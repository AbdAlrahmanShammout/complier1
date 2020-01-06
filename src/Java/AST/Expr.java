package Java.AST;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.json.JsonRule;

import java.util.ArrayList;

public class Expr extends Node {

    private ArrayList<Expr> exprs =new ArrayList<>();
    private LiteralValue literalValue;
    private JsonRule jsonRule;
    private Boolean boolStatus;
    private String database_name;
    private String table_name;
    private String column_name;
    private String unary_operator;
    private String function_name;
    private String Operator;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < exprs.size(); i++) {
            exprs.get(i).accept(astVisitor);
        }
        if (literalValue!=null)
            literalValue.accept(astVisitor);
        if (jsonRule!=null)
            jsonRule.accept(astVisitor);
    }



    public JsonRule getJsonRule() {
        return jsonRule;
    }

    public void setJsonRule(JsonRule jsonRule) {
        this.jsonRule = jsonRule;
    }

    public Boolean isBoolStatus() {
        return boolStatus;
    }

    public void setBoolStatus(boolean boolStatus) {
        this.boolStatus = boolStatus;
    }

    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<Expr> exprs) {
        this.exprs = exprs;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public String getDatabase_name() {
        return database_name;
    }

    public void setDatabase_name(String database_name) {
        this.database_name = database_name;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getUnary_operator() {
        return unary_operator;
    }

    public void setUnary_operator(String unary_operator) {
        this.unary_operator = unary_operator;
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }


}
