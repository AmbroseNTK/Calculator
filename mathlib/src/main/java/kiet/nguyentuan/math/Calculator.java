package kiet.nguyentuan.math;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
	private String expression;

	public Calculator(){};
	public Calculator(String expression){
		setExpression(expression);
	}
	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	public float calc(String expression){
		setExpression(expression);
		return calc();
	}
	public float calc(){
		//Prepare
		ErrorHandle errorHandle=new ErrorHandle();
		Elements.setErrorHandle(errorHandle);
		ArrayList<Elements> input=ExpressionHelper.parseToElements(getExpression());
		for(int i=0;i<input.size();i++)
			System.out.print(input.get(i).getCharacter());
		try{
		//Convert to postfix
		Stack<Elements> stack=new Stack<>();
		ArrayList<Elements> output=new ArrayList<>();
		
		for(int i=0;i<input.size();i++){
			Elements current=input.get(i);
			if(!current.isOperator())
				output.add(current);
			else{
				if(stack.size()>0){
					Operator header=(Operator)(stack.peek());
					Operator currentOperator=(Operator)(current);
					if(currentOperator.getOperatorType()==OperatorType.LPARENTHESIS){
						stack.push(currentOperator);
						continue;
					}
					if(currentOperator.getOperatorType()==OperatorType.RPARENTHESIS){
						Operator temp=(Operator)(stack.pop());
						while(temp.getOperatorType()!=OperatorType.LPARENTHESIS &&stack.size() !=0){
							output.add(temp);
							temp=(Operator)(stack.pop());
						}
						continue;
					}
					if(header.getPriority()>=currentOperator.getPriority()){
						output.add(stack.pop());
					}
					stack.push(current);
				}
				else
					stack.push(current);
			}
		}
		while(stack.size()!=0){
			output.add(stack.pop());
		}
		
		//Calculating
		stack=new Stack<Elements>();
		for(int i=0;i<output.size();i++){
			Elements current=output.get(i);
			if(!current.isOperator())
				stack.push(current);
			else{
				Operator currentOperator=(Operator)(current);
				stack.push(currentOperator.calc((Operand)(stack.pop()),(Operand)( stack.pop())));
			}
		}
		Operand result=(Operand)(stack.pop());
		System.out.println("\nResult = "+result.getValue());
		return result.getValue();
		}
		catch(Exception e){
		for(int i=0;i<Elements.checkError();i++)
			System.out.println("\nError: "+Elements.errorHandle.getErrorList().get(i));
		}
		return 0;
		
	}
	
}
