package Java.AST.rule;

import Java.AST.Node;

public class ConditionJava extends Node{
    private Expr expr = new Expr();

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
