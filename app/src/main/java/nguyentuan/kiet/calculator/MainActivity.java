package nguyentuan.kiet.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kiet.nguyentuan.math.Calculator;
import kiet.nguyentuan.math.Elements;

public class MainActivity extends AppCompatActivity {

    private Button btSolve;
    private EditText etExpression;
    private TextView tvResult;
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSolve=(Button)findViewById(R.id.btSolve);
        etExpression=(EditText)findViewById(R.id.etExpression);
        tvResult=(TextView)findViewById(R.id.tvResult);
        calculator=new Calculator();
        btSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setTextColor(Color.BLUE);
                tvResult.setText("Result = "+calculator.calc(etExpression.getText().toString()));
                String error="";
                for(int i=0;i<Elements.checkError();i++){
                    tvResult.setTextColor(Color.RED);
                    error+="\n"+Elements.getErrorHandle().getErrorList().get(i);
                }
                if(!error.equals(""))
                    tvResult.setText("Error:\n"+error);
            }
        });
    }
}
