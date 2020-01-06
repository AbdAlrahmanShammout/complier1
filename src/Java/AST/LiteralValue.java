package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class LiteralValue extends Node {
    private Double NUMERIC_LITERAL;
    private String STRING_LITERAL;
    private String BLOB_LITERAL;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public Double getNUMERIC_LITERAL() {
        return NUMERIC_LITERAL;
    }

    public void setNUMERIC_LITERAL(Double NUMERIC_LITERAL) {
        this.NUMERIC_LITERAL = NUMERIC_LITERAL;
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }

    public String getBLOB_LITERAL() {
        return BLOB_LITERAL;
    }

    public void setBLOB_LITERAL(String BLOB_LITERAL) {
        this.BLOB_LITERAL = BLOB_LITERAL;
    }
//    @Override
//    public void accept(ASTVisitor astVisitor) {
//        astVisitor.visit(this);
//    }
}
