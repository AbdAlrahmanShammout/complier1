package Java.AST.rule.function_java_call;

import Java.AST.Node;

import java.util.ArrayList;

public class ArgumentsList extends Node {
    private ArrayList<Argument> arguments = new ArrayList<>();

    public ArrayList<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Argument> arguments) {
        this.arguments = arguments;
    }
}
