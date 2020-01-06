package Java.AST.QueryStmt.Select;

import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class OrderingTerm extends Node {
    Expr expr;
    Name collationName;
    Boolean asc=false;
    Boolean desc=false;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Name getCollationName() {
        return collationName;
    }

    public void setCollationName(Name collationName) {
        this.collationName = collationName;
    }

    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (expr!=null){
            expr.accept(astVisitor);
        }
    }
}
