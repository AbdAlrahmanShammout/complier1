package Java.AST.QueryStmt.Create;

import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

public class IndexedColumn extends Node {
    private Name column_name=new Name();
    private Name collation_name=new Name();

    public Name getColumn_name() {
        return column_name;
    }

    public void setColumn_name(Name column_name) {
        this.column_name = column_name;
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

    }
}
