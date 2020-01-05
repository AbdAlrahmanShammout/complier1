package Java.AST.rule.while_stmt;

import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.JavaBody;

public class WhileJavaRule extends JavaBody {
    private WhileJavaHeader whileJavaHeader = new WhileJavaHeader();
    private BodyBracketsJava bodyBracketsJava = new BodyBracketsJava();

    public WhileJavaHeader getWhileJavaHeader() {
        return whileJavaHeader;
    }

    public void setWhileJavaHeader(WhileJavaHeader whileJavaHeader) {
        this.whileJavaHeader = whileJavaHeader;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }
}
