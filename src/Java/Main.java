package Java;

import Java.AST.Parse;
import Java.AST.Visitor.BaseASTVisitor;
import Java.Base.BaseVisitor;
import gen.SqlLexer;
import gen.SqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {


        try {
            String source = "sample.txt";
            CharStream cs = fromFileName(source);
            SqlLexer lexer = new SqlLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(token);
            ParseTree tree = parser.parse();


            Parse p = (Parse) new BaseVisitor().visit(tree);

            p.accept(new BaseASTVisitor());

            //System.out.println(p.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static boolean ch(String s){
        return s == null;
    }
}
