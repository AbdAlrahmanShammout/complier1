package Java.AST.rule.for_stmt;

import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.JavaBody;

public class ForJavaRule extends JavaBody {
    private ForJavaHeader forJavaHeader = new ForJavaHeader();
    private BodyBracketsJava bodyBracketsJava = new BodyBracketsJava();

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
}
