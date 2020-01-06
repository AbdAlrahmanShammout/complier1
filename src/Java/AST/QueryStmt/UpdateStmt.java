package Java.AST.QueryStmt;

import Java.AST.Expr;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class UpdateStmt extends Statement {
    QualifiedTableName qualifiedTableName;
    ArrayList<Name> qolumnNames=new ArrayList<>();
    ArrayList<Expr> exprs= new ArrayList<>();
    Expr WhereExpr;

    public QualifiedTableName getQualifiedTableName() {
        return qualifiedTableName;
    }

    public void setQualifiedTableName(QualifiedTableName qualifiedTableName) {
        this.qualifiedTableName = qualifiedTableName;
    }

    public ArrayList<Name> getQolumnNames() {
        return qolumnNames;
    }

    public void setQolumnNames(ArrayList<Name> qolumnNames) {
        this.qolumnNames = qolumnNames;
    }

    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<Expr> exprs) {
        this.exprs = exprs;
    }

    public Expr getWhereExpr() {
        return WhereExpr;
    }

    public void setWhereExpr(Expr whereExpr) {
        WhereExpr = whereExpr;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        if (qualifiedTableName!=null)
            qualifiedTableName.accept(astVisitor);
        astVisitor.visit(this);
        if (exprs.size()>0)
            for (int i=0;i<exprs.size();i++)
                exprs.get(i).accept(astVisitor);
    }
}
