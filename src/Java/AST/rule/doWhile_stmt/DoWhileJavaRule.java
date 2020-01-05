package Java.AST.rule.doWhile_stmt;

import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.JavaBody;
import Java.AST.rule.while_stmt.WhileJavaHeader;

public class DoWhileJavaRule extends JavaBody {
    private BodyBracketsJava bodyBracketsJava = new BodyBracketsJava();
    private WhileJavaHeader whileJavaHeader = new WhileJavaHeader();

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }

    public WhileJavaHeader getWhileJavaHeader() {
        return whileJavaHeader;
    }

    public void setWhileJavaHeader(WhileJavaHeader whileJavaHeader) {
        this.whileJavaHeader = whileJavaHeader;
    }
}
