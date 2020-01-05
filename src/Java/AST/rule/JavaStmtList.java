package Java.AST.rule;

import Java.AST.Node;

import java.util.ArrayList;

public class JavaStmtList extends Node{
   private ArrayList<JavaStmt> javaStmts = new ArrayList<>();

    public ArrayList<JavaStmt> getJavaStmts() {
        return javaStmts;
    }

    public void setJavaStmts(ArrayList<JavaStmt> javaStmts) {
        this.javaStmts = javaStmts;
    }
}
