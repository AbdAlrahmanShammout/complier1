package Java.AST.rule.return_stmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;
import Java.AST.rule.JavaBody;

public class ReturnJava extends JavaBody {
    private Expr exprReturn ;

    public Expr getExprReturn() {
        return exprReturn;
    }

    public void setExprReturn(Expr exprReturn) {
        this.exprReturn = exprReturn;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (exprReturn!=null)
            exprReturn.accept(astVisitor);
    }
}
