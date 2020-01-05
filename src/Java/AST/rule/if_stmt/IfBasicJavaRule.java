package Java.AST.rule.if_stmt;

import Java.AST.Node;
import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.ConditionJava;

public class IfBasicJavaRule extends Node{
    private ConditionJava conditionJava;
    private BodyBracketsJava bodyBracketsJava;

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }
}
