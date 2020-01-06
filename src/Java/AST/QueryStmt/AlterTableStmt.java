package Java.AST.QueryStmt;

import Java.AST.QueryStmt.Create.ColumnDef;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableStmt extends Statement {
    private Name database_name=new Name();
    private Name source_table_name=new Name();
    private  Name new_table_name = new Name();
    private AlterTableAdd alter_table_add;
    private AlterTableAddConstraint alter_table_add_constraint;
    private ColumnDef columnDef;

    public ColumnDef getColumnDef() {
        return columnDef;
    }

    public void setColumnDef(ColumnDef columnDef) {
        this.columnDef = columnDef;
    }

    public AlterTableAdd getAlter_table_add() {
        return alter_table_add;
    }

    public void setAlter_table_add(AlterTableAdd alter_table_add) {
        this.alter_table_add = alter_table_add;
    }

    public AlterTableAddConstraint getAlter_table_add_constraint() {
        return alter_table_add_constraint;
    }

    public void setAlter_table_add_constraint(AlterTableAddConstraint alter_table_add_constraint) {
        this.alter_table_add_constraint = alter_table_add_constraint;
    }

    public Name getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(Name database_name) {
        this.database_name = database_name;
    }

    public Name getSource_table_name() {
        return source_table_name;
    }

    public void setSource_table_name(Name source_table_name) {
        this.source_table_name = source_table_name;
    }

    public Name getNew_table_name() {
        return new_table_name;
    }

    public void setNew_table_name(Name new_table_name) {
        this.new_table_name = new_table_name;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (alter_table_add!=null)
            alter_table_add.accept(astVisitor);
        if(alter_table_add_constraint!=null)
            alter_table_add_constraint.accept(astVisitor);
        if (columnDef!=null)
            columnDef.accept(astVisitor);
    }
}
