package Java.AST.rule.switch_stmt;

import Java.AST.Node;
import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class SwitchJavaCase extends Node {
    private Expr caseExpr = new Expr();
    private ArrayList<JavaBody> javaBodies = new ArrayList<>();

    public Expr getCaseExpr() {
        return caseExpr;
    }

    public void setCaseExpr(Expr caseExpr) {
        this.caseExpr = caseExpr;
    }

    public ArrayList<JavaBody> getJavaBodies() {
        return javaBodies;
    }

    public void setJavaBodies(ArrayList<JavaBody> javaBodies) {
        this.javaBodies = javaBodies;
    }
}