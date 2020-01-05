package Java.AST.rule.while_stmt;

import Java.AST.Node;
import Java.AST.rule.ConditionJava;

public class WhileJavaHeader extends Node {
    private ConditionJava conditionJava = new ConditionJava();

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }
}
