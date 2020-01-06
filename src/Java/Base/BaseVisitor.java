package Java.Base;

import Java.AST.Expr;
import Java.AST.LiteralValue;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.Create.*;
import Java.AST.QueryStmt.Select.*;
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
import Java.AST.rule.if_stmt.IfBasicJavaRule;
import Java.AST.rule.if_stmt.IfJavaRule;
import Java.AST.rule.json.JsonRule;
import Java.AST.rule.json.JsonStyle;
import Java.AST.rule.json.JsonVal;
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

        if (ctx.sql_stmt_list().size()>0) {
            List<Statement> sqlStmts = (List<Statement>) visitSql_stmt_list(ctx.sql_stmt_list(0));
            p.setSqlStmts(sqlStmts);
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
//
//    @Override
//    public IfOneLineJava visitIf_one_line(SqlParser.If_one_lineContext ctx) {
//        System.out.println("visit If_one_line");
//        IfOneLineJava ifOneLineJava = new IfOneLineJava();
//        if (ctx.NOT()!=null){
//            ifOneLineJava.setNot(true);
//        }
//        ifOneLineJava.setConditionJava(visitCondition_java(ctx.condition_java()));
//        for (int i = 0; i < ctx.if_one_line_return().size(); i++) {
//            ifOneLineJava.getIfOneLineReturnJavas().add(visitIf_one_line_return(ctx.if_one_line_return(i)));
//        }
//        return ifOneLineJava;
//    }
//
//    @Override
//    public IfOneLineReturnJava visitIf_one_line_return(SqlParser.If_one_line_returnContext ctx) {
//        System.out.println("visit If_one_line_return");
//        IfOneLineReturnJava ifOneLineReturnJava = new IfOneLineReturnJava();
//        if (ctx.expr()!=null){
//            ifOneLineReturnJava.setExprReturn(visitExpr(ctx.expr()));
//        }
//        if (ctx.body_brackets_java()!=null){
//            ifOneLineReturnJava.setBodyBracketsJava(visitBody_brackets_java(ctx.body_brackets_java()));
//        }
//        return ifOneLineReturnJava;
//    }

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
        if (ctx.expr()!=null){
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
//        if (ctx.if_one_line()!= null){
//            IfOneLineJava ifJavaRule =  visitIf_one_line(ctx.if_one_line());
//            return ifJavaRule;
//        }
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
    @Override public Expr visitExpr(SqlParser.ExprContext ctx) {
        System.out.println("visit Expr");
        Expr expr = new Expr();


        if (ctx.literal_value()!=null){
            expr.setLiteralValue(visitLiteral_value(ctx.literal_value()));
        } else if (ctx.K_TRUE()!=null){
            expr.setBoolStatus(true);
        } else if (ctx.K_FALSE()!=null)
            expr.setBoolStatus(false);
        else if (ctx.json()!=null){
            expr.setJsonRule(visitJson(ctx.json()));
        }else if (ctx.QUES()!=null){//if one line
            for (int i = 0; i < ctx.expr().size(); i++) {
                expr.getExprs().add(visitExpr(ctx.expr(i)));
            }
        } else if (ctx.column_name()!=null){
            expr.setColumn_name(ctx.column_name().any_name().getText());
            if (ctx.table_name()!=null){
                expr.setTable_name(ctx.table_name().any_name_no_keyword().getText());
                if (ctx.database_name()!=null){
                    expr.setColumn_name(ctx.database_name().any_name().getText());
                }
            }
        }  else if (ctx.unary_operator()!=null){
            if (ctx.unary_operator().PLUS()!=null)
                expr.setUnary_operator("+");
            if(ctx.unary_operator().MINUS()!=null)
                expr.setUnary_operator("-");
            if(ctx.unary_operator().TILDE()!=null)
                expr.setUnary_operator("~");
            if(ctx.unary_operator().K_NOT()!=null)
                expr.setUnary_operator("not");
            expr.getExprs().add(visitExpr(ctx.expr(0)));
        } else if (ctx.function_name()!=null) {
            expr.setFunction_name(ctx.function_name().any_name().IDENTIFIER().getText());
            for(int i=0;i<ctx.expr().size();i++) {
                expr.getExprs().add(visitExpr(ctx.expr(i)));
            }
        } else if (ctx.expr().size()==1){
            expr.getExprs().add(visitExpr(ctx.expr(0)));
        }else {
            if(ctx.PIPE2()!=null){
                expr.setOperator("||");
            }
            else if(ctx.PIPE()!=null){
                expr.setOperator("|");
            }
            else if(ctx.STAR()!=null){
                expr.setOperator("*");
            }
            else if(ctx.GT()!=null){
                expr.setOperator(">");
            }
            else if(ctx.GT2()!=null){
                expr.setOperator(">>");
            }
            else if(ctx.GT_EQ()!=null){
                expr.setOperator(">=");
            }
            else if(ctx.EQ()!=null){
                expr.setOperator("==");
            }
            else if(ctx.LT()!=null){
                expr.setOperator("<");
            }
            else if(ctx.LT2()!=null){
                expr.setOperator("<<");
            }
            else if(ctx.LT_EQ()!=null){
                expr.setOperator("<=");
            }
            else if(ctx.NOT_EQ1()!=null){
                expr.setOperator("!=");
            }
            else if(ctx.NOT_EQ2()!=null){
                expr.setOperator("<>");
            }
            else if(ctx.AMP()!=null){
                expr.setOperator("&");
            }
            else if(ctx.MOD()!=null){
                expr.setOperator("%");
            }
            else if(ctx.DIV()!=null){
                expr.setOperator("/");
            }
            else if(ctx.MINUS()!=null){
                expr.setOperator("-");
            }
            else if(ctx.PLUS()!=null){
                expr.setOperator("+");
            }
            else if(ctx.K_AND()!=null){
                expr.setOperator(ctx.K_AND().getText());
            }
            else if(ctx.K_OR()!=null){
                expr.setOperator(ctx.K_OR().getText());
            }
        }
        return expr;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public LiteralValue visitLiteral_value(SqlParser.Literal_valueContext ctx) {
        System.out.println("visitLiteral_value");
        LiteralValue literalValue=new LiteralValue();
        if (ctx.BLOB_LITERAL()!=null) {
            literalValue.setBLOB_LITERAL(ctx.BLOB_LITERAL().getSymbol().getText());
        }
        if (ctx.NUMERIC_LITERAL()!=null) {
            literalValue.setNUMERIC_LITERAL(Double.parseDouble(ctx.NUMERIC_LITERAL().getSymbol().getText()));
        }
        if (ctx.STRING_LITERAL()!=null) {
            literalValue.setSTRING_LITERAL(ctx.STRING_LITERAL().getSymbol().getText());
        }
        return literalValue;
    }

    @Override
    public JsonRule visitJson(SqlParser.JsonContext ctx) {
        System.out.println("visitJson");
        JsonRule jsonRule = new JsonRule();
        if (ctx.json_style()!=null){
            for (int i = 0; i < ctx.json_style().size(); i++) {
                jsonRule.getJsonStyles().add(visitJson_style(ctx.json_style(i)));
            }
        }
        return jsonRule;
    }


    @Override
    public JsonStyle visitJson_style(SqlParser.Json_styleContext ctx) {
        System.out.println("visitJson_style");
        JsonStyle jsonStyle = new JsonStyle();
        jsonStyle.setName(ctx.IDENTIFIER().getText());
        jsonStyle.setJsonVal(visitJson_val(ctx.json_val()));
        return jsonStyle;
    }

    @Override
    public JsonVal visitJson_val(SqlParser.Json_valContext ctx) {
        System.out.println("visitJson_val");
        JsonVal jsonVal = new JsonVal();
        if (ctx.json()!=null)
            jsonVal.setJsonRule(visitJson(ctx.json()));
        if (ctx.expr()!=null)
            jsonVal.setExpr(visitExpr(ctx.expr()));
        return  jsonVal;
    }

    @Override
    public List<Statement> visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
        System.out.println("visitSql_stmt_list");
        List<Statement> sqlStmt = new ArrayList<Statement>();
        if(ctx.sql_stmt().size()>0)
            for (int i =0; i < ctx.sql_stmt().size() ; i++){
                sqlStmt.add((Statement) visitSql_stmt(ctx.sql_stmt(i)));
            }

        return sqlStmt;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Statement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt ");
        Statement s = new Statement();
        if(ctx.factored_select_stmt() != null){
            s = (Statement) visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        if(ctx.create_table_stmt()!= null)
        {
            s = (Statement) visitCreate_table_stmt(ctx.create_table_stmt());
        }
        if(ctx.drop_table_stmt()!=null){
            s=visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        if(ctx.update_stmt()!=null)
            s=visitUpdate_stmt(ctx.update_stmt());
        if(ctx.insert_stmt()!=null)
            s=visitInsert_stmt(ctx.insert_stmt());
        if(ctx.delete_stmt()!=null)
            s=visitDelete_stmt(ctx.delete_stmt());
        if(ctx.alter_table_stmt()!=null)
            s=visitAlter_table_stmt(ctx.alter_table_stmt());


        return s;
//        return visitChildren(ctx);
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
    @Override public SelectStmt visitSelect_stmt(SqlParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
        SelectStmt selectStmt=new SelectStmt();
//        selectStmt.setSelectOrValues(visitSelect_or_values(ctx.select_or_values()));
        if(ctx.ordering_term()!=null){
            for(int i=0;i<ctx.ordering_term().size();i++)
                selectStmt.getOrderingTerms().add(visitOrdering_term(ctx.ordering_term(i)));
        }
        if(ctx.expr()!=null){
            for(int i=0;i<ctx.expr().size();i++)
                selectStmt.getExprs().add(visitExpr(ctx.expr(i)));
        }

        return selectStmt;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public SelectStmt visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
    {
        System.out.println("visitFactored_select_stmt");
        SelectStmt selectStmt=new SelectStmt();
//        selectStmt.setSelectOrValues(visitSelect_or_values(ctx.select_core()));
        if(ctx.ordering_term()!=null){
            for(int i=0;i<ctx.ordering_term().size();i++)
                selectStmt.getOrderingTerms().add(visitOrdering_term(ctx.ordering_term(i)));
        }
        if(ctx.expr()!=null){
            for(int i=0;i<ctx.expr().size();i++)
                selectStmt.getExprs().add(visitExpr(ctx.expr(i)));
        }
        selectStmt.setName("Select");
        return selectStmt;
        /*SelectStmt__ select = new SelectStmt__();
        select.setFromItem((String) visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
        select.setName("Select");
        return select;*/
//        return visitChildren(ctx);

    }

    @Override
    public CreatStmt visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx) {

        System.out.println("visitCreate_table_stmt");
        CreatStmt s=new CreatStmt();
        s.setName("Create");
        ArrayList<ColumnDef> column_defs=new ArrayList<>();
        if (ctx.database_name()!=null)
            s.getDatabase_name().setName(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        s.getTable_name().setName(ctx.table_name().getText());

        for (int i =0; i < ctx.column_def().size() ; i++){
            column_defs.add((ColumnDef) visitColumn_def(ctx.column_def(i)));
        }
        s.setColumn_def(column_defs);
        if(ctx.table_constraint()!=null)
        {
            ArrayList<TableConstraint> tableConstraints=new ArrayList<>();
            for (int i=0;i<ctx.table_constraint().size();i++)
            {
                tableConstraints.add((TableConstraint) visitTable_constraint(ctx.table_constraint(i)));
            }
        }
        return s;
        //return super.visitCreate_table_stmt(ctx);
    }

    @Override
    public TypeName visitType_name(SqlParser.Type_nameContext ctx) {
        System.out.println("visitType_name");
        ArrayList<Name> anyName=new ArrayList<>();
        TypeName typeName=new TypeName();
        if(ctx.name()!=null) {

            typeName.getName().setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());

        }
        if(ctx.any_name()!=null) {
            for (int i = 0; i < ctx.any_name().size(); i++) {
                Name n = new Name();
                n.setName(ctx.any_name(i).any_name().IDENTIFIER().getSymbol().getText());
                anyName.add(n);
            }
            typeName.setAny_name(anyName);
        }
        if(ctx.signed_number()!=null) {
            for (int i = 0; i < ctx.signed_number().size(); i++) {
                typeName.getSigned_number().add(visitSigned_number(ctx.signed_number(i)));
            }
        }
        typeName.setLine(ctx.getStart().getLine()); //get line number
        typeName.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return typeName;
    }


    @Override
    public ColumnDef visitColumn_def(SqlParser.Column_defContext ctx) {
        System.out.println("visitColumn_def");
        ColumnDef columnDef=new ColumnDef();
        columnDef.getColumn_name().setName(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
        ArrayList<ColumnConstraint> column_constraint=new ArrayList<>();
        ArrayList<TypeName> typeNames=new ArrayList<>();
        for (int i =0; i < ctx.column_constraint().size() ; i++){
            column_constraint.add((ColumnConstraint) visitColumn_constraint(ctx.column_constraint(i)));
        }
        columnDef.setColumn_constraint(column_constraint);
        for (int i =0; i < ctx.type_name().size() ; i++){
            typeNames.add((TypeName) visitType_name(ctx.type_name(i)));
        }
        columnDef.setType_name(typeNames);


        columnDef.setLine(ctx.getStart().getLine()); //get line number
        columnDef.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return columnDef;
    }

    @Override
    public ColumnConstraint visitColumn_constraint(SqlParser.Column_constraintContext ctx) {
        System.out.println("visitColumn_constraint");
        ColumnConstraint columnConstraint=null;
        if(ctx.column_constraint_primary_key()!=null) {
            columnConstraint = new CCprimary_key();
            columnConstraint=visitColumn_constraint_primary_key(ctx.column_constraint_primary_key());
        }
        else if(ctx.column_constraint_foreign_key()!=null) {
            columnConstraint = new ForeignKeyClause();
            columnConstraint=visitForeign_key_clause(ctx.column_constraint_foreign_key().foreign_key_clause());
        }
        else if (ctx.column_constraint_not_null() !=null)
        {
            columnConstraint = new CCNotNull();
            columnConstraint=visitColumn_constraint_not_null(ctx.column_constraint_not_null());
        }
        else if (ctx.column_constraint_null() !=null)
        {
            columnConstraint = new CCNull();
            columnConstraint=visitColumn_constraint_null(ctx.column_constraint_null());
        }
        else if(ctx.column_default()!=null)
            columnConstraint=visitColumn_default(ctx.column_default());
        if(ctx.expr()!=null)
        {
            columnConstraint.setExp(visitExpr(ctx.expr()));
        }
        if (ctx.collation_name()!=null)
            columnConstraint.getCollation_name().setName(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
        if (ctx.name()!=null)
            columnConstraint.getName().setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());

        columnConstraint.setLine(ctx.getStart().getLine()); //get line number
        columnConstraint.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return columnConstraint;
    }


    @Override
    public CCprimary_key visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx) {
        System.out.println("visitColumn_constraint_primary_key");

        return new CCprimary_key();
    }

    @Override
    public CCNotNull visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx) {
        System.out.println("visitColumn_constraint_not_null");

        return new CCNotNull();
    }

    @Override
    public CCNull visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx) {
        System.out.println("visitColumn_constraint_null");

        return new CCNull();
    }











    @Override
    public SignedNumber visitSigned_number(SqlParser.Signed_numberContext ctx) {
        System.out.println("visitSigned_number");
        SignedNumber signedNumber=new SignedNumber();
        if(ctx.PLUS()!=null)
            signedNumber.setOperation('+');
        if(ctx.MINUS()!=null)
            signedNumber.setOperation('-');
        if(ctx.STAR()!=null)
            signedNumber.setStar(true);
        if (ctx.NUMERIC_LITERAL()!=null)
            signedNumber.setNUMERIC_LITERAL(Double.parseDouble(ctx.NUMERIC_LITERAL().getSymbol().getText()));
        signedNumber.setLine(ctx.getStart().getLine()); //get line number
        signedNumber.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return signedNumber;
    }

    @Override
    public ColumnDefault visitColumn_default(SqlParser.Column_defaultContext ctx) {
        System.out.println("visitColumn_default");

        ColumnDefault columnDefault = new ColumnDefault();
        if (ctx.column_default_value() != null)
            columnDefault.setColumnDefaultValue(visitColumn_default_value(ctx.column_default_value()));
        if (ctx.any_name().size() > 0)
            for (int i = 0; i < ctx.any_name().size(); i++) {
                Name n=new Name();
                n.setName(ctx.any_name().get(i).getText());
                columnDefault.getAny_name().add(n);
            }
        if(ctx.expr()!=null)
            columnDefault.setExprs(visitExpr(ctx.expr()));
        return columnDefault;
    }

    @Override
    public ColumnDefaultValue visitColumn_default_value(SqlParser.Column_default_valueContext ctx) {
        ColumnDefaultValue columnDefaultValue=new ColumnDefaultValue();
        if (ctx.signed_number()!=null)
            columnDefaultValue.setSignedNumber(visitSigned_number(ctx.signed_number()));
        if(ctx.literal_value()!=null)
            columnDefaultValue.setLiteralValuel(visitLiteral_value(ctx.literal_value()));
        return columnDefaultValue;
    }

    @Override
    public ForeignKeyClause visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx) {
        System.out.println("visitForeign_key_clause");
        ArrayList<Name> Match_name=new ArrayList<>();
        ArrayList<Name> fk_target_column_name=new ArrayList<>();
        ForeignKeyClause foreignKeyClause=new ForeignKeyClause();
        if (ctx.database_name()!=null)
            foreignKeyClause.getDatabase_name().setName(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        foreignKeyClause.getForeign_table().setName(ctx.foreign_table().any_name().IDENTIFIER().getSymbol().getText());
        if (ctx.name()!=null) {
            for (int i = 0; i < ctx.name().size(); i++) {
                Name n = new Name();
                n.setName(ctx.name(i).any_name().IDENTIFIER().getSymbol().getText());
                Match_name.add(n);
            }
        }
        foreignKeyClause.setMatch_name(Match_name);
        for(int i=0;i<ctx.fk_target_column_name().size();i++)
        {
            Name n=new Name();
            n.setName(ctx.fk_target_column_name(i).name().any_name().IDENTIFIER().getSymbol().getText());
            fk_target_column_name.add(n);
        }

        foreignKeyClause.setFk_target_column_name(fk_target_column_name);
        return foreignKeyClause;

    }

    @Override
    public TableConstraint visitTable_constraint(SqlParser.Table_constraintContext ctx) {
        System.out.println("visitTable_constraint");

        TableConstraint tableConstraint=null;
        if(ctx.table_constraint_primary_key()!=null)
        {
            tableConstraint=new TC_PrimaryKey();
            tableConstraint=visitTable_constraint_primary_key(ctx.table_constraint_primary_key());
        }
        if (ctx.table_constraint_foreign_key()!=null)
        {
            tableConstraint=new TC_ForeignKey();
            tableConstraint=visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key());
        }
        if (ctx.table_constraint_unique()!=null)
        {
            tableConstraint=new TC_Unique();
            tableConstraint=visitTable_constraint_unique(ctx.table_constraint_unique());
        }
        if (ctx.table_constraint_key()!=null)
        {
            tableConstraint=new TC_Key();
            tableConstraint=visitTable_constraint_key(ctx.table_constraint_key());
        }
        if (ctx.name()!=null)
        {
            tableConstraint.getTCname().setName(ctx.name().any_name().getText());
        }
        if(ctx.expr()!=null)
        {
            tableConstraint.setExp(visitExpr(ctx.expr()));
        }
        tableConstraint.setLine(ctx.getStart().getLine()); //get line number
        tableConstraint.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return tableConstraint;
    }

    @Override
    public IndexedColumn visitIndexed_column(SqlParser.Indexed_columnContext ctx) {
        System.out.println("visitIndexed_column");
        IndexedColumn indexedColumn=new IndexedColumn();
        indexedColumn.getColumn_name().setName(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.collation_name()!=null)
        {
            indexedColumn.getCollation_name().setName(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        indexedColumn.setLine(ctx.getStart().getLine()); //get line number
        indexedColumn.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return indexedColumn;
    }

    @Override
    public TC_PrimaryKey visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx) {
        System.out.println("visitTable_constraint_primary_key");
        TC_PrimaryKey tc_primaryKey=new TC_PrimaryKey();
        for (int i=0 ;i<ctx.indexed_column().size();i++)
        {
            tc_primaryKey.getIndexed_column().add((IndexedColumn)visitIndexed_column(ctx.indexed_column(i)));
        }
        return tc_primaryKey;
    }

    @Override
    public TC_ForeignKey visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx) {
        System.out.println("visitTable_constraint_foreign_key");
        TC_ForeignKey tc_foreignKey=new TC_ForeignKey();
        for (int i=0;i<ctx.fk_origin_column_name().size();i++)
        {
            Name n=new Name();
            n.setName(ctx.fk_origin_column_name(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            tc_foreignKey.getColumn_name().add(n);
        }
        tc_foreignKey.setForeign_key_clause(visitForeign_key_clause(ctx.foreign_key_clause()));
        return tc_foreignKey;
    }

    @Override
    public TC_Unique visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx) {
        System.out.println("visitTable_constraint_unique");
        TC_Unique tc_unique=new TC_Unique();
        if (ctx.name()!=null)
            tc_unique.getUname().setName(ctx.name().any_name().getText());
        for (int i=0;i<ctx.indexed_column().size();i++)
        {
            tc_unique.getIndexed_column().add(visitIndexed_column(ctx.indexed_column(i)));
        }
        return tc_unique;
    }

    @Override
    public TC_Key visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx) {
        System.out.println("visitTable_constraint_key");
        TC_Key tc_key=new TC_Key();
        if (ctx.name()!=null)
            tc_key.getKname().setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        for (int i=0;i<ctx.indexed_column().size();i++)
        {
            tc_key.getIndexed_column().add(visitIndexed_column(ctx.indexed_column(i)));
        }
        return tc_key;
    }

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
    @Override public SelectOrValues visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) {
        System.out.println("visitSelect_or_values");
        SelectOrValues selectOrValues=new SelectOrValues();
        if(ctx.K_SELECT()!=null){
            if(ctx.K_DISTINCT()!=null)
                selectOrValues.setDistinct(true);
            if(ctx.K_ALL()!=null)
                selectOrValues.setAll(true);
            if(ctx.result_column()!=null){
                for(int i=0;i<ctx.result_column().size();i++)
                    selectOrValues.getResultColumns().add(visitResult_column(ctx.result_column(i)));
            }
            if(ctx.table_or_subquery()!=null){
                for(int i=0;i<ctx.table_or_subquery().size();i++)
                    selectOrValues.getTableOrSubqueries().add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }
            if(ctx.join_clause()!=null)
                selectOrValues.setJoinClause(visitJoin_clause(ctx.join_clause()));
            if(ctx.K_WHERE()!=null){
                selectOrValues.setWhereExpr(visitExpr(ctx.expr(0)));
                if(ctx.K_HAVING()!=null){
                    for(int i=1;i<ctx.expr().size()-1;i++)
                        selectOrValues.getGroupByExprs().add(visitExpr(ctx.expr(i)));
                    selectOrValues.setHavingExpr(visitExpr(ctx.expr(ctx.expr().size()-1)));
                }else if(ctx.K_GROUP()!=null){
                    for(int i=1;i<ctx.expr().size();i++)
                        selectOrValues.getGroupByExprs().add(visitExpr(ctx.expr(i)));
                }
            }else{
                if(ctx.K_HAVING()!=null){
                    for(int i=0;i<ctx.expr().size()-1;i++)
                        selectOrValues.getGroupByExprs().add(visitExpr(ctx.expr(i)));
                    selectOrValues.setHavingExpr(visitExpr(ctx.expr(ctx.expr().size()-1)));
                }else if(ctx.K_GROUP()!=null){
                    for(int i=0;i<ctx.expr().size();i++)
                        selectOrValues.getGroupByExprs().add(visitExpr(ctx.expr(i)));
                }
            }

        }
        else if(ctx.K_VALUES()!=null){
            for(int i=0;i<ctx.expr().size();i++)
                selectOrValues.getValuesExprs().add(visitExpr(ctx.expr(i)));
        }

        return selectOrValues;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public OrderingTerm visitOrdering_term(SqlParser.Ordering_termContext ctx) {
        System.out.println("visitOrdering_term");
        OrderingTerm orderingTerm=new OrderingTerm();
        orderingTerm.setExpr(visitExpr(ctx.expr()));
        if(ctx.collation_name()!=null){
            Name name=new Name();
            name.setName(ctx.collation_name().getText());
            orderingTerm.setCollationName(name);
        }
        if(ctx.K_ASC()!=null)
            orderingTerm.setAsc(true);
        if(ctx.K_DESC()!=null)
            orderingTerm.setDesc(true);


        return orderingTerm;
    }

    @Override
    public DropTableStmt visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx) {
        System.out.println("visitDrop_table_stmt");
        DropTableStmt dropTableStmt=new DropTableStmt();
        Name tablename=new Name();
        tablename.setName(ctx.table_name().getText());
        dropTableStmt.setTableName(tablename);
        if(ctx.database_name()!=null){
            Name databaseName=new Name();
            databaseName.setName(ctx.database_name().getText());
            dropTableStmt.setDataBaseName(databaseName);
        }
        if(ctx.K_EXISTS()!=null){
            dropTableStmt.setExists(true);
        }
        dropTableStmt.setName("DropTable");
        return dropTableStmt;
    }

    @Override
    public UpdateStmt visitUpdate_stmt(SqlParser.Update_stmtContext ctx) {
        System.out.println("visitUpdate_stmt");
        UpdateStmt updateStmt=new UpdateStmt();
        updateStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
        for(int i=0;i<ctx.column_name().size();i++){
            Name colomnName=new Name();
            colomnName.setName(ctx.column_name(i).getText());
            updateStmt.getQolumnNames().add(colomnName);
        }
        for(int i=0;i<ctx.column_name().size();i++){
            updateStmt.getExprs().add(visitExpr(ctx.expr(i)));
        }
        if(ctx.K_WHERE()!=null){
            updateStmt.setWhereExpr(visitExpr(ctx.expr(ctx.expr().size()-1)));
        }
        updateStmt.setName("Update");
        return updateStmt;
    }

    @Override
    public QualifiedTableName visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx) {
        System.out.println("visitQualified_table_name");
        QualifiedTableName qualifiedTableName=new QualifiedTableName();
        Name tableName=new Name();
        tableName.setName(ctx.table_name().getText());
        qualifiedTableName.setTableName(tableName);
        if(ctx.database_name()!=null){
            Name databaseName=new Name();
            databaseName.setName(ctx.database_name().getText());
            qualifiedTableName.setDataBaseName(databaseName);
        }
        if(ctx.index_name()!=null){
            Name indexName=new Name();
            indexName.setName(ctx.index_name().getText());
            qualifiedTableName.setIndexName(indexName);
        }
        if(ctx.K_NOT()!=null){
            qualifiedTableName.setNotIndexed(true);
        }
        return qualifiedTableName;
    }

    @Override
    public InsertStmt visitInsert_stmt(SqlParser.Insert_stmtContext ctx) {
        System.out.println("visitInsert_stmt");
        InsertStmt insertStmt=new InsertStmt();
        Name tableName=new Name();
        tableName.setName(ctx.table_name().getText());
        insertStmt.setTableName(tableName);
        if(ctx.database_name()!=null){
            Name databaseName=new Name();
            databaseName.setName(ctx.database_name().getText());
            insertStmt.setDatabaseName(databaseName);
        }
        if(ctx.column_name()!=null){
            for(int i=0;i<ctx.column_name().size();i++){
                Name name=new Name();
                name.setName(ctx.column_name(i).getText());
                insertStmt.getColumnName().add(name);
            }
        }
        if(ctx.expr()!=null){
            for(int i=0;i<ctx.expr().size();i++){
                insertStmt.getExprs().add(visitExpr(ctx.expr(i)));
            }
        }
        if(ctx.select_stmt()!=null){
            insertStmt.setSelectStmt( visitSelect_stmt(ctx.select_stmt()));
        }

        insertStmt.setName("Insert");
        return insertStmt;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public ResultColumn visitResult_column(SqlParser.Result_columnContext ctx) {
        System.out.println("visitResult_column");
        ResultColumn resultColumn=new ResultColumn();
        if(ctx.STAR()!=null)
            resultColumn.setStar(true);
        else if(ctx.table_name()!=null){
            Name tableName=new Name();
            tableName.setName(ctx.table_name().getText());
            resultColumn.setTableName(tableName);
        }
        else if(ctx.expr()!=null){
            resultColumn.setExpr(visitExpr(ctx.expr()));
            if(ctx.column_alias()!=null){
                Name colomnAlias=new Name();
                colomnAlias.setName(ctx.column_alias().getText());
                resultColumn.setColumnAlias(colomnAlias);
            }
        }

        return resultColumn;
    }

    @Override
    public JoinOperator visitJoin_operator(SqlParser.Join_operatorContext ctx) {
        System.out.println("visitJoin_operator");
        JoinOperator joinOperator=new JoinOperator();
        if(ctx.K_INNER()!=null)
            joinOperator.setInner(true);
        if(ctx.K_OUTER()!=null)
            joinOperator.setOuter(true);
        if(ctx.K_LEFT()!=null)
            joinOperator.setLeft(true);

        return joinOperator;
    }

    @Override
    public JoinConstraint visitJoin_constraint(SqlParser.Join_constraintContext ctx) {
        System.out.println("visitJoin_constraint");
        JoinConstraint joinConstraint=new JoinConstraint();
        if(ctx.expr()!=null)
            joinConstraint.setExpr(visitExpr(ctx.expr()));

        return joinConstraint;
    }

    @Override
    public JoinClause visitJoin_clause(SqlParser.Join_clauseContext ctx) {
        System.out.println("visitJoin_clause");
        JoinClause joinClause=new JoinClause();
        for (int i=0;i<ctx.table_or_subquery().size();i++)
            joinClause.getTableOrSubquerys().add(visitTable_or_subquery(ctx.table_or_subquery(i)));
        if(ctx.join_operator()!=null){
            for(int i=0;i<ctx.join_operator().size();i++)
                joinClause.getJoinOperators().add(visitJoin_operator(ctx.join_operator(i)));
        }
        if(ctx.join_constraint()!=null){
            for(int i=0;i<ctx.join_constraint().size();i++)
                joinClause.getJoinConstraints().add(visitJoin_constraint(ctx.join_constraint(i)));
        }

        return joinClause;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */



    @Override public TableOrSubquery visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx) {
        System.out.println("visitTable_or_subquery");
        TableOrSubquery tableOrSubquery=new TableOrSubquery();
        if(ctx.database_name()!=null){
            Name databaseName=new Name();
            databaseName.setName(ctx.database_name().getText());
            tableOrSubquery.setDatabseName(databaseName);
        }
        if(ctx.table_name()!=null){
            Name tableName=new Name();
            tableName.setName(ctx.table_name().getText());
            tableOrSubquery.setTableName(tableName);
        }
        if(ctx.table_alias()!=null){
            Name tablealias=new Name();
            tablealias.setName(ctx.table_alias().getText());
            tableOrSubquery.setTableAlias(tablealias);
        }
        if(ctx.index_name()!=null){
            Name indexName=new Name();
            indexName.setName(ctx.index_name().getText());
            tableOrSubquery.setIndexName(indexName);
        }
        if(ctx.K_NOT()!=null){
            tableOrSubquery.setNotIndexed(true);
        }
        if(ctx.table_or_subquery()!=null){
            for(int i=0;i<ctx.table_or_subquery().size();i++)
                tableOrSubquery.getTableOrSubqueries().add(visitTable_or_subquery(ctx.table_or_subquery(i)));
        }
        if(ctx.join_clause()!=null){
            tableOrSubquery.setJoinClause(visitJoin_clause(ctx.join_clause()));
        }
        if(ctx.select_stmt()!=null){
            tableOrSubquery.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }

        return tableOrSubquery;
    }

    @Override
    public AlterTableAdd visitAlter_table_add(SqlParser.Alter_table_addContext ctx) {
        System.out.println("visitAlter_table_add");
        AlterTableAdd alterTableAdd=new AlterTableAdd();
        alterTableAdd.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        return alterTableAdd;
    }

    @Override
    public AlterTableAddConstraint visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx) {
        System.out.println("visitAlter_table_add_constraint");
        AlterTableAddConstraint alterTableAddConstraint=new AlterTableAddConstraint();
        alterTableAddConstraint.getAny_name().setName(ctx.any_name().getText());
        alterTableAddConstraint.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        return alterTableAddConstraint;
    }

    @Override
    public AlterTableStmt visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx) {
        System.out.println("visitAlter_table_stm");
        AlterTableStmt alterTableStmt=new AlterTableStmt();
        alterTableStmt.getSource_table_name().setName(ctx.source_table_name().any_name().getText());
        if(ctx.new_table_name()!=null)
            alterTableStmt.getNew_table_name().setName(ctx.new_table_name().getText());
        if(ctx.database_name()!=null){
            alterTableStmt.getDatabase_name().setName(ctx.database_name().any_name().getText());
        }
        if(ctx.alter_table_add()!=null){

            alterTableStmt.setAlter_table_add(visitAlter_table_add(ctx.alter_table_add()));
        }
        if(ctx.alter_table_add_constraint()!=null){
            alterTableStmt.setAlter_table_add_constraint(visitAlter_table_add_constraint(ctx.alter_table_add_constraint()));
        }
        if(ctx.column_def()!=null){
            alterTableStmt.setColumnDef(visitColumn_def(ctx.column_def()));
        }

        alterTableStmt.setName("AlterTable");
        return alterTableStmt;
    }

    @Override
    public DeleteStmt visitDelete_stmt(SqlParser.Delete_stmtContext ctx) {
        System.out.println("visitDelete_stmt");
        DeleteStmt deleteStmt=new DeleteStmt();
        deleteStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
        if(ctx.expr()!=null){
            deleteStmt.setExpr(visitExpr(ctx.expr()));
        }
        deleteStmt.setName("Delete");
        return deleteStmt;
    }

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
    @Override public  Object visitTable_name(SqlParser.Table_nameContext ctx) {
        System.out.println(ctx.any_name_no_keyword().IDENTIFIER().getText());
        return visitChildren(ctx);
    }
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
    @Override public  Object visitAny_name(SqlParser.Any_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SqlParser.KeywordContext ctx) { return visitChildren(ctx); }
    
    
    
    
    
    
    
    
    
    
    
}
