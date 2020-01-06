package Java.AST.rule.function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class FunctionJavaHeader extends Node {

    private String functionName;
    private ParametersList parametersList;

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

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        parametersList.accept(astVisitor);
    }
}
