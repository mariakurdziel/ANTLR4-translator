// Generated from C:/Users/maria/Desktop/lab4/translator/src/main/antlr4\cpp_grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cpp_grammarParser}.
 */
public interface cpp_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#namespacedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#namespacedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#preprocessordirective}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#preprocessordirective}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#printtext}.
	 * @param ctx the parse tree
	 */
	void enterPrinttext(cpp_grammarParser.PrinttextContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#printtext}.
	 * @param ctx the parse tree
	 */
	void exitPrinttext(cpp_grammarParser.PrinttextContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#inputtext}.
	 * @param ctx the parse tree
	 */
	void enterInputtext(cpp_grammarParser.InputtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#inputtext}.
	 * @param ctx the parse tree
	 */
	void exitInputtext(cpp_grammarParser.InputtextContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#variablevalue}.
	 * @param ctx the parse tree
	 */
	void enterVariablevalue(cpp_grammarParser.VariablevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#variablevalue}.
	 * @param ctx the parse tree
	 */
	void exitVariablevalue(cpp_grammarParser.VariablevalueContext ctx);
}