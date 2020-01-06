package Java.AST.QueryStmt;

import Java.AST.Node;

public class Name extends Node {

    private String name="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
