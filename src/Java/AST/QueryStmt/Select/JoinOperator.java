package Java.AST.QueryStmt.Select;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class JoinOperator extends Node {
    Boolean left=false;
    Boolean outer=false;
    Boolean inner=false;

    public Boolean getLeft() {
        return left;
    }

    public void setLeft(Boolean left) {
        this.left = left;
    }

    public Boolean getOuter() {
        return outer;
    }

    public void setOuter(Boolean outer) {
        this.outer = outer;
    }

    public Boolean getInner() {
        return inner;
    }

    public void setInner(Boolean inner) {
        this.inner = inner;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
