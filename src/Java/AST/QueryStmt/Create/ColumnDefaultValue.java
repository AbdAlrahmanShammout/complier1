package Java.AST.QueryStmt.Create;

import Java.AST.LiteralValue;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnDefaultValue extends Node {
    private SignedNumber signedNumber;
    private LiteralValue literalValuel;

    public SignedNumber getSignedNumber() {
        return signedNumber;
    }

    public void setSignedNumber(SignedNumber signedNumber) {
        this.signedNumber = signedNumber;
    }

    public LiteralValue getLiteralValuel() {
        return literalValuel;
    }

    public void setLiteralValuel(LiteralValue literalValuel) {
        this.literalValuel = literalValuel;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        if (signedNumber!=null)
            signedNumber.accept(astVisitor);
        if (literalValuel!=null)
            literalValuel.accept(astVisitor);

    }
}