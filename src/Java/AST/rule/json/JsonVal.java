package Java.AST.rule.json;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Expr;

public class JsonVal extends Node {
    private Expr expr;
    private JsonRule jsonRule;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (expr!=null)
            expr.accept(astVisitor);
        if (jsonRule!=null)
            jsonRule.accept(astVisitor);
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public JsonRule getJsonRule() {
        return jsonRule;
    }

    public void setJsonRule(JsonRule jsonRule) {
        this.jsonRule = jsonRule;
    }
}
