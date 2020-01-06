package Java.AST.rule.declareJavaArray;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;

public class DeclareJavaArray extends JavaBody {
    private String name;
    private Expr array;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expr getArray() {
        return array;
    }

    public void setArray(Expr array) {
        this.array = array;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        array.accept(astVisitor);
    }
}
