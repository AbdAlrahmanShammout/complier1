package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;

public class StatementList extends Node {
    private ArrayList<Statement> statements = new ArrayList<>();

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }
}
