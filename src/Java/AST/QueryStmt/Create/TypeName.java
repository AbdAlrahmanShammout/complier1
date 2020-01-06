package Java.AST.QueryStmt.Create;

import Java.AST.Node;
import Java.AST.QueryStmt.Name;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class TypeName extends Node {
    private Name name=new Name();
    private ArrayList<SignedNumber> signed_number=new ArrayList<>();
    private ArrayList<Name> any_name=new ArrayList<>();

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ArrayList<SignedNumber> getSigned_number() {
        return signed_number;
    }

    public void setSigned_number(ArrayList<SignedNumber> signed_number) {
        this.signed_number = signed_number;
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
        if(signed_number.size()>0)
        for(int i=0;i<signed_number.size();i++)
        {
            signed_number.get(i).accept(astVisitor);
        }
    }
}
