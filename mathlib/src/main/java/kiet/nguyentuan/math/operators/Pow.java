package kiet.nguyentuan.math.operators;

import kiet.nguyentuan.math.Operand;
import kiet.nguyentuan.math.Operator;
import kiet.nguyentuan.math.OperatorType;

/**
 * Created by Bich Tram on 6/24/2017.
 */

public class Pow extends Operator {

    @Override
    public OperatorType getOperatorType() {
        return OperatorType.POW;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public Operand calc(Operand opA,Operand opB){
        return new Operand((float)(Math.pow((double)(opB.getValue()),(double)(opA.getValue()))));
    }

    @Override
    public String getCharacter() {
        return "+";
    }
}
