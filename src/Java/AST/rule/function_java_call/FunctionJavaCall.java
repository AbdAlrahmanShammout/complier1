package Java.AST.rule.function_java_call;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaBody;

public class FunctionJavaCall extends JavaBody {
    private String functionName;
    private ArgumentsList argumentsList;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArgumentsList getArgumentsList() {
        return argumentsList;
    }

    public void setArgumentsList(ArgumentsList argumentsList) {
        this.argumentsList = argumentsList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        argumentsList.accept(astVisitor);
    }

}
