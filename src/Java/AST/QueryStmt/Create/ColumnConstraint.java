package Java.AST.QueryStmt.Create;


import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class ColumnConstraint extends Node {
    private Name name=new Name();
    private Expr exp;

    public Expr getExp() {
        return exp;
    }

    public void setExp(Expr exp) {
        this.exp = exp;
    }

    private Name collation_name=new Name();

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getCollation_name() {
        return collation_name;
    }

    public void setCollation_name(Name collation_name) {
        this.collation_name = collation_name;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (exp!=null){
            exp.accept(astVisitor);
        }
    }
}
