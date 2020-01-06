package Java.AST.QueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class JoinConstraint extends Node {
    Expr expr;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {

        if (expr!=null){
            expr.accept(astVisitor);
        }
    }
}
