import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;

public class cppGrammarListenerImpl implements cpp_grammarListener {

    private int namespaceDeclarations = 0;
    private int preprocesorDirctives = 0;
    private int variables = 0;
    private int printedTexts = 0;
    private int simpleTypes = 0;
    private BufferedWriter writer;
    private int fileSize = 0;

    cppGrammarListenerImpl(BufferedWriter writer, int fileSize) {
        this.fileSize = fileSize;
        this.writer = writer;
    }

    public void enterNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
        namespaceDeclarations++;
    }

    public void exitNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx) {
        namespaceDeclarations--;
    }

    public void enterPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
    }

    public void exitPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx) {

    }

    public void enterVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx) {
        System.out.println(ctx.getText());

    }

    public void exitVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx) {

    }

    public void enterPrinttext(cpp_grammarParser.PrinttextContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
    }

    public void exitPrinttext(cpp_grammarParser.PrinttextContext ctx) {

    }

    public void enterInputtext(cpp_grammarParser.InputtextContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
    }

    public void exitInputtext(cpp_grammarParser.InputtextContext ctx) {

    }

    public void enterSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
    }

    public void exitSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx) {

    }

    public void enterVariablevalue(cpp_grammarParser.VariablevalueContext ctx) {
        System.out.println(ctx.toStringTree());
        System.out.println(ctx.getText());
    }

    public void exitVariablevalue(cpp_grammarParser.VariablevalueContext ctx) {

    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
