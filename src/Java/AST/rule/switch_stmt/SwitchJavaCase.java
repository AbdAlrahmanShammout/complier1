package Java.AST.rule.switch_stmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.Expr;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class SwitchJavaCase extends Node {
    private Expr caseExpr;
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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        caseExpr.accept(astVisitor);
        for (int i = 0; i < javaBodies.size(); i++) {
            javaBodies.get(i).accept(astVisitor);
        }
    }
}
