package Java.AST.rule;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JavaStmtList extends Node{
   private ArrayList<JavaStmt> javaStmts = new ArrayList<>();

    public ArrayList<JavaStmt> getJavaStmts() {
        return javaStmts;
    }

    public void setJavaStmts(ArrayList<JavaStmt> javaStmts) {
        this.javaStmts = javaStmts;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < javaStmts.size(); i++) {
            javaStmts.get(i).accept(astVisitor);
        }
    }
}
