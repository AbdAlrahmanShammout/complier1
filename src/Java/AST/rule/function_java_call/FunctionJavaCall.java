package Java.AST.rule.function_java_call;

import Java.AST.rule.JavaBody;

public class FunctionJavaCall extends JavaBody {
    private String functionName;
    private ArgumentsList argumentsList = new ArgumentsList();

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
}
