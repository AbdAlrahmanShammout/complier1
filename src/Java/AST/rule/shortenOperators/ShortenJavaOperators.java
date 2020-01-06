package Java.AST.rule.shortenOperators;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.Expr;

public class ShortenJavaOperators extends Node {
    private String name;
    private String operator;
    private Expr exprVal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expr getExprVal() {
        return exprVal;
    }

    public void setExprVal(Expr exprVal) {
        this.exprVal = exprVal;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (exprVal!=null)
            exprVal.accept(astVisitor);
    }
}
