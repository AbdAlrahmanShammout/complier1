package Java.AST.Visitor;

import Java.AST.Parse;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;
import Java.AST.rule.assignmentVar.AssignmentJavaVar;

public class BaseASTVisitor implements ASTVisitor {


    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
    }

    @Override
    public void visit(AssignmentJavaListVar assignmentJavaListVar) {
        System.out.println("ast AssignmentJavaListVar ");

    }

    @Override
    public void visit(AssignmentJavaVar assignmentJavaVar) {
        System.out.println("ast AssignmentJavaVar ");
        if (assignmentJavaVar.getName()!=null){
            System.out.println("ast AssignmentJavaVar Name: "+ assignmentJavaVar.getName());
        }
    }
}



