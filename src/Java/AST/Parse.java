package Java.AST;

import Java.AST.QueryStmt.Statement;
//import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaStmtList;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    //todo add this
    private List<JavaStmtList> javaStmtLists = new ArrayList<JavaStmtList>();

    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public List<JavaStmtList> getJavaStmtLists() {
        return javaStmtLists;
    }

    public void setJavaStmtLists(List<JavaStmtList> javaStmtLists) {
        this.javaStmtLists = javaStmtLists;
    }

    public void addJavaStmt(JavaStmtList javaStmtList){
        this.javaStmtLists.add(javaStmtList);
    }


    @Override
    public String toString(){
        return "sql stmts = "+ getSqlStmts().get(0).getName();
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
