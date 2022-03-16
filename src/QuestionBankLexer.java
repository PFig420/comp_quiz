// Generated from QuestionBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionBankLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, SEPARATOR=14, NEWLINE=15, COMMENT_SINGLE=16, 
		COMMENT_MULTI=17, TEXT=18, Integer=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "SEPARATOR", "NEWLINE", "COMMENT_SINGLE", 
			"COMMENT_MULTI", "TEXT", "Integer", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Theme'", "':'", "'end'", "'qmc'", "'-'", "'qm'", "','", "'t'", 
			"'f'", "'left'", "'right'", "'Match'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "SEPARATOR", "NEWLINE", "COMMENT_SINGLE", "COMMENT_MULTI", 
			"TEXT", "Integer", "WS"
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


	public QuestionBankLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QuestionBank.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\17\6\17`\n\17\r\17\16"+
		"\17a\3\17\7\17e\n\17\f\17\16\17h\13\17\5\17j\n\17\3\20\5\20m\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21u\n\21\f\21\16\21x\13\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u0082\n\22\f\22\16\22\u0085\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u008e\n\23\f\23\16\23\u0091\13\23"+
		"\3\23\3\23\3\24\6\24\u0096\n\24\r\24\16\24\u0097\3\25\6\25\u009b\n\25"+
		"\r\25\16\25\u009c\3\25\3\25\5v\u0083\u008f\2\26\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26\3\2\4\3\2\62;\4\2\13\13\"\"\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3+\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\67\3\2\2\2\13;\3\2\2\2"+
		"\r=\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27K\3\2\2"+
		"\2\31Q\3\2\2\2\33W\3\2\2\2\35i\3\2\2\2\37l\3\2\2\2!p\3\2\2\2#}\3\2\2\2"+
		"%\u008b\3\2\2\2\'\u0095\3\2\2\2)\u009a\3\2\2\2+,\7V\2\2,-\7j\2\2-.\7g"+
		"\2\2./\7o\2\2/\60\7g\2\2\60\4\3\2\2\2\61\62\7<\2\2\62\6\3\2\2\2\63\64"+
		"\7g\2\2\64\65\7p\2\2\65\66\7f\2\2\66\b\3\2\2\2\678\7s\2\289\7o\2\29:\7"+
		"e\2\2:\n\3\2\2\2;<\7/\2\2<\f\3\2\2\2=>\7s\2\2>?\7o\2\2?\16\3\2\2\2@A\7"+
		".\2\2A\20\3\2\2\2BC\7v\2\2C\22\3\2\2\2DE\7h\2\2E\24\3\2\2\2FG\7n\2\2G"+
		"H\7g\2\2HI\7h\2\2IJ\7v\2\2J\26\3\2\2\2KL\7t\2\2LM\7k\2\2MN\7i\2\2NO\7"+
		"j\2\2OP\7v\2\2P\30\3\2\2\2QR\7O\2\2RS\7c\2\2ST\7v\2\2TU\7e\2\2UV\7j\2"+
		"\2V\32\3\2\2\2WX\7-\2\2X\34\3\2\2\2Y[\5\37\20\2ZY\3\2\2\2[\\\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]j\3\2\2\2^`\7=\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2bf\3\2\2\2ce\5\37\20\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2iZ\3\2\2\2i_\3\2\2\2j\36\3\2\2\2km\7\17\2\2lk\3"+
		"\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2o \3\2\2\2pq\7\61\2\2qr\7\61\2\2r"+
		"v\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2yz\5\37\20\2z{\3\2\2\2{|\b\21\2\2|\"\3\2\2\2}~\7\61\2\2~\177"+
		"\7,\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7,\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\b\22\2\2\u008a$\3\2\2\2\u008b\u008f\7$\2\2"+
		"\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7$\2\2\u0093&\3\2\2\2\u0094\u0096\t\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098(\3\2\2\2"+
		"\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\25\2\2"+
		"\u009f*\3\2\2\2\r\2\\afilv\u0083\u008f\u0097\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}