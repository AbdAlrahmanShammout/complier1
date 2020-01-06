package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class DropTableStmt extends Statement {
    Name dataBaseName=new Name();
    Name tableName=new Name();
    Boolean exists=false;

    public Name getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(Name dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public Name getTableName() {
        return tableName;
    }

    public void setTableName(Name tableName) {
        this.tableName = tableName;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
