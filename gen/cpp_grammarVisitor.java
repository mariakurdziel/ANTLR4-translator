// Generated from C:/Users/maria/Desktop/lab4/translator/src/main/antlr4\cpp_grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cpp_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cpp_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#namespacedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacedeclaration(cpp_grammarParser.NamespacedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#preprocessordirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessordirective(cpp_grammarParser.PreprocessordirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaration(cpp_grammarParser.VariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#printtext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinttext(cpp_grammarParser.PrinttextContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#inputtext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputtext(cpp_grammarParser.InputtextContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#variablevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablevalue(cpp_grammarParser.VariablevalueContext ctx);
}