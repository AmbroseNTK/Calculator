package kiet.nguyentuan.math;

public abstract class Operator extends Elements {

	@Override
	public boolean isOperator() {
		return true;
	}


	public abstract OperatorType getOperatorType();
	public abstract int getPriority();
	public abstract Operand calc(Operand opA,Operand opB);
}
