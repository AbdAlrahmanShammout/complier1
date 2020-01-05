package Java.AST.rule;

import Java.AST.Node;

import java.util.ArrayList;

public class BodyBracketsJava extends Node {
    private ArrayList<JavaBody> javaBodies = new ArrayList<>();

    public ArrayList<JavaBody> getJavaBodies() {
        return javaBodies;
    }

    public void setJavaBodies(ArrayList<JavaBody> javaBodies) {
        this.javaBodies = javaBodies;
    }
}
