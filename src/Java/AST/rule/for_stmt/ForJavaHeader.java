package Java.AST.rule.for_stmt;

import Java.AST.Node;
import Java.AST.rule.ConditionJava;
import Java.AST.rule.Expr;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;
import Java.AST.rule.assignmentVar.AssignmentJavaVar;
import Java.AST.rule.shortenOperators.ShortenJavaOperators;

public class ForJavaHeader extends Node {

    private AssignmentJavaListVar assignmentJavaListVar = new AssignmentJavaListVar();
    private ConditionJava conditionJava = new ConditionJava();
    private ShortenJavaOperators shortenJavaOperatorsFor = new ShortenJavaOperators();


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
}
