package Java.AST.QueryStmt;

import Java.AST.Expr;
import Java.AST.Visitor.ASTVisitor;

public class DeleteStmt extends Statement {
    private QualifiedTableName qualifiedTableName;
    private Expr expr;

    public QualifiedTableName getQualifiedTableName() {
        return qualifiedTableName;
    }

    public void setQualifiedTableName(QualifiedTableName qualifiedTableName) {
        this.qualifiedTableName = qualifiedTableName;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        if (qualifiedTableName!=null)
            qualifiedTableName.accept(astVisitor);
        if (expr!=null)
            expr.accept(astVisitor);
    }
}
