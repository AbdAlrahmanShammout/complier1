package Java.AST.Visitor;

import Java.AST.Parse;
import Java.AST.rule.*;
import Java.AST.rule.assignmentVar.AssignmentJavaListVar;
import Java.AST.rule.assignmentVar.AssignmentJavaVar;
import Java.AST.rule.declareJavaArray.DeclareJavaArray;
import Java.AST.rule.declareVar.DeclareJavaVar;
import Java.AST.rule.declareVarNotAssignmen.DeclareJavaVarNotAssignment;
import Java.AST.rule.doWhile_stmt.DoWhileJavaRule;
import Java.AST.rule.for_stmt.ForJavaHeader;
import Java.AST.rule.for_stmt.ForJavaRule;
import Java.AST.rule.function.DefaultParameters;
import Java.AST.rule.function.FunctionJavaHeader;
import Java.AST.rule.function.FunctionJavaRule;
import Java.AST.rule.function.ParametersList;
import Java.AST.rule.function_java_call.Argument;
import Java.AST.rule.function_java_call.ArgumentsList;
import Java.AST.rule.function_java_call.ArrowFunctionJava;
import Java.AST.rule.function_java_call.FunctionJavaCall;
import Java.AST.rule.if_one_line.IfOneLineJava;
import Java.AST.rule.if_one_line.IfOneLineReturnJava;
import Java.AST.rule.if_stmt.IfBasicJavaRule;
import Java.AST.rule.if_stmt.IfJavaRule;
import Java.AST.rule.print.PrintJava;
import Java.AST.rule.return_stmt.ReturnJava;
import Java.AST.rule.shortenOperators.ShortenJavaOperators;
import Java.AST.rule.switch_stmt.SwitchJavaCase;
import Java.AST.rule.switch_stmt.SwitchJavaRule;
import Java.AST.rule.while_stmt.WhileJavaHeader;
import Java.AST.rule.while_stmt.WhileJavaRule;

public interface ASTVisitor {

    void visit(Parse p);

    void visit(AssignmentJavaListVar assignmentJavaListVar);

    void visit(AssignmentJavaVar assignmentJavaVar);

    void visit(DeclareJavaArray declareJavaArray);

    void visit(DeclareJavaVar declareJavaVar);

    void visit(DeclareJavaVarNotAssignment declareJavaVarNotAssignment);

    void visit(DoWhileJavaRule doWhileJavaRule);

    void visit(ForJavaHeader forJavaHeader);

    void visit(ForJavaRule forJavaRule);

    void visit(DefaultParameters defaultParameters);

    void visit(FunctionJavaHeader functionJavaHeader);

    void visit(FunctionJavaRule functionJavaRule);

    void visit(ParametersList parametersList);

    void visit(Argument argument);

    void visit(ArgumentsList argumentsList);

    void visit(ArrowFunctionJava arrowFunctionJava);

    void visit(FunctionJavaCall functionJavaCall);

    void visit(IfOneLineJava ifOneLineJava);

    void visit(IfOneLineReturnJava ifOneLineReturnJava);

    void visit(IfBasicJavaRule ifBasicJavaRule);

    void visit(IfJavaRule ifJavaRule);

    void visit(PrintJava printJava);

    void visit(ReturnJava returnJava);

    void visit(ShortenJavaOperators shortenJavaOperators);

    void visit(SwitchJavaCase switchJavaCase);

    void visit(SwitchJavaRule switchJavaRule);

    void visit(WhileJavaHeader whileJavaHeader);

    void visit(WhileJavaRule whileJavaRule);

    void visit(BodyBracketsJava bodyBracketsJava);

    void visit(ConditionJava conditionJava);

    void visit(JavaBody javaBody);

    void visit(JavaStmtList javaStmtList);

    void visit(Expr expr);



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
