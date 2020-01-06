package Java.AST.rule.declareVar;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaBody;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;

public class DeclareJavaVar extends JavaBody {
    private AssignmentJavaListVar assignmentJavaListVar;

    public AssignmentJavaListVar getAssignmentJavaListVar() {
        return assignmentJavaListVar;
    }

    public void setAssignmentJavaListVar(AssignmentJavaListVar assignmentJavaListVar) {
        this.assignmentJavaListVar = assignmentJavaListVar;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        assignmentJavaListVar.accept(astVisitor);
    }
}
