package Java.AST.QueryStmt.Select;

import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class TableOrSubquery extends Node {
    Name databseName=new Name();
    Name tableName=new Name();
    Name tableAlias=new Name();
    Name indexName=new Name();
    Boolean notIndexed=false;
    ArrayList<TableOrSubquery> tableOrSubqueries=new ArrayList<>();
    JoinClause joinClause;
    SelectStmt selectStmt;

    public Name getDatabseName() {
        return databseName;
    }

    public void setDatabseName(Name databseName) {
        this.databseName = databseName;
    }

    public Name getTableName() {
        return tableName;
    }

    public void setTableName(Name tableName) {
        this.tableName = tableName;
    }

    public Name getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(Name tableAlias) {
        this.tableAlias = tableAlias;
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

    public ArrayList<TableOrSubquery> getTableOrSubqueries() {
        return tableOrSubqueries;
    }

    public void setTableOrSubqueries(ArrayList<TableOrSubquery> tableOrSubqueries) {
        this.tableOrSubqueries = tableOrSubqueries;
    }

    public JoinClause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(JoinClause joinClause) {
        this.joinClause = joinClause;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (tableOrSubqueries.size()!=0){
            for(int i=0;i<tableOrSubqueries.size();i++){
                tableOrSubqueries.get(i).accept(astVisitor);
            }
        }
        if (joinClause!=null){
            joinClause.accept(astVisitor);
        }
        if (selectStmt!=null){
            selectStmt.accept(astVisitor);
        }
    }
}
