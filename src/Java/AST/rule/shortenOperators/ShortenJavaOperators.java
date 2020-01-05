package Java.AST.rule.shortenOperators;

import Java.AST.rule.Expr;

public class ShortenJavaOperators {
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
}
