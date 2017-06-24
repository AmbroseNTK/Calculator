package kiet.nguyentuan.math;

import java.util.ArrayList;

import kiet.nguyentuan.math.operators.*;

public abstract class Elements {
	protected static ErrorHandle errorHandle;
	public abstract boolean isOperator();
	public abstract String getCharacter();
	public static Elements parseToElement(String value){
		if(value.equals("+"))
			return new Plus();
		else if(value.equals("-"))
			return new Minus();
		else if(value.equals("*"))
			return new Times();
		else if(value.equals("/"))
			return new Obelus();
		else if(value.equals("("))
			return new LParenthesis();
		else if(value.equals(")"))
			return new RParenthesis();
		else
			return new Operand(value);
	}
	public static void setErrorHandle(ErrorHandle errorHandle){
		Elements.errorHandle=errorHandle;
	}
	public static ErrorHandle getErrorHandle(){
		return errorHandle;
	}
	public static int checkError(){
		if(errorHandle !=null)
			return errorHandle.getErrorList().size();
		return -1;
	}
}
