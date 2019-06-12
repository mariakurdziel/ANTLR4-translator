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
	 * Visit a parse tree produced by {@link cpp_grammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(cpp_grammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(cpp_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#accessection1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessection1(cpp_grammarParser.Accessection1Context ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#accessection2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessection2(cpp_grammarParser.Accessection2Context ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#extendsop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsop(cpp_grammarParser.ExtendsopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(cpp_grammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#enumdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumdeclaration(cpp_grammarParser.EnumdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(cpp_grammarParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#destructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructor(cpp_grammarParser.DestructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(cpp_grammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#noargfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoargfunction(cpp_grammarParser.NoargfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#classprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassprefix(cpp_grammarParser.ClassprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#switchloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchloop(cpp_grammarParser.SwitchloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(cpp_grammarParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(cpp_grammarParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(cpp_grammarParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(cpp_grammarParser.OperationContext ctx);
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
	 * Visit a parse tree produced by {@link cpp_grammarParser#pointerassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerassign(cpp_grammarParser.PointerassignContext ctx);
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
	 * Visit a parse tree produced by {@link cpp_grammarParser#specialtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialtypes(cpp_grammarParser.SpecialtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#accessoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessoperator(cpp_grammarParser.AccessoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#simpleoperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleoperators(cpp_grammarParser.SimpleoperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#assignoperatior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignoperatior(cpp_grammarParser.AssignoperatiorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#decincoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecincoperator(cpp_grammarParser.DecincoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#cincout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCincout(cpp_grammarParser.CincoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#ifoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfoperator(cpp_grammarParser.IfoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#exproperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExproperator(cpp_grammarParser.ExproperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#classsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasssign(cpp_grammarParser.ClasssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(cpp_grammarParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#logicoperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoperators(cpp_grammarParser.LogicoperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypespecifier(cpp_grammarParser.SimpletypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#textsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextsign(cpp_grammarParser.TextsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#stylesign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesign(cpp_grammarParser.StylesignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(cpp_grammarParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#variablevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablevalue(cpp_grammarParser.VariablevalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(cpp_grammarParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#variablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablename(cpp_grammarParser.VariablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpp_grammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(cpp_grammarParser.TextContext ctx);
}