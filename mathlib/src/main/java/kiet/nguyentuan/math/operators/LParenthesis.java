package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

public class LParenthesis extends Operator {

	@Override
	public OperatorType getOperatorType() {
		
		return OperatorType.LPARENTHESIS;
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public Operand calc(Operand opA, Operand opB) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCharacter() {
		return "(";
	}

}
