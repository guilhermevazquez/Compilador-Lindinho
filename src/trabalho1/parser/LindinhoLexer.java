// Generated from /home/akari/Projects/Lindinho/Compilador-Lindinho/src/main/antlr/Lindinho.g4 by ANTLR 4.2.2
package trabalho1.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LindinhoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		NUMERO=33, WS=34, COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'seminima'", "'fim_musica'", "'semifusa'", "'semicolcheia'", "'{'", "'}'", 
		"'fecha'", "'b'", "'semibreve'", "'colcheia'", "'ritornelo'", "'do'", 
		"'('", "'sol'", "'*'", "'menor'", "'pausa'", "'bq'", "'.'", "'re'", "'abre'", 
		"'si'", "'la'", "'mi'", "'fa'", "'x'", "'minima'", "'maior'", "'#'", "')'", 
		"'musica'", "'fusa'", "NUMERO", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NUMERO", 
		"WS", "COMMENT"
	};


	public LindinhoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lindinho.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0108\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\5\"\u00ed\n\"\3\"\6\"\u00f0\n\""+
		"\r\"\16\"\u00f1\3#\6#\u00f5\n#\r#\16#\u00f6\3#\3#\3$\3$\3$\3$\7$\u00ff"+
		"\n$\f$\16$\u0102\13$\3$\3$\3$\3$\3$\3\u0100\2%\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\3\5"+
		"\2\13\f\17\17\"\"\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5R\3\2\2\2\7]\3\2\2\2\tf\3\2\2\2\13"+
		"s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0089\3"+
		"\2\2\2\27\u0092\3\2\2\2\31\u009c\3\2\2\2\33\u009f\3\2\2\2\35\u00a1\3\2"+
		"\2\2\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00ad\3\2\2\2%\u00b3\3\2\2\2\'\u00b6"+
		"\3\2\2\2)\u00b8\3\2\2\2+\u00bb\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61"+
		"\u00c6\3\2\2\2\63\u00c9\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00db\3\2\2\2=\u00dd\3\2\2\2?\u00df\3\2\2\2A\u00e6\3\2\2\2C"+
		"\u00ec\3\2\2\2E\u00f4\3\2\2\2G\u00fa\3\2\2\2IJ\7u\2\2JK\7g\2\2KL\7o\2"+
		"\2LM\7k\2\2MN\7p\2\2NO\7k\2\2OP\7o\2\2PQ\7c\2\2Q\4\3\2\2\2RS\7h\2\2ST"+
		"\7k\2\2TU\7o\2\2UV\7a\2\2VW\7o\2\2WX\7w\2\2XY\7u\2\2YZ\7k\2\2Z[\7e\2\2"+
		"[\\\7c\2\2\\\6\3\2\2\2]^\7u\2\2^_\7g\2\2_`\7o\2\2`a\7k\2\2ab\7h\2\2bc"+
		"\7w\2\2cd\7u\2\2de\7c\2\2e\b\3\2\2\2fg\7u\2\2gh\7g\2\2hi\7o\2\2ij\7k\2"+
		"\2jk\7e\2\2kl\7q\2\2lm\7n\2\2mn\7e\2\2no\7j\2\2op\7g\2\2pq\7k\2\2qr\7"+
		"c\2\2r\n\3\2\2\2st\7}\2\2t\f\3\2\2\2uv\7\177\2\2v\16\3\2\2\2wx\7h\2\2"+
		"xy\7g\2\2yz\7e\2\2z{\7j\2\2{|\7c\2\2|\20\3\2\2\2}~\7d\2\2~\22\3\2\2\2"+
		"\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7o\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7d\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7x\2\2\u0087\u0088\7g\2\2\u0088\24\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7n\2\2\u008c\u008d\7e\2\2\u008d\u008e\7j\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7k\2\2\u0090\u0091\7c\2\2\u0091\26\3\2\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7q\2\2"+
		"\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7q\2\2\u009b\30\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e"+
		"\7q\2\2\u009e\32\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\34\3\2\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7n\2\2\u00a4\36\3\2\2\2\u00a5\u00a6"+
		"\7,\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\"\3\2\2\2\u00ad\u00ae"+
		"\7r\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7s\2\2\u00b5"+
		"&\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7d\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\60\3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7k\2\2\u00c8\62\3\2\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7z\2\2\u00cd"+
		"\66\3\2\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7c\2\2\u00d48\3\2\2\2\u00d5"+
		"\u00d6\7o\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7q\2\2"+
		"\u00d9\u00da\7t\2\2\u00da:\3\2\2\2\u00db\u00dc\7%\2\2\u00dc<\3\2\2\2\u00dd"+
		"\u00de\7+\2\2\u00de>\3\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7c\2\2"+
		"\u00e5@\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7u\2"+
		"\2\u00e9\u00ea\7c\2\2\u00eaB\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\4\62;\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2D\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b#\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7,\2\2\u00fc"+
		"\u0100\3\2\2\2\u00fd\u00ff\13\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7\61\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\b$\2\2\u0107H\3\2\2\2\7\2\u00ec\u00f1\u00f6\u0100\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}