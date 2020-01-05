package Java.AST.rule.if_stmt;

import Java.AST.rule.BodyBracketsJava;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class IfJavaRule extends JavaBody {
    private ArrayList<IfBasicJavaRule>  ifBasicJavaRules = new ArrayList<>();
    private BodyBracketsJava bodyBracketsJava;

    public ArrayList<IfBasicJavaRule> getIfBasicJavaRules() {
        return ifBasicJavaRules;
    }

    public void setIfBasicJavaRules(ArrayList<IfBasicJavaRule> ifBasicJavaRules) {
        this.ifBasicJavaRules = ifBasicJavaRules;
    }

    public BodyBracketsJava getBodyBracketsJava() {
        return bodyBracketsJava;
    }

    public void setBodyBracketsJava(BodyBracketsJava bodyBracketsJava) {
        this.bodyBracketsJava = bodyBracketsJava;
    }


}
