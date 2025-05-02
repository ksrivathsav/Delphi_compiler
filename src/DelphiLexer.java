// Generated from src/Delphi.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DelphiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, IDENTIFIER=45, 
		INT=46, WS=47, COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "IDENTIFIER", "INT", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'var'", "'begin'", "'end'", "'class'", 
			"'extends'", "'implements'", "'{'", "'}'", "'interface'", "'procedure'", 
			"'('", "')'", "':'", "'constructor'", "'destructor'", "'public'", "'private'", 
			"'protected'", "':='", "','", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'to'", "'break'", "'continue'", "'function'", "'*'", 
			"'/'", "'+'", "'-'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IDENTIFIER", "INT", 
			"WS", "COMMENT"
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


	public DelphiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Delphi.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0159\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\7.\u013e"+
		"\n.\f.\16.\u0141\13.\3/\6/\u0144\n/\r/\16/\u0145\3\60\6\60\u0149\n\60"+
		"\r\60\16\60\u014a\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0153\n\61\f\61\16"+
		"\61\u0156\13\61\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2"+
		"\13s\3\2\2\2\ry\3\2\2\2\17}\3\2\2\2\21\u0083\3\2\2\2\23\u008b\3\2\2\2"+
		"\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a\3\2\2\2\33\u00a4\3\2\2\2\35"+
		"\u00ae\3\2\2\2\37\u00b0\3\2\2\2!\u00b2\3\2\2\2#\u00b4\3\2\2\2%\u00c0\3"+
		"\2\2\2\'\u00cb\3\2\2\2)\u00d2\3\2\2\2+\u00da\3\2\2\2-\u00e4\3\2\2\2/\u00e7"+
		"\3\2\2\2\61\u00e9\3\2\2\2\63\u00ec\3\2\2\2\65\u00f1\3\2\2\2\67\u00f6\3"+
		"\2\2\29\u00fc\3\2\2\2;\u00ff\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2\2\2A\u010c"+
		"\3\2\2\2C\u0115\3\2\2\2E\u011e\3\2\2\2G\u0120\3\2\2\2I\u0122\3\2\2\2K"+
		"\u0124\3\2\2\2M\u0126\3\2\2\2O\u0128\3\2\2\2Q\u012b\3\2\2\2S\u012d\3\2"+
		"\2\2U\u012f\3\2\2\2W\u0132\3\2\2\2Y\u0135\3\2\2\2[\u013b\3\2\2\2]\u0143"+
		"\3\2\2\2_\u0148\3\2\2\2a\u014e\3\2\2\2cd\7r\2\2de\7t\2\2ef\7q\2\2fg\7"+
		"i\2\2gh\7t\2\2hi\7c\2\2ij\7o\2\2j\4\3\2\2\2kl\7=\2\2l\6\3\2\2\2mn\7\60"+
		"\2\2n\b\3\2\2\2op\7x\2\2pq\7c\2\2qr\7t\2\2r\n\3\2\2\2st\7d\2\2tu\7g\2"+
		"\2uv\7i\2\2vw\7k\2\2wx\7p\2\2x\f\3\2\2\2yz\7g\2\2z{\7p\2\2{|\7f\2\2|\16"+
		"\3\2\2\2}~\7e\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081"+
		"\u0082\7u\2\2\u0082\20\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7z\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7f\2\2"+
		"\u0089\u008a\7u\2\2\u008a\22\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7"+
		"o\2\2\u008d\u008e\7r\2\2\u008e\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7u\2\2\u0095\24\3\2\2\2\u0096\u0097\7}\2\2\u0097\26\3\2\2\2\u0098"+
		"\u0099\7\177\2\2\u0099\30\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2"+
		"\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\32\3\2\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7w\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7"+
		"*\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7+\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7"+
		"<\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7q\2\2"+
		"\u00be\u00bf\7t\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2"+
		"\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7w\2\2\u00cd"+
		"\u00ce\7d\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7e\2\2"+
		"\u00d1(\3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2"+
		"\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9*\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7e\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7f\2\2\u00e3,\3\2\2\2\u00e4"+
		"\u00e5\7<\2\2\u00e5\u00e6\7?\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8"+
		"\60\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7h\2\2\u00eb\62\3\2\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2"+
		"\u00f0\64\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7"+
		"u\2\2\u00f4\u00f5\7g\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"8\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7q\2\2\u00fe:\3\2\2\2\u00ff\u0100"+
		"\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102<\3\2\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7q\2\2\u0105>\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2\u010b"+
		"@\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7w\2\2"+
		"\u0113\u0114\7g\2\2\u0114B\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7w\2"+
		"\2\u0117\u0118\7p\2\2\u0118\u0119\7e\2\2\u0119\u011a\7v\2\2\u011a\u011b"+
		"\7k\2\2\u011b\u011c\7q\2\2\u011c\u011d\7p\2\2\u011dD\3\2\2\2\u011e\u011f"+
		"\7,\2\2\u011fF\3\2\2\2\u0120\u0121\7\61\2\2\u0121H\3\2\2\2\u0122\u0123"+
		"\7-\2\2\u0123J\3\2\2\2\u0124\u0125\7/\2\2\u0125L\3\2\2\2\u0126\u0127\7"+
		"?\2\2\u0127N\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7@\2\2\u012aP\3\2"+
		"\2\2\u012b\u012c\7>\2\2\u012cR\3\2\2\2\u012d\u012e\7@\2\2\u012eT\3\2\2"+
		"\2\u012f\u0130\7>\2\2\u0130\u0131\7?\2\2\u0131V\3\2\2\2\u0132\u0133\7"+
		"@\2\2\u0133\u0134\7?\2\2\u0134X\3\2\2\2\u0135\u0136\7r\2\2\u0136\u0137"+
		"\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a\7v\2\2\u013a"+
		"Z\3\2\2\2\u013b\u013f\t\2\2\2\u013c\u013e\t\3\2\2\u013d\u013c\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\\\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\t\4\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146^\3\2\2\2"+
		"\u0147\u0149\t\5\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\60\2\2"+
		"\u014d`\3\2\2\2\u014e\u014f\7\61\2\2\u014f\u0150\7\61\2\2\u0150\u0154"+
		"\3\2\2\2\u0151\u0153\n\6\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0158\b\61\2\2\u0158b\3\2\2\2\7\2\u013f\u0145\u014a\u0154\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}