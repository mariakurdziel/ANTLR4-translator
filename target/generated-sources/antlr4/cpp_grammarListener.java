// Generated from cpp_grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cpp_grammarParser}.
 */
public interface cpp_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(cpp_grammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(cpp_grammarParser.FileContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#accessection1}.
	 * @param ctx the parse tree
	 */
	void enterAccessection1(cpp_grammarParser.Accessection1Context ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#accessection1}.
	 * @param ctx the parse tree
	 */
	void exitAccessection1(cpp_grammarParser.Accessection1Context ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#accessection2}.
	 * @param ctx the parse tree
	 */
	void enterAccessection2(cpp_grammarParser.Accessection2Context ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#accessection2}.
	 * @param ctx the parse tree
	 */
	void exitAccessection2(cpp_grammarParser.Accessection2Context ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#extendsop}.
	 * @param ctx the parse tree
	 */
	void enterExtendsop(cpp_grammarParser.ExtendsopContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#extendsop}.
	 * @param ctx the parse tree
	 */
	void exitExtendsop(cpp_grammarParser.ExtendsopContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(cpp_grammarParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(cpp_grammarParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#destructor}.
	 * @param ctx the parse tree
	 */
	void enterDestructor(cpp_grammarParser.DestructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#destructor}.
	 * @param ctx the parse tree
	 */
	void exitDestructor(cpp_grammarParser.DestructorContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#noargfunction}.
	 * @param ctx the parse tree
	 */
	void enterNoargfunction(cpp_grammarParser.NoargfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#noargfunction}.
	 * @param ctx the parse tree
	 */
	void exitNoargfunction(cpp_grammarParser.NoargfunctionContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(cpp_grammarParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(cpp_grammarParser.IfstatementContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#pointerassign}.
	 * @param ctx the parse tree
	 */
	void enterPointerassign(cpp_grammarParser.PointerassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#pointerassign}.
	 * @param ctx the parse tree
	 */
	void exitPointerassign(cpp_grammarParser.PointerassignContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#specialtypes}.
	 * @param ctx the parse tree
	 */
	void enterSpecialtypes(cpp_grammarParser.SpecialtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#specialtypes}.
	 * @param ctx the parse tree
	 */
	void exitSpecialtypes(cpp_grammarParser.SpecialtypesContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#simpleoperators}.
	 * @param ctx the parse tree
	 */
	void enterSimpleoperators(cpp_grammarParser.SimpleoperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#simpleoperators}.
	 * @param ctx the parse tree
	 */
	void exitSimpleoperators(cpp_grammarParser.SimpleoperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#assignoperatior}.
	 * @param ctx the parse tree
	 */
	void enterAssignoperatior(cpp_grammarParser.AssignoperatiorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#assignoperatior}.
	 * @param ctx the parse tree
	 */
	void exitAssignoperatior(cpp_grammarParser.AssignoperatiorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#decincoperator}.
	 * @param ctx the parse tree
	 */
	void enterDecincoperator(cpp_grammarParser.DecincoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#decincoperator}.
	 * @param ctx the parse tree
	 */
	void exitDecincoperator(cpp_grammarParser.DecincoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#cincout}.
	 * @param ctx the parse tree
	 */
	void enterCincout(cpp_grammarParser.CincoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#cincout}.
	 * @param ctx the parse tree
	 */
	void exitCincout(cpp_grammarParser.CincoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#ifoperator}.
	 * @param ctx the parse tree
	 */
	void enterIfoperator(cpp_grammarParser.IfoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#ifoperator}.
	 * @param ctx the parse tree
	 */
	void exitIfoperator(cpp_grammarParser.IfoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#exproperator}.
	 * @param ctx the parse tree
	 */
	void enterExproperator(cpp_grammarParser.ExproperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#exproperator}.
	 * @param ctx the parse tree
	 */
	void exitExproperator(cpp_grammarParser.ExproperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#classsign}.
	 * @param ctx the parse tree
	 */
	void enterClasssign(cpp_grammarParser.ClasssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#classsign}.
	 * @param ctx the parse tree
	 */
	void exitClasssign(cpp_grammarParser.ClasssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(cpp_grammarParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(cpp_grammarParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#logicoperators}.
	 * @param ctx the parse tree
	 */
	void enterLogicoperators(cpp_grammarParser.LogicoperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#logicoperators}.
	 * @param ctx the parse tree
	 */
	void exitLogicoperators(cpp_grammarParser.LogicoperatorsContext ctx);
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
	 * Enter a parse tree produced by {@link cpp_grammarParser#textsign}.
	 * @param ctx the parse tree
	 */
	void enterTextsign(cpp_grammarParser.TextsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#textsign}.
	 * @param ctx the parse tree
	 */
	void exitTextsign(cpp_grammarParser.TextsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#stylesign}.
	 * @param ctx the parse tree
	 */
	void enterStylesign(cpp_grammarParser.StylesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#stylesign}.
	 * @param ctx the parse tree
	 */
	void exitStylesign(cpp_grammarParser.StylesignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(cpp_grammarParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(cpp_grammarParser.ColonContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(cpp_grammarParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(cpp_grammarParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#variablename}.
	 * @param ctx the parse tree
	 */
	void enterVariablename(cpp_grammarParser.VariablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#variablename}.
	 * @param ctx the parse tree
	 */
	void exitVariablename(cpp_grammarParser.VariablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpp_grammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(cpp_grammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpp_grammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(cpp_grammarParser.TextContext ctx);
}