package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

public class RParenthesis extends Operator {

	@Override
	public OperatorType getOperatorType() {
		
		return OperatorType.RPARENTHESIS;
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public Operand calc(Operand opA, Operand opB) {
		return null;
	}

	@Override
	public String getCharacter() {
		return ")";
	}

}
