package Java.AST.rule.return_stmt;

import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;
import Java.AST.rule.if_one_line.IfOneLineJava;

public class ReturnJava extends JavaBody {
    private IfOneLineJava ifOneLineJava = new IfOneLineJava();
    private Expr exprReturn = new Expr();

    public IfOneLineJava getIfOneLineJava() {
        return ifOneLineJava;
    }

    public void setIfOneLineJava(IfOneLineJava ifOneLineJava) {
        this.ifOneLineJava = ifOneLineJava;
    }

    public Expr getExprReturn() {
        return exprReturn;
    }

    public void setExprReturn(Expr exprReturn) {
        this.exprReturn = exprReturn;
    }
}
