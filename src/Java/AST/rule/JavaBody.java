package Java.AST.rule;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class JavaBody extends Node {
    private boolean Abreak;

    public boolean isAbreak() {
        return Abreak;
    }

    public void setAbreak(boolean abreak) {
        Abreak = abreak;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        super.accept(astVisitor);
    }
}
