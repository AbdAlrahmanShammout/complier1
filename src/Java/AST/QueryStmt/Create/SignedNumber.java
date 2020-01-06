package Java.AST.QueryStmt.Create;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class SignedNumber extends Node {
    private char operation=' ';
    private boolean Star=false;
    private Double NUMERIC_LITERAL;



    public char getOperation() {
        return operation;
    }

    public boolean isStar() {
        return Star;
    }

    public void setStar(boolean star) {
        Star = star;
    }

    public Double getNUMERIC_LITERAL() {
        return NUMERIC_LITERAL;
    }

    public void setNUMERIC_LITERAL(Double NUMERIC_LITERAL) {
        this.NUMERIC_LITERAL = NUMERIC_LITERAL;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
