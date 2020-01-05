package Java.AST.rule.function_java_call;

import Java.AST.rule.Expr;
import Java.AST.rule.function.ParametersList;

public class ArrowFunctionJava {
    private ParametersList parametersList = new ParametersList();
    private Expr returnExpr = new Expr();

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
}
