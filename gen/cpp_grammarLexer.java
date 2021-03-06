// Generated from C:/Users/maria/Desktop/lab4/translator/src/main/antlr4\cpp_grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cpp_grammarLexer extends Lexer {
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
		NEWLINE=101, WHITESPACE=102;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "USING", "INCLUDE", "EQUAL", "NOTEQUAL", 
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
			"SIGN", "VARIABLENAME", "WORD", "LIBRARY", "TEXT", "NONDIGIT", "NUMBER", 
			"DIGIT", "LINECOMMENT", "BLOCKCOMMENT", "NEWLINE", "WHITESPACE"
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
			"NEWLINE", "WHITESPACE"
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


	public cpp_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cpp_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2h\u032e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0106\n\f\3\r\3"+
		"\r\3\r\3\r\5\r\u010c\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H"+
		"\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S"+
		"\3S\5S\u027d\nS\3T\3T\3U\3U\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z"+
		"\3[\3[\3[\3\\\3\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\5^\u02d6\n^\3_\3_\3`\3`\7`\u02dc\n`\f`\16`\u02df\13`\3a\6a\u02e2\na"+
		"\ra\16a\u02e3\3b\3b\3b\5b\u02e9\nb\3c\3c\3c\3c\6c\u02ef\nc\rc\16c\u02f0"+
		"\3c\3c\3d\3d\3e\6e\u02f8\ne\re\16e\u02f9\3e\3e\6e\u02fe\ne\re\16e\u02ff"+
		"\5e\u0302\ne\3f\3f\3g\3g\3g\3g\7g\u030a\ng\fg\16g\u030d\13g\3g\3g\3h\3"+
		"h\3h\3h\7h\u0315\nh\fh\16h\u0318\13h\3h\3h\3h\3h\3h\3i\3i\5i\u0321\ni"+
		"\3i\5i\u0324\ni\3i\3i\3j\6j\u0329\nj\rj\16j\u032a\3j\3j\3\u0316\2k\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd\2\u00bf`\u00c1a\u00c3b\u00c5c\u00c7\2\u00c9d\u00cb"+
		"\2\u00cde\u00cff\u00d1g\u00d3h\3\2\t\n\2##\'(,-//\61\61``~~\u0080\u0080"+
		"\4\2--//\5\2C\\aac|\4\2..\60\60\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2"+
		"\u0356\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c9\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\3\u00d5\3\2\2\2\5\u00da\3\2\2\2\7\u00df\3\2\2"+
		"\2\t\u00e3\3\2\2\2\13\u00e5\3\2\2\2\r\u00eb\3\2\2\2\17\u00f4\3\2\2\2\21"+
		"\u00f7\3\2\2\2\23\u00fa\3\2\2\2\25\u00fd\3\2\2\2\27\u0105\3\2\2\2\31\u010b"+
		"\3\2\2\2\33\u010d\3\2\2\2\35\u0110\3\2\2\2\37\u0113\3\2\2\2!\u0115\3\2"+
		"\2\2#\u0118\3\2\2\2%\u011b\3\2\2\2\'\u0120\3\2\2\2)\u0125\3\2\2\2+\u012b"+
		"\3\2\2\2-\u0130\3\2\2\2/\u0136\3\2\2\2\61\u013b\3\2\2\2\63\u0141\3\2\2"+
		"\2\65\u0147\3\2\2\2\67\u0150\3\2\2\29\u0158\3\2\2\2;\u015f\3\2\2\2=\u0162"+
		"\3\2\2\2?\u0169\3\2\2\2A\u016e\3\2\2\2C\u0173\3\2\2\2E\u0179\3\2\2\2G"+
		"\u017f\3\2\2\2I\u0185\3\2\2\2K\u0189\3\2\2\2M\u0190\3\2\2\2O\u0195\3\2"+
		"\2\2Q\u0198\3\2\2\2S\u019f\3\2\2\2U\u01a3\3\2\2\2W\u01a8\3\2\2\2Y\u01b2"+
		"\3\2\2\2[\u01b6\3\2\2\2]\u01bf\3\2\2\2_\u01c7\3\2\2\2a\u01d0\3\2\2\2c"+
		"\u01d8\3\2\2\2e\u01e2\3\2\2\2g\u01e9\3\2\2\2i\u01fa\3\2\2\2k\u0201\3\2"+
		"\2\2m\u0207\3\2\2\2o\u020e\3\2\2\2q\u0215\3\2\2\2s\u021c\3\2\2\2u\u0223"+
		"\3\2\2\2w\u022a\3\2\2\2y\u022f\3\2\2\2{\u0235\3\2\2\2}\u023a\3\2\2\2\177"+
		"\u023e\3\2\2\2\u0081\u0247\3\2\2\2\u0083\u024f\3\2\2\2\u0085\u0254\3\2"+
		"\2\2\u0087\u025a\3\2\2\2\u0089\u025c\3\2\2\2\u008b\u025e\3\2\2\2\u008d"+
		"\u0260\3\2\2\2\u008f\u0262\3\2\2\2\u0091\u0264\3\2\2\2\u0093\u0266\3\2"+
		"\2\2\u0095\u0268\3\2\2\2\u0097\u026a\3\2\2\2\u0099\u026c\3\2\2\2\u009b"+
		"\u026e\3\2\2\2\u009d\u0270\3\2\2\2\u009f\u0272\3\2\2\2\u00a1\u0274\3\2"+
		"\2\2\u00a3\u0276\3\2\2\2\u00a5\u027c\3\2\2\2\u00a7\u027e\3\2\2\2\u00a9"+
		"\u0280\3\2\2\2\u00ab\u0282\3\2\2\2\u00ad\u0284\3\2\2\2\u00af\u0287\3\2"+
		"\2\2\u00b1\u028a\3\2\2\2\u00b3\u028d\3\2\2\2\u00b5\u0290\3\2\2\2\u00b7"+
		"\u0293\3\2\2\2\u00b9\u0295\3\2\2\2\u00bb\u02d5\3\2\2\2\u00bd\u02d7\3\2"+
		"\2\2\u00bf\u02d9\3\2\2\2\u00c1\u02e1\3\2\2\2\u00c3\u02e5\3\2\2\2\u00c5"+
		"\u02ea\3\2\2\2\u00c7\u02f4\3\2\2\2\u00c9\u02f7\3\2\2\2\u00cb\u0303\3\2"+
		"\2\2\u00cd\u0305\3\2\2\2\u00cf\u0310\3\2\2\2\u00d1\u0323\3\2\2\2\u00d3"+
		"\u0328\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7w\2"+
		"\2\u00d8\u00d9\7v\2\2\u00d9\4\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7"+
		"p\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7n\2\2\u00de\6\3\2\2\2\u00df\u00e0"+
		"\7e\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\b\3\2\2\2\u00e3\u00e4"+
		"\7)\2\2\u00e4\n\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7i\2\2\u00ea\f\3\2\2\2\u00eb\u00ec"+
		"\7%\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3\16\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7?\2\2\u00f6\20\3\2\2"+
		"\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\7?\2\2\u00f9\22\3\2\2\2\u00fa\u00fb"+
		"\7>\2\2\u00fb\u00fc\7?\2\2\u00fc\24\3\2\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\26\3\2\2\2\u0100\u0101\7(\2\2\u0101\u0106\7(\2\2\u0102\u0103"+
		"\7c\2\2\u0103\u0104\7p\2\2\u0104\u0106\7f\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0106\30\3\2\2\2\u0107\u0108\7~\2\2\u0108\u010c\7~\2\2"+
		"\u0109\u010a\7q\2\2\u010a\u010c\7t\2\2\u010b\u0107\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\32\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f\7-\2\2\u010f"+
		"\34\3\2\2\2\u0110\u0111\7/\2\2\u0111\u0112\7/\2\2\u0112\36\3\2\2\2\u0113"+
		"\u0114\7.\2\2\u0114 \3\2\2\2\u0115\u0116\7>\2\2\u0116\u0117\7>\2\2\u0117"+
		"\"\3\2\2\2\u0118\u0119\7@\2\2\u0119\u011a\7@\2\2\u011a$\3\2\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7w\2\2\u011d\u011e\7v\2\2\u011e\u011f\7q\2\2"+
		"\u011f&\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7q\2\2\u0122\u0123\7q\2"+
		"\2\u0123\u0124\7n\2\2\u0124(\3\2\2\2\u0125\u0126\7d\2\2\u0126\u0127\7"+
		"t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7c\2\2\u0129\u012a\7m\2\2\u012a*"+
		"\3\2\2\2\u012b\u012c\7e\2\2\u012c\u012d\7c\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7g\2\2\u012f,\3\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7v\2\2\u0133\u0134\7e\2\2\u0134\u0135\7j\2\2\u0135.\3\2\2\2\u0136"+
		"\u0137\7e\2\2\u0137\u0138\7j\2\2\u0138\u0139\7c\2\2\u0139\u013a\7t\2\2"+
		"\u013a\60\3\2\2\2\u013b\u013c\7e\2\2\u013c\u013d\7n\2\2\u013d\u013e\7"+
		"c\2\2\u013e\u013f\7u\2\2\u013f\u0140\7u\2\2\u0140\62\3\2\2\2\u0141\u0142"+
		"\7e\2\2\u0142\u0143\7q\2\2\u0143\u0144\7p\2\2\u0144\u0145\7u\2\2\u0145"+
		"\u0146\7v\2\2\u0146\64\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149\7q\2\2\u0149"+
		"\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2"+
		"\u014d\u014e\7w\2\2\u014e\u014f\7g\2\2\u014f\66\3\2\2\2\u0150\u0151\7"+
		"f\2\2\u0151\u0152\7g\2\2\u0152\u0153\7h\2\2\u0153\u0154\7c\2\2\u0154\u0155"+
		"\7w\2\2\u0155\u0156\7n\2\2\u0156\u0157\7v\2\2\u01578\3\2\2\2\u0158\u0159"+
		"\7f\2\2\u0159\u015a\7g\2\2\u015a\u015b\7n\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u015d\7v\2\2\u015d\u015e\7g\2\2\u015e:\3\2\2\2\u015f\u0160\7f\2\2\u0160"+
		"\u0161\7q\2\2\u0161<\3\2\2\2\u0162\u0163\7f\2\2\u0163\u0164\7q\2\2\u0164"+
		"\u0165\7w\2\2\u0165\u0166\7d\2\2\u0166\u0167\7n\2\2\u0167\u0168\7g\2\2"+
		"\u0168>\3\2\2\2\u0169\u016a\7g\2\2\u016a\u016b\7n\2\2\u016b\u016c\7u\2"+
		"\2\u016c\u016d\7g\2\2\u016d@\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7"+
		"p\2\2\u0170\u0171\7w\2\2\u0171\u0172\7o\2\2\u0172B\3\2\2\2\u0173\u0174"+
		"\7h\2\2\u0174\u0175\7c\2\2\u0175\u0176\7n\2\2\u0176\u0177\7u\2\2\u0177"+
		"\u0178\7g\2\2\u0178D\3\2\2\2\u0179\u017a\7h\2\2\u017a\u017b\7k\2\2\u017b"+
		"\u017c\7p\2\2\u017c\u017d\7c\2\2\u017d\u017e\7n\2\2\u017eF\3\2\2\2\u017f"+
		"\u0180\7h\2\2\u0180\u0181\7n\2\2\u0181\u0182\7q\2\2\u0182\u0183\7c\2\2"+
		"\u0183\u0184\7v\2\2\u0184H\3\2\2\2\u0185\u0186\7h\2\2\u0186\u0187\7q\2"+
		"\2\u0187\u0188\7t\2\2\u0188J\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7"+
		"t\2\2\u018b\u018c\7k\2\2\u018c\u018d\7g\2\2\u018d\u018e\7p\2\2\u018e\u018f"+
		"\7f\2\2\u018fL\3\2\2\2\u0190\u0191\7i\2\2\u0191\u0192\7q\2\2\u0192\u0193"+
		"\7v\2\2\u0193\u0194\7q\2\2\u0194N\3\2\2\2\u0195\u0196\7k\2\2\u0196\u0197"+
		"\7h\2\2\u0197P\3\2\2\2\u0198\u0199\7k\2\2\u0199\u019a\7p\2\2\u019a\u019b"+
		"\7n\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e\7g\2\2\u019e"+
		"R\3\2\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7v\2\2\u01a2"+
		"T\3\2\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7p\2\2\u01a6"+
		"\u01a7\7i\2\2\u01a7V\3\2\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7c\2\2\u01aa"+
		"\u01ab\7o\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7r\2\2"+
		"\u01ae\u01af\7c\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7g\2\2\u01b1X\3\2\2"+
		"\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7y\2\2\u01b5Z\3\2"+
		"\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba"+
		"\7z\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7r\2\2\u01bd"+
		"\u01be\7v\2\2\u01be\\\3\2\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7w\2\2\u01c1"+
		"\u01c2\7n\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7r\2\2\u01c4\u01c5\7v\2\2"+
		"\u01c5\u01c6\7t\2\2\u01c6^\3\2\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9\7x\2"+
		"\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd"+
		"\7k\2\2\u01cd\u01ce\7f\2\2\u01ce\u01cf\7g\2\2\u01cf`\3\2\2\2\u01d0\u01d1"+
		"\7r\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7x\2\2\u01d4"+
		"\u01d5\7c\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7g\2\2\u01d7b\3\2\2\2\u01d8"+
		"\u01d9\7r\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7v\2\2"+
		"\u01dc\u01dd\7g\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7v\2\2\u01df\u01e0"+
		"\7g\2\2\u01e0\u01e1\7f\2\2\u01e1d\3\2\2\2\u01e2\u01e3\7r\2\2\u01e3\u01e4"+
		"\7w\2\2\u01e4\u01e5\7d\2\2\u01e5\u01e6\7n\2\2\u01e6\u01e7\7k\2\2\u01e7"+
		"\u01e8\7e\2\2\u01e8f\3\2\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7g\2\2\u01eb"+
		"\u01ec\7k\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7g\2\2"+
		"\u01ef\u01f0\7t\2\2\u01f0\u01f1\7r\2\2\u01f1\u01f2\7t\2\2\u01f2\u01f3"+
		"\7g\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7a\2\2\u01f5\u01f6\7e\2\2\u01f6"+
		"\u01f7\7c\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7v\2\2\u01f9h\3\2\2\2\u01fa"+
		"\u01fb\7t\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7w\2\2"+
		"\u01fe\u01ff\7t\2\2\u01ff\u0200\7p\2\2\u0200j\3\2\2\2\u0201\u0202\7u\2"+
		"\2\u0202\u0203\7j\2\2\u0203\u0204\7q\2\2\u0204\u0205\7t\2\2\u0205\u0206"+
		"\7v\2\2\u0206l\3\2\2\2\u0207\u0208\7u\2\2\u0208\u0209\7k\2\2\u0209\u020a"+
		"\7i\2\2\u020a\u020b\7p\2\2\u020b\u020c\7g\2\2\u020c\u020d\7f\2\2\u020d"+
		"n\3\2\2\2\u020e\u020f\7u\2\2\u020f\u0210\7k\2\2\u0210\u0211\7|\2\2\u0211"+
		"\u0212\7g\2\2\u0212\u0213\7q\2\2\u0213\u0214\7h\2\2\u0214p\3\2\2\2\u0215"+
		"\u0216\7u\2\2\u0216\u0217\7v\2\2\u0217\u0218\7c\2\2\u0218\u0219\7v\2\2"+
		"\u0219\u021a\7k\2\2\u021a\u021b\7e\2\2\u021br\3\2\2\2\u021c\u021d\7u\2"+
		"\2\u021d\u021e\7v\2\2\u021e\u021f\7t\2\2\u021f\u0220\7w\2\2\u0220\u0221"+
		"\7e\2\2\u0221\u0222\7v\2\2\u0222t\3\2\2\2\u0223\u0224\7u\2\2\u0224\u0225"+
		"\7y\2\2\u0225\u0226\7k\2\2\u0226\u0227\7v\2\2\u0227\u0228\7e\2\2\u0228"+
		"\u0229\7j\2\2\u0229v\3\2\2\2\u022a\u022b\7v\2\2\u022b\u022c\7j\2\2\u022c"+
		"\u022d\7k\2\2\u022d\u022e\7u\2\2\u022ex\3\2\2\2\u022f\u0230\7v\2\2\u0230"+
		"\u0231\7j\2\2\u0231\u0232\7t\2\2\u0232\u0233\7q\2\2\u0233\u0234\7y\2\2"+
		"\u0234z\3\2\2\2\u0235\u0236\7v\2\2\u0236\u0237\7t\2\2\u0237\u0238\7w\2"+
		"\2\u0238\u0239\7g\2\2\u0239|\3\2\2\2\u023a\u023b\7v\2\2\u023b\u023c\7"+
		"t\2\2\u023c\u023d\7{\2\2\u023d~\3\2\2\2\u023e\u023f\7w\2\2\u023f\u0240"+
		"\7p\2\2\u0240\u0241\7u\2\2\u0241\u0242\7k\2\2\u0242\u0243\7i\2\2\u0243"+
		"\u0244\7p\2\2\u0244\u0245\7g\2\2\u0245\u0246\7f\2\2\u0246\u0080\3\2\2"+
		"\2\u0247\u0248\7x\2\2\u0248\u0249\7k\2\2\u0249\u024a\7t\2\2\u024a\u024b"+
		"\7v\2\2\u024b\u024c\7w\2\2\u024c\u024d\7c\2\2\u024d\u024e\7n\2\2\u024e"+
		"\u0082\3\2\2\2\u024f\u0250\7x\2\2\u0250\u0251\7q\2\2\u0251\u0252\7k\2"+
		"\2\u0252\u0253\7f\2\2\u0253\u0084\3\2\2\2\u0254\u0255\7y\2\2\u0255\u0256"+
		"\7j\2\2\u0256\u0257\7k\2\2\u0257\u0258\7n\2\2\u0258\u0259\7g\2\2\u0259"+
		"\u0086\3\2\2\2\u025a\u025b\7*\2\2\u025b\u0088\3\2\2\2\u025c\u025d\7+\2"+
		"\2\u025d\u008a\3\2\2\2\u025e\u025f\7]\2\2\u025f\u008c\3\2\2\2\u0260\u0261"+
		"\7_\2\2\u0261\u008e\3\2\2\2\u0262\u0263\7}\2\2\u0263\u0090\3\2\2\2\u0264"+
		"\u0265\7\177\2\2\u0265\u0092\3\2\2\2\u0266\u0267\7-\2\2\u0267\u0094\3"+
		"\2\2\2\u0268\u0269\7/\2\2\u0269\u0096\3\2\2\2\u026a\u026b\7,\2\2\u026b"+
		"\u0098\3\2\2\2\u026c\u026d\7\61\2\2\u026d\u009a\3\2\2\2\u026e\u026f\7"+
		"\'\2\2\u026f\u009c\3\2\2\2\u0270\u0271\7`\2\2\u0271\u009e\3\2\2\2\u0272"+
		"\u0273\7(\2\2\u0273\u00a0\3\2\2\2\u0274\u0275\7~\2\2\u0275\u00a2\3\2\2"+
		"\2\u0276\u0277\7\u0080\2\2\u0277\u00a4\3\2\2\2\u0278\u027d\7#\2\2\u0279"+
		"\u027a\7p\2\2\u027a\u027b\7q\2\2\u027b\u027d\7v\2\2\u027c\u0278\3\2\2"+
		"\2\u027c\u0279\3\2\2\2\u027d\u00a6\3\2\2\2\u027e\u027f\7?\2\2\u027f\u00a8"+
		"\3\2\2\2\u0280\u0281\7>\2\2\u0281\u00aa\3\2\2\2\u0282\u0283\7@\2\2\u0283"+
		"\u00ac\3\2\2\2\u0284\u0285\7-\2\2\u0285\u0286\7?\2\2\u0286\u00ae\3\2\2"+
		"\2\u0287\u0288\7/\2\2\u0288\u0289\7?\2\2\u0289\u00b0\3\2\2\2\u028a\u028b"+
		"\7,\2\2\u028b\u028c\7?\2\2\u028c\u00b2\3\2\2\2\u028d\u028e\7\61\2\2\u028e"+
		"\u028f\7?\2\2\u028f\u00b4\3\2\2\2\u0290\u0291\7\'\2\2\u0291\u0292\7?\2"+
		"\2\u0292\u00b6\3\2\2\2\u0293\u0294\7=\2\2\u0294\u00b8\3\2\2\2\u0295\u0296"+
		"\7$\2\2\u0296\u00ba\3\2\2\2\u0297\u02d6\5Y-\2\u0298\u02d6\59\35\2\u0299"+
		"\u029a\5Y-\2\u029a\u029b\7]\2\2\u029b\u029c\7_\2\2\u029c\u02d6\3\2\2\2"+
		"\u029d\u029e\59\35\2\u029e\u029f\7]\2\2\u029f\u02a0\7_\2\2\u02a0\u02d6"+
		"\3\2\2\2\u02a1\u02d6\t\2\2\2\u02a2\u02a3\7p\2\2\u02a3\u02a4\7q\2\2\u02a4"+
		"\u02d6\7v\2\2\u02a5\u02d6\4>@\2\u02a6\u02a7\7-\2\2\u02a7\u02d6\7?\2\2"+
		"\u02a8\u02a9\7/\2\2\u02a9\u02d6\7?\2\2\u02aa\u02ab\7,\2\2\u02ab\u02d6"+
		"\7?\2\2\u02ac\u02ad\7\61\2\2\u02ad\u02d6\7?\2\2\u02ae\u02af\7\'\2\2\u02af"+
		"\u02d6\7?\2\2\u02b0\u02b1\7`\2\2\u02b1\u02d6\7?\2\2\u02b2\u02b3\7(\2\2"+
		"\u02b3\u02d6\7?\2\2\u02b4\u02b5\7~\2\2\u02b5\u02d6\7?\2\2\u02b6\u02b7"+
		"\7?\2\2\u02b7\u02d6\7?\2\2\u02b8\u02b9\7#\2\2\u02b9\u02d6\7?\2\2\u02ba"+
		"\u02bb\7>\2\2\u02bb\u02d6\7?\2\2\u02bc\u02bd\7@\2\2\u02bd\u02d6\7?\2\2"+
		"\u02be\u02bf\7(\2\2\u02bf\u02d6\7(\2\2\u02c0\u02c1\7c\2\2\u02c1\u02c2"+
		"\7p\2\2\u02c2\u02d6\7f\2\2\u02c3\u02c4\7~\2\2\u02c4\u02d6\7~\2\2\u02c5"+
		"\u02c6\7q\2\2\u02c6\u02d6\7t\2\2\u02c7\u02c8\7-\2\2\u02c8\u02d6\7-\2\2"+
		"\u02c9\u02ca\7/\2\2\u02ca\u02d6\7/\2\2\u02cb\u02d6\7.\2\2\u02cc\u02cd"+
		"\7/\2\2\u02cd\u02ce\7@\2\2\u02ce\u02d6\7,\2\2\u02cf\u02d0\7/\2\2\u02d0"+
		"\u02d6\7@\2\2\u02d1\u02d2\7*\2\2\u02d2\u02d6\7+\2\2\u02d3\u02d4\7]\2\2"+
		"\u02d4\u02d6\7_\2\2\u02d5\u0297\3\2\2\2\u02d5\u0298\3\2\2\2\u02d5\u0299"+
		"\3\2\2\2\u02d5\u029d\3\2\2\2\u02d5\u02a1\3\2\2\2\u02d5\u02a2\3\2\2\2\u02d5"+
		"\u02a5\3\2\2\2\u02d5\u02a6\3\2\2\2\u02d5\u02a8\3\2\2\2\u02d5\u02aa\3\2"+
		"\2\2\u02d5\u02ac\3\2\2\2\u02d5\u02ae\3\2\2\2\u02d5\u02b0\3\2\2\2\u02d5"+
		"\u02b2\3\2\2\2\u02d5\u02b4\3\2\2\2\u02d5\u02b6\3\2\2\2\u02d5\u02b8\3\2"+
		"\2\2\u02d5\u02ba\3\2\2\2\u02d5\u02bc\3\2\2\2\u02d5\u02be\3\2\2\2\u02d5"+
		"\u02c0\3\2\2\2\u02d5\u02c3\3\2\2\2\u02d5\u02c5\3\2\2\2\u02d5\u02c7\3\2"+
		"\2\2\u02d5\u02c9\3\2\2\2\u02d5\u02cb\3\2\2\2\u02d5\u02cc\3\2\2\2\u02d5"+
		"\u02cf\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u00bc\3\2"+
		"\2\2\u02d7\u02d8\t\3\2\2\u02d8\u00be\3\2\2\2\u02d9\u02dd\5\u00c1a\2\u02da"+
		"\u02dc\5\u00cbf\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u00c0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0"+
		"\u02e2\5\u00c7d\2\u02e1\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e1"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u00c2\3\2\2\2\u02e5\u02e8\5\u00c1a"+
		"\2\u02e6\u02e7\7\60\2\2\u02e7\u02e9\7j\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u00c4\3\2\2\2\u02ea\u02ee\5\u00b9]\2\u02eb\u02ec\5\u00c1"+
		"a\2\u02ec\u02ed\5\u00d3j\2\u02ed\u02ef\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f3\5\u00b9]\2\u02f3\u00c6\3\2\2\2\u02f4\u02f5\t\4\2\2\u02f5"+
		"\u00c8\3\2\2\2\u02f6\u02f8\5\u00cbf\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9"+
		"\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u0301\3\2\2\2\u02fb"+
		"\u02fd\t\5\2\2\u02fc\u02fe\5\u00cbf\2\u02fd\u02fc\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301"+
		"\u02fb\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u00ca\3\2\2\2\u0303\u0304\t\6"+
		"\2\2\u0304\u00cc\3\2\2\2\u0305\u0306\7\61\2\2\u0306\u0307\7\61\2\2\u0307"+
		"\u030b\3\2\2\2\u0308\u030a\n\7\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2"+
		"\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030e\u030f\bg\2\2\u030f\u00ce\3\2\2\2\u0310\u0311\7\61"+
		"\2\2\u0311\u0312\7,\2\2\u0312\u0316\3\2\2\2\u0313\u0315\13\2\2\2\u0314"+
		"\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0317\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a\7,\2\2\u031a"+
		"\u031b\7\61\2\2\u031b\u031c\3\2\2\2\u031c\u031d\bh\2\2\u031d\u00d0\3\2"+
		"\2\2\u031e\u0320\7\17\2\2\u031f\u0321\7\f\2\2\u0320\u031f\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0324\7\f\2\2\u0323\u031e\3\2"+
		"\2\2\u0323\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\bi\2\2\u0326"+
		"\u00d2\3\2\2\2\u0327\u0329\t\b\2\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\bj\2\2\u032d\u00d4\3\2\2\2\23\2\u0105\u010b\u027c\u02d5\u02dd\u02e3"+
		"\u02e8\u02f0\u02f9\u02ff\u0301\u030b\u0316\u0320\u0323\u032a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}