package Java.AST.rule.while_stmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.ConditionJava;

public class WhileJavaHeader extends Node {
    private ConditionJava conditionJava ;

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        conditionJava.accept(astVisitor);
    }
}
