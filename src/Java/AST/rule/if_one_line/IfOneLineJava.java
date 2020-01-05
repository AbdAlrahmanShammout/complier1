package Java.AST.rule.if_one_line;

import Java.AST.rule.ConditionJava;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class IfOneLineJava extends JavaBody {
    private Boolean Not;
    private ConditionJava conditionJava = new ConditionJava();
    private ArrayList<IfOneLineReturnJava> ifOneLineReturnJavas = new ArrayList<>();

    public Boolean getNot() {
        return Not;
    }

    public void setNot(Boolean not) {
        Not = not;
    }

    public ArrayList<IfOneLineReturnJava> getIfOneLineReturnJavas() {
        return ifOneLineReturnJavas;
    }

    public void setIfOneLineReturnJavas(ArrayList<IfOneLineReturnJava> ifOneLineReturnJavas) {
        this.ifOneLineReturnJavas = ifOneLineReturnJavas;
    }

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }
}
