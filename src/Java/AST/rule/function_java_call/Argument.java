package Java.AST.rule.function_java_call;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class Argument extends Node {
    private Expr expr;
    private ArrowFunctionJava arrowFunctionJava;

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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (expr!=null)
            expr.accept(astVisitor);
        if (arrowFunctionJava!=null)
            arrowFunctionJava.accept(astVisitor);
    }
}
