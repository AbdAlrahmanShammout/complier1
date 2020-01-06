package Java.AST.rule.for_stmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.ConditionJava;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;
import Java.AST.rule.shortenOperators.ShortenJavaOperators;

public class ForJavaHeader extends Node {

    private AssignmentJavaListVar assignmentJavaListVar;
    private ConditionJava conditionJava;
    private ShortenJavaOperators shortenJavaOperatorsFor;


    public AssignmentJavaListVar getAssignmentJavaListVar() {
        return assignmentJavaListVar;
    }

    public void setAssignmentJavaListVar(AssignmentJavaListVar assignmentJavaListVar) {
        this.assignmentJavaListVar = assignmentJavaListVar;
    }

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }

    public ShortenJavaOperators getShortenJavaOperatorsFor() {
        return shortenJavaOperatorsFor;
    }

    public void setShortenJavaOperatorsFor(ShortenJavaOperators shortenJavaOperatorsFor) {
        this.shortenJavaOperatorsFor = shortenJavaOperatorsFor;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        assignmentJavaListVar.accept(astVisitor);
        conditionJava.accept(astVisitor);
        shortenJavaOperatorsFor.accept(astVisitor);
    }

}
