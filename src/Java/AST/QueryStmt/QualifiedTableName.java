package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class QualifiedTableName extends Node {
    Name tableName=new Name();
    Name dataBaseName=new Name();
    Name indexName=new Name();
    Boolean notIndexed;

    public Name getTableName() {
        return tableName;
    }

    public void setTableName(Name tableName) {
        this.tableName = tableName;
    }

    public Name getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(Name dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public Name getIndexName() {
        return indexName;
    }

    public void setIndexName(Name indexName) {
        this.indexName = indexName;
    }

    public Boolean getNotIndexed() {
        return notIndexed;
    }

    public void setNotIndexed(Boolean notIndexed) {
        this.notIndexed = notIndexed;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
