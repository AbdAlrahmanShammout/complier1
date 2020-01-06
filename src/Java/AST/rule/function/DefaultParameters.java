package Java.AST.rule.function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.Expr;

public class DefaultParameters extends Node {

    private String parameterName;
    private Expr parameterVal;

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Expr getParameterVal() {
        return parameterVal;
    }

    public void setParameterVal(Expr parameterVal) {
        this.parameterVal = parameterVal;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        parameterVal.accept(astVisitor);
    }

}
