package Java.AST.QueryStmt.Create;

import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

import java.util.ArrayList;

public class ColumnDefault extends ColumnConstraint{
    ColumnDefaultValue columnDefaultValue;
    Expr expr;
    ArrayList<Name> any_name=new ArrayList<>();

    public ColumnDefaultValue getColumnDefaultValue() {
        return columnDefaultValue;
    }

    public void setColumnDefaultValue(ColumnDefaultValue columnDefaultValue) {
        this.columnDefaultValue = columnDefaultValue;
    }

    public Expr getExprs() {
        return expr;
    }

    public void setExprs(Expr exprs) {
        this.expr = exprs;
    }

    public ArrayList<Name> getAny_name() {
        return any_name;
    }

    public void setAny_name(ArrayList<Name> any_name) {
        this.any_name = any_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (columnDefaultValue!=null)
            columnDefaultValue.accept(astVisitor);
        if (expr!=null)
            expr.accept(astVisitor);
    }

}