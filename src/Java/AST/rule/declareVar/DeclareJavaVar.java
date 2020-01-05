package Java.AST.rule.declareVar;

import Java.AST.rule.JavaBody;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;

public class DeclareJavaVar extends JavaBody {
    private AssignmentJavaListVar assignmentJavaListVar = new AssignmentJavaListVar();

    public AssignmentJavaListVar getAssignmentJavaListVar() {
        return assignmentJavaListVar;
    }

    public void setAssignmentJavaListVar(AssignmentJavaListVar assignmentJavaListVar) {
        this.assignmentJavaListVar = assignmentJavaListVar;
    }
}
