package Java.AST.rule.if_one_line;

import Java.AST.Node;
import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.ConditionJava;
import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;

public class IfOneLineReturnJava extends Node {
    private Expr exprReturn;
    private BodyBracketsJava bodyBracketsJava;

    public Expr getExprReturn() {
        return exprReturn;
    }

    public void setExprReturn(Expr exprReturn) {
        this.exprReturn = exprReturn;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }
}
