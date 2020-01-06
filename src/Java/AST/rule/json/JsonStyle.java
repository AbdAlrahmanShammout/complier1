package Java.AST.rule.json;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class JsonStyle extends Node {
    private String key;
    private JsonVal jsonVal = new JsonVal();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        jsonVal.accept(astVisitor);
    }

    public String getName() {
        return key;
    }

    public void setName(String key) {
        this.key = key;
    }

    public JsonVal getJsonVal() {
        return jsonVal;
    }

    public void setJsonVal(JsonVal jsonVal) {
        this.jsonVal = jsonVal;
    }
}
