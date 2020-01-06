package Java.AST.QueryStmt.Create;

import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class TableConstraint extends Node {
    private Name TCname=new Name();
    private Expr exp;

    public Expr getExp() {
        return exp;
    }

    public void setExp(Expr exp) {
        this.exp = exp;
    }

    public Name getTCname() {
        return TCname;
    }

    public void setTCname(Name TCname) {
        this.TCname = TCname;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(exp!=null)
            exp.accept(astVisitor);
    }
}
