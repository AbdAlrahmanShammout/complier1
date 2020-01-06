package Java.AST.rule.json;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JsonRule extends Node {
    private ArrayList<JsonStyle> jsonStyles = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < jsonStyles.size(); i++) {
            jsonStyles.get(i).accept(astVisitor);
        }
    }

    public ArrayList<JsonStyle> getJsonStyles() {
        return jsonStyles;
    }

    public void setJsonStyles(ArrayList<JsonStyle> jsonStyles) {
        this.jsonStyles = jsonStyles;
    }
}
