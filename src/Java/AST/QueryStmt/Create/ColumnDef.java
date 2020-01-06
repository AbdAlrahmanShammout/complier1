package Java.AST.QueryStmt.Create;
import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ColumnDef extends Node {
    private Name column_name=new Name();
    private ArrayList<ColumnConstraint> column_constraint=new ArrayList<>();
    private ArrayList<TypeName> type_name=new ArrayList<>();

    public Name getColumn_name() {
        return column_name;
    }

    public void setColumn_name(Name column_name) {
        this.column_name = column_name;
    }

    public ArrayList<ColumnConstraint> getColumn_constraint() {
        return column_constraint;
    }

    public void setColumn_constraint(ArrayList<ColumnConstraint> column_constraint) {
        this.column_constraint = column_constraint;
    }

    public ArrayList<TypeName> getType_name() {
        return type_name;
    }

    public void setType_name(ArrayList<TypeName> type_name) {
        this.type_name = type_name;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if (type_name.size()!=0){
            for (int i=0;i<type_name.size();i++){
                type_name.get(i).accept(astVisitor);
            }
        }
        if (column_constraint.size()!=0){
            for (int i=0; i<column_constraint.size();i++){
                column_constraint.get(i).accept(astVisitor);
            }
        }
    }
}
