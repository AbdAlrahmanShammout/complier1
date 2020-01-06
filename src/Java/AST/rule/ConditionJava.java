package Java.AST.rule;

import Java.AST.Expr;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ConditionJava extends Node{
    private Expr expr;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expr.accept(astVisitor);
    }
}
