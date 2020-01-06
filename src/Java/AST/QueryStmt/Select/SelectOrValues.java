package Java.AST.QueryStmt.Select;

import Java.AST.Expr;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectOrValues extends Node {
    Boolean distinct=false;
    Boolean all=false;
    ArrayList<ResultColumn>resultColumns=new ArrayList<>();
    ArrayList<TableOrSubquery>tableOrSubqueries=new ArrayList<>();
    JoinClause joinClause;
    Expr whereExpr;
    ArrayList<Expr>groupByExprs=new ArrayList<>();
    Expr havingExpr;
    ArrayList<Expr>valuesExprs=new ArrayList<>();

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public ArrayList<ResultColumn> getResultColumns() {
        return resultColumns;
    }

    public void setResultColumns(ArrayList<ResultColumn> resultColumns) {
        this.resultColumns = resultColumns;
    }

    public ArrayList<TableOrSubquery> getTableOrSubqueries() {
        return tableOrSubqueries;
    }

    public void setTableOrSubqueries(ArrayList<TableOrSubquery> tableOrSubqueries) {
        this.tableOrSubqueries = tableOrSubqueries;
    }

    public JoinClause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(JoinClause joinClause) {
        this.joinClause = joinClause;
    }

    public Expr getWhereExpr() {
        return whereExpr;
    }

    public void setWhereExpr(Expr whereExpr) {
        this.whereExpr = whereExpr;
    }

    public ArrayList<Expr> getGroupByExprs() {
        return groupByExprs;
    }

    public void setGroupByExprs(ArrayList<Expr> groupByExprs) {
        this.groupByExprs = groupByExprs;
    }

    public Expr getHavingExpr() {
        return havingExpr;
    }

    public void setHavingExpr(Expr havingExpr) {
        this.havingExpr = havingExpr;
    }

    public ArrayList<Expr> getValuesExprs() {
        return valuesExprs;
    }

    public void setValuesExprs(ArrayList<Expr> valuesExprs) {
        this.valuesExprs = valuesExprs;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (resultColumns.size()!=0){
            for (int i=0;i<resultColumns.size();i++){
                resultColumns.get(i).accept(astVisitor);
            }
        }

        if (tableOrSubqueries.size()!=0){
            for (int i=0;i<tableOrSubqueries.size();i++){
                tableOrSubqueries.get(i).accept(astVisitor);
            }
        }
        if (groupByExprs.size()!=0){
            for (int i=0;i<groupByExprs.size();i++){
                groupByExprs.get(i).accept(astVisitor);
            }
        }
        if (valuesExprs.size()!=0){
            for (int i=0;i<valuesExprs.size();i++){
                valuesExprs.get(i).accept(astVisitor);
            }
        }
        if (joinClause!=null){
            joinClause.accept(astVisitor);
        }
        if (whereExpr!= null){
            whereExpr.accept(astVisitor);
        }
        if (havingExpr!= null){
            havingExpr.accept(astVisitor);
        }

    }
}
