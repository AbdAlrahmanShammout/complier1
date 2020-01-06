package Java.AST.QueryStmt.Create;

import Java.AST.QueryStmt.Name;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class CreatStmt extends Statement {
    private Name database_name=new Name();
    private Name table_name=new Name();
    private ArrayList<ColumnDef> column_def=new ArrayList<>();
    private ArrayList<TableConstraint> table_constraint=new ArrayList<>();


    public Name getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(Name database_name) {
        this.database_name = database_name;
    }

    public Name getTable_name() {
        return table_name;
    }

    public void setTable_name(Name table_name) {
        this.table_name = table_name;
    }

    public ArrayList<ColumnDef> getColumn_def() {
        return column_def;
    }

    public void setColumn_def(ArrayList<ColumnDef> column_def) {
        this.column_def = column_def;
    }

    public ArrayList<TableConstraint> getTable_constraint() {
        return table_constraint;
    }

    public void setTable_constraint(ArrayList<TableConstraint> table_constraint) {
        this.table_constraint = table_constraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (table_constraint.size()!=0){
            for (int i=0;i<table_constraint.size();i++){
                table_constraint.get(i).accept(astVisitor);
            }
        }

        if (column_def.size()!=0){
            for (int i=0;i<column_def.size();i++){
                column_def.get(i).accept(astVisitor);
            }
        }
    }
}
