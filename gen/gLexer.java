// Generated from /Users/dillahuntym/Documents/Fall_2022/CS4450-PoPL/CS4450-Parser-Final-Project/src/g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, NUM=4, INT=5, FLOAT=6, BOOL=7, STRING=8, PLUS=9, 
		MINUS=10, MULTIPLY=11, DIVIDE=12, MOD=13, ASSIGN=14, PLUS_EQUAL=15, MINUS_EQUAL=16, 
		MULTI_EQUAL=17, DIVIDE_EQUAL=18, MOD_EQUAL=19, VAR_NAME=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "NUM", "INT", "FLOAT", "BOOL", "STRING", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MULTI_EQUAL", "DIVIDE_EQUAL", "MOD_EQUAL", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "NUM", "INT", "FLOAT", "BOOL", "STRING", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MULTI_EQUAL", "DIVIDE_EQUAL", "MOD_EQUAL", "VAR_NAME"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\u0004\u0000\u0014\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002/\b\u0002\u000b\u0002"+
		"\f\u00020\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u00036\b\u0003\u0001"+
		"\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003\u0005"+
		"\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0004\u0003E\b\u0003"+
		"\u000b\u0003\f\u0003F\u0001\u0004\u0004\u0004J\b\u0004\u000b\u0004\f\u0004"+
		"K\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005\f\u0005P\u0001\u0005\u0001"+
		"\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007i\b\u0007\n\u0007\f\u0007l\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008d\b\u0013\n\u0013"+
		"\f\u0013\u0090\t\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"--\u0001\u000009\u0001\u0000..\u0002\u0000\"\"\\\\\u0004\u0000\n\n\r\r"+
		"\"\"\\\\\u0003\u0000AZ__az\u0004\u000009AZ__az\u009c\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000"+
		"\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000"+
		"\tI\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rb\u0001\u0000"+
		"\u0000\u0000\u000fd\u0001\u0000\u0000\u0000\u0011o\u0001\u0000\u0000\u0000"+
		"\u0013q\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000\u0000\u0017u"+
		"\u0001\u0000\u0000\u0000\u0019w\u0001\u0000\u0000\u0000\u001by\u0001\u0000"+
		"\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000"+
		"!\u0081\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000%\u0087"+
		"\u0001\u0000\u0000\u0000\'\u008a\u0001\u0000\u0000\u0000)*\u0005(\u0000"+
		"\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000,\u0004\u0001"+
		"\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0006\u0002\u0000\u00003\u0006\u0001"+
		"\u0000\u0000\u000046\u0007\u0001\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006:\u0001\u0000\u0000\u000079\u0007\u0002\u0000"+
		"\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=?\u0007\u0003\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0007\u0002"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\b\u0001\u0000\u0000\u0000"+
		"HJ\u0007\u0002\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\n\u0001\u0000"+
		"\u0000\u0000MO\u0003\t\u0004\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RV\u0005.\u0000\u0000SU\u0003\t\u0004\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\f\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000YZ\u0005T\u0000\u0000Z[\u0005R\u0000\u0000[\\\u0005U\u0000\u0000"+
		"\\c\u0005E\u0000\u0000]^\u0005F\u0000\u0000^_\u0005A\u0000\u0000_`\u0005"+
		"L\u0000\u0000`a\u0005S\u0000\u0000ac\u0005E\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000c\u000e\u0001\u0000\u0000\u0000"+
		"dj\u0005\"\u0000\u0000ef\u0005\\\u0000\u0000fi\u0007\u0004\u0000\u0000"+
		"gi\b\u0005\u0000\u0000he\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\"\u0000"+
		"\u0000n\u0010\u0001\u0000\u0000\u0000op\u0005+\u0000\u0000p\u0012\u0001"+
		"\u0000\u0000\u0000qr\u0005-\u0000\u0000r\u0014\u0001\u0000\u0000\u0000"+
		"st\u0005*\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0005/\u0000\u0000"+
		"v\u0018\u0001\u0000\u0000\u0000wx\u0005%\u0000\u0000x\u001a\u0001\u0000"+
		"\u0000\u0000yz\u0005=\u0000\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005"+
		"+\u0000\u0000|}\u0005=\u0000\u0000}\u001e\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005-\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080 \u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005*\u0000\u0000\u0082\u0083\u0005=\u0000\u0000"+
		"\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085\u0005/\u0000\u0000\u0085"+
		"\u0086\u0005=\u0000\u0000\u0086$\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"%\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089&\u0001\u0000\u0000"+
		"\u0000\u008a\u008e\u0007\u0006\u0000\u0000\u008b\u008d\u0007\u0007\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f(\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\r\u000005:@FKPVbhj\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}