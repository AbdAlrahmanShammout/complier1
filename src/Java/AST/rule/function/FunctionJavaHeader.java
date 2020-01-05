package Java.AST.rule.function;

import Java.AST.Node;

public class FunctionJavaHeader extends Node {

    private String functionName;
    private ParametersList parametersList = new ParametersList();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ParametersList getParametersList() {
        return parametersList;
    }

    public void setParametersList(ParametersList parametersList) {
        this.parametersList = parametersList;
    }
}
