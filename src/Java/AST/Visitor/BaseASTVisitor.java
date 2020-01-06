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

public class BaseASTVisitor implements ASTVisitor {


    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
        System.out.println("---------------");
    }

    @Override
    public void visit(AssignmentJavaListVar assignmentJavaListVar) {
        System.out.println("ast AssignmentJavaListVar ");
        System.out.println("---------------");

    }

    @Override
    public void visit(AssignmentJavaVar assignmentJavaVar) {
        System.out.println("ast AssignmentJavaVar ");
        if (assignmentJavaVar.getName()!=null){
            System.out.println("ast AssignmentJavaVar Name: "+ assignmentJavaVar.getName());
        }
        System.out.println("---------------");

    }

    @Override
    public void visit(DeclareJavaArray declareJavaArray) {
        System.out.println("ast DeclareJavaArray ");
        if (declareJavaArray.getName()!= null){
            System.out.println("ast DeclareJavaArray Name: "+ declareJavaArray.getName());
        }
        System.out.println("---------------");

    }

    @Override
    public void visit(DeclareJavaVar declareJavaVar) {
        System.out.println("ast DeclareJavaVar ");
        System.out.println("---------------");

    }

    @Override
    public void visit(DeclareJavaVarNotAssignment declareJavaVarNotAssignment) {
        System.out.println("ast DeclareJavaVarNotAssignment ");
        for (int i = 0; i < declareJavaVarNotAssignment.getNamesVar().size(); i++) {
            System.out.println("ast DeclareJavaVarNotAssignment namesVar : "+declareJavaVarNotAssignment.getNamesVar().get(i));
        }
        System.out.println("---------------");
    }

    @Override
    public void visit(DoWhileJavaRule doWhileJavaRule) {
        System.out.println("ast DoWhileJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ForJavaHeader forJavaHeader) {
        System.out.println("ast ForJavaHeader ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ForJavaRule forJavaRule) {
        System.out.println("ast ForJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(DefaultParameters defaultParameters) {
        System.out.println("ast ForJavaRule ");
        System.out.println("ast DefaultParameters parameterName : "+defaultParameters.getParameterName());
        System.out.println("---------------");
    }

    @Override
    public void visit(FunctionJavaHeader functionJavaHeader) {
        System.out.println("ast FunctionJavaHeader ");
        System.out.println("ast FunctionJavaHeader functionName:"+functionJavaHeader.getFunctionName());
        System.out.println("---------------");

    }

    @Override
    public void visit(FunctionJavaRule functionJavaRule) {
        System.out.println("ast FunctionJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ParametersList parametersList) {
        System.out.println("ast ParametersList ");
        for (int i = 0; i < parametersList.getParametersNames().size(); i++) {
            System.out.println("ast ParametersList parametersNames : "+parametersList.getParametersNames().get(i));
        }
        System.out.println("---------------");
    }

    @Override
    public void visit(Argument argument) {
        System.out.println("ast Argument ");
        System.out.println("---------------");
    }

    @Override
    public void visit(ArgumentsList argumentsList) {
        System.out.println("ast ArgumentsList ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ArrowFunctionJava arrowFunctionJava) {
        System.out.println("ast ArrowFunctionJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(FunctionJavaCall functionJavaCall) {
        System.out.println("ast ArrowFunctionJava ");
        System.out.println("ast ArrowFunctionJava functionName : "+functionJavaCall.getFunctionName());
        System.out.println("---------------");

    }

    @Override
    public void visit(IfOneLineJava ifOneLineJava) {
        System.out.println("ast IfOneLineJava ");
        System.out.println("ast IfOneLineJava is Not? : "+ ifOneLineJava.getNot());
        System.out.println("---------------");

    }

    @Override
    public void visit(IfOneLineReturnJava ifOneLineReturnJava) {
        System.out.println("ast IfOneLineReturnJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(IfBasicJavaRule ifBasicJavaRule) {
        System.out.println("ast IfBasicJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(IfJavaRule ifJavaRule) {
        System.out.println("ast IfJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(PrintJava printJava) {
        System.out.println("ast PrintJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ReturnJava returnJava) {
        System.out.println("ast ReturnJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ShortenJavaOperators shortenJavaOperators) {
        System.out.println("ast ShortenJavaOperators ");
        System.out.println("ast ShortenJavaOperators name : "+shortenJavaOperators.getName());
        if (shortenJavaOperators.getOperator()!=null)
            System.out.println("ast ShortenJavaOperators operator : "+shortenJavaOperators.getOperator());
        if (shortenJavaOperators.getExprVal()!=null)
            System.out.println("ast ShortenJavaOperators exprVal : "+shortenJavaOperators.getExprVal());
        System.out.println("---------------");
    }

    @Override
    public void visit(SwitchJavaCase switchJavaCase) {
        System.out.println("ast SwitchJavaCase ");
        System.out.println("---------------");

    }

    @Override
    public void visit(SwitchJavaRule switchJavaRule) {
        System.out.println("ast SwitchJavaRule ");
        System.out.println("ast SwitchJavaRule switchKey : "+ switchJavaRule.getSwitchKey());
        System.out.println("---------------");

    }

    @Override
    public void visit(WhileJavaHeader whileJavaHeader) {
        System.out.println("ast WhileJavaHeader ");
        System.out.println("---------------");

    }

    @Override
    public void visit(WhileJavaRule whileJavaRule) {
        System.out.println("ast WhileJavaRule ");
        System.out.println("---------------");

    }

    @Override
    public void visit(BodyBracketsJava bodyBracketsJava) {
        System.out.println("ast BodyBracketsJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(ConditionJava conditionJava) {
        System.out.println("ast ConditionJava ");
        System.out.println("---------------");

    }

    @Override
    public void visit(JavaBody javaBody) {
        System.out.println("ast JavaBody ");
        System.out.println("ast JavaBody a have break? = "+javaBody.isAbreak());
        System.out.println("---------------");
    }

    @Override
    public void visit(JavaStmtList javaStmtList) {
        System.out.println("ast JavaStmtList ");
        System.out.println("---------------");

    }

    @Override
    public void visit(Expr expr) {
        System.out.println("ast Expr ");
        System.out.println("---------------");

    }
}



