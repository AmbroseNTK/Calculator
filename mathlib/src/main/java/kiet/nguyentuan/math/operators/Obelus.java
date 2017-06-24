package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

public class Obelus extends Operator {

	@Override
	public OperatorType getOperatorType() {
		return OperatorType.OBELUS;
	}

	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	public Operand calc(Operand opA, Operand opB) {
		if(opA.getValue() !=0)
			return new Operand(opB.getValue()/opA.getValue());
		errorHandle.setError("Divided by zero");
		return null;
	}

	@Override
	public String getCharacter() {
		return "/";
	}

}
