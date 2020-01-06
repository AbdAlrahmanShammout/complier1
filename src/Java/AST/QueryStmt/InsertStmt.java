package Java.AST.QueryStmt;

import Java.AST.Expr;
import Java.AST.QueryStmt.Select.SelectStmt;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class InsertStmt extends Statement{
    Name tableName=new Name();
    Name databaseName;
    ArrayList<Name> ColumnName=new ArrayList<>();
    ArrayList<Expr> exprs= new ArrayList<>();
    SelectStmt selectStmt;
    Boolean defaultValues=false;

    public Name getTableName() {
        return tableName;
    }

    public void setTableName(Name tableName) {
        this.tableName = tableName;
    }

    public Name getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(Name databaseName) {
        this.databaseName = databaseName;
    }

    public ArrayList<Name> getColumnName() {
        return ColumnName;
    }

    public void setColumnName(ArrayList<Name> columnName) {
        ColumnName = columnName;
    }

    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<Expr> exprs) {
        this.exprs = exprs;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public Boolean getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(Boolean defaultValues) {
        this.defaultValues = defaultValues;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (exprs.size()>0)
            for(int i=0;i<exprs.size();i++)
                exprs.get(i).accept(astVisitor);
        selectStmt.accept(astVisitor);
    }

}
