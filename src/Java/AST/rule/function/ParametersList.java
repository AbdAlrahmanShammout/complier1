package Java.AST.rule.function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ParametersList extends Node {

    private ArrayList<String> parametersNames = new ArrayList<>();
    private ArrayList<DefaultParameters> defaultParameters = new ArrayList<>();

    public ArrayList<String> getParametersNames() {
        return parametersNames;
    }

    public void setParametersNames(ArrayList<String> parametersNames) {
        this.parametersNames = parametersNames;
    }

    public ArrayList<DefaultParameters> getDefaultParameters() {
        return defaultParameters;
    }

    public void setDefaultParameters(ArrayList<DefaultParameters> defaultParameters) {
        this.defaultParameters = defaultParameters;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < defaultParameters.size(); i++) {
            defaultParameters.get(i).accept(astVisitor);
        }

    }
}
