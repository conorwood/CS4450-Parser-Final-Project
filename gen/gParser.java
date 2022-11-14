// Generated from /Users/dillahuntym/Documents/Fall_2022/CS4450-PoPL/CS4450-Parser-Final-Project/src/g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, NUM=4, INT=5, FLOAT=6, BOOL=7, STRING=8, PLUS=9, 
		MINUS=10, MULTIPLY=11, DIVIDE=12, MOD=13, ASSIGN=14, PLUS_EQUAL=15, MINUS_EQUAL=16, 
		MULTI_EQUAL=17, DIVIDE_EQUAL=18, MOD_EQUAL=19, VAR_NAME=20;
	public static final int
		RULE_arithmetic_operations = 0, RULE_assignment_operations = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_operations", "assignment_operations"
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

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Arithmetic_operationsContext extends ParserRuleContext {
		public List<Arithmetic_operationsContext> arithmetic_operations() {
			return getRuleContexts(Arithmetic_operationsContext.class);
		}
		public Arithmetic_operationsContext arithmetic_operations(int i) {
			return getRuleContext(Arithmetic_operationsContext.class,i);
		}
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode MULTIPLY() { return getToken(gParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(gParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public Arithmetic_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArithmetic_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArithmetic_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArithmetic_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operationsContext arithmetic_operations() throws RecognitionException {
		return arithmetic_operations(0);
	}

	private Arithmetic_operationsContext arithmetic_operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_operationsContext _localctx = new Arithmetic_operationsContext(_ctx, _parentState);
		Arithmetic_operationsContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_arithmetic_operations, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(5);
				match(T__0);
				setState(6);
				arithmetic_operations(0);
				setState(7);
				match(T__1);
				}
				break;
			case NUM:
				{
				setState(9);
				match(NUM);
				}
				break;
			case VAR_NAME:
				{
				setState(10);
				match(VAR_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(19);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(13);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(14);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(15);
						arithmetic_operations(5);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(16);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(17);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(18);
						arithmetic_operations(4);
						}
						break;
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assignment_operationsContext extends ParserRuleContext {
		public List<Assignment_operationsContext> assignment_operations() {
			return getRuleContexts(Assignment_operationsContext.class);
		}
		public Assignment_operationsContext assignment_operations(int i) {
			return getRuleContext(Assignment_operationsContext.class,i);
		}
		public Arithmetic_operationsContext arithmetic_operations() {
			return getRuleContext(Arithmetic_operationsContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public TerminalNode PLUS_EQUAL() { return getToken(gParser.PLUS_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(gParser.MINUS_EQUAL, 0); }
		public TerminalNode MULTI_EQUAL() { return getToken(gParser.MULTI_EQUAL, 0); }
		public TerminalNode DIVIDE_EQUAL() { return getToken(gParser.DIVIDE_EQUAL, 0); }
		public TerminalNode MOD_EQUAL() { return getToken(gParser.MOD_EQUAL, 0); }
		public Assignment_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssignment_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssignment_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssignment_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operationsContext assignment_operations() throws RecognitionException {
		return assignment_operations(0);
	}

	private Assignment_operationsContext assignment_operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assignment_operationsContext _localctx = new Assignment_operationsContext(_ctx, _parentState);
		Assignment_operationsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_assignment_operations, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(25);
				match(T__0);
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(26);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(27);
					arithmetic_operations(0);
					}
					break;
				}
				setState(30);
				match(T__1);
				}
				break;
			case VAR_NAME:
				{
				setState(32);
				match(VAR_NAME);
				}
				break;
			case FLOAT:
				{
				setState(33);
				match(FLOAT);
				}
				break;
			case INT:
				{
				setState(34);
				match(INT);
				}
				break;
			case NUM:
				{
				setState(35);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(36);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(39);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(40);
						match(ASSIGN);
						setState(41);
						assignment_operations(8);
						}
						break;
					case 2:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(42);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(43);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_EQUAL) | (1L << MINUS_EQUAL) | (1L << MULTI_EQUAL) | (1L << DIVIDE_EQUAL) | (1L << MOD_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						assignment_operations(7);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return arithmetic_operations_sempred((Arithmetic_operationsContext)_localctx, predIndex);
		case 1:
			return assignment_operations_sempred((Assignment_operationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_operations_sempred(Arithmetic_operationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean assignment_operations_sempred(Assignment_operationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00143\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001"+
		"\n\u0001\f\u00011\t\u0001\u0001\u0001\u0000\u0002\u0000\u0002\u0002\u0000"+
		"\u0002\u0000\u0003\u0001\u0000\u000b\r\u0001\u0000\t\n\u0001\u0000\u000f"+
		"\u0013<\u0000\u000b\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u0004\u0005\u0006\u0000\uffff\uffff\u0000\u0005\u0006\u0005\u0001\u0000"+
		"\u0000\u0006\u0007\u0003\u0000\u0000\u0000\u0007\b\u0005\u0002\u0000\u0000"+
		"\b\f\u0001\u0000\u0000\u0000\t\f\u0005\u0004\u0000\u0000\n\f\u0005\u0014"+
		"\u0000\u0000\u000b\u0004\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u0015\u0001\u0000\u0000\u0000"+
		"\r\u000e\n\u0004\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000\u000f"+
		"\u0014\u0003\u0000\u0000\u0005\u0010\u0011\n\u0003\u0000\u0000\u0011\u0012"+
		"\u0007\u0001\u0000\u0000\u0012\u0014\u0003\u0000\u0000\u0004\u0013\r\u0001"+
		"\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019\u001c"+
		"\u0005\u0001\u0000\u0000\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d"+
		"\u0003\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0002\u0000\u0000\u001f&\u0001\u0000\u0000\u0000 &\u0005\u0014"+
		"\u0000\u0000!&\u0005\u0006\u0000\u0000\"&\u0005\u0005\u0000\u0000#&\u0005"+
		"\u0004\u0000\u0000$&\u0005\b\u0000\u0000%\u0018\u0001\u0000\u0000\u0000"+
		"% \u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&/\u0001\u0000"+
		"\u0000\u0000\'(\n\u0007\u0000\u0000()\u0005\u000e\u0000\u0000).\u0003"+
		"\u0002\u0001\b*+\n\u0006\u0000\u0000+,\u0007\u0002\u0000\u0000,.\u0003"+
		"\u0002\u0001\u0007-\'\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000\u0007"+
		"\u000b\u0013\u0015\u001c%-/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}