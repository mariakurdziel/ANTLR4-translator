// Generated from cpp_grammar.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link cpp_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#classprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassprefix(cpp_grammarParser.ClassprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#enumdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(cpp_grammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#switchloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchloop(cpp_grammarParser.SwitchloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(cpp_grammarParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(cpp_grammarParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#ifoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfoperation(cpp_grammarParser.IfoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(cpp_grammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(cpp_grammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#assignoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignoperation(cpp_grammarParser.AssignoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(cpp_grammarParser.ConditionContext ctx);
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
	 * Visit a parse tree produced by {@link cpp_grammarParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(cpp_grammarParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#tabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabledeclaration(cpp_grammarParser.TabledeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link cpp_grammarParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(cpp_grammarParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#accessoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessoperator(cpp_grammarParser.AccessoperatorContext ctx);
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