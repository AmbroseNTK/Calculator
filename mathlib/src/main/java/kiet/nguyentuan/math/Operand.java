package kiet.nguyentuan.math;

public class Operand extends Elements {

	private float value;
	public Operand(){}
	public Operand(String value){
		parseToValue(value);
	}
	public Operand(float value){
		this.value=value;
	}
	@Override
	public boolean isOperator() {
		return false;
	}

	@Override
	public String getCharacter() {
		return String.valueOf(value);
	}
	public void parseToValue(String value){
		try{
			this.value=Float.parseFloat(value);
		}
		catch(Exception e){
			errorHandle.setError("Parse value error :"+value);
		}
	}
	public float getValue(){
		return value;
	}
}
