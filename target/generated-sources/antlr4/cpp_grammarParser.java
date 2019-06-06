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
		T__0=1, T__1=2, T__2=3, T__3=4, USING=5, INCLUDE=6, EQUAL=7, NOTEQUAL=8, 
		LESSEQUAL=9, GREATEREQUAL=10, ANDAND=11, OROR=12, PLUSPLUS=13, MINUSMINUS=14, 
		COMMA=15, LEFTSHIFT=16, RIGHTSHIFT=17, AUTO=18, BOOL=19, BREAK=20, CASE=21, 
		CATCH=22, CHAR=23, CLASS=24, CONST=25, CONTINUE=26, DEFAULT=27, DELETE=28, 
		DO=29, DOUBLE=30, ELSE=31, ENUM=32, FALSE=33, FINAL=34, FLOAT=35, FOR=36, 
		FRIEND=37, GOTO=38, IF=39, INLINE=40, INT=41, LONG=42, NAMESPACE=43, NEW=44, 
		NOEXCEPT=45, NULLPTR=46, OVERRIDE=47, PRIVATE=48, PROTECTED=49, PUBLIC=50, 
		REINTERPRET_CAST=51, RETURN=52, SHORT=53, SIGNED=54, SIZEOF=55, STATIC=56, 
		STRUCT=57, SWITCH=58, THIS=59, THROW=60, TRUE=61, TRY=62, UNSIGNED=63, 
		VIRTUAL=64, VOID=65, WHILE=66, LEFTPAREN=67, RIGHTPAREN=68, LEFTBRACKET=69, 
		RIGHTBRACKET=70, LEFTBRACE=71, RIGHTBRACE=72, PLUS=73, MINUS=74, STAR=75, 
		DIV=76, MOD=77, CARET=78, AND=79, OR=80, TILDE=81, NOT=82, ASSIGN=83, 
		LESS=84, GREATER=85, PLUSASSIGN=86, MINUSASSIGN=87, STARASSIGN=88, DIVASSIGN=89, 
		MODASSIGN=90, SEMICOLON=91, COLON=92, QUOTEMARK=93, OPERATOR=94, TEXT=95, 
		VARIABLENAME=96, WORD=97, LIBRARY=98, NUMBER=99, LINECOMMENT=100, BLOCKCOMMENT=101, 
		NEWLINE=102, WHITESPACE=103, LEFTBAREN=104, BODY=105, NONDIGIT=106;
	public static final int
		RULE_classdeclaration = 0, RULE_classprefix = 1, RULE_enumdeclaration = 2, 
		RULE_function = 3, RULE_switchloop = 4, RULE_forloop = 5, RULE_whileloop = 6, 
		RULE_ifoperation = 7, RULE_body = 8, RULE_operation = 9, RULE_assignoperation = 10, 
		RULE_condition = 11, RULE_namespacedeclaration = 12, RULE_preprocessordirective = 13, 
		RULE_functiondeclaration = 14, RULE_tabledeclaration = 15, RULE_variabledeclaration = 16, 
		RULE_printtext = 17, RULE_inputtext = 18, RULE_table = 19, RULE_accessoperator = 20, 
		RULE_simpletypespecifier = 21, RULE_variablevalue = 22;
	public static final String[] ruleNames = {
		"classdeclaration", "classprefix", "enumdeclaration", "function", "switchloop", 
		"forloop", "whileloop", "ifoperation", "body", "operation", "assignoperation", 
		"condition", "namespacedeclaration", "preprocessordirective", "functiondeclaration", 
		"tabledeclaration", "variabledeclaration", "printtext", "inputtext", "table", 
		"accessoperator", "simpletypespecifier", "variablevalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cout'", "'endl'", "'cin'", "'''", "'using'", "'#include'", "'=='", 
		"'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'<<'", "'>>'", 
		"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'default'", "'delete'", "'do'", "'double'", 
		"'else'", "'enum'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
		"'goto'", "'if'", "'inline'", "'int'", "'long'", "'namespace'", "'new'", 
		"'noexcept'", "'nullptr'", "'override'", "'private'", "'protected'", "'public'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'struct'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'unsigned'", 
		"'virtual'", "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", 
		"'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "';'", "':'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "USING", "INCLUDE", "EQUAL", "NOTEQUAL", 
		"LESSEQUAL", "GREATEREQUAL", "ANDAND", "OROR", "PLUSPLUS", "MINUSMINUS", 
		"COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AUTO", "BOOL", "BREAK", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DELETE", "DO", "DOUBLE", 
		"ELSE", "ENUM", "FALSE", "FINAL", "FLOAT", "FOR", "FRIEND", "GOTO", "IF", 
		"INLINE", "INT", "LONG", "NAMESPACE", "NEW", "NOEXCEPT", "NULLPTR", "OVERRIDE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "REINTERPRET_CAST", "RETURN", "SHORT", 
		"SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", 
		"TRY", "UNSIGNED", "VIRTUAL", "VOID", "WHILE", "LEFTPAREN", "RIGHTPAREN", 
		"LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", "PLUS", "MINUS", 
		"STAR", "DIV", "MOD", "CARET", "AND", "OR", "TILDE", "NOT", "ASSIGN", 
		"LESS", "GREATER", "PLUSASSIGN", "MINUSASSIGN", "STARASSIGN", "DIVASSIGN", 
		"MODASSIGN", "SEMICOLON", "COLON", "QUOTEMARK", "OPERATOR", "TEXT", "VARIABLENAME", 
		"WORD", "LIBRARY", "NUMBER", "LINECOMMENT", "BLOCKCOMMENT", "NEWLINE", 
		"WHITESPACE", "LEFTBAREN", "BODY", "NONDIGIT"
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
	public static class ClassdeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(cpp_grammarParser.CLASS, 0); }
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public AccessoperatorContext accessoperator() {
			return getRuleContext(AccessoperatorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(cpp_grammarParser.COLON, 0); }
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
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
		enterRule(_localctx, 0, RULE_classdeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CLASS);
			setState(47);
			match(VARIABLENAME);
			setState(48);
			match(LEFTBRACE);
			{
			setState(49);
			accessoperator();
			setState(50);
			match(COLON);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(51);
				variabledeclaration();
				}
				break;
			case 2:
				{
				setState(52);
				functiondeclaration();
				}
				break;
			}
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					matchWildcard();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					matchWildcard();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(67);
			match(RIGHTBRACE);
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
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public List<TerminalNode> COLON() { return getTokens(cpp_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(cpp_grammarParser.COLON, i);
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
		enterRule(_localctx, 2, RULE_classprefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(VARIABLENAME);
			setState(70);
			match(COLON);
			setState(71);
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

	public static class EnumdeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(cpp_grammarParser.ENUM, 0); }
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public TerminalNode COMMA() { return getToken(cpp_grammarParser.COMMA, 0); }
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
		enterRule(_localctx, 4, RULE_enumdeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ENUM);
			setState(74);
			match(VARIABLENAME);
			setState(75);
			match(LEFTBRACE);
			{
			setState(76);
			match(VARIABLENAME);
			setState(77);
			match(COMMA);
			}
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					matchWildcard();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(85);
			match(RIGHTBRACE);
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
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(cpp_grammarParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cpp_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cpp_grammarParser.COMMA, i);
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
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			simpletypespecifier();
			setState(88);
			match(VARIABLENAME);
			setState(89);
			match(LEFTPAREN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(90);
				simpletypespecifier();
				setState(91);
				match(VARIABLENAME);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(92);
					match(COMMA);
					}
				}

				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RIGHTPAREN);
			setState(101);
			match(LEFTBRACE);
			setState(102);
			body();
			setState(103);
			match(RIGHTBRACE);
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
		public TerminalNode SWITCH() { return getToken(cpp_grammarParser.SWITCH, 0); }
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(cpp_grammarParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public TerminalNode CASE() { return getToken(cpp_grammarParser.CASE, 0); }
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(cpp_grammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(cpp_grammarParser.COLON, i);
		}
		public TerminalNode BREAK() { return getToken(cpp_grammarParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public TerminalNode DEFAULT() { return getToken(cpp_grammarParser.DEFAULT, 0); }
		public List<AssignoperationContext> assignoperation() {
			return getRuleContexts(AssignoperationContext.class);
		}
		public AssignoperationContext assignoperation(int i) {
			return getRuleContext(AssignoperationContext.class,i);
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
		enterRule(_localctx, 8, RULE_switchloop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SWITCH);
			setState(106);
			match(LEFTPAREN);
			setState(107);
			match(VARIABLENAME);
			setState(108);
			match(RIGHTPAREN);
			setState(109);
			match(LEFTBRACE);
			{
			setState(110);
			match(CASE);
			setState(111);
			variablevalue();
			setState(112);
			match(COLON);
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(113);
				assignoperation();
				}
				break;
			case 2:
				{
				setState(114);
				operation();
				}
				break;
			case 3:
				{
				setState(115);
				printtext();
				}
				break;
			}
			setState(118);
			match(BREAK);
			setState(119);
			match(SEMICOLON);
			}
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					matchWildcard();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(127);
				match(DEFAULT);
				setState(128);
				match(COLON);
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(129);
					assignoperation();
					}
					break;
				case 2:
					{
					setState(130);
					operation();
					}
					break;
				case 3:
					{
					setState(131);
					printtext();
					}
					break;
				}
				}
			}

			setState(136);
			match(RIGHTBRACE);
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
		public TerminalNode FOR() { return getToken(cpp_grammarParser.FOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(cpp_grammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(cpp_grammarParser.SEMICOLON, i);
		}
		public TerminalNode LEFTBAREN() { return getToken(cpp_grammarParser.LEFTBAREN, 0); }
		public TerminalNode BODY() { return getToken(cpp_grammarParser.BODY, 0); }
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(cpp_grammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(cpp_grammarParser.NUMBER, i);
		}
		public TerminalNode LESSEQUAL() { return getToken(cpp_grammarParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(cpp_grammarParser.GREATEREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(cpp_grammarParser.NOTEQUAL, 0); }
		public TerminalNode LESS() { return getToken(cpp_grammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(cpp_grammarParser.GREATER, 0); }
		public List<TerminalNode> PLUSPLUS() { return getTokens(cpp_grammarParser.PLUSPLUS); }
		public TerminalNode PLUSPLUS(int i) {
			return getToken(cpp_grammarParser.PLUSPLUS, i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(cpp_grammarParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(cpp_grammarParser.MINUSMINUS, i);
		}
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
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
		enterRule(_localctx, 10, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(FOR);
			setState(139);
			match(LEFTPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(140);
				match(VARIABLENAME);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(141);
					match(ASSIGN);
					setState(142);
					match(NUMBER);
					}
				}

				}
			}

			setState(147);
			match(SEMICOLON);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(148);
				match(VARIABLENAME);
				setState(149);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTEQUAL) | (1L << LESSEQUAL) | (1L << GREATEREQUAL))) != 0) || _la==LESS || _la==GREATER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				match(NUMBER);
				}
			}

			setState(153);
			match(SEMICOLON);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUSPLUS || _la==MINUSMINUS) {
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				match(VARIABLENAME);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLENAME) {
				{
				setState(158);
				match(VARIABLENAME);
				setState(159);
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

			setState(162);
			match(LEFTBAREN);
			setState(163);
			match(BODY);
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
		public TerminalNode WHILE() { return getToken(cpp_grammarParser.WHILE, 0); }
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
		enterRule(_localctx, 12, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WHILE);
			setState(166);
			condition();
			setState(167);
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

	public static class IfoperationContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cpp_grammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BODY() { return getToken(cpp_grammarParser.BODY, 0); }
		public IfoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterIfoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitIfoperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitIfoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfoperationContext ifoperation() throws RecognitionException {
		IfoperationContext _localctx = new IfoperationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifoperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			condition();
			setState(171);
			match(BODY);
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
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AssignoperationContext assignoperation() {
			return getRuleContext(AssignoperationContext.class,0);
		}
		public IfoperationContext ifoperation() {
			return getRuleContext(IfoperationContext.class,0);
		}
		public PrinttextContext printtext() {
			return getRuleContext(PrinttextContext.class,0);
		}
		public InputtextContext inputtext() {
			return getRuleContext(InputtextContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public SwitchloopContext switchloop() {
			return getRuleContext(SwitchloopContext.class,0);
		}
		public TabledeclarationContext tabledeclaration() {
			return getRuleContext(TabledeclarationContext.class,0);
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
		enterRule(_localctx, 16, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LEFTBRACE);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(174);
				operation();
				}
				break;
			case 2:
				{
				setState(175);
				assignoperation();
				}
				break;
			case 3:
				{
				setState(176);
				ifoperation();
				}
				break;
			case 4:
				{
				setState(177);
				printtext();
				}
				break;
			case 5:
				{
				setState(178);
				inputtext();
				}
				break;
			case 6:
				{
				setState(179);
				variabledeclaration();
				}
				break;
			case 7:
				{
				setState(180);
				ifoperation();
				}
				break;
			case 8:
				{
				setState(181);
				whileloop();
				}
				break;
			case 9:
				{
				setState(182);
				forloop();
				}
				break;
			case 10:
				{
				setState(183);
				table();
				}
				break;
			case 11:
				{
				setState(184);
				switchloop();
				}
				break;
			case 12:
				{
				setState(185);
				tabledeclaration();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					matchWildcard();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(194);
			match(RIGHTBRACE);
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
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(cpp_grammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(cpp_grammarParser.NUMBER, i);
		}
		public List<TerminalNode> NONDIGIT() { return getTokens(cpp_grammarParser.NONDIGIT); }
		public TerminalNode NONDIGIT(int i) {
			return getToken(cpp_grammarParser.NONDIGIT, i);
		}
		public TerminalNode PLUS() { return getToken(cpp_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cpp_grammarParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(cpp_grammarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(cpp_grammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(cpp_grammarParser.MOD, 0); }
		public TerminalNode CARET() { return getToken(cpp_grammarParser.CARET, 0); }
		public TerminalNode AND() { return getToken(cpp_grammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(cpp_grammarParser.OR, 0); }
		public TerminalNode TILDE() { return getToken(cpp_grammarParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(cpp_grammarParser.NOT, 0); }
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
		enterRule(_localctx, 18, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				setState(196);
				simpletypespecifier();
				}
			}

			setState(199);
			match(VARIABLENAME);
			setState(200);
			match(ASSIGN);
			setState(201);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (VARIABLENAME - 96)) | (1L << (NUMBER - 96)) | (1L << (NONDIGIT - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PLUS - 73)) | (1L << (MINUS - 73)) | (1L << (STAR - 73)) | (1L << (DIV - 73)) | (1L << (MOD - 73)) | (1L << (CARET - 73)) | (1L << (AND - 73)) | (1L << (OR - 73)) | (1L << (TILDE - 73)) | (1L << (NOT - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(203);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (VARIABLENAME - 96)) | (1L << (NUMBER - 96)) | (1L << (NONDIGIT - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			match(SEMICOLON);
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

	public static class AssignoperationContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(cpp_grammarParser.PLUSASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(cpp_grammarParser.MINUSASSIGN, 0); }
		public TerminalNode STARASSIGN() { return getToken(cpp_grammarParser.STARASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(cpp_grammarParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(cpp_grammarParser.MODASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(cpp_grammarParser.NUMBER, 0); }
		public TerminalNode NONDIGIT() { return getToken(cpp_grammarParser.NONDIGIT, 0); }
		public AssignoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).enterAssignoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpp_grammarListener ) ((cpp_grammarListener)listener).exitAssignoperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cpp_grammarVisitor ) return ((cpp_grammarVisitor<? extends T>)visitor).visitAssignoperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignoperationContext assignoperation() throws RecognitionException {
		AssignoperationContext _localctx = new AssignoperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignoperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(VARIABLENAME);
			setState(207);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PLUSASSIGN - 86)) | (1L << (MINUSASSIGN - 86)) | (1L << (STARASSIGN - 86)) | (1L << (DIVASSIGN - 86)) | (1L << (MODASSIGN - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (VARIABLENAME - 96)) | (1L << (NUMBER - 96)) | (1L << (NONDIGIT - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			match(SEMICOLON);
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
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(cpp_grammarParser.RIGHTPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(cpp_grammarParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(cpp_grammarParser.NOTEQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(cpp_grammarParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(cpp_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cpp_grammarParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(cpp_grammarParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(cpp_grammarParser.STAR, 0); }
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LEFTPAREN);
			setState(212);
			match(VARIABLENAME);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PLUS - 73)) | (1L << (MINUS - 73)) | (1L << (STAR - 73)) | (1L << (MOD - 73)) | (1L << (VARIABLENAME - 73)))) != 0)) {
				{
				{
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(213);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(214);
					match(MINUS);
					}
					break;
				case MOD:
					{
					setState(215);
					match(MOD);
					}
					break;
				case STAR:
					{
					setState(216);
					match(STAR);
					}
					break;
				case VARIABLENAME:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(220);
				match(VARIABLENAME);
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						matchWildcard();
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
			}

			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==NOTEQUAL) {
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==VARIABLENAME || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(234);
			match(RIGHTPAREN);
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
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 24, RULE_namespacedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(USING);
			setState(237);
			match(NAMESPACE);
			setState(238);
			match(VARIABLENAME);
			setState(239);
			match(SEMICOLON);
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
		enterRule(_localctx, 26, RULE_preprocessordirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(INCLUDE);
			setState(242);
			match(LESS);
			setState(243);
			match(LIBRARY);
			setState(244);
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
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode LEFTPAREN() { return getToken(cpp_grammarParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(cpp_grammarParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cpp_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cpp_grammarParser.COMMA, i);
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
		enterRule(_localctx, 28, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			simpletypespecifier();
			setState(247);
			match(VARIABLENAME);
			setState(248);
			match(LEFTPAREN);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(249);
				simpletypespecifier();
				setState(250);
				match(VARIABLENAME);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(251);
					match(COMMA);
					}
				}

				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(RIGHTPAREN);
			setState(260);
			match(SEMICOLON);
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
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(cpp_grammarParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(cpp_grammarParser.NUMBER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cpp_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cpp_grammarParser.COMMA, i);
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
		enterRule(_localctx, 30, RULE_tabledeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			table();
			setState(263);
			match(ASSIGN);
			setState(264);
			match(LEFTBRACE);
			{
			setState(265);
			match(NUMBER);
			}
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					matchWildcard();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(RIGHTBRACE);
			setState(279);
			match(SEMICOLON);
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
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 32, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			simpletypespecifier();
			setState(282);
			match(VARIABLENAME);
			setState(283);
			match(ASSIGN);
			setState(284);
			variablevalue();
			setState(285);
			match(SEMICOLON);
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
		public List<TerminalNode> LEFTSHIFT() { return getTokens(cpp_grammarParser.LEFTSHIFT); }
		public TerminalNode LEFTSHIFT(int i) {
			return getToken(cpp_grammarParser.LEFTSHIFT, i);
		}
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public TerminalNode TEXT() { return getToken(cpp_grammarParser.TEXT, 0); }
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
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
		enterRule(_localctx, 34, RULE_printtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__0);
			setState(288);
			match(LEFTSHIFT);
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==VARIABLENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT) {
				{
				setState(290);
				match(LEFTSHIFT);
				setState(291);
				match(T__1);
				}
			}

			setState(294);
			match(SEMICOLON);
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
		public TerminalNode RIGHTSHIFT() { return getToken(cpp_grammarParser.RIGHTSHIFT, 0); }
		public TerminalNode VARIABLENAME() { return getToken(cpp_grammarParser.VARIABLENAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_inputtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__2);
			setState(297);
			match(RIGHTSHIFT);
			setState(298);
			match(VARIABLENAME);
			setState(299);
			match(SEMICOLON);
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
		public List<TerminalNode> VARIABLENAME() { return getTokens(cpp_grammarParser.VARIABLENAME); }
		public TerminalNode VARIABLENAME(int i) {
			return getToken(cpp_grammarParser.VARIABLENAME, i);
		}
		public TerminalNode LEFTBRACKET() { return getToken(cpp_grammarParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(cpp_grammarParser.RIGHTBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(cpp_grammarParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 38, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			simpletypespecifier();
			setState(302);
			match(VARIABLENAME);
			setState(303);
			match(LEFTBRACKET);
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==VARIABLENAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			match(RIGHTBRACKET);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(306);
				match(SEMICOLON);
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
		enterRule(_localctx, 40, RULE_accessoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 42, RULE_simpletypespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 44, RULE_variablevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(313);
				match(NUMBER);
				}
				break;
			case T__3:
				{
				setState(314);
				match(T__3);
				setState(315);
				match(NONDIGIT);
				setState(316);
				match(T__3);
				}
				break;
			case SEMICOLON:
			case COLON:
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3l\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\28\n\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n\2\f"+
		"\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\7\5b\n\5"+
		"\f\5\16\5e\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6w\n\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0087\n\6\5\6\u0089\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0092\n\7\5\7\u0094\n\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\7\3\7\3\7"+
		"\5\7\u009f\n\7\3\7\3\7\5\7\u00a3\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd"+
		"\n\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n\3\n\3\13\5\13\u00c8\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00dd\n\r\3\r\3\r\3\r\7\r\u00e2\n\r\f\r\16\r\u00e5"+
		"\13\r\5\r\u00e7\n\r\3\r\3\r\5\r\u00eb\n\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ff"+
		"\n\20\7\20\u0101\n\20\f\20\16\20\u0104\13\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u010e\n\21\f\21\16\21\u0111\13\21\3\21\7\21\u0114"+
		"\n\21\f\21\16\21\u0117\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\5\23\u0127\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0136\n\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0141\n\30\3\30\2\2\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\f\4\2\n\fVW\3\2\17\20\5\2bbeel"+
		"l\3\2KT\3\2X\\\3\2\t\n\4\2bbee\3\2ab\3\2\62\64\n\2\24\25\31\31  %%+,\67"+
		"8AACC\2\u0158\2\60\3\2\2\2\4G\3\2\2\2\6K\3\2\2\2\bY\3\2\2\2\nk\3\2\2\2"+
		"\f\u008c\3\2\2\2\16\u00a7\3\2\2\2\20\u00ab\3\2\2\2\22\u00af\3\2\2\2\24"+
		"\u00c7\3\2\2\2\26\u00d0\3\2\2\2\30\u00d5\3\2\2\2\32\u00ee\3\2\2\2\34\u00f3"+
		"\3\2\2\2\36\u00f8\3\2\2\2 \u0108\3\2\2\2\"\u011b\3\2\2\2$\u0121\3\2\2"+
		"\2&\u012a\3\2\2\2(\u012f\3\2\2\2*\u0137\3\2\2\2,\u0139\3\2\2\2.\u0140"+
		"\3\2\2\2\60\61\7\32\2\2\61\62\7b\2\2\62\63\7I\2\2\63\64\5*\26\2\64\67"+
		"\7^\2\2\658\5\"\22\2\668\5\36\20\2\67\65\3\2\2\2\67\66\3\2\2\28<\3\2\2"+
		"\29;\13\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2"+
		"\2\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3"+
		"\2\2\2EF\7J\2\2F\3\3\2\2\2GH\7b\2\2HI\7^\2\2IJ\7^\2\2J\5\3\2\2\2KL\7\""+
		"\2\2LM\7b\2\2MN\7I\2\2NO\7b\2\2OP\7\21\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7J\2\2X\7\3\2"+
		"\2\2YZ\5,\27\2Z[\7b\2\2[c\7E\2\2\\]\5,\27\2]_\7b\2\2^`\7\21\2\2_^\3\2"+
		"\2\2_`\3\2\2\2`b\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3"+
		"\2\2\2ec\3\2\2\2fg\7F\2\2gh\7I\2\2hi\5\22\n\2ij\7J\2\2j\t\3\2\2\2kl\7"+
		"<\2\2lm\7E\2\2mn\7b\2\2no\7F\2\2op\7I\2\2pq\7\27\2\2qr\5.\30\2rv\7^\2"+
		"\2sw\5\26\f\2tw\5\24\13\2uw\5$\23\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xy\7\26\2\2yz\7]\2\2z~\3\2\2\2{}\13\2\2\2|{\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0088\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7\35\2\2\u0082\u0086\7^\2\2\u0083\u0087\5\26\f\2\u0084\u0087\5\24\13"+
		"\2\u0085\u0087\5$\23\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\7J\2\2\u008b\13\3\2\2\2\u008c\u008d\7&\2\2"+
		"\u008d\u0093\7E\2\2\u008e\u0091\7b\2\2\u008f\u0090\7U\2\2\u0090\u0092"+
		"\7e\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\7]"+
		"\2\2\u0096\u0097\7b\2\2\u0097\u0098\t\2\2\2\u0098\u009a\7e\2\2\u0099\u0096"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\7]\2\2\u009c"+
		"\u009d\t\3\2\2\u009d\u009f\7b\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\7b\2\2\u00a1\u00a3\t\3\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7j"+
		"\2\2\u00a5\u00a6\7k\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9"+
		"\5\30\r\2\u00a9\u00aa\5\22\n\2\u00aa\17\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00ae\7k\2\2\u00ae\21\3\2\2\2\u00af\u00bc\7I\2\2"+
		"\u00b0\u00bd\5\24\13\2\u00b1\u00bd\5\26\f\2\u00b2\u00bd\5\20\t\2\u00b3"+
		"\u00bd\5$\23\2\u00b4\u00bd\5&\24\2\u00b5\u00bd\5\"\22\2\u00b6\u00bd\5"+
		"\20\t\2\u00b7\u00bd\5\16\b\2\u00b8\u00bd\5\f\7\2\u00b9\u00bd\5(\25\2\u00ba"+
		"\u00bd\5\n\6\2\u00bb\u00bd\5 \21\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1\3\2"+
		"\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7J\2\2\u00c5\23\3\2\2\2\u00c6\u00c8\5,\27\2"+
		"\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca"+
		"\7b\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\t\5\2\2\u00cd"+
		"\u00ce\t\4\2\2\u00ce\u00cf\7]\2\2\u00cf\25\3\2\2\2\u00d0\u00d1\7b\2\2"+
		"\u00d1\u00d2\t\6\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\7]\2\2\u00d4\27\3"+
		"\2\2\2\u00d5\u00d6\7E\2\2\u00d6\u00e6\7b\2\2\u00d7\u00dd\7K\2\2\u00d8"+
		"\u00dd\7L\2\2\u00d9\u00dd\7O\2\2\u00da\u00dd\7M\2\2\u00db\u00dd\3\2\2"+
		"\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7b\2\2\u00df"+
		"\u00e3\3\2\2\2\u00e0\u00e2\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e9\t\7\2\2\u00e9\u00eb\t\b\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7F\2\2\u00ed\31\3\2\2\2"+
		"\u00ee\u00ef\7\7\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7b\2\2\u00f1\u00f2"+
		"\7]\2\2\u00f2\33\3\2\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		"\u00f6\7d\2\2\u00f6\u00f7\7W\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\5,\27\2"+
		"\u00f9\u00fa\7b\2\2\u00fa\u0102\7E\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fe"+
		"\7b\2\2\u00fd\u00ff\7\21\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7F\2\2\u0106\u0107\7]\2\2\u0107\37\3\2\2\2\u0108\u0109\5(\25\2"+
		"\u0109\u010a\7U\2\2\u010a\u010b\7I\2\2\u010b\u010f\7e\2\2\u010c\u010e"+
		"\13\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0115\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114"+
		"\7\21\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119"+
		"\7J\2\2\u0119\u011a\7]\2\2\u011a!\3\2\2\2\u011b\u011c\5,\27\2\u011c\u011d"+
		"\7b\2\2\u011d\u011e\7U\2\2\u011e\u011f\5.\30\2\u011f\u0120\7]\2\2\u0120"+
		"#\3\2\2\2\u0121\u0122\7\3\2\2\u0122\u0123\7\22\2\2\u0123\u0126\t\t\2\2"+
		"\u0124\u0125\7\22\2\2\u0125\u0127\7\4\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7]\2\2\u0129%\3\2\2\2\u012a\u012b"+
		"\7\5\2\2\u012b\u012c\7\23\2\2\u012c\u012d\7b\2\2\u012d\u012e\7]\2\2\u012e"+
		"\'\3\2\2\2\u012f\u0130\5,\27\2\u0130\u0131\7b\2\2\u0131\u0132\7G\2\2\u0132"+
		"\u0133\t\b\2\2\u0133\u0135\7H\2\2\u0134\u0136\7]\2\2\u0135\u0134\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136)\3\2\2\2\u0137\u0138\t\n\2\2\u0138+\3\2\2"+
		"\2\u0139\u013a\t\13\2\2\u013a-\3\2\2\2\u013b\u0141\7e\2\2\u013c\u013d"+
		"\7\6\2\2\u013d\u013e\7l\2\2\u013e\u0141\7\6\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013f\3\2\2\2\u0141/\3\2\2\2"+
		"\37\67<BT_cv~\u0086\u0088\u0091\u0093\u0099\u009e\u00a2\u00bc\u00c1\u00c7"+
		"\u00dc\u00e3\u00e6\u00ea\u00fe\u0102\u010f\u0115\u0126\u0135\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}