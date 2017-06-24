package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

public class Minus extends Operator {

	@Override
	public OperatorType getOperatorType() {
	
		return OperatorType.MINUS;
	}

	@Override
	public int getPriority() {
		
		return 1;
	}

	@Override
	public Operand calc(Operand opA, Operand opB) {
		return new Operand(opB.getValue()-opA.getValue());
	}

	@Override
	public String getCharacter() {
		return "-";
	}

}
