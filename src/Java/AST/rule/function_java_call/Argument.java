package Java.AST.rule.function_java_call;

import Java.AST.Node;
import Java.AST.rule.Expr;

public class Argument extends Node {
    private Expr expr = new Expr();
    private ArrowFunctionJava arrowFunctionJava = new ArrowFunctionJava();

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public ArrowFunctionJava getArrowFunctionJava() {
        return arrowFunctionJava;
    }

    public void setArrowFunctionJava(ArrowFunctionJava arrowFunctionJava) {
        this.arrowFunctionJava = arrowFunctionJava;
    }
}
