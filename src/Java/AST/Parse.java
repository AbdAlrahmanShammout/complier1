package Java.AST;

import Java.AST.QueryStmt.Statement;
//import Java.AST.Visitor.ASTVisitor;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaStmtList;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private List<JavaStmtList> javaStmtLists = new ArrayList<>();


    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public List<JavaStmtList> getJavaStmtLists() {
        return javaStmtLists;
    }

    public void setJavaStmtLists(List<JavaStmtList> javaStmtLists) {
        this.javaStmtLists = javaStmtLists;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < javaStmtLists.size(); i++) {
            javaStmtLists.get(i).accept(astVisitor);
        }
        if (sqlStmts.size()>0)
            for(int i = 0 ; i < this.sqlStmts.size() ; i++){
                this.sqlStmts.get(i).accept(astVisitor);
            }
    }


    //    @Override
//    public void accept(ASTVisitor astVisitor){
//        astVisitor.visit(this);
////        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
//        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
//            this.sqlStmts.get(i).accept(astVisitor);
//        }
//    }
}
