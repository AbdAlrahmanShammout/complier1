package Java.AST.rule.assignmentVar;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class AssignmentJavaListVar extends JavaBody {
    private ArrayList<AssignmentJavaVar> assignmentJavaVars = new ArrayList<>();

    public ArrayList<AssignmentJavaVar> getAssignmentJavaVars() {
        return assignmentJavaVars;
    }

    public void setAssignmentJavaVars(ArrayList<AssignmentJavaVar> assignmentJavaVars) {
        this.assignmentJavaVars = assignmentJavaVars;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < assignmentJavaVars.size(); i++) {
            assignmentJavaVars.get(i).accept(astVisitor);
        }
    }
}
