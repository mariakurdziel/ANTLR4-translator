import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;

public class Compiler {
    public static void compileCode(String sourceCode, BufferedWriter writer) {
        CommonTokenStream tokens = createToken(sourceCode);

        cpp_grammarParser parser = new cpp_grammarParser(tokens);
        //System.out.println(parser.getContext());
        ParseTree parseTree = parser.file();
        int size = 1024;
        generateOutput(writer, parseTree, size);

    }

    private static CommonTokenStream createToken(String code) {
        CharStream stream = new ANTLRInputStream(code);
        cpp_grammarLexer lexer = new cpp_grammarLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    private static void generateOutput(BufferedWriter writer, ParseTree tree, int size) {
        cppGrammarListenerImpl listener = new cppGrammarListenerImpl(writer, size);
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(listener, tree);
    }
}
