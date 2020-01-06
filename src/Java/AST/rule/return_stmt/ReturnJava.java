package Java.AST.rule.return_stmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;
import Java.AST.rule.if_one_line.IfOneLineJava;

public class ReturnJava extends JavaBody {
    private IfOneLineJava ifOneLineJava;
    private Expr exprReturn ;

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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (ifOneLineJava!=null)
            ifOneLineJava.accept(astVisitor);
        if (exprReturn!=null)
            exprReturn.accept(astVisitor);
    }
}
