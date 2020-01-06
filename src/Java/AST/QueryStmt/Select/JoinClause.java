package Java.AST.QueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JoinClause extends Node {
    ArrayList<TableOrSubquery> tableOrSubquerys=new ArrayList<TableOrSubquery>();
    ArrayList<JoinOperator> joinOperators=new ArrayList<>();
    ArrayList<JoinConstraint> joinConstraints=new ArrayList<>();

    public ArrayList<TableOrSubquery> getTableOrSubquerys() {
        return tableOrSubquerys;
    }

    public void setTableOrSubquerys(ArrayList<TableOrSubquery> tableOrSubquerys) {
        this.tableOrSubquerys = tableOrSubquerys;
    }

    public ArrayList<JoinOperator> getJoinOperators() {
        return joinOperators;
    }

    public void setJoinOperators(ArrayList<JoinOperator> joinOperators) {
        this.joinOperators = joinOperators;
    }

    public ArrayList<JoinConstraint> getJoinConstraints() {
        return joinConstraints;
    }

    public void setJoinConstraints(ArrayList<JoinConstraint> joinConstraints) {
        this.joinConstraints = joinConstraints;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        if (tableOrSubquerys.size()!=0){
            for (int i=0;i<tableOrSubquerys.size();i++){
                tableOrSubquerys.get(i).accept(astVisitor);
            }
        }
        if (joinOperators.size()!=0){
            for (int i=0; i<joinOperators.size();i++){
                joinOperators.get(i).accept(astVisitor);
            }
        }
        if (joinConstraints.size()!=0){
            for (int i=0; i<joinConstraints.size();i++){
                joinConstraints.get(i).accept(astVisitor);
            }
        }

    }
}
