package Java.AST.QueryStmt;

import Java.AST.QueryStmt.Create.TableConstraint;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAdd extends Statement {
    private TableConstraint tableConstraint;

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        tableConstraint.accept(astVisitor);
    }
}
