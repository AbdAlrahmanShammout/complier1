package Java.AST.rule.function_java_call;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ArgumentsList extends Node {
    private ArrayList<Argument> arguments = new ArrayList<>();

    public ArrayList<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Argument> arguments) {
        this.arguments = arguments;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < arguments.size(); i++) {
            arguments.get(i).accept(astVisitor);
        }
    }
}
