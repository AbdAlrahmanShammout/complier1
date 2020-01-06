package Java.AST.QueryStmt;

import Java.AST.QueryStmt.Create.TableConstraint;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAddConstraint extends Statement {
    private Name any_name = new Name();
    private TableConstraint tableConstraint;

    public Name getAny_name() {
        return any_name;
    }

    public void setAny_name(Name any_name) {
        this.any_name = any_name;
    }

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (tableConstraint!=null)
            tableConstraint.accept(astVisitor);
    }
}
