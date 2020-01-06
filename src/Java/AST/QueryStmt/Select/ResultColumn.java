package Java.AST.QueryStmt.Select;

import Java.AST.Expr;
import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

public class ResultColumn extends Node {
    Boolean star=false;
    Name tableName=new Name();
    Expr expr;
    Name ColumnAlias=new Name();

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public Name getTableName() {
        return tableName;
    }

    public void setTableName(Name tableName) {
        this.tableName = tableName;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Name getColumnAlias() {
        return ColumnAlias;
    }

    public void setColumnAlias(Name columnAlias) {
        ColumnAlias = columnAlias;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (expr!=null){
            expr.accept(astVisitor);
        }
    }
}
