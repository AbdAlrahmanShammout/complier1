package Java.AST.rule.if_one_line;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.BodyBracketsJava;
import Java.AST.Expr;

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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (exprReturn!=null)
            exprReturn.accept(astVisitor);
        if (bodyBracketsJava!=null)
            bodyBracketsJava.accept(astVisitor);
    }
}
