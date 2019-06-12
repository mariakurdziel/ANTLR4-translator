// Generated from cpp_grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cpp_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, USING=4, ENDL=5, INCLUDE=6, EQUAL=7, NOTEQUAL=8, 
		LESSEQUAL=9, GREATEREQUAL=10, ANDAND=11, OROR=12, PLUSPLUS=13, MINUSMINUS=14, 
		COMMA=15, LEFTSHIFT=16, RIGHTSHIFT=17, AUTO=18, BOOL=19, BREAK=20, CASE=21, 
		CATCH=22, CHAR=23, CLASS=24, CONST=25, CONTINUE=26, CIN=27, COUT=28, DEFAULT=29, 
		DELETE=30, DO=31, DOUBLE=32, ELSE=33, ENUM=34, FALSE=35, FINAL=36, FLOAT=37, 
		FOR=38, FRIEND=39, GOTO=40, IF=41, INLINE=42, INT=43, LONG=44, NAMESPACE=45, 
		NEW=46, NOEXCEPT=47, NULLPTR=48, OVERRIDE=49, PRIVATE=50, PROTECTED=51, 
		PUBLIC=52, REINTERPRET_CAST=53, RETURN=54, SHORT=55, SIGNED=56, SIZEOF=57, 
		STATIC=58, STRUCT=59, SWITCH=60, THROW=61, TRUE=62, TRY=63, UNSIGNED=64, 
		VIRTUAL=65, VOID=66, WHILE=67, LEFTPAREN=68, RIGHTPAREN=69, LEFTBRACKET=70, 
		RIGHTBRACKET=71, LEFTBRACE=72, RIGHTBRACE=73, PLUS=74, MINUS=75, STAR=76, 
		DIV=77, MOD=78, CARET=79, AND=80, OR=81, TILDE=82, NOT=83, ASSIGN=84, 
		LESS=85, GREATER=86, PLUSASSIGN=87, MINUSASSIGN=88, STARASSIGN=89, DIVASSIGN=90, 
		MODASSIGN=91, SEMICOLON=92, COLON=93, QUOTEMARK=94, POINTER=95, OPERATOR=96, 
		TEXT=97, VARIABLENAME=98, WORD=99, LIBRARY=100, NUMBER=101, LINECOMMENT=102, 
		BLOCKCOMMENT=103, NEWLINE=104, WHITESPACE=105, NONDIGIT=106;
	public static final int
		RULE_file = 0, RULE_classdeclaration = 1, RULE_accessection1 = 2, RULE_accessection2 = 3, 
		RULE_extendsop = 4, RULE_body = 5, RULE_enumdeclaration = 6, RULE_constructor = 7, 
		RULE_destructor = 8, RULE_function = 9, RULE_noargfunction = 10, RULE_classprefix = 11, 
		RULE_switchloop = 12, RULE_ifstatement = 13, RULE_whileloop = 14, RULE_forloop = 15, 
		RULE_operation = 16, RULE_condition = 17, RULE_namespacedeclaration = 18, 
		RULE_pointerassign = 19, RULE_preprocessordirective = 20, RULE_functiondeclaration = 21, 
		RULE_tabledeclaration = 22, RULE_variabledeclaration = 23, RULE_printtext = 24, 
		RULE_inputtext = 25, RULE_table = 26, RULE_specialtypes = 27, RULE_accessoperator = 28, 
		RULE_simpleoperators = 29, RULE_assignoperatior = 30, RULE_decincoperator = 31, 
		RULE_cincout = 32, RULE_ifoperator = 33, RULE_exproperator = 34, RULE_classsign = 35, 
		RULE_pointer = 36, RULE_logicoperators = 37, RULE_simpletypespecifier = 38, 
		RULE_textsign = 39, RULE_stylesign = 40, RULE_colon = 41, RULE_variablevalue = 42, 
		RULE_classname = 43, RULE_variablename = 44, RULE_text = 45;
	public static final String[] ruleNames = {
		"file", "classdeclaration", "accessection1", "accessection2", "extendsop", 
		"body", "enumdeclaration", "constructor", "destructor", "function", "noargfunction", 
		"classprefix", "switchloop", "ifstatement", "whileloop", "forloop", "operation", 
		"condition", "namespacedeclaration", "pointerassign", "preprocessordirective", 
		"functiondeclaration", "tabledeclaration", "variabledeclaration", "printtext", 
		"inputtext", "table", "specialtypes", "accessoperator", "simpleoperators", 
		"assignoperatior", "decincoperator", "cincout", "ifoperator", "exproperator", 
		"classsign", "pointer", "logicoperators", "simpletypespecifier", "textsign", 
		"stylesign", "colon", "variablevalue", "classname", "variablename", "text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(){}'", "'std;'", "'''", "'using'", "'endl'", "'#include'", "'=='", 
		"'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'<<'", "'>>'", 
		"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'cin'", "'cout'", "'default'", "'delete'", "'do'", 
		"'double'", "'else'", "'enum'", "'false'", "'final'", "'float'", "'for'", 
		"'friend'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'namespace'", 
		"'new'", "'noexcept'", "'nullptr'", "'override'", "'private'", "'protected'", 
		"'public'", "'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", 
		"'static'", "'struct'", "'switch'", "'throw'", "'true'", "'try'", "'unsigned'", 
		"'virtual'", "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", 
		"'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "';'", "':'", "'\"'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "USING", "ENDL", "INCLUDE", "EQUAL", "NOTEQUAL", 
		"LESSEQUAL", "GREATEREQUAL", "ANDAND", "OROR", "PLUSPLUS", "MINUSMINUS", 
		"COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AUTO", "BOOL", "BREAK", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "CIN", "COUT", "DEFAULT", "DELETE", 
		"DO", "DOUBLE", "ELSE", "ENUM", "FALSE", "FINAL", "FLOAT", "FOR", "FRIEND", 
		"GOTO", "IF", "INLINE", "INT", "LONG", "NAMESPACE", "NEW", "NOEXCEPT", 
		"NULLPTR", "OVERRIDE", "PRIVATE", "PROTECTED", "PUBLIC", "REINTERPRET_CAST", 
		"RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "THROW", 
		"TRUE", "TRY", "UNSIGNED", "VIRTUAL", "VOID", "WHILE", "LEFTPAREN", "RIGHTPAREN", 
		"LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", "PLUS", "MINUS", 
		"STAR", "DIV", "MOD", "CARET", "AND", "OR", "TILDE", "NOT", "ASSIGN", 
		"LESS", "GREATER", "PLUSASSIGN", "MINUSASSIGN", "STARASSIGN", "DIVASSIGN", 
		"MODASSIGN", "SEMICOLON", "COLON", "QUOTEMARK", "POINTER", "OPERATOR", 
		"TEXT", "VARIABLENAME", "WORD", "LIBRARY", "NUMBER", "LINECOMMENT", "BLOCKCOMMENT", 
		"NEWLINE", "WHITESPACE", "NONDIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cpp_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cpp_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public PreprocessordirectiveContext preprocessordirective() {
			return getRuleContext(PreprocessordirectiveContext.class,0);
		}
		public NamespacedeclarationContext namespacedeclaration() {
			return getRuleContext(NamespacedeclarationContext.class,0);
		}
		public ClassdeclarationContext classdeclaration() {
			return getRuleContext(ClassdeclarationContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			preprocessordirective();
			setState(93);
			namespacedeclaration();
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(94);
				classdeclaration();
				}
				break;
			case AUTO:
			case BOOL:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case SIGNED:
			case STATIC:
			case UNSIGNED:
			case VOID:
				{
				{
				setState(95);
				function();
				setState(96);
				function();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdeclarationContext extends ParserRuleContext {
		public ClasssignContext classsign() {
			return getRuleContext(ClasssignContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public ExtendsopContext extendsop() {
			return getRuleContext(ExtendsopContext.class,0);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public Accessection1Context accessection1() {
			return getRuleContext(Accessection1Context.class,0);
		}
		public Accessection2Context accessection2() {
			return getRuleContext(Accessection2Context.class,0);
		}
		public ClassdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterClassdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitClassdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitClassdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclarationContext classdeclaration() throws RecognitionException {
		ClassdeclarationContext _localctx = new ClassdeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			classsign();
			setState(101);
			variablename();
			setState(102);
			extendsop();
			setState(103);
			stylesign();
			setState(104);
			accessection1();
			setState(105);
			accessection2();
			setState(106);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessection1Context extends ParserRuleContext {
		public AccessoperatorContext accessoperator() {
			return getRuleContext(AccessoperatorContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public List<VariabledeclarationContext> variabledeclaration() {
			return getRuleContexts(VariabledeclarationContext.class);
		}
		public VariabledeclarationContext variabledeclaration(int i) {
			return getRuleContext(VariabledeclarationContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public DestructorContext destructor() {
			return getRuleContext(DestructorContext.class,0);
		}
		public Accessection1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessection1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterAccessection1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitAccessection1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitAccessection1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessection1Context accessection1() throws RecognitionException {
		Accessection1Context _localctx = new Accessection1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_accessection1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			accessoperator();
			setState(109);
			colon();
			setState(110);
			variabledeclaration();
			setState(111);
			variabledeclaration();
			setState(112);
			constructor();
			setState(113);
			destructor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessection2Context extends ParserRuleContext {
		public AccessoperatorContext accessoperator() {
			return getRuleContext(AccessoperatorContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NoargfunctionContext noargfunction() {
			return getRuleContext(NoargfunctionContext.class,0);
		}
		public Accessection2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessection2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterAccessection2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitAccessection2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitAccessection2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessection2Context accessection2() throws RecognitionException {
		Accessection2Context _localctx = new Accessection2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_accessection2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			accessoperator();
			setState(116);
			colon();
			setState(117);
			variabledeclaration();
			setState(118);
			function();
			setState(119);
			noargfunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsopContext extends ParserRuleContext {
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public AccessoperatorContext accessoperator() {
			return getRuleContext(AccessoperatorContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public ExtendsopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterExtendsop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitExtendsop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitExtendsop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsopContext extendsop() throws RecognitionException {
		ExtendsopContext _localctx = new ExtendsopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_extendsop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			colon();
			setState(122);
			accessoperator();
			setState(123);
			variablename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public List<PrinttextContext> printtext() {
			return getRuleContexts(PrinttextContext.class);
		}
		public PrinttextContext printtext(int i) {
			return getRuleContext(PrinttextContext.class,i);
		}
		public List<PointerassignContext> pointerassign() {
			return getRuleContexts(PointerassignContext.class);
		}
		public PointerassignContext pointerassign(int i) {
			return getRuleContext(PointerassignContext.class,i);
		}
		public List<InputtextContext> inputtext() {
			return getRuleContexts(InputtextContext.class);
		}
		public InputtextContext inputtext(int i) {
			return getRuleContext(InputtextContext.class,i);
		}
		public List<VariabledeclarationContext> variabledeclaration() {
			return getRuleContexts(VariabledeclarationContext.class);
		}
		public VariabledeclarationContext variabledeclaration(int i) {
			return getRuleContext(VariabledeclarationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<WhileloopContext> whileloop() {
			return getRuleContexts(WhileloopContext.class);
		}
		public WhileloopContext whileloop(int i) {
			return getRuleContext(WhileloopContext.class,i);
		}
		public List<ForloopContext> forloop() {
			return getRuleContexts(ForloopContext.class);
		}
		public ForloopContext forloop(int i) {
			return getRuleContext(ForloopContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<SwitchloopContext> switchloop() {
			return getRuleContexts(SwitchloopContext.class);
		}
		public SwitchloopContext switchloop(int i) {
			return getRuleContext(SwitchloopContext.class,i);
		}
		public List<TabledeclarationContext> tabledeclaration() {
			return getRuleContexts(TabledeclarationContext.class);
		}
		public TabledeclarationContext tabledeclaration(int i) {
			return getRuleContext(TabledeclarationContext.class,i);
		}
		public ExproperatorContext exproperator() {
			return getRuleContext(ExproperatorContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			stylesign();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(126);
						printtext();
						}
						break;
					case 2:
						{
						setState(127);
						pointerassign();
						}
						break;
					case 3:
						{
						setState(128);
						inputtext();
						}
						break;
					case 4:
						{
						setState(129);
						variabledeclaration();
						}
						break;
					case 5:
						{
						setState(130);
						operation();
						}
						break;
					case 6:
						{
						setState(131);
						whileloop();
						}
						break;
					case 7:
						{
						setState(132);
						forloop();
						}
						break;
					case 8:
						{
						setState(133);
						table();
						}
						break;
					case 9:
						{
						setState(134);
						switchloop();
						}
						break;
					case 10:
						{
						setState(135);
						tabledeclaration();
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (BREAK - 20)) | (1L << (CASE - 20)) | (1L << (DEFAULT - 20)) | (1L << (ENUM - 20)) | (1L << (FOR - 20)) | (1L << (RETURN - 20)) | (1L << (SWITCH - 20)) | (1L << (WHILE - 20)))) != 0)) {
				{
				setState(141);
				exproperator();
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLENAME:
					{
					setState(142);
					variablename();
					}
					break;
				case T__2:
				case COMMA:
				case LEFTPAREN:
				case RIGHTPAREN:
				case LEFTBRACKET:
				case RIGHTBRACKET:
				case LEFTBRACE:
				case RIGHTBRACE:
				case SEMICOLON:
				case COLON:
				case NUMBER:
					{
					setState(143);
					variablevalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146);
				stylesign();
				}
			}

			setState(150);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumdeclarationContext extends ParserRuleContext {
		public ExproperatorContext exproperator() {
			return getRuleContext(ExproperatorContext.class,0);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public EnumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterEnumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitEnumdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitEnumdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumdeclarationContext enumdeclaration() throws RecognitionException {
		EnumdeclarationContext _localctx = new EnumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumdeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			exproperator();
			setState(153);
			stylesign();
			{
			setState(154);
			variablename();
			setState(155);
			stylesign();
			}
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					matchWildcard();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(163);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ClassprefixContext classprefix() {
			return getRuleContext(ClassprefixContext.class,0);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<SimpletypespecifierContext> simpletypespecifier() {
			return getRuleContexts(SimpletypespecifierContext.class);
		}
		public SimpletypespecifierContext simpletypespecifier(int i) {
			return getRuleContext(SimpletypespecifierContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			classprefix();
			setState(166);
			variablename();
			setState(167);
			stylesign();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(168);
				simpletypespecifier();
				setState(169);
				variablename();
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(170);
					stylesign();
					}
					break;
				}
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			stylesign();
			setState(179);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestructorContext extends ParserRuleContext {
		public ClassprefixContext classprefix() {
			return getRuleContext(ClassprefixContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DestructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterDestructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitDestructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitDestructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorContext destructor() throws RecognitionException {
		DestructorContext _localctx = new DestructorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_destructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TILDE);
			setState(182);
			classprefix();
			setState(183);
			classname();
			setState(184);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<SimpletypespecifierContext> simpletypespecifier() {
			return getRuleContexts(SimpletypespecifierContext.class);
		}
		public SimpletypespecifierContext simpletypespecifier(int i) {
			return getRuleContext(SimpletypespecifierContext.class,i);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<SpecialtypesContext> specialtypes() {
			return getRuleContexts(SpecialtypesContext.class);
		}
		public SpecialtypesContext specialtypes(int i) {
			return getRuleContext(SpecialtypesContext.class,i);
		}
		public ClassprefixContext classprefix() {
			return getRuleContext(ClassprefixContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATIC) {
				{
				{
				setState(186);
				specialtypes();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			simpletypespecifier();
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(193);
				classprefix();
				}
				break;
			}
			setState(196);
			variablename();
			setState(197);
			stylesign();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(198);
				simpletypespecifier();
				setState(199);
				variablename();
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(200);
					stylesign();
					}
					break;
				}
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			stylesign();
			setState(209);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoargfunctionContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<SpecialtypesContext> specialtypes() {
			return getRuleContexts(SpecialtypesContext.class);
		}
		public SpecialtypesContext specialtypes(int i) {
			return getRuleContext(SpecialtypesContext.class,i);
		}
		public ClassprefixContext classprefix() {
			return getRuleContext(ClassprefixContext.class,0);
		}
		public NoargfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noargfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterNoargfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitNoargfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitNoargfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoargfunctionContext noargfunction() throws RecognitionException {
		NoargfunctionContext _localctx = new NoargfunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_noargfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATIC) {
				{
				{
				setState(211);
				specialtypes();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			simpletypespecifier();
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(218);
				classprefix();
				}
				break;
			}
			setState(221);
			variablename();
			setState(222);
			stylesign();
			setState(223);
			stylesign();
			setState(224);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassprefixContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public List<ColonContext> colon() {
			return getRuleContexts(ColonContext.class);
		}
		public ColonContext colon(int i) {
			return getRuleContext(ColonContext.class,i);
		}
		public ClassprefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classprefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterClassprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitClassprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitClassprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassprefixContext classprefix() throws RecognitionException {
		ClassprefixContext _localctx = new ClassprefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			classname();
			setState(227);
			colon();
			setState(228);
			colon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchloopContext extends ParserRuleContext {
		public List<ExproperatorContext> exproperator() {
			return getRuleContexts(ExproperatorContext.class);
		}
		public ExproperatorContext exproperator(int i) {
			return getRuleContext(ExproperatorContext.class,i);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<PrinttextContext> printtext() {
			return getRuleContexts(PrinttextContext.class);
		}
		public PrinttextContext printtext(int i) {
			return getRuleContext(PrinttextContext.class,i);
		}
		public SwitchloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterSwitchloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitSwitchloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitSwitchloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchloopContext switchloop() throws RecognitionException {
		SwitchloopContext _localctx = new SwitchloopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchloop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			exproperator();
			setState(231);
			stylesign();
			setState(232);
			variablename();
			setState(233);
			stylesign();
			setState(234);
			stylesign();
			{
			setState(235);
			exproperator();
			setState(236);
			variablevalue();
			setState(237);
			stylesign();
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO:
			case BOOL:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case SIGNED:
			case UNSIGNED:
			case VOID:
			case VARIABLENAME:
				{
				setState(238);
				operation();
				}
				break;
			case ENDL:
			case CIN:
			case COUT:
				{
				setState(239);
				printtext();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			exproperator();
			setState(243);
			stylesign();
			}
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					matchWildcard();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (BREAK - 20)) | (1L << (CASE - 20)) | (1L << (DEFAULT - 20)) | (1L << (ENUM - 20)) | (1L << (FOR - 20)) | (1L << (RETURN - 20)) | (1L << (SWITCH - 20)) | (1L << (WHILE - 20)))) != 0)) {
				{
				setState(251);
				exproperator();
				setState(252);
				stylesign();
				setState(255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUTO:
				case BOOL:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case SIGNED:
				case UNSIGNED:
				case VOID:
				case VARIABLENAME:
					{
					setState(253);
					operation();
					}
					break;
				case ENDL:
				case CIN:
				case COUT:
					{
					setState(254);
					printtext();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(259);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public IfoperatorContext ifoperator() {
			return getRuleContext(IfoperatorContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			ifoperator();
			setState(262);
			condition();
			setState(263);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public ExproperatorContext exproperator() {
			return getRuleContext(ExproperatorContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			exproperator();
			setState(266);
			condition();
			setState(267);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public ExproperatorContext exproperator() {
			return getRuleContext(ExproperatorContext.class,0);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<VariablevalueContext> variablevalue() {
			return getRuleContexts(VariablevalueContext.class);
		}
		public VariablevalueContext variablevalue(int i) {
			return getRuleContext(VariablevalueContext.class,i);
		}
		public List<DecincoperatorContext> decincoperator() {
			return getRuleContexts(DecincoperatorContext.class);
		}
		public DecincoperatorContext decincoperator(int i) {
			return getRuleContext(DecincoperatorContext.class,i);
		}
		public List<LogicoperatorsContext> logicoperators() {
			return getRuleContexts(LogicoperatorsContext.class);
		}
		public LogicoperatorsContext logicoperators(int i) {
			return getRuleContext(LogicoperatorsContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			exproperator();
			setState(270);
			stylesign();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(271);
				variablename();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AND - 80)) | (1L << (OR - 80)) | (1L << (ASSIGN - 80)) | (1L << (LESS - 80)) | (1L << (GREATER - 80)))) != 0)) {
					{
					setState(272);
					logicoperators();
					setState(273);
					variablevalue();
					}
				}

				}
			}

			setState(279);
			stylesign();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(280);
				variablename();
				{
				setState(281);
				logicoperators();
				}
				setState(282);
				variablevalue();
				}
			}

			setState(286);
			stylesign();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUSPLUS || _la==MINUSMINUS) {
				{
				setState(287);
				decincoperator();
				setState(288);
				variablename();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(292);
				variablename();
				setState(293);
				decincoperator();
				}
			}

			setState(297);
			stylesign();
			setState(298);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public StylesignContext stylesign() {
			return getRuleContext(StylesignContext.class,0);
		}
		public AssignoperatiorContext assignoperatior() {
			return getRuleContext(AssignoperatiorContext.class,0);
		}
		public List<DecincoperatorContext> decincoperator() {
			return getRuleContexts(DecincoperatorContext.class);
		}
		public DecincoperatorContext decincoperator(int i) {
			return getRuleContext(DecincoperatorContext.class,i);
		}
		public List<VariablevalueContext> variablevalue() {
			return getRuleContexts(VariablevalueContext.class);
		}
		public VariablevalueContext variablevalue(int i) {
			return getRuleContext(VariablevalueContext.class,i);
		}
		public SimpleoperatorsContext simpleoperators() {
			return getRuleContext(SimpleoperatorsContext.class,0);
		}
		public LogicoperatorsContext logicoperators() {
			return getRuleContext(LogicoperatorsContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				setState(300);
				simpletypespecifier();
				}
			}

			setState(303);
			variablename();
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case PLUSASSIGN:
			case MINUSASSIGN:
			case STARASSIGN:
			case DIVASSIGN:
			case MODASSIGN:
				{
				setState(304);
				assignoperatior();
				}
				break;
			case PLUSPLUS:
			case MINUSMINUS:
				{
				setState(305);
				decincoperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(308);
				variablename();
				}
				break;
			case 2:
				{
				setState(309);
				variablevalue();
				}
				break;
			case 3:
				{
				setState(310);
				decincoperator();
				}
				break;
			}
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					matchWildcard();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case STAR:
			case DIV:
			case MOD:
				{
				setState(319);
				simpleoperators();
				}
				break;
			case EQUAL:
			case NOTEQUAL:
			case LESSEQUAL:
			case GREATEREQUAL:
			case AND:
			case OR:
			case ASSIGN:
			case LESS:
			case GREATER:
				{
				setState(320);
				logicoperators();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					matchWildcard();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(329);
				variablename();
				}
				break;
			case 2:
				{
				setState(330);
				variablevalue();
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					matchWildcard();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(339);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public LogicoperatorsContext logicoperators() {
			return getRuleContext(LogicoperatorsContext.class,0);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public SimpleoperatorsContext simpleoperators() {
			return getRuleContext(SimpleoperatorsContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			stylesign();
			setState(342);
			variablename();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PLUS - 74)) | (1L << (MINUS - 74)) | (1L << (STAR - 74)) | (1L << (DIV - 74)) | (1L << (MOD - 74)))) != 0)) {
				{
				{
				{
				setState(343);
				simpleoperators();
				}
				setState(344);
				variablename();
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						matchWildcard();
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AND - 80)) | (1L << (OR - 80)) | (1L << (ASSIGN - 80)) | (1L << (LESS - 80)) | (1L << (GREATER - 80)))) != 0)) {
				{
				{
				setState(354);
				logicoperators();
				}
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLENAME:
					{
					setState(355);
					variablename();
					}
					break;
				case T__2:
				case COMMA:
				case LEFTPAREN:
				case RIGHTPAREN:
				case LEFTBRACKET:
				case RIGHTBRACKET:
				case LEFTBRACE:
				case RIGHTBRACE:
				case SEMICOLON:
				case COLON:
				case NUMBER:
					{
					setState(356);
					variablevalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(361);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedeclarationContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(cpp_grammarParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(cpp_grammarParser.NAMESPACE, 0); }
		public NamespacedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterNamespacedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitNamespacedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitNamespacedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacedeclarationContext namespacedeclaration() throws RecognitionException {
		NamespacedeclarationContext _localctx = new NamespacedeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_namespacedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(USING);
			setState(364);
			match(NAMESPACE);
			setState(365);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerassignContext extends ParserRuleContext {
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AssignoperatiorContext assignoperatior() {
			return getRuleContext(AssignoperatiorContext.class,0);
		}
		public StylesignContext stylesign() {
			return getRuleContext(StylesignContext.class,0);
		}
		public PointerassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterPointerassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitPointerassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitPointerassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerassignContext pointerassign() throws RecognitionException {
		PointerassignContext _localctx = new PointerassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointerassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			variablename();
			setState(368);
			pointer();
			setState(369);
			variablename();
			setState(370);
			assignoperatior();
			setState(371);
			variablename();
			setState(372);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocessordirectiveContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(cpp_grammarParser.INCLUDE, 0); }
		public TerminalNode LIBRARY() { return getToken(cpp_grammarParser.LIBRARY, 0); }
		public PreprocessordirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessordirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterPreprocessordirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitPreprocessordirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitPreprocessordirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessordirectiveContext preprocessordirective() throws RecognitionException {
		PreprocessordirectiveContext _localctx = new PreprocessordirectiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_preprocessordirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(INCLUDE);
			setState(375);
			match(LESS);
			setState(376);
			match(LIBRARY);
			setState(377);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public List<SimpletypespecifierContext> simpletypespecifier() {
			return getRuleContexts(SimpletypespecifierContext.class);
		}
		public SimpletypespecifierContext simpletypespecifier(int i) {
			return getRuleContext(SimpletypespecifierContext.class,i);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitFunctiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			simpletypespecifier();
			setState(380);
			variablename();
			setState(381);
			stylesign();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(382);
				simpletypespecifier();
				setState(383);
				variablename();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(384);
					stylesign();
					}
					break;
				}
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			stylesign();
			setState(393);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabledeclarationContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public LogicoperatorsContext logicoperators() {
			return getRuleContext(LogicoperatorsContext.class,0);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public TabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterTabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitTabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitTabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabledeclarationContext tabledeclaration() throws RecognitionException {
		TabledeclarationContext _localctx = new TabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tabledeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			table();
			setState(396);
			logicoperators();
			setState(397);
			stylesign();
			{
			setState(398);
			variablevalue();
			}
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					matchWildcard();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					stylesign();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(411);
			stylesign();
			setState(412);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabledeclarationContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public LogicoperatorsContext logicoperators() {
			return getRuleContext(LogicoperatorsContext.class,0);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public StylesignContext stylesign() {
			return getRuleContext(StylesignContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitVariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			simpletypespecifier();
			setState(415);
			variablename();
			setState(416);
			logicoperators();
			setState(417);
			variablevalue();
			setState(418);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrinttextContext extends ParserRuleContext {
		public List<CincoutContext> cincout() {
			return getRuleContexts(CincoutContext.class);
		}
		public CincoutContext cincout(int i) {
			return getRuleContext(CincoutContext.class,i);
		}
		public List<TextsignContext> textsign() {
			return getRuleContexts(TextsignContext.class);
		}
		public TextsignContext textsign(int i) {
			return getRuleContext(TextsignContext.class,i);
		}
		public StylesignContext stylesign() {
			return getRuleContext(StylesignContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public PrinttextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printtext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterPrinttext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitPrinttext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitPrinttext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinttextContext printtext() throws RecognitionException {
		PrinttextContext _localctx = new PrinttextContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			cincout();
			setState(421);
			textsign();
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(422);
				text();
				}
				break;
			case VARIABLENAME:
				{
				setState(423);
				variablename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT || _la==RIGHTSHIFT) {
				{
				setState(426);
				textsign();
				setState(427);
				cincout();
				}
			}

			setState(431);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputtextContext extends ParserRuleContext {
		public List<CincoutContext> cincout() {
			return getRuleContexts(CincoutContext.class);
		}
		public CincoutContext cincout(int i) {
			return getRuleContext(CincoutContext.class,i);
		}
		public List<TextsignContext> textsign() {
			return getRuleContexts(TextsignContext.class);
		}
		public TextsignContext textsign(int i) {
			return getRuleContext(TextsignContext.class,i);
		}
		public VariablenameContext variablename() {
			return getRuleContext(VariablenameContext.class,0);
		}
		public StylesignContext stylesign() {
			return getRuleContext(StylesignContext.class,0);
		}
		public InputtextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputtext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterInputtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitInputtext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitInputtext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputtextContext inputtext() throws RecognitionException {
		InputtextContext _localctx = new InputtextContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inputtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			cincout();
			setState(434);
			textsign();
			setState(435);
			variablename();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT || _la==RIGHTSHIFT) {
				{
				setState(436);
				textsign();
				setState(437);
				cincout();
				}
			}

			setState(441);
			stylesign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public List<VariablenameContext> variablename() {
			return getRuleContexts(VariablenameContext.class);
		}
		public VariablenameContext variablename(int i) {
			return getRuleContext(VariablenameContext.class,i);
		}
		public List<StylesignContext> stylesign() {
			return getRuleContexts(StylesignContext.class);
		}
		public StylesignContext stylesign(int i) {
			return getRuleContext(StylesignContext.class,i);
		}
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			simpletypespecifier();
			setState(444);
			variablename();
			setState(445);
			stylesign();
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case COMMA:
			case LEFTPAREN:
			case RIGHTPAREN:
			case LEFTBRACKET:
			case RIGHTBRACKET:
			case LEFTBRACE:
			case RIGHTBRACE:
			case SEMICOLON:
			case COLON:
			case NUMBER:
				{
				setState(446);
				variablevalue();
				}
				break;
			case VARIABLENAME:
				{
				setState(447);
				variablename();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			stylesign();
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(451);
				stylesign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialtypesContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(cpp_grammarParser.STATIC, 0); }
		public SpecialtypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialtypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterSpecialtypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitSpecialtypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitSpecialtypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialtypesContext specialtypes() throws RecognitionException {
		SpecialtypesContext _localctx = new SpecialtypesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_specialtypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessoperatorContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(cpp_grammarParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(cpp_grammarParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(cpp_grammarParser.PROTECTED, 0); }
		public AccessoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterAccessoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitAccessoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitAccessoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessoperatorContext accessoperator() throws RecognitionException {
		AccessoperatorContext _localctx = new AccessoperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_accessoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleoperatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(cpp_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cpp_grammarParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(cpp_grammarParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(cpp_grammarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(cpp_grammarParser.DIV, 0); }
		public SimpleoperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleoperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterSimpleoperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitSimpleoperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitSimpleoperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleoperatorsContext simpleoperators() throws RecognitionException {
		SimpleoperatorsContext _localctx = new SimpleoperatorsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleoperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PLUS - 74)) | (1L << (MINUS - 74)) | (1L << (STAR - 74)) | (1L << (DIV - 74)) | (1L << (MOD - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignoperatiorContext extends ParserRuleContext {
		public TerminalNode PLUSASSIGN() { return getToken(cpp_grammarParser.PLUSASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(cpp_grammarParser.MINUSASSIGN, 0); }
		public TerminalNode STARASSIGN() { return getToken(cpp_grammarParser.STARASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(cpp_grammarParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(cpp_grammarParser.MODASSIGN, 0); }
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
		public AssignoperatiorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignoperatior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterAssignoperatior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitAssignoperatior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitAssignoperatior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignoperatiorContext assignoperatior() throws RecognitionException {
		AssignoperatiorContext _localctx = new AssignoperatiorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignoperatior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ASSIGN - 84)) | (1L << (PLUSASSIGN - 84)) | (1L << (MINUSASSIGN - 84)) | (1L << (STARASSIGN - 84)) | (1L << (DIVASSIGN - 84)) | (1L << (MODASSIGN - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecincoperatorContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(cpp_grammarParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(cpp_grammarParser.MINUSMINUS, 0); }
		public DecincoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decincoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterDecincoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitDecincoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitDecincoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecincoperatorContext decincoperator() throws RecognitionException {
		DecincoperatorContext _localctx = new DecincoperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decincoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CincoutContext extends ParserRuleContext {
		public TerminalNode CIN() { return getToken(cpp_grammarParser.CIN, 0); }
		public TerminalNode COUT() { return getToken(cpp_grammarParser.COUT, 0); }
		public TerminalNode ENDL() { return getToken(cpp_grammarParser.ENDL, 0); }
		public CincoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cincout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterCincout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitCincout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitCincout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CincoutContext cincout() throws RecognitionException {
		CincoutContext _localctx = new CincoutContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cincout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENDL) | (1L << CIN) | (1L << COUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfoperatorContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cpp_grammarParser.IF, 0); }
		public IfoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterIfoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitIfoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitIfoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfoperatorContext ifoperator() throws RecognitionException {
		IfoperatorContext _localctx = new IfoperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExproperatorContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(cpp_grammarParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(cpp_grammarParser.FOR, 0); }
		public TerminalNode SWITCH() { return getToken(cpp_grammarParser.SWITCH, 0); }
		public TerminalNode CASE() { return getToken(cpp_grammarParser.CASE, 0); }
		public TerminalNode ENUM() { return getToken(cpp_grammarParser.ENUM, 0); }
		public TerminalNode BREAK() { return getToken(cpp_grammarParser.BREAK, 0); }
		public TerminalNode DEFAULT() { return getToken(cpp_grammarParser.DEFAULT, 0); }
		public TerminalNode RETURN() { return getToken(cpp_grammarParser.RETURN, 0); }
		public ExproperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exproperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterExproperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitExproperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitExproperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExproperatorContext exproperator() throws RecognitionException {
		ExproperatorContext _localctx = new ExproperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exproperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (BREAK - 20)) | (1L << (CASE - 20)) | (1L << (DEFAULT - 20)) | (1L << (ENUM - 20)) | (1L << (FOR - 20)) | (1L << (RETURN - 20)) | (1L << (SWITCH - 20)) | (1L << (WHILE - 20)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasssignContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(cpp_grammarParser.CLASS, 0); }
		public ClasssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterClasssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitClasssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitClasssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasssignContext classsign() throws RecognitionException {
		ClasssignContext _localctx = new ClasssignContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classsign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(CLASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(cpp_grammarParser.POINTER, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(POINTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicoperatorsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(cpp_grammarParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(cpp_grammarParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(cpp_grammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(cpp_grammarParser.OR, 0); }
		public TerminalNode LESSEQUAL() { return getToken(cpp_grammarParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(cpp_grammarParser.GREATEREQUAL, 0); }
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
		public TerminalNode LESS() { return getToken(cpp_grammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(cpp_grammarParser.GREATER, 0); }
		public LogicoperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterLogicoperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitLogicoperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitLogicoperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoperatorsContext logicoperators() throws RecognitionException {
		LogicoperatorsContext _localctx = new LogicoperatorsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicoperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AND - 80)) | (1L << (OR - 80)) | (1L << (ASSIGN - 80)) | (1L << (LESS - 80)) | (1L << (GREATER - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(cpp_grammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(cpp_grammarParser.BOOL, 0); }
		public TerminalNode SHORT() { return getToken(cpp_grammarParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(cpp_grammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(cpp_grammarParser.LONG, 0); }
		public TerminalNode SIGNED() { return getToken(cpp_grammarParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(cpp_grammarParser.UNSIGNED, 0); }
		public TerminalNode FLOAT() { return getToken(cpp_grammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(cpp_grammarParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(cpp_grammarParser.VOID, 0); }
		public TerminalNode AUTO() { return getToken(cpp_grammarParser.AUTO, 0); }
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitSimpletypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitSimpletypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simpletypespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextsignContext extends ParserRuleContext {
		public TerminalNode RIGHTSHIFT() { return getToken(cpp_grammarParser.RIGHTSHIFT, 0); }
		public TerminalNode LEFTSHIFT() { return getToken(cpp_grammarParser.LEFTSHIFT, 0); }
		public TextsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterTextsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitTextsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitTextsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextsignContext textsign() throws RecognitionException {
		TextsignContext _localctx = new TextsignContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_textsign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StylesignContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(cpp_grammarParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(cpp_grammarParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(cpp_grammarParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(cpp_grammarParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(cpp_grammarParser.RIGHTBRACKET, 0); }
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public StylesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterStylesign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitStylesign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitStylesign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesignContext stylesign() throws RecognitionException {
		StylesignContext _localctx = new StylesignContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stylesign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !(_la==COMMA || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LEFTPAREN - 68)) | (1L << (RIGHTPAREN - 68)) | (1L << (LEFTBRACKET - 68)) | (1L << (RIGHTBRACKET - 68)) | (1L << (LEFTBRACE - 68)) | (1L << (RIGHTBRACE - 68)) | (1L << (SEMICOLON - 68)) | (1L << (COLON - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColonContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(cpp_grammarParser.COLON, 0); }
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablevalueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(cpp_grammarParser.NUMBER, 0); }
		public TerminalNode NONDIGIT() { return getToken(cpp_grammarParser.NONDIGIT, 0); }
		public VariablevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterVariablevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitVariablevalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitVariablevalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablevalueContext variablevalue() throws RecognitionException {
		VariablevalueContext _localctx = new VariablevalueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variablevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(484);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(485);
				match(T__2);
				setState(486);
				match(NONDIGIT);
				setState(487);
				match(T__2);
				}
				break;
			case 3:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(VARIABLENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablenameContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public VariablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterVariablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitVariablename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitVariablename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablenameContext variablename() throws RecognitionException {
		VariablenameContext _localctx = new VariablenameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variablename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(VARIABLENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(cpp_grammarParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u01f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\5\2e\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008b"+
		"\n\7\f\7\16\7\u008e\13\7\3\7\3\7\3\7\5\7\u0093\n\7\3\7\3\7\5\7\u0097\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\7\t\u00b0\n\t\f\t\16\t\u00b3"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\7\13\u00be\n\13\f\13\16\13"+
		"\u00c1\13\13\3\13\3\13\5\13\u00c5\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00cc"+
		"\n\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\13\3\13\3\13\3\f\7\f\u00d7"+
		"\n\f\f\f\16\f\u00da\13\f\3\f\3\f\5\f\u00de\n\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f3"+
		"\n\16\3\16\3\16\3\16\3\16\7\16\u00f9\n\16\f\16\16\16\u00fc\13\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0102\n\16\5\16\u0104\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116"+
		"\n\21\5\21\u0118\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u011f\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0125\n\21\3\21\3\21\3\21\5\21\u012a\n\21\3\21\3\21"+
		"\3\21\3\22\5\22\u0130\n\22\3\22\3\22\3\22\5\22\u0135\n\22\3\22\3\22\3"+
		"\22\5\22\u013a\n\22\3\22\7\22\u013d\n\22\f\22\16\22\u0140\13\22\3\22\3"+
		"\22\5\22\u0144\n\22\3\22\7\22\u0147\n\22\f\22\16\22\u014a\13\22\3\22\3"+
		"\22\5\22\u014e\n\22\3\22\7\22\u0151\n\22\f\22\16\22\u0154\13\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015e\n\23\f\23\16\23\u0161\13"+
		"\23\5\23\u0163\n\23\3\23\3\23\3\23\5\23\u0168\n\23\5\23\u016a\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0184\n\27\7\27\u0186"+
		"\n\27\f\27\16\27\u0189\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7"+
		"\30\u0193\n\30\f\30\16\30\u0196\13\30\3\30\7\30\u0199\n\30\f\30\16\30"+
		"\u019c\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\5\32\u01ab\n\32\3\32\3\32\3\32\5\32\u01b0\n\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01ba\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01c3\n\34\3\34\3\34\5\34\u01c7\n\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\5,\u01ec\n,\3-\3-\3.\3.\3/\3/\3/\2\2\60"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\\2\f\3\2\64\66\3\2LP\4\2VVY]\3\2\17\20\4\2\7\7\35\36\t\2\26"+
		"\27\37\37$$((88>>EE\5\2\t\fRSVX\n\2\24\25\31\31\"\"\'\'-.9:BBDD\3\2\22"+
		"\23\5\2\21\21FK^_\2\u01fc\2^\3\2\2\2\4f\3\2\2\2\6n\3\2\2\2\bu\3\2\2\2"+
		"\n{\3\2\2\2\f\177\3\2\2\2\16\u009a\3\2\2\2\20\u00a7\3\2\2\2\22\u00b7\3"+
		"\2\2\2\24\u00bf\3\2\2\2\26\u00d8\3\2\2\2\30\u00e4\3\2\2\2\32\u00e8\3\2"+
		"\2\2\34\u0107\3\2\2\2\36\u010b\3\2\2\2 \u010f\3\2\2\2\"\u012f\3\2\2\2"+
		"$\u0157\3\2\2\2&\u016d\3\2\2\2(\u0171\3\2\2\2*\u0178\3\2\2\2,\u017d\3"+
		"\2\2\2.\u018d\3\2\2\2\60\u01a0\3\2\2\2\62\u01a6\3\2\2\2\64\u01b3\3\2\2"+
		"\2\66\u01bd\3\2\2\28\u01c8\3\2\2\2:\u01ca\3\2\2\2<\u01cc\3\2\2\2>\u01ce"+
		"\3\2\2\2@\u01d0\3\2\2\2B\u01d2\3\2\2\2D\u01d4\3\2\2\2F\u01d6\3\2\2\2H"+
		"\u01d8\3\2\2\2J\u01da\3\2\2\2L\u01dc\3\2\2\2N\u01de\3\2\2\2P\u01e0\3\2"+
		"\2\2R\u01e2\3\2\2\2T\u01e4\3\2\2\2V\u01eb\3\2\2\2X\u01ed\3\2\2\2Z\u01ef"+
		"\3\2\2\2\\\u01f1\3\2\2\2^_\5*\26\2_d\5&\24\2`e\5\4\3\2ab\5\24\13\2bc\5"+
		"\24\13\2ce\3\2\2\2d`\3\2\2\2da\3\2\2\2e\3\3\2\2\2fg\5H%\2gh\5Z.\2hi\5"+
		"\n\6\2ij\5R*\2jk\5\6\4\2kl\5\b\5\2lm\5R*\2m\5\3\2\2\2no\5:\36\2op\5T+"+
		"\2pq\5\60\31\2qr\5\60\31\2rs\5\20\t\2st\5\22\n\2t\7\3\2\2\2uv\5:\36\2"+
		"vw\5T+\2wx\5\60\31\2xy\5\24\13\2yz\5\26\f\2z\t\3\2\2\2{|\5T+\2|}\5:\36"+
		"\2}~\5Z.\2~\13\3\2\2\2\177\u008c\5R*\2\u0080\u008b\5\62\32\2\u0081\u008b"+
		"\5(\25\2\u0082\u008b\5\64\33\2\u0083\u008b\5\60\31\2\u0084\u008b\5\"\22"+
		"\2\u0085\u008b\5\36\20\2\u0086\u008b\5 \21\2\u0087\u008b\5\66\34\2\u0088"+
		"\u008b\5\32\16\2\u0089\u008b\5.\30\2\u008a\u0080\3\2\2\2\u008a\u0081\3"+
		"\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\5F"+
		"$\2\u0090\u0093\5Z.\2\u0091\u0093\5V,\2\u0092\u0090\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5R*\2\u0095\u0097\3\2\2\2\u0096"+
		"\u008f\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5R"+
		"*\2\u0099\r\3\2\2\2\u009a\u009b\5F$\2\u009b\u009c\5R*\2\u009c\u009d\5"+
		"Z.\2\u009d\u009e\5R*\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5R*\2\u00a6\17"+
		"\3\2\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\5Z.\2\u00a9\u00b1\5R*\2\u00aa"+
		"\u00ab\5N(\2\u00ab\u00ad\5Z.\2\u00ac\u00ae\5R*\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\5R*\2\u00b5\u00b6\5\f\7\2\u00b6\21\3\2\2\2"+
		"\u00b7\u00b8\7T\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\5X-\2\u00ba\u00bb"+
		"\7\3\2\2\u00bb\23\3\2\2\2\u00bc\u00be\58\35\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5N(\2\u00c3\u00c5\5\30\r\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5Z"+
		".\2\u00c7\u00cf\5R*\2\u00c8\u00c9\5N(\2\u00c9\u00cb\5Z.\2\u00ca\u00cc"+
		"\5R*\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5R*\2\u00d3\u00d4"+
		"\5\f\7\2\u00d4\25\3\2\2\2\u00d5\u00d7\58\35\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5N(\2\u00dc\u00de\5\30\r\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5Z"+
		".\2\u00e0\u00e1\5R*\2\u00e1\u00e2\5R*\2\u00e2\u00e3\5\f\7\2\u00e3\27\3"+
		"\2\2\2\u00e4\u00e5\5X-\2\u00e5\u00e6\5T+\2\u00e6\u00e7\5T+\2\u00e7\31"+
		"\3\2\2\2\u00e8\u00e9\5F$\2\u00e9\u00ea\5R*\2\u00ea\u00eb\5Z.\2\u00eb\u00ec"+
		"\5R*\2\u00ec\u00ed\5R*\2\u00ed\u00ee\5F$\2\u00ee\u00ef\5V,\2\u00ef\u00f2"+
		"\5R*\2\u00f0\u00f3\5\"\22\2\u00f1\u00f3\5\62\32\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5F$\2\u00f5\u00f6"+
		"\5R*\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0103\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5F$\2\u00fe\u0101\5R*\2\u00ff\u0102"+
		"\5\"\22\2\u0100\u0102\5\62\32\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2"+
		"\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\5R*\2\u0106\33\3\2\2\2\u0107\u0108\5D#\2\u0108\u0109"+
		"\5$\23\2\u0109\u010a\5\f\7\2\u010a\35\3\2\2\2\u010b\u010c\5F$\2\u010c"+
		"\u010d\5$\23\2\u010d\u010e\5\f\7\2\u010e\37\3\2\2\2\u010f\u0110\5F$\2"+
		"\u0110\u0117\5R*\2\u0111\u0115\5Z.\2\u0112\u0113\5L\'\2\u0113\u0114\5"+
		"V,\2\u0114\u0116\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011e\5R*\2\u011a\u011b\5Z.\2\u011b\u011c\5L\'\2\u011c\u011d"+
		"\5V,\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0124\5R*\2\u0121\u0122\5@!\2\u0122\u0123\5Z.\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2"+
		"\2\2\u0126\u0127\5Z.\2\u0127\u0128\5@!\2\u0128\u012a\3\2\2\2\u0129\u0126"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5R*\2\u012c"+
		"\u012d\5\f\7\2\u012d!\3\2\2\2\u012e\u0130\5N(\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\5Z.\2\u0132\u0135\5> \2"+
		"\u0133\u0135\5@!\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0139"+
		"\3\2\2\2\u0136\u013a\5Z.\2\u0137\u013a\5V,\2\u0138\u013a\5@!\2\u0139\u0136"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013e\3\2\2\2\u013b"+
		"\u013d\13\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0144\5<\37\2\u0142\u0144\5L\'\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014d\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014e\5Z.\2\u014c\u014e\5V,\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u0151\13\2\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5R*\2\u0156"+
		"#\3\2\2\2\u0157\u0158\5R*\2\u0158\u0162\5Z.\2\u0159\u015a\5<\37\2\u015a"+
		"\u015b\5Z.\2\u015b\u015f\3\2\2\2\u015c\u015e\13\2\2\2\u015d\u015c\3\2"+
		"\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0159\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0169\3\2\2\2\u0164\u0167\5L\'\2\u0165\u0168\5Z.\2\u0166\u0168"+
		"\5V,\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5R"+
		"*\2\u016c%\3\2\2\2\u016d\u016e\7\6\2\2\u016e\u016f\7/\2\2\u016f\u0170"+
		"\7\4\2\2\u0170\'\3\2\2\2\u0171\u0172\5Z.\2\u0172\u0173\5J&\2\u0173\u0174"+
		"\5Z.\2\u0174\u0175\5> \2\u0175\u0176\5Z.\2\u0176\u0177\5R*\2\u0177)\3"+
		"\2\2\2\u0178\u0179\7\b\2\2\u0179\u017a\7W\2\2\u017a\u017b\7f\2\2\u017b"+
		"\u017c\7X\2\2\u017c+\3\2\2\2\u017d\u017e\5N(\2\u017e\u017f\5Z.\2\u017f"+
		"\u0187\5R*\2\u0180\u0181\5N(\2\u0181\u0183\5Z.\2\u0182\u0184\5R*\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0180\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\5R*\2\u018b\u018c\5R*\2"+
		"\u018c-\3\2\2\2\u018d\u018e\5\66\34\2\u018e\u018f\5L\'\2\u018f\u0190\5"+
		"R*\2\u0190\u0194\5V,\2\u0191\u0193\13\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019a\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5R*\2\u0198\u0197\3\2\2\2\u0199\u019c"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\5R*\2\u019e\u019f\5R*\2\u019f/\3\2\2\2\u01a0"+
		"\u01a1\5N(\2\u01a1\u01a2\5Z.\2\u01a2\u01a3\5L\'\2\u01a3\u01a4\5V,\2\u01a4"+
		"\u01a5\5R*\2\u01a5\61\3\2\2\2\u01a6\u01a7\5B\"\2\u01a7\u01aa\5P)\2\u01a8"+
		"\u01ab\5\\/\2\u01a9\u01ab\5Z.\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2"+
		"\2\u01ab\u01af\3\2\2\2\u01ac\u01ad\5P)\2\u01ad\u01ae\5B\"\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\5R*\2\u01b2\63\3\2\2\2\u01b3\u01b4\5B\"\2\u01b4\u01b5\5P)\2\u01b5"+
		"\u01b9\5Z.\2\u01b6\u01b7\5P)\2\u01b7\u01b8\5B\"\2\u01b8\u01ba\3\2\2\2"+
		"\u01b9\u01b6\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc"+
		"\5R*\2\u01bc\65\3\2\2\2\u01bd\u01be\5N(\2\u01be\u01bf\5Z.\2\u01bf\u01c2"+
		"\5R*\2\u01c0\u01c3\5V,\2\u01c1\u01c3\5Z.\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\5R*\2\u01c5\u01c7\5R*\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\67\3\2\2\2\u01c8\u01c9\7<\2\2"+
		"\u01c99\3\2\2\2\u01ca\u01cb\t\2\2\2\u01cb;\3\2\2\2\u01cc\u01cd\t\3\2\2"+
		"\u01cd=\3\2\2\2\u01ce\u01cf\t\4\2\2\u01cf?\3\2\2\2\u01d0\u01d1\t\5\2\2"+
		"\u01d1A\3\2\2\2\u01d2\u01d3\t\6\2\2\u01d3C\3\2\2\2\u01d4\u01d5\7+\2\2"+
		"\u01d5E\3\2\2\2\u01d6\u01d7\t\7\2\2\u01d7G\3\2\2\2\u01d8\u01d9\7\32\2"+
		"\2\u01d9I\3\2\2\2\u01da\u01db\7a\2\2\u01dbK\3\2\2\2\u01dc\u01dd\t\b\2"+
		"\2\u01ddM\3\2\2\2\u01de\u01df\t\t\2\2\u01dfO\3\2\2\2\u01e0\u01e1\t\n\2"+
		"\2\u01e1Q\3\2\2\2\u01e2\u01e3\t\13\2\2\u01e3S\3\2\2\2\u01e4\u01e5\7_\2"+
		"\2\u01e5U\3\2\2\2\u01e6\u01ec\7g\2\2\u01e7\u01e8\7\5\2\2\u01e8\u01e9\7"+
		"l\2\2\u01e9\u01ec\7\5\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eb"+
		"\u01e7\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecW\3\2\2\2\u01ed\u01ee\7d\2\2\u01ee"+
		"Y\3\2\2\2\u01ef\u01f0\7d\2\2\u01f0[\3\2\2\2\u01f1\u01f2\7c\2\2\u01f2]"+
		"\3\2\2\2/d\u008a\u008c\u0092\u0096\u00a2\u00ad\u00b1\u00bf\u00c4\u00cb"+
		"\u00cf\u00d8\u00dd\u00f2\u00fa\u0101\u0103\u0115\u0117\u011e\u0124\u0129"+
		"\u012f\u0134\u0139\u013e\u0143\u0148\u014d\u0152\u015f\u0162\u0167\u0169"+
		"\u0183\u0187\u0194\u019a\u01aa\u01af\u01b9\u01c2\u01c6\u01eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}