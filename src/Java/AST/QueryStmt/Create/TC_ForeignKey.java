package Java.AST.QueryStmt.Create;

import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class TC_ForeignKey extends TableConstraint {
    private ArrayList<Name> column_name=new ArrayList<>();
    private ForeignKeyClause foreign_key_clause;

    public ArrayList<Name> getColumn_name() {
        return column_name;
    }

    public void setColumn_name(ArrayList<Name> column_name) {
        this.column_name = column_name;
    }

    public ForeignKeyClause getForeign_key_clause() {
        return foreign_key_clause;
    }

    public void setForeign_key_clause(ForeignKeyClause foreign_key_clause) {
        this.foreign_key_clause = foreign_key_clause;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        super.accept(astVisitor);
        astVisitor.visit(this);
        foreign_key_clause.accept(astVisitor);
    }
}
