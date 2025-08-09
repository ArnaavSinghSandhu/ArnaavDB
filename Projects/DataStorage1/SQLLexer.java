// Generated from /Users/arnaavsinghsandhu/Projects/SQL.g4 by ANTLR 4.13.2
package DataStorage1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		WHERE=10, INSERT=11, INTO=12, VALUES=13, AND=14, OR=15, UPDATE=16, SET=17, 
		FLOAT=18, STRING=19, IDENTIFIER=20, INT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SELECT", "FROM", 
			"WHERE", "INSERT", "INTO", "VALUES", "AND", "OR", "UPDATE", "SET", "FLOAT", 
			"STRING", "IDENTIFIER", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'('", "')'", "'>'", "'<'", "'SELECT'", "'FROM'", 
			"'WHERE'", "'INSERT'", "'INTO'", "'VALUES'", "'AND'", "'OR'", "'UPDATE'", 
			"'SET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE", 
			"INSERT", "INTO", "VALUES", "AND", "OR", "UPDATE", "SET", "FLOAT", "STRING", 
			"IDENTIFIER", "INT", "WS"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

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
		"\u0004\u0000\u0016\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0004\u0011t\b\u0011\u000b\u0011\f\u0011"+
		"u\u0001\u0011\u0001\u0011\u0004\u0011z\b\u0011\u000b\u0011\f\u0011{\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0082\b\u0012\n"+
		"\u0012\f\u0012\u0085\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u008b\b\u0013\n\u0013\f\u0013\u008e\t\u0013\u0001\u0014"+
		"\u0004\u0014\u0091\b\u0014\u000b\u0014\f\u0014\u0092\u0001\u0015\u0004"+
		"\u0015\u0096\b\u0015\u000b\u0015\f\u0015\u0097\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016\u0001\u0000\u0005\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00a1\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000"+
		"\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001"+
		"\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000"+
		"\u0000\u000f;\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017T\u0001"+
		"\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000"+
		"\u0000\u001dd\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000!"+
		"n\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u0088\u0001\u0000\u0000\u0000)\u0090\u0001\u0000\u0000\u0000"+
		"+\u0095\u0001\u0000\u0000\u0000-.\u0005;\u0000\u0000.\u0002\u0001\u0000"+
		"\u0000\u0000/0\u0005,\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005"+
		"=\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\b\u0001"+
		"\u0000\u0000\u000056\u0005)\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005"+
		">\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005<\u0000\u0000:\u000e\u0001"+
		"\u0000\u0000\u0000;<\u0005S\u0000\u0000<=\u0005E\u0000\u0000=>\u0005L"+
		"\u0000\u0000>?\u0005E\u0000\u0000?@\u0005C\u0000\u0000@A\u0005T\u0000"+
		"\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005F\u0000\u0000CD\u0005R\u0000"+
		"\u0000DE\u0005O\u0000\u0000EF\u0005M\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GH\u0005W\u0000\u0000HI\u0005H\u0000\u0000IJ\u0005E\u0000\u0000"+
		"JK\u0005R\u0000\u0000KL\u0005E\u0000\u0000L\u0014\u0001\u0000\u0000\u0000"+
		"MN\u0005I\u0000\u0000NO\u0005N\u0000\u0000OP\u0005S\u0000\u0000PQ\u0005"+
		"E\u0000\u0000QR\u0005R\u0000\u0000RS\u0005T\u0000\u0000S\u0016\u0001\u0000"+
		"\u0000\u0000TU\u0005I\u0000\u0000UV\u0005N\u0000\u0000VW\u0005T\u0000"+
		"\u0000WX\u0005O\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005V\u0000"+
		"\u0000Z[\u0005A\u0000\u0000[\\\u0005L\u0000\u0000\\]\u0005U\u0000\u0000"+
		"]^\u0005E\u0000\u0000^_\u0005S\u0000\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"`a\u0005A\u0000\u0000ab\u0005N\u0000\u0000bc\u0005D\u0000\u0000c\u001c"+
		"\u0001\u0000\u0000\u0000de\u0005O\u0000\u0000ef\u0005R\u0000\u0000f\u001e"+
		"\u0001\u0000\u0000\u0000gh\u0005U\u0000\u0000hi\u0005P\u0000\u0000ij\u0005"+
		"D\u0000\u0000jk\u0005A\u0000\u0000kl\u0005T\u0000\u0000lm\u0005E\u0000"+
		"\u0000m \u0001\u0000\u0000\u0000no\u0005S\u0000\u0000op\u0005E\u0000\u0000"+
		"pq\u0005T\u0000\u0000q\"\u0001\u0000\u0000\u0000rt\u0007\u0000\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0005.\u0000"+
		"\u0000xz\u0007\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|$\u0001"+
		"\u0000\u0000\u0000}\u0083\u0005\"\u0000\u0000~\u0082\b\u0001\u0000\u0000"+
		"\u007f\u0080\u0005\\\u0000\u0000\u0080\u0082\t\u0000\u0000\u0000\u0081"+
		"~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087&\u0001"+
		"\u0000\u0000\u0000\u0088\u008c\u0007\u0002\u0000\u0000\u0089\u008b\u0007"+
		"\u0003\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0007\u0000\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093*\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0007\u0004\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0006\u0015\u0000\u0000\u009a,\u0001\u0000\u0000\u0000"+
		"\b\u0000u{\u0081\u0083\u008c\u0092\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}