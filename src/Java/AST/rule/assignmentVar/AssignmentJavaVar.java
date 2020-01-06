package Java.AST.rule.assignmentVar;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class AssignmentJavaVar extends Node {
    private String name;
    private Expr ExprVal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expr getExprVal() {
        return ExprVal;
    }

    public void setExprVal(Expr exprVal) {
        ExprVal = exprVal;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        ExprVal.accept(astVisitor);
    }
}

