package Java.AST.Visitor;

import Java.AST.Parse;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;
import Java.AST.rule.assignmentVar.AssignmentJavaVar;
import Java.AST.rule.if_stmt.IfJavaRule;
import Java.AST.rule.switch_stmt.SwitchJavaRule;

public interface ASTVisitor {
    void visit(Parse p);

    //this look
    void visit(AssignmentJavaListVar assignmentJavaListVar);
    void visit(AssignmentJavaVar assignmentJavaVar);
    //this look





//    public void visit(SwitchJavaRule switchJavaRule);
//    public void visit(IfJavaRule ifJavaRule);

//    public void visit(FunctionDeclaration funcDec);
//    public void visit(Statement stmt);
//    public void visit(SelectStmt selectStmt);
//    public void visit(SwitchLabel switchLabel);
//    public void visit(SwitchStatement switchStatement);
//    public void visit(SwitchBlockStatementGroup switchBlockStatementGroup);
//    public void visit(Value value);
//    public void visit(WhileStmt whileStmt);
//    public void visit(SignedNumber signedNumber);
//    public void visit(TableConstraint tableConstraint);
//    public void visit(TC_ForeignKey tc_foreignKey);
//    public void visit(TC_Key tc_key);
//    public void visit(TC_Unique tc_unique);
//    public void visit(TypeName typeName);
}
