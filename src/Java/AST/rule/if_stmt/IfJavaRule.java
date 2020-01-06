package Java.AST.rule.if_stmt;

import Java.AST.Visitor.ASTVisitor;
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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (bodyBracketsJava!=null)
            bodyBracketsJava.accept(astVisitor);
        for (int i = 0; i < ifBasicJavaRules.size(); i++) {
            ifBasicJavaRules.get(i).accept(astVisitor);
        }
    }

}
