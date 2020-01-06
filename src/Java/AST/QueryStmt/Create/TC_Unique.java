package Java.AST.QueryStmt.Create;

import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class TC_Unique extends TableConstraint{
    private Name Uname=new Name();
    private ArrayList<IndexedColumn> indexed_column=new ArrayList<>();

    public Name getUname() {
        return Uname;
    }

    public void setUname(Name uname) {
        Uname = uname;
    }

    public ArrayList<IndexedColumn> getIndexed_column() {
        return indexed_column;
    }

    public void setIndexed_column(ArrayList<IndexedColumn> indexed_column) {
        this.indexed_column = indexed_column;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        super.accept(astVisitor);
        astVisitor.visit(this);
        if(indexed_column.size()>0)
        for(int i=0;i<indexed_column.size();i++)
        {
            indexed_column.get(i).accept(astVisitor);
        }
    }
}
