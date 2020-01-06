package Java.AST.Visitor;

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
import Java.AST.rule.if_one_line.IfOneLineJava;
import Java.AST.rule.if_one_line.IfOneLineReturnJava;
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
        if (expr.isBoolStatus() !=null){
            System.out.println("ast expr BoolStatus : "+expr.isBoolStatus());
        }
        if (expr.getDatabase_name()!=null)
            System.out.println("ast expr Database_name : "+expr.getDatabase_name());
        if (expr.getTable_name()!=null)
            System.out.println("ast expr Table_name : "+expr.getTable_name());
        if (expr.getFunction_name()!=null)
            System.out.println("ast expr Function_name : "+expr.getFunction_name());
        if (expr.getColumn_name()!=null)
            System.out.println("ast expr Column_name : "+expr.getColumn_name());
        if (expr.getUnary_operator()!=null)
            System.out.println("ast expr Unary_operator : "+expr.getUnary_operator());
        if (expr.getOperator()!=null)
            System.out.println("ast expr Operator : "+expr.getOperator());
        System.out.println("---------------");

    }

    @Override
    public void visit(LiteralValue literalValue) {
        System.out.println("ast LiteralValue ");
        if (literalValue.getBLOB_LITERAL()!=null)
            System.out.println("ast LiteralValue BLOB_LITERAL : "+literalValue.getBLOB_LITERAL());
        if (literalValue.getNUMERIC_LITERAL()!=null)
            System.out.println("ast LiteralValue NUMERIC_LITERAL : "+literalValue.getNUMERIC_LITERAL());
        if (literalValue.getSTRING_LITERAL()!=null)
            System.out.println("ast LiteralValue STRING_LITERAL : "+literalValue.getSTRING_LITERAL());
        System.out.println("---------------");
    }

    @Override
    public void visit(JsonRule jsonRule) {
        System.out.println("ast JsonRule ");
        System.out.println("---------------");
    }

    @Override
    public void visit(JsonStyle jsonStyle) {
        System.out.println("ast JsonStyle ");
        System.out.println("ast JsonStyle Key : "+jsonStyle.getName());
        System.out.println("---------------");
    }

    @Override
    public void visit(JsonVal jsonVal) {
        System.out.println("ast JsonVal ");
        System.out.println("---------------");
    }










    @Override
    public void visit(InsertStmt insertStmt) {
        System.out.println("\nast insertStmt ");
        if (insertStmt.getDatabaseName()!=null)
        if (!insertStmt.getDatabaseName().getName().equals(""))
            System.out.println("Database name is \""+insertStmt.getDatabaseName().getName()+"\"");
        if (insertStmt.getTableName()!=null)
            System.out.println("Table name is \""+insertStmt.getTableName().getName()+"\"");
        if (insertStmt.getColumnName().size()>0)
            for(int i=0;i<insertStmt.getColumnName().size();i++)
                System.out.println("column name is \""+insertStmt.getColumnName().get(i).getName()+"\"");
        if (insertStmt.getDefaultValues())
            System.out.println("DEFAULT VALUES");
    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("\nast Statement ");
    }


    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("\nast selectStmt ");
    }

    @Override
    public void visit(IndexedColumn indexedColumn) {
        System.out.println("\nast indexedColumn ");
        if(!indexedColumn.getCollation_name().getName().equals(""))
            System.out.println("collation name is \""+indexedColumn.getCollation_name().getName()+"\"");
        if(!indexedColumn.getColumn_name().getName().equals(""))
            System.out.println("Column name is \""+indexedColumn.getColumn_name().getName()+"\"");

    }

    @Override
    public void visit(SignedNumber signedNumber) {
        System.out.println("\nast signedNumber");
        if(signedNumber.getOperation()!=' ')
        {
            System.out.print(signedNumber.getOperation());

        }
        if(signedNumber.getNUMERIC_LITERAL()!=null)
            System.out.print(signedNumber.getNUMERIC_LITERAL().toString());
        if(signedNumber.isStar())
            System.out.println("*");
    }
    @Override
    public void visit(TableOrSubquery tableOrSubquery) {
        System.out.println("\nast TableOrSubquery ");
        if(!tableOrSubquery.getTableName().getName().equals("")){
            System.out.println("Table name is \""+tableOrSubquery.getTableName().getName()+"\"");
        }
        if (!tableOrSubquery.getDatabseName().getName().equals("")){
            System.out.println("Database name is \""+tableOrSubquery.getDatabseName().getName()+"\"");
        }
        if (!tableOrSubquery.getTableAlias().getName().equals("")){
            System.out.println("Table alias is \""+tableOrSubquery.getTableAlias().getName()+"\"");
        }
        if (!tableOrSubquery.getIndexName().getName().equals("")){
            System.out.println("Index name is \""+tableOrSubquery.getIndexName().getName()+"\"");
        }
        if (tableOrSubquery.getNotIndexed()==true){
            System.out.println("NotIndexed");
        }
    }
    @Override
    public void visit(AlterTableAddConstraint alterTableAddConstraint) {
        System.out.println("\nast alterTableAddConstraint ");
        if( !alterTableAddConstraint.getAny_name().getName().equals(""))
            System.out.println("table name is \""+alterTableAddConstraint.getAny_name().getName()+"\"");

    }
    @Override
    public void visit(TableConstraint tableConstraint) {
        System.out.println("\nast tableConstraint");
        if(!tableConstraint.getTCname().getName().equals(""))
            System.out.println("Table constraint name is \""+tableConstraint.getTCname().getName()+"\"");
    }

    @Override
    public void visit(TC_ForeignKey tc_foreignKey) {
        System.out.println("\nast tc_foreignKey");
        for(int i=0;i<tc_foreignKey.getColumn_name().size();i++)
        {
            System.out.println("Column name is \""+tc_foreignKey.getColumn_name().get(i).getName());
        }
    }

    @Override
    public void visit(TC_Key tc_key) {
        System.out.println("\nast tc_key");
        if(!tc_key.getKname().getName().equals(""))
            System.out.println(tc_key.getKname().getName());
    }

    @Override
    public void visit(TC_Unique tc_unique) {
        System.out.println("\nast tc_unique");
        if(!tc_unique.getUname().getName().equals(""))
            System.out.println(tc_unique.getUname().getName());
    }

    @Override
    public void visit(TypeName typeName) {
        System.out.println("\nast typeName");
        System.out.println(typeName.getName().getName());
        if(typeName.getAny_name().size()>0)
        {
            for(int i=0;i<typeName.getAny_name().size();i++)
            {
                System.out.println(typeName.getAny_name().get(i).getName());
            }
        }
    }


    @Override
    public void visit(DropTableStmt dropTableStmt) {
        System.out.println("\nast dropTableStmt ");
        if (dropTableStmt.getExists())
            System.out.println("Exists");
        if (!dropTableStmt.getDataBaseName().getName().equals(""))
            System.out.println(dropTableStmt.getDataBaseName().getName());
        System.out.println(dropTableStmt.getTableName().getName());

    }
    @Override
    public void visit(QualifiedTableName qualifiedTableName) {
        System.out.println("\nast qualifiedTableName ");
        if (!qualifiedTableName.getDataBaseName().getName().equals(""))
            System.out.println(qualifiedTableName.getDataBaseName().getName());
        if (!qualifiedTableName.getTableName().getName().equals(""))
            System.out.println(qualifiedTableName.getTableName().getName());
        if (!qualifiedTableName.getIndexName().getName().equals(""))
            System.out.println(qualifiedTableName.getIndexName().getName());
        else if (qualifiedTableName.getNotIndexed())
            System.out.println("NOT INDEXED");
    }

    @Override
    public void visit(UpdateStmt updateStmt) {
        System.out.println("\nast updateStmt ");

        for(int i=0;i<updateStmt.getQolumnNames().size();i++)
            System.out.println(updateStmt.getQolumnNames().get(i).getName());
    }

    @Override
    public void visit(AlterTableStmt alterTableStmt) {
        System.out.println("\nast alterTableStmt ");
        if (!alterTableStmt.getDatabase_name().getName().equals(""))
            System.out.println(alterTableStmt.getDatabase_name().getName());
        System.out.println(alterTableStmt.getSource_table_name().getName());
        if (!alterTableStmt.getNew_table_name().getName().equals(""))
            System.out.println(alterTableStmt.getNew_table_name().getName());

    }
    @Override
    public void visit(ColumnDef columnDef) {
        System.out.println("\nast ColumnDef");
        if (!columnDef.getColumn_name().getName().equals("")){
            System.out.println(columnDef.getColumn_name().getName());
        }

    }

    @Override
    public void visit(JoinOperator joinOperator) {
        System.out.println("\nast joinOperator");
        if(joinOperator.getInner()!=false)
            System.out.println(false);
        if(joinOperator.getLeft()!=false)
            System.out.println("Left");
        if(joinOperator.getOuter()!=false)
            System.out.println("outer");
    }

    @Override
    public void visit(OrderingTerm orderingTerm) {
        System.out.println("\nast orderingTerm");
        if (orderingTerm.getCollationName()!=null)
            if(!orderingTerm.getCollationName().getName().equals(""))
                System.out.println(orderingTerm.getCollationName().getName());
        if(orderingTerm.getAsc()!=false)
            System.out.println("Asc");
        if(orderingTerm.getDesc()!=false)
            System.out.println("Desc");

    }
    @Override
    public void visit(SelectOrValues selectOrValues) {
        System.out.println("\nast SelectOrValues");
        if (selectOrValues.getDistinct()==true){
            System.out.println("Distinct");
        }
        if (selectOrValues.getAll()==true){
            System.out.println("All");
        }
    }
    @Override
    public void visit(ResultColumn resultColumn) {
        System.out.println("\nast ResultColumn");
        if (resultColumn.getStar()!=false){
            System.out.println("*");
        }
        if (!resultColumn.getTableName().getName().equals("")){
            System.out.println(resultColumn.getTableName().getName());
        }
        if (!resultColumn.getColumnAlias().getName().equals("")){
            System.out.println(resultColumn.getColumnAlias().getName());
        }
    }
    @Override
    public void visit(ForeignKeyClause foreignKeyClause) {
        System.out.println("\nast foreignKeyClause");
        if(!foreignKeyClause.getDatabase_name().getName().equals(""))
        {
            System.out.println(foreignKeyClause.getDatabase_name().getName());
        }
        if(!foreignKeyClause.getForeign_table().getName().equals(""))
            System.out.println(foreignKeyClause.getForeign_table().getName());

        if(foreignKeyClause.getFk_target_column_name().size()>0)
        {
            for (int i = 0; i <foreignKeyClause.getFk_target_column_name().size(); i++) {
                System.out.println(foreignKeyClause.getFk_target_column_name().get(i).getName());

            }
        }
        if(foreignKeyClause.getMatch_name().size()>0)
        {
            for (int i = 0; i <foreignKeyClause.getMatch_name().size(); i++) {
                System.out.println(foreignKeyClause.getMatch_name().get(i).getName());

            }
        }
    }

    @Override
    public void visit(CreatStmt creatStmt) {
        System.out.println("\nast CreatStmt");
        if (!creatStmt.getDatabase_name().getName().equals("")){
            System.out.println(creatStmt.getDatabase_name().getName());
        }
        if (!creatStmt.getTable_name().getName().equals("")){
            System.out.println(creatStmt.getTable_name().getName());
        }
    }
    @Override
    public void visit(ColumnConstraint columnConstraint) {
        System.out.println("\nast ColumnConstraint ");
        if (!columnConstraint.getName().getName().equals("")){
            System.out.println(columnConstraint.getName().getName());
        }
        if (!columnConstraint.getCollation_name().getName().equals("")){
            System.out.println(columnConstraint.getCollation_name().getName());
        }
    }

    @Override
    public void visit(ColumnDefault columnDefault) {
        System.out.println("\nast columnDefault ");
        if (columnDefault.getAny_name().size()>0)
            for (int i = 0; i <columnDefault.getAny_name().size() ; i++) {
                System.out.println(columnDefault.getAny_name().get(i).getName());
            }
    }







}



