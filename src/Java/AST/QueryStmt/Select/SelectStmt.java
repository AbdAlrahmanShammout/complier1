package Java.AST.QueryStmt.Select;

import Java.AST.Expr;
import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectStmt extends Statement {
    SelectOrValues selectOrValues;
    ArrayList<OrderingTerm>orderingTerms=new ArrayList<>();
    ArrayList<Expr>exprs=new ArrayList<>();

    public SelectOrValues getSelectOrValues() {
        return selectOrValues;
    }

    public void setSelectOrValues(SelectOrValues selectOrValues) {
        this.selectOrValues = selectOrValues;
    }

    public ArrayList<OrderingTerm> getOrderingTerms() {
        return orderingTerms;
    }

    public void setOrderingTerms(ArrayList<OrderingTerm> orderingTerms) {
        this.orderingTerms = orderingTerms;
    }

    public ArrayList<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(ArrayList<Expr> exprs) {
        this.exprs = exprs;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (selectOrValues!=null){
            selectOrValues.accept(astVisitor);
        }
        if (orderingTerms.size()!=0){
            for(int i=0;i<orderingTerms.size();i++){
                orderingTerms.get(i).accept(astVisitor);
            }
        }
        if (exprs.size()!=0){
            for(int i=0;i<exprs.size();i++){
                exprs.get(i).accept(astVisitor);
            }
        }
    }
}
