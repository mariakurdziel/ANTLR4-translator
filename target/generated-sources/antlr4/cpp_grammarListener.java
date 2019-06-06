// Generated from cpp_grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cpp_grammarParser}.
 */
public interface cpp_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#classprefix}.
	 * @param ctx the parse tree
	 */
	void enterClassprefix(cpp_grammarParser.ClassprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#classprefix}.
	 * @param ctx the parse tree
	 */
	void exitClassprefix(cpp_grammarParser.ClassprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#enumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#enumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(cpp_grammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(cpp_grammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#switchloop}.
	 * @param ctx the parse tree
	 */
	void enterSwitchloop(cpp_grammarParser.SwitchloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#switchloop}.
	 * @param ctx the parse tree
	 */
	void exitSwitchloop(cpp_grammarParser.SwitchloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(cpp_grammarParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(cpp_grammarParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(cpp_grammarParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(cpp_grammarParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#ifoperation}.
	 * @param ctx the parse tree
	 */
	void enterIfoperation(cpp_grammarParser.IfoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#ifoperation}.
	 * @param ctx the parse tree
	 */
	void exitIfoperation(cpp_grammarParser.IfoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(cpp_grammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(cpp_grammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(cpp_grammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(cpp_grammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#assignoperation}.
	 * @param ctx the parse tree
	 */
	void enterAssignoperation(cpp_grammarParser.AssignoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#assignoperation}.
	 * @param ctx the parse tree
	 */
	void exitAssignoperation(cpp_grammarParser.AssignoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(cpp_grammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(cpp_grammarParser.ConditionContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(cpp_grammarParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(cpp_grammarParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#tabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTabledeclaration(cpp_grammarParser.TabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#tabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTabledeclaration(cpp_grammarParser.TabledeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(cpp_grammarParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(cpp_grammarParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#accessoperator}.
	 * @param ctx the parse tree
	 */
	void enterAccessoperator(cpp_grammarParser.AccessoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#accessoperator}.
	 * @param ctx the parse tree
	 */
	void exitAccessoperator(cpp_grammarParser.AccessoperatorContext ctx);
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