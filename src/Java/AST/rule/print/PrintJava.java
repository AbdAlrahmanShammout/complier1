package Java.AST.rule.print;

import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;

public class PrintJava extends JavaBody {
    private Expr exprPrint = new Expr();

    public Expr getExprPrint() {
        return exprPrint;
    }

    public void setExprPrint(Expr exprPrint) {
        this.exprPrint = exprPrint;
    }
}

