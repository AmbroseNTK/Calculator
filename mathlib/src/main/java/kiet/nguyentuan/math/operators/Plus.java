package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

public class Plus extends Operator {

	@Override
	public OperatorType getOperatorType() {
		return OperatorType.PLUS;
	}

	@Override
	public int getPriority() {
		return 1;
	}
	
	@Override
	public Operand calc(Operand opA,Operand opB){
		return new Operand(opA.getValue()+opB.getValue());
	}

	@Override
	public String getCharacter() {
		return "+";
	}
}
