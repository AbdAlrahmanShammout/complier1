package Java.AST.rule.function_java_call;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;
import Java.AST.rule.function.ParametersList;

public class ArrowFunctionJava extends Node {
    private ParametersList parametersList;
    private Expr returnExpr;

    public ParametersList getParametersList() {
        return parametersList;
    }

    public void setParametersList(ParametersList parametersList) {
        this.parametersList = parametersList;
    }

    public Expr getReturnExpr() {
        return returnExpr;
    }

    public void setReturnExpr(Expr returnExpr) {
        this.returnExpr = returnExpr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        parametersList.accept(astVisitor);
        returnExpr.accept(astVisitor);
    }
}
