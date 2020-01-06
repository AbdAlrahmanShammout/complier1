package Java.Base;

import Java.AST.Parse;
import Java.AST.QueryStmt.SelectStmt;
import Java.AST.QueryStmt.Statement;
import Java.AST.QueryStmt.StatementList;
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
import gen.SqlBaseVisitor;
import gen.SqlParser;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SqlBaseVisitor {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Parse visitParse(SqlParser.ParseContext ctx) {
        System.out.println("visit Parse");
        Parse p = new Parse();

        for (int i = 0; i < ctx.java_stmt_list().size(); i++) {
            p.getJavaStmtLists().add(visitJava_stmt_list(ctx.java_stmt_list(i)));
        }

        for (int i = 0; i < ctx.sql_stmt_list().size(); i++) {
            p.getSqlStmtList().add(visitSql_stmt_list(ctx.sql_stmt_list(i)));
        }

        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }

    @Override
    public JavaStmtList visitJava_stmt_list(SqlParser.Java_stmt_listContext ctx) {
        System.out.println("visit Java_stmt_list");
        JavaStmtList javaStmtList = new JavaStmtList();
        for (int i = 0; i < ctx.java_stmt().size(); i++) {
            javaStmtList.getJavaStmts().add(visitJava_stmt(ctx.java_stmt(i)));
        }
        return javaStmtList;
    }


    @Override
    public JavaStmt visitJava_stmt(SqlParser.Java_stmtContext ctx) {
        System.out.println("visit Java_stmt");
        FunctionJavaRule functionJavaRule = new FunctionJavaRule();
        functionJavaRule.setFunctionJavaHeader(visitFunction_java_header(ctx.function_java_rule().function_java_header()));
        if (ctx.function_java_rule().java_body()!=null){
            for (int i = 0; i < ctx.function_java_rule().java_body().size(); i++) {
                functionJavaRule.getJavaBodies().add(visitJava_body(ctx.function_java_rule().java_body(i)));
            }
        }
        return functionJavaRule;
    }

    //============Function_java============
    @Override
    public FunctionJavaHeader visitFunction_java_header(SqlParser.Function_java_headerContext ctx) {
        System.out.println("visit Function_java_header");
        FunctionJavaHeader functionJavaHeader = new FunctionJavaHeader();
        functionJavaHeader.setFunctionName(ctx.function_java_name().getText());
        functionJavaHeader.setParametersList(visitParameters_list(ctx.parameters_list()));
        return  functionJavaHeader;
    }

    @Override
    public ParametersList visitParameters_list(SqlParser.Parameters_listContext ctx) {
        System.out.println("visit Parameters_list");
        ParametersList parametersList = new ParametersList();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            parametersList.getParametersNames().add(ctx.IDENTIFIER(i).getText());
        }
        for (int i = 0; i < ctx.default_parameters().size(); i++) {
            parametersList.getDefaultParameters().add(visitDefault_parameters(ctx.default_parameters(i)));
        }
        return parametersList;
    }

    @Override
    public DefaultParameters visitDefault_parameters(SqlParser.Default_parametersContext ctx) {
        System.out.println("visit Default_parameters");
        DefaultParameters defaultParameters = new DefaultParameters();
        defaultParameters.setParameterName(ctx.IDENTIFIER().getText());
        defaultParameters.setParameterVal(visitExpr(ctx.expr()));
        return defaultParameters;
    }
    //====================================






    //============declare_var_java & assignment_var_list_java============

    @Override
    public DeclareJavaVar visitDeclare_var_java(SqlParser.Declare_var_javaContext ctx) {
        System.out.println("visit Declare_var_java");
        DeclareJavaVar declareJavaVar = new DeclareJavaVar();
        declareJavaVar.setAssignmentJavaListVar(visitAssignment_var_list_java(ctx.assignment_var_list_java()));
        return declareJavaVar;
    }

    @Override
    public DeclareJavaVarNotAssignment visitDeclare_var_java_not_assignmen(SqlParser.Declare_var_java_not_assignmenContext ctx) {
        DeclareJavaVarNotAssignment declareJavaVarNotAssignment = new DeclareJavaVarNotAssignment();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            declareJavaVarNotAssignment.getNamesVar().add(ctx.IDENTIFIER(i).getText());
        }
        return declareJavaVarNotAssignment;
    }

    @Override
    public AssignmentJavaListVar visitAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx) {
        System.out.println("visit Assignment_var_list_java");
        AssignmentJavaListVar assignmentJavaListVar = new AssignmentJavaListVar();
        for (int i = 0; i < ctx.assignment_var_java().size(); i++) {
            assignmentJavaListVar.getAssignmentJavaVars().add(visitAssignment_var_java(ctx.assignment_var_java(i)));
        }
        return  assignmentJavaListVar;
    }

    @Override
    public AssignmentJavaVar visitAssignment_var_java(SqlParser.Assignment_var_javaContext ctx) {
        System.out.println("visit Assignment_var_java");
        AssignmentJavaVar assignmentJavaVar = new AssignmentJavaVar();
        assignmentJavaVar.setName(ctx.IDENTIFIER().getText());
        assignmentJavaVar.setExprVal(visitExpr(ctx.expr()));
        return assignmentJavaVar;
    }

    //====================================


    //============declare_array_java============
    @Override
    public DeclareJavaArray visitDeclare_array_java(SqlParser.Declare_array_javaContext ctx) {
        System.out.println("visit Declare_array_java");
        DeclareJavaArray declareJavaArray = new DeclareJavaArray();
        declareJavaArray.setName(ctx.IDENTIFIER().getText());
        declareJavaArray.setArray(visitExpr(ctx.expr()));
        return  declareJavaArray;
    }

    //======================================


    //============switch_stmt============
    @Override
    public SwitchJavaRule visitSwitch_stmt(SqlParser.Switch_stmtContext ctx) {
        System.out.println("visit Switch_stmt");
        SwitchJavaRule switchJavaRule = new SwitchJavaRule();
        switchJavaRule.setSwitchKey(ctx.IDENTIFIER().getText());
        for (int i = 0; i < ctx.switch_case().size(); i++) {
            switchJavaRule.getSwitchJavaCases().add(visitSwitch_case(ctx.switch_case(i)));
        }
        for (int i = 0; i < ctx.java_body().size(); i++) {
            switchJavaRule.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
        }
        return switchJavaRule;
    }

    @Override
    public SwitchJavaCase visitSwitch_case(SqlParser.Switch_caseContext ctx) {
        System.out.println("visit Switch_case");
        SwitchJavaCase switchJavaCase = new SwitchJavaCase();
        switchJavaCase.setCaseExpr(visitExpr(ctx.expr()));
        for (int i = 0; i < ctx.java_body().size(); i++) {
            switchJavaCase.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
        }
        return switchJavaCase;
    }

    //======================================


    //================function_java_call==========

    @Override
    public FunctionJavaCall visitFunction_java_call(SqlParser.Function_java_callContext ctx) {
        System.out.println("visit Function_java_call");
        FunctionJavaCall functionJavaCall = new FunctionJavaCall();
        functionJavaCall.setFunctionName(ctx.function_java_name().getText());
        functionJavaCall.setArgumentsList(visitArguments_list(ctx.arguments_list()));
        return functionJavaCall;
    }

    @Override
    public ArgumentsList visitArguments_list(SqlParser.Arguments_listContext ctx) {
        System.out.println("visit Arguments_list");
        ArgumentsList argumentsList = new ArgumentsList();
        if (ctx.argument() != null) {
            for (int i = 0; i < ctx.argument().size(); i++) {
                argumentsList.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }
        return argumentsList;
    }

    @Override
    public Argument visitArgument(SqlParser.ArgumentContext ctx) {
        System.out.println("visit Argument");
        Argument argument = new Argument();
        if (ctx.expr() != null) {
            argument.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.arrow_function_java() != null) {
            argument.setArrowFunctionJava(visitArrow_function_java(ctx.arrow_function_java()));
        }
        return argument;
    }

    @Override
    public ArrowFunctionJava visitArrow_function_java(SqlParser.Arrow_function_javaContext ctx) {
        System.out.println("visit Arrow_function_java");
        ArrowFunctionJava arrowFunctionJava = new ArrowFunctionJava();
        arrowFunctionJava.setParametersList(visitParameters_list(ctx.parameters_list()));
        arrowFunctionJava.setReturnExpr(visitExpr(ctx.expr()));
        return arrowFunctionJava;
    }
    //======================================

    //============if_java============
    @Override
    public IfJavaRule visitIf_java_rule(SqlParser.If_java_ruleContext ctx) {
        System.out.println("visit If_java_rule");
        IfJavaRule ifJavaRule  = new IfJavaRule();
        for (int i = 0; i < ctx.if_basic_java_rule().size(); i++) {
            ifJavaRule.getIfBasicJavaRules().add(visitIf_basic_java_rule(ctx.if_basic_java_rule(i)));
        }
        if (ctx.body_brackets_java()!=null){
            ifJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        }
        return ifJavaRule;
    }

    @Override
    public IfBasicJavaRule visitIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx) {
        System.out.println("visit If_basic_java_rule");
        IfBasicJavaRule ifBasicJavaRule = new IfBasicJavaRule();
        ifBasicJavaRule.setConditionJava(visitCondition_java(ctx.condition_java()));
        ifBasicJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        return ifBasicJavaRule;
    }

    @Override
    public ConditionJava visitCondition_java(SqlParser.Condition_javaContext ctx) {
        System.out.println("visit Condition_java");
        ConditionJava conditionJava = new ConditionJava();
        conditionJava.setExpr(visitExpr(ctx.expr()));
        return conditionJava;
    }

    //====================================



    //============if_one_line_java============

    @Override
    public IfOneLineJava visitIf_one_line(SqlParser.If_one_lineContext ctx) {
        System.out.println("visit If_one_line");
        IfOneLineJava ifOneLineJava = new IfOneLineJava();
        if (ctx.NOT()!=null){
            ifOneLineJava.setNot(true);
        }
        ifOneLineJava.setConditionJava(visitCondition_java(ctx.condition_java()));
        for (int i = 0; i < ctx.if_one_line_return().size(); i++) {
            ifOneLineJava.getIfOneLineReturnJavas().add(visitIf_one_line_return(ctx.if_one_line_return(i)));
        }
        return ifOneLineJava;
    }

    @Override
    public IfOneLineReturnJava visitIf_one_line_return(SqlParser.If_one_line_returnContext ctx) {
        System.out.println("visit If_one_line_return");
        IfOneLineReturnJava ifOneLineReturnJava = new IfOneLineReturnJava();
        if (ctx.expr()!=null){
            ifOneLineReturnJava.setExprReturn(visitExpr(ctx.expr()));
        }
        if (ctx.body_brackets_java()!=null){
            ifOneLineReturnJava.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        }
        return ifOneLineReturnJava;
    }

    //====================================


    //==============for_java=============

    @Override
    public ForJavaRule visitFor_java_rule(SqlParser.For_java_ruleContext ctx) {
        System.out.println("visit For_java_rule");
        ForJavaRule forJavaRule = new ForJavaRule();
        forJavaRule.setForJavaHeader(visitFor_java_header(ctx.for_java_header()));
        forJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        return forJavaRule;
    }

    @Override
    public ForJavaHeader visitFor_java_header(SqlParser.For_java_headerContext ctx) {
        System.out.println("visit For_java_header");
        ForJavaHeader forJavaHeader = new ForJavaHeader();
        forJavaHeader.setAssignmentJavaListVar(visitAssignment_var_list_java(ctx.assignment_var_list_java()));
        forJavaHeader.setConditionJava(visitCondition_java(ctx.condition_java()));
        forJavaHeader.setShortenJavaOperatorsFor(visitShorten_operators_java(ctx.shorten_operators_java()));
        return forJavaHeader;
    }

    //====================================

    //===============while_java=====================
    @Override
    public WhileJavaRule visitWhile_java_rule(SqlParser.While_java_ruleContext ctx) {
        System.out.println("visit While_java_rule");
        WhileJavaRule whileJavaRule = new WhileJavaRule();
        whileJavaRule.setWhileJavaHeader(visitWhile_java_header(ctx.while_java_header()));
        whileJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        return whileJavaRule;
    }

    @Override
    public WhileJavaHeader visitWhile_java_header(SqlParser.While_java_headerContext ctx) {
        System.out.println("visit While_java_header");
        WhileJavaHeader whileJavaHeader = new WhileJavaHeader();
        whileJavaHeader.setConditionJava(visitCondition_java(ctx.condition_java()));
        return whileJavaHeader;
    }

    //====================================


    //===============do_while_java=====================
    @Override
    public DoWhileJavaRule visitDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx) {
        System.out.println("visit Do_while_java_rule");
        DoWhileJavaRule doWhileJavaRule = new DoWhileJavaRule();
        doWhileJavaRule.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
        doWhileJavaRule.setWhileJavaHeader(visitWhile_java_header(ctx.while_java_header()));
        return doWhileJavaRule;
    }

    //====================================


    //===============print_java=====================
    @Override
    public PrintJava visitPrint_java(SqlParser.Print_javaContext ctx) {
        System.out.println("visit Print_java");
        PrintJava printJava = new PrintJava();
        printJava.setExprPrint(visitExpr(ctx.expr()));
        return printJava;
    }
    //====================================

    //===============print_java=====================
    @Override
    public ReturnJava visitReturn_stmt(SqlParser.Return_stmtContext ctx) {
        System.out.println("visit Return_stmt");
        ReturnJava returnJava = new ReturnJava();
        if (ctx.if_one_line()!=null){
            returnJava.setIfOneLineJava(visitIf_one_line(ctx.if_one_line()));
        }else if (ctx.expr()!=null){
            returnJava.setExprReturn(visitExpr(ctx.expr()));
        }
        return returnJava;
    }
    //====================================



    @Override
    public ShortenJavaOperators visitShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx) {
        System.out.println("visit Shorten_operators_java");
        ShortenJavaOperators shortenJavaOperators = new ShortenJavaOperators();
        shortenJavaOperators.setName(ctx.any_name_no_keyword().getText());
        if (ctx.expr()!=null){
            shortenJavaOperators.setExprVal(visitExpr(ctx.expr()));
        }
        if (ctx.PLUS_PLUS()!=null){
            shortenJavaOperators.setOperator(ctx.PLUS_PLUS().getText());
        }else if (ctx.MINUS_MINUS()!=null){
            shortenJavaOperators.setOperator(ctx.MINUS_MINUS().getText());
        }else if (ctx.PLUS_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.PLUS_ASSIGN().getText());
        }else if (ctx.MINUS_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.MINUS_ASSIGN().getText());
        }else if (ctx.DIV_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.DIV_ASSIGN().getText());
        }else if (ctx.POWER_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.POWER_ASSIGN().getText());
        }else if (ctx.MOD_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.MOD_ASSIGN().getText());
        }else if (ctx.STAR_ASSIGN()!=null){
            shortenJavaOperators.setOperator(ctx.STAR_ASSIGN().getText());
        }
        return shortenJavaOperators;
    }

    @Override
    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx) {
        System.out.println("visit Java_body");
        if (ctx.declare_var_java() != null){
            DeclareJavaVar declareJavaVar = visitDeclare_var_java(ctx.declare_var_java());
            return declareJavaVar;
        }
        if (ctx.declare_var_java_not_assignmen() != null){
            DeclareJavaVarNotAssignment declareJavaVarNotAssignment = visitDeclare_var_java_not_assignmen(ctx.declare_var_java_not_assignmen());
            return declareJavaVarNotAssignment;
        }
        if (ctx.assignment_var_list_java() != null){
            AssignmentJavaListVar assignmentJavaListVar = visitAssignment_var_list_java(ctx.assignment_var_list_java());
            return assignmentJavaListVar;
        }
        if (ctx.declare_array_java() != null){
            DeclareJavaArray declareJavaArray = visitDeclare_array_java(ctx.declare_array_java());
            return declareJavaArray;
        }
        if (ctx.shorten_operators_java() != null){
            ShortenJavaOperators shortenJavaOperators = visitShorten_operators_java(ctx.shorten_operators_java());
            return shortenJavaOperators;
        }
        if (ctx.switch_stmt() != null){
            SwitchJavaRule switchJavaRule = visitSwitch_stmt(ctx.switch_stmt());
        return switchJavaRule;
        }
        if (ctx.function_java_call() != null){
            FunctionJavaCall functionJavaCall = visitFunction_java_call(ctx.function_java_call());
            return functionJavaCall;
        }
        if (ctx.if_java_rule()!= null){
            IfJavaRule ifJavaRule = visitIf_java_rule(ctx.if_java_rule());
            return ifJavaRule;
        }
        if (ctx.if_one_line()!= null){
            IfOneLineJava ifJavaRule =  visitIf_one_line(ctx.if_one_line());
            return ifJavaRule;
        }
        if (ctx.for_java_rule()!= null){
            ForJavaRule forJavaRule = visitFor_java_rule(ctx.for_java_rule());
            return forJavaRule;
        }
        if (ctx.while_java_rule()!= null){
            WhileJavaRule whileJavaRule = visitWhile_java_rule(ctx.while_java_rule());
            return whileJavaRule;
        }
        if (ctx.do_while_java_rule()!= null){
            DoWhileJavaRule doWhileJavaRule = visitDo_while_java_rule(ctx.do_while_java_rule());
            return doWhileJavaRule;
        }
        if (ctx.print_java()!= null){
            PrintJava printJava = visitPrint_java(ctx.print_java());
            return printJava;
        }
        if (ctx.K_BREAK()!= null){
            JavaBody javaBody = new JavaBody();
            javaBody.setAbreak(true);
            return javaBody;
        }
        if (ctx.return_stmt()!= null){
            ReturnJava returnJava = visitReturn_stmt(ctx.return_stmt());
            return returnJava;
        }
        return null;
    }

    @Override
    public BodyBracketsJava visitBody_brackets_java(SqlParser.Body_brackets_javaContext ctx) {
        System.out.println("visit Body_brackets_java");
        BodyBracketsJava bodyBracketsJava = new BodyBracketsJava();
        //todo remove line check for test
        if (ctx.java_body() != null){
            for (int i = 0; i < ctx.java_body().size(); i++) {
                bodyBracketsJava.getJavaBodies().add(visitJava_body(ctx.java_body(i)));
            }
        }
        return bodyBracketsJava;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Expr visitExpr(SqlParser.ExprContext ctx) {
        System.out.println("visit Expr");
        return new Expr(); }











    @Override
    public StatementList visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
        System.out.println("visit Sql_stmt_list");
        StatementList statementList = new StatementList();
        for (int i =0; i < ctx.sql_stmt().size() ; i++){
            statementList.getStatements().add(visitSql_stmt(ctx.sql_stmt(i)));
        }
        return statementList;
    }

    @Override
    public Statement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {
        System.out.println("visit Sql_stmt");
        Statement statement = new SelectStmt();

        return statement;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitError(SqlParser.ErrorContext ctx) { return visitChildren(ctx); }





    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitSelect_stmt(SqlParser.Select_stmtContext ctx) {
        System.out.println("visit Select_stmt");

        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitOrdering_term(SqlParser.Ordering_termContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitResult_column(SqlParser.Result_columnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_alias(SqlParser.Column_aliasContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_name(SqlParser.Column_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitDatabase_name(SqlParser.Database_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCollation_name(SqlParser.Collation_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitLiteral_value(SqlParser.Literal_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitAny_name(SqlParser.Any_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SqlParser.KeywordContext ctx) { return visitChildren(ctx); }
}
