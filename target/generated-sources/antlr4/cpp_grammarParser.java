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
		MODASSIGN=90, SEMICOLON=91, QUOTEMARK=92, OPERATOR=93, TEXT=94, VARIABLENAME=95, 
		WORD=96, LIBRARY=97, NUMBER=98, LINECOMMENT=99, BLOCKCOMMENT=100, NEWLINE=101, 
		WHITESPACE=102, NONDIGIT=103;
	public static final int
		RULE_function = 0, RULE_operation = 1, RULE_assignoperation = 2, RULE_namespacedeclaration = 3, 
		RULE_preprocessordirective = 4, RULE_variabledeclaration = 5, RULE_printtext = 6, 
		RULE_inputtext = 7, RULE_simpletypespecifier = 8, RULE_variablevalue = 9;
	public static final String[] ruleNames = {
		"function", "operation", "assignoperation", "namespacedeclaration", "preprocessordirective", 
		"variabledeclaration", "printtext", "inputtext", "simpletypespecifier", 
		"variablevalue"
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
		"'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "';'", "'\"'"
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
		"MODASSIGN", "SEMICOLON", "QUOTEMARK", "OPERATOR", "TEXT", "VARIABLENAME", 
		"WORD", "LIBRARY", "NUMBER", "LINECOMMENT", "BLOCKCOMMENT", "NEWLINE", 
		"WHITESPACE", "NONDIGIT"
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
		public TerminalNode RIGHTBRACE() { return getToken(cpp_grammarParser.RIGHTBRACE, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<AssignoperationContext> assignoperation() {
			return getRuleContexts(AssignoperationContext.class);
		}
		public AssignoperationContext assignoperation(int i) {
			return getRuleContext(AssignoperationContext.class,i);
		}
		public List<VariabledeclarationContext> variabledeclaration() {
			return getRuleContexts(VariabledeclarationContext.class);
		}
		public VariabledeclarationContext variabledeclaration(int i) {
			return getRuleContext(VariabledeclarationContext.class,i);
		}
		public List<PrinttextContext> printtext() {
			return getRuleContexts(PrinttextContext.class);
		}
		public PrinttextContext printtext(int i) {
			return getRuleContext(PrinttextContext.class,i);
		}
		public List<InputtextContext> inputtext() {
			return getRuleContexts(InputtextContext.class);
		}
		public InputtextContext inputtext(int i) {
			return getRuleContext(InputtextContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(cpp_grammarParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
		public VariablevalueContext variablevalue() {
			return getRuleContext(VariablevalueContext.class,0);
		}
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
		enterRule(_localctx, 0, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			simpletypespecifier();
			setState(21);
			match(VARIABLENAME);
			setState(22);
			match(LEFTPAREN);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(23);
				simpletypespecifier();
				setState(24);
				match(VARIABLENAME);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(25);
					match(COMMA);
					}
				}

				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(RIGHTPAREN);
			setState(34);
			match(LEFTBRACE);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					operation();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLENAME) {
				{
				{
				setState(41);
				assignoperation();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				{
				setState(47);
				variabledeclaration();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				printtext();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(59);
				inputtext();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(65);
				match(RETURN);
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLENAME:
					{
					setState(66);
					match(VARIABLENAME);
					}
					break;
				case T__3:
				case SEMICOLON:
				case NUMBER:
					{
					setState(67);
					variablevalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70);
				match(SEMICOLON);
				}
			}

			setState(73);
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
		enterRule(_localctx, 2, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (AUTO - 18)) | (1L << (BOOL - 18)) | (1L << (CHAR - 18)) | (1L << (DOUBLE - 18)) | (1L << (FLOAT - 18)) | (1L << (INT - 18)) | (1L << (LONG - 18)) | (1L << (SHORT - 18)) | (1L << (SIGNED - 18)) | (1L << (UNSIGNED - 18)) | (1L << (VOID - 18)))) != 0)) {
				{
				setState(75);
				simpletypespecifier();
				}
			}

			setState(78);
			match(VARIABLENAME);
			setState(79);
			match(ASSIGN);
			setState(80);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (VARIABLENAME - 95)) | (1L << (NUMBER - 95)) | (1L << (NONDIGIT - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (PLUS - 73)) | (1L << (MINUS - 73)) | (1L << (STAR - 73)) | (1L << (DIV - 73)) | (1L << (MOD - 73)) | (1L << (CARET - 73)) | (1L << (AND - 73)) | (1L << (OR - 73)) | (1L << (TILDE - 73)) | (1L << (NOT - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (VARIABLENAME - 95)) | (1L << (NUMBER - 95)) | (1L << (NONDIGIT - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
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
		enterRule(_localctx, 4, RULE_assignoperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VARIABLENAME);
			setState(86);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PLUSASSIGN - 86)) | (1L << (MINUSASSIGN - 86)) | (1L << (STARASSIGN - 86)) | (1L << (DIVASSIGN - 86)) | (1L << (MODASSIGN - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (VARIABLENAME - 95)) | (1L << (NUMBER - 95)) | (1L << (NONDIGIT - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
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
		enterRule(_localctx, 6, RULE_namespacedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(USING);
			setState(91);
			match(NAMESPACE);
			setState(92);
			match(VARIABLENAME);
			setState(93);
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
		enterRule(_localctx, 8, RULE_preprocessordirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(INCLUDE);
			setState(96);
			match(LESS);
			setState(97);
			match(LIBRARY);
			setState(98);
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
		enterRule(_localctx, 10, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			simpletypespecifier();
			setState(101);
			match(VARIABLENAME);
			setState(102);
			match(ASSIGN);
			setState(103);
			variablevalue();
			setState(104);
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
		enterRule(_localctx, 12, RULE_printtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
			setState(107);
			match(LEFTSHIFT);
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==VARIABLENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT) {
				{
				setState(109);
				match(LEFTSHIFT);
				setState(110);
				match(T__1);
				}
			}

			setState(113);
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
		enterRule(_localctx, 14, RULE_inputtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(116);
			match(RIGHTSHIFT);
			setState(117);
			match(VARIABLENAME);
			setState(118);
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
		enterRule(_localctx, 16, RULE_simpletypespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 18, RULE_variablevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(122);
				match(NUMBER);
				}
				break;
			case T__3:
				{
				setState(123);
				match(T__3);
				setState(124);
				match(NONDIGIT);
				setState(125);
				match(T__3);
				}
				break;
			case SEMICOLON:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\3\2\3\2\5\2G\n\2\3\2\5\2J\n\2\3\2\3\2\3\3\5\3O\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\br\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\7\5\2aaddii\3\2KT\3\2X\\\3"+
		"\2`a\n\2\24\25\31\31  %%+,\678AACC\2\u0086\2\26\3\2\2\2\4N\3\2\2\2\6W"+
		"\3\2\2\2\b\\\3\2\2\2\na\3\2\2\2\ff\3\2\2\2\16l\3\2\2\2\20u\3\2\2\2\22"+
		"z\3\2\2\2\24\u0081\3\2\2\2\26\27\5\22\n\2\27\30\7a\2\2\30 \7E\2\2\31\32"+
		"\5\22\n\2\32\34\7a\2\2\33\35\7\21\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\37"+
		"\3\2\2\2\36\31\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\""+
		" \3\2\2\2#$\7F\2\2$(\7I\2\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2"+
		"()\3\2\2\2).\3\2\2\2*(\3\2\2\2+-\5\6\4\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\f\7\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\5\16"+
		"\b\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5"+
		"\20\t\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AI\3\2\2\2B@\3\2\2\2CF"+
		"\7\66\2\2DG\7a\2\2EG\5\24\13\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HJ\7]\2\2"+
		"IC\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7J\2\2L\3\3\2\2\2MO\5\22\n\2NM\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PQ\7a\2\2QR\7U\2\2RS\t\2\2\2ST\t\3\2\2TU\t\2\2\2"+
		"UV\7]\2\2V\5\3\2\2\2WX\7a\2\2XY\t\4\2\2YZ\t\2\2\2Z[\7]\2\2[\7\3\2\2\2"+
		"\\]\7\7\2\2]^\7-\2\2^_\7a\2\2_`\7]\2\2`\t\3\2\2\2ab\7\b\2\2bc\7V\2\2c"+
		"d\7c\2\2de\7W\2\2e\13\3\2\2\2fg\5\22\n\2gh\7a\2\2hi\7U\2\2ij\5\24\13\2"+
		"jk\7]\2\2k\r\3\2\2\2lm\7\3\2\2mn\7\22\2\2nq\t\5\2\2op\7\22\2\2pr\7\4\2"+
		"\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7]\2\2t\17\3\2\2\2uv\7\5\2\2vw\7\23"+
		"\2\2wx\7a\2\2xy\7]\2\2y\21\3\2\2\2z{\t\6\2\2{\23\3\2\2\2|\u0082\7d\2\2"+
		"}~\7\6\2\2~\177\7i\2\2\177\u0082\7\6\2\2\u0080\u0082\3\2\2\2\u0081|\3"+
		"\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\25\3\2\2\2\16\34 (.\64"+
		":@FINq\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}