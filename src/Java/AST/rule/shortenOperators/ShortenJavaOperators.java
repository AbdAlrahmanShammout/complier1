package Java.AST.rule.shortenOperators;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;
import Java.AST.rule.JavaBody;

public class ShortenJavaOperators extends JavaBody {
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
