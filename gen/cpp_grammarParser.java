// Generated from C:/Users/maria/Desktop/lab4/translator/src/main/antlr4\cpp_grammar.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		MODASSIGN=90, SEMICOLON=91, QUOTEMARK=92, OPERATOR=93, VARIABLENAME=94, 
		WORD=95, LIBRARY=96, TEXT=97, NUMBER=98, LINECOMMENT=99, BLOCKCOMMENT=100, 
		NEWLINE=101, WHITESPACE=102, NONDIGIT=103;
	public static final int
		RULE_namespacedeclaration = 0, RULE_preprocessordirective = 1, RULE_variabledeclaration = 2, 
		RULE_printtext = 3, RULE_inputtext = 4, RULE_simpletypespecifier = 5, 
		RULE_variablevalue = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"namespacedeclaration", "preprocessordirective", "variabledeclaration", 
			"printtext", "inputtext", "simpletypespecifier", "variablevalue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cout'", "'endl'", "'cin'", "'''", "'using'", "'#include'", "'=='", 
			"'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'<<'", "'>>'", 
			"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'class'", 
			"'const'", "'continue'", "'default'", "'delete'", "'do'", "'double'", 
			"'else'", "'enum'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'namespace'", "'new'", 
			"'noexcept'", "'nullptr'", "'override'", "'private'", "'protected'", 
			"'public'", "'reinterpret_cast'", "'return'", "'short'", "'signed'", 
			"'sizeof'", "'static'", "'struct'", "'switch'", "'this'", "'throw'", 
			"'true'", "'try'", "'unsigned'", "'virtual'", "'void'", "'while'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "USING", "INCLUDE", "EQUAL", "NOTEQUAL", 
			"LESSEQUAL", "GREATEREQUAL", "ANDAND", "OROR", "PLUSPLUS", "MINUSMINUS", 
			"COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AUTO", "BOOL", "BREAK", "CASE", 
			"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DELETE", "DO", 
			"DOUBLE", "ELSE", "ENUM", "FALSE", "FINAL", "FLOAT", "FOR", "FRIEND", 
			"GOTO", "IF", "INLINE", "INT", "LONG", "NAMESPACE", "NEW", "NOEXCEPT", 
			"NULLPTR", "OVERRIDE", "PRIVATE", "PROTECTED", "PUBLIC", "REINTERPRET_CAST", 
			"RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", 
			"THIS", "THROW", "TRUE", "TRY", "UNSIGNED", "VIRTUAL", "VOID", "WHILE", 
			"LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", 
			"RIGHTBRACE", "PLUS", "MINUS", "STAR", "DIV", "MOD", "CARET", "AND", 
			"OR", "TILDE", "NOT", "ASSIGN", "LESS", "GREATER", "PLUSASSIGN", "MINUSASSIGN", 
			"STARASSIGN", "DIVASSIGN", "MODASSIGN", "SEMICOLON", "QUOTEMARK", "OPERATOR", 
			"VARIABLENAME", "WORD", "LIBRARY", "TEXT", "NUMBER", "LINECOMMENT", "BLOCKCOMMENT", 
			"NEWLINE", "WHITESPACE", "NONDIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		enterRule(_localctx, 0, RULE_namespacedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(USING);
			setState(15);
			match(NAMESPACE);
			setState(16);
			match(VARIABLENAME);
			setState(17);
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
		public TerminalNode LESS() { return getToken(cpp_grammarParser.LESS, 0); }
		public TerminalNode LIBRARY() { return getToken(cpp_grammarParser.LIBRARY, 0); }
		public TerminalNode GREATER() { return getToken(cpp_grammarParser.GREATER, 0); }
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
		enterRule(_localctx, 2, RULE_preprocessordirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(INCLUDE);
			setState(20);
			match(LESS);
			setState(21);
			match(LIBRARY);
			setState(22);
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
		public TerminalNode ASSIGN() { return getToken(cpp_grammarParser.ASSIGN, 0); }
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
		enterRule(_localctx, 4, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			simpletypespecifier();
			setState(25);
			match(VARIABLENAME);
			setState(26);
			match(ASSIGN);
			setState(27);
			variablevalue();
			setState(28);
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
		enterRule(_localctx, 6, RULE_printtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(LEFTSHIFT);
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==VARIABLENAME || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT) {
				{
				setState(33);
				match(LEFTSHIFT);
				setState(34);
				match(T__1);
				}
			}

			setState(37);
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
		enterRule(_localctx, 8, RULE_inputtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			match(RIGHTSHIFT);
			setState(41);
			match(VARIABLENAME);
			setState(42);
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
		enterRule(_localctx, 10, RULE_simpletypespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		enterRule(_localctx, 12, RULE_variablevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(46);
				match(NUMBER);
				}
				break;
			case T__3:
				{
				setState(47);
				match(T__3);
				setState(48);
				match(NONDIGIT);
				setState(49);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i8\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5&\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\66\n\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\4\4\2``cc\n\2\24\25\31\31  %%+,\678AACC\2\63\2\20"+
		"\3\2\2\2\4\25\3\2\2\2\6\32\3\2\2\2\b \3\2\2\2\n)\3\2\2\2\f.\3\2\2\2\16"+
		"\65\3\2\2\2\20\21\7\7\2\2\21\22\7-\2\2\22\23\7`\2\2\23\24\7]\2\2\24\3"+
		"\3\2\2\2\25\26\7\b\2\2\26\27\7V\2\2\27\30\7b\2\2\30\31\7W\2\2\31\5\3\2"+
		"\2\2\32\33\5\f\7\2\33\34\7`\2\2\34\35\7U\2\2\35\36\5\16\b\2\36\37\7]\2"+
		"\2\37\7\3\2\2\2 !\7\3\2\2!\"\7\22\2\2\"%\t\2\2\2#$\7\22\2\2$&\7\4\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7]\2\2(\t\3\2\2\2)*\7\5\2\2*+\7\23"+
		"\2\2+,\7`\2\2,-\7]\2\2-\13\3\2\2\2./\t\3\2\2/\r\3\2\2\2\60\66\7d\2\2\61"+
		"\62\7\6\2\2\62\63\7i\2\2\63\66\7\6\2\2\64\66\3\2\2\2\65\60\3\2\2\2\65"+
		"\61\3\2\2\2\65\64\3\2\2\2\66\17\3\2\2\2\4%\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}