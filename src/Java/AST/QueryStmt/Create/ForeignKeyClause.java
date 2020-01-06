package Java.AST.QueryStmt.Create;

import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ForeignKeyClause extends ColumnConstraint {
    private Name database_name=new Name();
    private Name foreign_table=new Name();
    private ArrayList<Name> fk_target_column_name=new ArrayList<>();
    private ArrayList<Name> match_name=new ArrayList<>();

    public Name getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(Name database_name) {
        this.database_name = database_name;
    }

    public Name getForeign_table() {
        return foreign_table;
    }

    public void setForeign_table(Name foreign_table) {
        this.foreign_table = foreign_table;
    }

    public ArrayList<Name> getFk_target_column_name() {
        return fk_target_column_name;
    }

    public void setFk_target_column_name(ArrayList<Name> fk_target_column_name) {
        this.fk_target_column_name = fk_target_column_name;
    }

    public ArrayList<Name> getMatch_name() {
        return match_name;
    }

    public void setMatch_name(ArrayList<Name> match_name) {
        this.match_name = match_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
