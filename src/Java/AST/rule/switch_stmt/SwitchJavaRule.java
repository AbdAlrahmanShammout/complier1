package Java.AST.rule.switch_stmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.rule.JavaBody;

import java.util.ArrayList;

public class SwitchJavaRule extends JavaBody {
    private String switchKey;
    private ArrayList<SwitchJavaCase> switchJavaCases = new ArrayList<>();
    private ArrayList<JavaBody> javaBodies = new ArrayList<>();

    public String getSwitchKey() {
        return switchKey;
    }

    public void setSwitchKey(String switchKey) {
        this.switchKey = switchKey;
    }

    public ArrayList<SwitchJavaCase> getSwitchJavaCases() {
        return switchJavaCases;
    }

    public void setSwitchJavaCases(ArrayList<SwitchJavaCase> switchJavaCases) {
        this.switchJavaCases = switchJavaCases;
    }

    public ArrayList<JavaBody> getJavaBodies() {
        return javaBodies;
    }

    public void setJavaBodies(ArrayList<JavaBody> javaBodies) {
        this.javaBodies = javaBodies;
    }


}
