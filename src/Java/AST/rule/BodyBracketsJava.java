package Java.AST.rule;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class BodyBracketsJava extends Node {
    private ArrayList<JavaBody> javaBodies = new ArrayList<>();

    public ArrayList<JavaBody> getJavaBodies() {
        return javaBodies;
    }

    public void setJavaBodies(ArrayList<JavaBody> javaBodies) {
        this.javaBodies = javaBodies;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (javaBodies!=null){
            for (int i = 0; i < javaBodies.size(); i++) {
                javaBodies.get(i).accept(astVisitor);
            }
        }
    }
}
