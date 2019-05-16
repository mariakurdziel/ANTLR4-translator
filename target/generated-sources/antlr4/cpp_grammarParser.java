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
		T__0=1, T__1=2, T__2=3, T__3=4, TEXT=5, LIBRARY=6, INCLUDE=7, EQUAL=8, 
		NOTEQUAL=9, LESSEQUAL=10, GREATEREQUAL=11, ANDAND=12, OROR=13, PLUSPLUS=14, 
		MINUSMINUS=15, COMMA=16, LEFTSHIFT=17, RIGHTSHIFT=18, AUTO=19, BOOL=20, 
		BREAK=21, CASE=22, CATCH=23, CHAR=24, CLASS=25, CONST=26, CONTINUE=27, 
		DEFAULT=28, DELETE=29, DO=30, DOUBLE=31, ELSE=32, ENUM=33, FALSE=34, FINAL=35, 
		FLOAT=36, FOR=37, FRIEND=38, GOTO=39, IF=40, INLINE=41, INT=42, LONG=43, 
		NAMESPACE=44, NEW=45, NOEXCEPT=46, NULLPTR=47, OVERRIDE=48, PRIVATE=49, 
		PROTECTED=50, PUBLIC=51, REINTERPRET_CAST=52, RETURN=53, SHORT=54, SIGNED=55, 
		SIZEOF=56, STATIC=57, STRUCT=58, SWITCH=59, THIS=60, THROW=61, TRUE=62, 
		TRY=63, UNSIGNED=64, USING=65, VIRTUAL=66, VOID=67, WHILE=68, LEFTPAREN=69, 
		RIGHTPAREN=70, LEFTBRACKET=71, RIGHTBRACKET=72, LEFTBRACE=73, RIGHTBRACE=74, 
		PLUS=75, MINUS=76, STAR=77, DIV=78, MOD=79, CARET=80, AND=81, OR=82, TILDE=83, 
		NOT=84, ASSIGN=85, LESS=86, GREATER=87, PLUSASSIGN=88, MINUSASSIGN=89, 
		STARASSIGN=90, DIVASSIGN=91, MODASSIGN=92, SEMICOLON=93, QUOTEMARK=94, 
		OPERATOR=95, VARIABLENAME=96, WORD=97, NUMBER=98, LINECOMMENT=99, BLOCKCOMMENT=100, 
		NEWLINE=101, WHITESPACE=102, NONDIGIT=103;
	public static final int
		RULE_namespacedeclaration = 0, RULE_preprocessordirective = 1, RULE_variabledeclaration = 2, 
		RULE_printtext = 3, RULE_inputtext = 4, RULE_simpletypespecifier = 5, 
		RULE_variablevalue = 6;
	public static final String[] ruleNames = {
		"namespacedeclaration", "preprocessordirective", "variabledeclaration", 
		"printtext", "inputtext", "simpletypespecifier", "variablevalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cout'", "'endl'", "'cin'", "'''", null, null, "'#include'", "'=='", 
		"'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'<<'", "'>>'", 
		"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'default'", "'delete'", "'do'", "'double'", 
		"'else'", "'enum'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
		"'goto'", "'if'", "'inline'", "'int'", "'long'", "'namespace'", "'new'", 
		"'noexcept'", "'nullptr'", "'override'", "'private'", "'protected'", "'public'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'struct'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'unsigned'", 
		"'using'", "'virtual'", "'void'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"';'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "TEXT", "LIBRARY", "INCLUDE", "EQUAL", "NOTEQUAL", 
		"LESSEQUAL", "GREATEREQUAL", "ANDAND", "OROR", "PLUSPLUS", "MINUSMINUS", 
		"COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AUTO", "BOOL", "BREAK", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DELETE", "DO", "DOUBLE", 
		"ELSE", "ENUM", "FALSE", "FINAL", "FLOAT", "FOR", "FRIEND", "GOTO", "IF", 
		"INLINE", "INT", "LONG", "NAMESPACE", "NEW", "NOEXCEPT", "NULLPTR", "OVERRIDE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "REINTERPRET_CAST", "RETURN", "SHORT", 
		"SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", 
		"TRY", "UNSIGNED", "USING", "VIRTUAL", "VOID", "WHILE", "LEFTPAREN", "RIGHTPAREN", 
		"LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", "RIGHTBRACE", "PLUS", "MINUS", 
		"STAR", "DIV", "MOD", "CARET", "AND", "OR", "TILDE", "NOT", "ASSIGN", 
		"LESS", "GREATER", "PLUSASSIGN", "MINUSASSIGN", "STARASSIGN", "DIVASSIGN", 
		"MODASSIGN", "SEMICOLON", "QUOTEMARK", "OPERATOR", "VARIABLENAME", "WORD", 
		"NUMBER", "LINECOMMENT", "BLOCKCOMMENT", "NEWLINE", "WHITESPACE", "NONDIGIT"
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
	public static class NamespacedeclarationContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(cpp_grammarParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(cpp_grammarParser.NAMESPACE, 0); }
		public TerminalNode WORD() { return getToken(cpp_grammarParser.WORD, 0); }
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
			match(WORD);
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
		public TerminalNode LIBRARY() { return getToken(cpp_grammarParser.LIBRARY, 0); }
		public TerminalNode SEMICOLON() { return getToken(cpp_grammarParser.SEMICOLON, 0); }
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
			setState(23);
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
		enterRule(_localctx, 4, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			simpletypespecifier();
			setState(26);
			match(VARIABLENAME);
			setState(27);
			match(ASSIGN);
			setState(28);
			variablevalue();
			setState(29);
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
			setState(31);
			match(T__0);
			setState(32);
			match(LEFTSHIFT);
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==VARIABLENAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTSHIFT) {
				{
				setState(34);
				match(LEFTSHIFT);
				setState(35);
				match(T__1);
				}
			}

			setState(38);
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
			setState(40);
			match(T__2);
			setState(41);
			match(RIGHTSHIFT);
			setState(42);
			match(VARIABLENAME);
			setState(43);
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
			setState(45);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (AUTO - 19)) | (1L << (BOOL - 19)) | (1L << (CHAR - 19)) | (1L << (DOUBLE - 19)) | (1L << (FLOAT - 19)) | (1L << (INT - 19)) | (1L << (LONG - 19)) | (1L << (SHORT - 19)) | (1L << (SIGNED - 19)) | (1L << (UNSIGNED - 19)) | (1L << (VOID - 19)))) != 0)) ) {
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(47);
				match(NUMBER);
				}
				break;
			case T__3:
				{
				setState(48);
				match(T__3);
				setState(49);
				match(NONDIGIT);
				setState(50);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3i9\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\'\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\67\n\b\3\b"+
		"\2\2\t\2\4\6\b\n\f\16\2\4\4\2\7\7bb\n\2\25\26\32\32!!&&,-89BBEE\2\64\2"+
		"\20\3\2\2\2\4\25\3\2\2\2\6\33\3\2\2\2\b!\3\2\2\2\n*\3\2\2\2\f/\3\2\2\2"+
		"\16\66\3\2\2\2\20\21\7C\2\2\21\22\7.\2\2\22\23\7c\2\2\23\24\7_\2\2\24"+
		"\3\3\2\2\2\25\26\7\t\2\2\26\27\7X\2\2\27\30\7\b\2\2\30\31\7Y\2\2\31\32"+
		"\7_\2\2\32\5\3\2\2\2\33\34\5\f\7\2\34\35\7b\2\2\35\36\7W\2\2\36\37\5\16"+
		"\b\2\37 \7_\2\2 \7\3\2\2\2!\"\7\3\2\2\"#\7\23\2\2#&\t\2\2\2$%\7\23\2\2"+
		"%\'\7\4\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7_\2\2)\t\3\2\2\2*+\7\5"+
		"\2\2+,\7\24\2\2,-\7b\2\2-.\7_\2\2.\13\3\2\2\2/\60\t\3\2\2\60\r\3\2\2\2"+
		"\61\67\7d\2\2\62\63\7\6\2\2\63\64\7i\2\2\64\67\7\6\2\2\65\67\3\2\2\2\66"+
		"\61\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\17\3\2\2\2\4&\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}