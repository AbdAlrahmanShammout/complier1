package Java.AST.rule.for_stmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.JavaBody;

public class ForJavaRule extends JavaBody {
    private ForJavaHeader forJavaHeader;
    private BodyBracketsJava bodyBracketsJava;

    public ForJavaHeader getForJavaHeader() {
        return forJavaHeader;
    }

    public void setForJavaHeader(ForJavaHeader forJavaHeader) {
        this.forJavaHeader = forJavaHeader;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        forJavaHeader.accept(astVisitor);
        bodyBracketsJava.accept(astVisitor);
    }
}
