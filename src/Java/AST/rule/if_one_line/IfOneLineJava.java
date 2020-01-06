package Java.AST.rule.if_one_line;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.ConditionJava;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class IfOneLineJava extends JavaBody {
    private boolean Not;
    private ConditionJava conditionJava;
    private ArrayList<IfOneLineReturnJava> ifOneLineReturnJavas = new ArrayList<>();

    public boolean getNot() {
        return Not;
    }

    public void setNot(boolean not) {
        Not = not;
    }

    public ArrayList<IfOneLineReturnJava> getIfOneLineReturnJavas() {
        return ifOneLineReturnJavas;
    }

    public void setIfOneLineReturnJavas(ArrayList<IfOneLineReturnJava> ifOneLineReturnJavas) {
        this.ifOneLineReturnJavas = ifOneLineReturnJavas;
    }

    public ConditionJava getConditionJava() {
        return conditionJava;
    }

    public void setConditionJava(ConditionJava conditionJava) {
        this.conditionJava = conditionJava;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        conditionJava.accept(astVisitor);
        for (int i = 0; i < ifOneLineReturnJavas.size(); i++) {
            ifOneLineReturnJavas.get(i).accept(astVisitor);
        }
    }
}
