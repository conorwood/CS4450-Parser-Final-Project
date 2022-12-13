// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DEDENT=12, WS=13, TAB=14, NUM=15, INT=16, FLOAT=17, 
		BOOL=18, STRING=19, SINGLE_LINE_COMMENT=20, MULTI_LINE_COMMENT=21, COLON=22, 
		FOR=23, PLUS=24, MINUS=25, MULTIPLY=26, DIVIDE=27, MOD=28, ASSIGN=29, 
		PLUS_EQUAL=30, MINUS_EQUAL=31, MULTI_EQUAL=32, DIVIDE_EQUAL=33, MOD_EQUAL=34, 
		EQUAL_EQUAL=35, DOESNOT_EQUAL=36, LESS_THAN=37, LESS_THAN_EQUAL=38, GREATER_THAN=39, 
		GREATER_THAN_EQUAL=40, AND=41, OR=42, VAR_NAME=43, ANYTHING=44;
	public static final int
		RULE_arithmetic_operations = 0, RULE_assignment_operations = 1, RULE_conditional_statements = 2, 
		RULE_if_else_block = 3, RULE_while_block = 4, RULE_for_block = 5, RULE_comments = 6, 
		RULE_arg_types = 7, RULE_function_args = 8, RULE_function_call_args = 9, 
		RULE_function_call = 10, RULE_function_declaration = 11, RULE_function_block = 12, 
		RULE_block = 13, RULE_statement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_operations", "assignment_operations", "conditional_statements", 
			"if_else_block", "while_block", "for_block", "comments", "arg_types", 
			"function_args", "function_call_args", "function_call", "function_declaration", 
			"function_block", "block", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'):'", "'\\n'", "'elif'", "'else:'", "'while'", 
			"'for ('", "','", "'def '", "'\\n]'", null, "'    '", null, null, null, 
			null, null, null, null, "':'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DEDENT", "WS", "TAB", "NUM", "INT", "FLOAT", "BOOL", "STRING", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "COLON", "FOR", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MOD", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", "MULTI_EQUAL", "DIVIDE_EQUAL", 
			"MOD_EQUAL", "EQUAL_EQUAL", "DOESNOT_EQUAL", "LESS_THAN", "LESS_THAN_EQUAL", 
			"GREATER_THAN", "GREATER_THAN_EQUAL", "AND", "OR", "VAR_NAME", "ANYTHING"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(31);
				match(T__0);
				setState(32);
				arithmetic_operations(0);
				setState(33);
				match(T__1);
				}
				break;
			case NUM:
				{
				setState(35);
				match(NUM);
				}
				break;
			case VAR_NAME:
				{
				setState(36);
				match(VAR_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(39);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(40);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(41);
								arithmetic_operations(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(44); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(48);
								arithmetic_operations(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(51); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(59);
				match(T__0);
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(60);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(61);
					arithmetic_operations(0);
					}
					break;
				}
				setState(64);
				match(T__1);
				}
				break;
			case VAR_NAME:
				{
				setState(66);
				match(VAR_NAME);
				}
				break;
			case FLOAT:
				{
				setState(67);
				match(FLOAT);
				}
				break;
			case INT:
				{
				setState(68);
				match(INT);
				}
				break;
			case NUM:
				{
				setState(69);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(70);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						match(ASSIGN);
						setState(76); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(75);
								assignment_operations(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(78); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996544L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(82);
								assignment_operations(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(85); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementsContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode FLOAT() { return getToken(gParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(gParser.INT, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public List<Conditional_statementsContext> conditional_statements() {
			return getRuleContexts(Conditional_statementsContext.class);
		}
		public Conditional_statementsContext conditional_statements(int i) {
			return getRuleContext(Conditional_statementsContext.class,i);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(gParser.EQUAL_EQUAL, 0); }
		public TerminalNode DOESNOT_EQUAL() { return getToken(gParser.DOESNOT_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(gParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(gParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(gParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(gParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public Conditional_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterConditional_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitConditional_statements(this);
		}
	}

	public final Conditional_statementsContext conditional_statements() throws RecognitionException {
		return conditional_statements(0);
	}

	private Conditional_statementsContext conditional_statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Conditional_statementsContext _localctx = new Conditional_statementsContext(_ctx, _parentState);
		Conditional_statementsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_conditional_statements, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(93);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(94);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(95);
				match(INT);
				}
				break;
			case 5:
				{
				setState(96);
				match(NUM);
				}
				break;
			case 6:
				{
				setState(97);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(100);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==DOESNOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						conditional_statements(10);
						}
						break;
					case 2:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==LESS_THAN || _la==LESS_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						conditional_statements(9);
						}
						break;
					case 3:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(106);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(107);
						_la = _input.LA(1);
						if ( !(_la==GREATER_THAN || _la==GREATER_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						conditional_statements(8);
						}
						break;
					case 4:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(109);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(110);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						conditional_statements(7);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_blockContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(gParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(gParser.TAB, i);
		}
		public List<Conditional_statementsContext> conditional_statements() {
			return getRuleContexts(Conditional_statementsContext.class);
		}
		public Conditional_statementsContext conditional_statements(int i) {
			return getRuleContext(Conditional_statementsContext.class,i);
		}
		public List<TerminalNode> BOOL() { return getTokens(gParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(gParser.BOOL, i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(gParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(gParser.VAR_NAME, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterIf_else_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitIf_else_block(this);
		}
	}

	public final If_else_blockContext if_else_block() throws RecognitionException {
		If_else_blockContext _localctx = new If_else_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__2);
			setState(118);
			match(T__0);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(119);
				conditional_statements(0);
				}
				break;
			case 2:
				{
				setState(120);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(121);
				match(VAR_NAME);
				}
				break;
			}
			setState(124);
			match(T__3);
			setState(125);
			match(T__4);
			setState(126);
			match(TAB);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093778722L) != 0) {
				{
				{
				setState(127);
				block();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(133);
				match(T__5);
				setState(134);
				match(T__0);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(135);
					conditional_statements(0);
					}
					break;
				case 2:
					{
					setState(136);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(137);
					match(VAR_NAME);
					}
					break;
				}
				setState(140);
				match(T__3);
				setState(141);
				match(T__4);
				setState(142);
				match(TAB);
				setState(143);
				block();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(149);
				match(T__6);
				setState(150);
				match(T__4);
				setState(151);
				match(TAB);
				setState(152);
				block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_blockContext extends ParserRuleContext {
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitWhile_block(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_block);
		try {
			int _alt;
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__7);
				setState(156);
				match(T__0);
				setState(157);
				assignment_operations(0);
				setState(158);
				match(T__3);
				setState(159);
				match(T__4);
				setState(160);
				match(TAB);
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						block();
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__7);
				setState(168);
				match(T__0);
				setState(169);
				conditional_statements(0);
				setState(170);
				match(T__3);
				setState(171);
				match(T__4);
				setState(172);
				match(TAB);
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						block();
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_blockContext extends ParserRuleContext {
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_block);
		try {
			int _alt;
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__8);
				setState(182);
				assignment_operations(0);
				setState(183);
				match(T__3);
				setState(184);
				match(T__4);
				setState(185);
				match(TAB);
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						block();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__8);
				setState(193);
				conditional_statements(0);
				setState(194);
				match(T__3);
				setState(195);
				match(T__4);
				setState(196);
				match(TAB);
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197);
						block();
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentsContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_LINE_COMMENT() { return getTokens(gParser.SINGLE_LINE_COMMENT); }
		public TerminalNode SINGLE_LINE_COMMENT(int i) {
			return getToken(gParser.SINGLE_LINE_COMMENT, i);
		}
		public List<TerminalNode> MULTI_LINE_COMMENT() { return getTokens(gParser.MULTI_LINE_COMMENT); }
		public TerminalNode MULTI_LINE_COMMENT(int i) {
			return getToken(gParser.MULTI_LINE_COMMENT, i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitComments(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_typesContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public Arg_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterArg_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitArg_types(this);
		}
	}

	public final Arg_typesContext arg_types() throws RecognitionException {
		Arg_typesContext _localctx = new Arg_typesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093841408L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_argsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(gParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(gParser.VAR_NAME, i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_args(this);
		}
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			match(VAR_NAME);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(214);
				match(T__9);
				setState(215);
				match(VAR_NAME);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_argsContext extends ParserRuleContext {
		public List<Arg_typesContext> arg_types() {
			return getRuleContexts(Arg_typesContext.class);
		}
		public Arg_typesContext arg_types(int i) {
			return getRuleContext(Arg_typesContext.class,i);
		}
		public Function_call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_call_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_call_args(this);
		}
	}

	public final Function_call_argsContext function_call_args() throws RecognitionException {
		Function_call_argsContext _localctx = new Function_call_argsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			arg_types();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(222);
				match(T__9);
				setState(223);
				arg_types();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<Function_call_argsContext> function_call_args() {
			return getRuleContexts(Function_call_argsContext.class);
		}
		public Function_call_argsContext function_call_args(int i) {
			return getRuleContext(Function_call_argsContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(VAR_NAME);
			setState(230);
			match(T__0);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093841408L) != 0) {
				{
				{
				setState(231);
				function_call_args();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<Function_argsContext> function_args() {
			return getRuleContexts(Function_argsContext.class);
		}
		public Function_argsContext function_args(int i) {
			return getRuleContext(Function_argsContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__10);
			setState(240);
			match(VAR_NAME);
			setState(241);
			match(T__0);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME) {
				{
				{
				setState(242);
				function_args();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			function_declaration();
			setState(251);
			match(T__4);
			setState(252);
			match(TAB);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093778722L) != 0) {
				{
				{
				setState(253);
				block();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case T__8:
			case T__10:
			case NUM:
			case INT:
			case FLOAT:
			case STRING:
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__4);
				setState(261);
				match(TAB);
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public Arithmetic_operationsContext arithmetic_operations() {
			return getRuleContext(Arithmetic_operationsContext.class,0);
		}
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				while_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				for_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				arithmetic_operations(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				assignment_operations(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				function_declaration();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return arithmetic_operations_sempred((Arithmetic_operationsContext)_localctx, predIndex);
		case 1:
			return assignment_operations_sempred((Assignment_operationsContext)_localctx, predIndex);
		case 2:
			return conditional_statements_sempred((Conditional_statementsContext)_localctx, predIndex);
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
	private boolean conditional_statements_sempred(Conditional_statementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0116\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000+\b\u0000\u000b"+
		"\u0000\f\u0000,\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00002\b\u0000"+
		"\u000b\u0000\f\u00003\u0005\u00006\b\u0000\n\u0000\f\u00009\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001?\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001H\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001M\b\u0001\u000b\u0001\f\u0001N\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001T\b\u0001\u000b\u0001\f\u0001U\u0005\u0001X\b\u0001\n\u0001"+
		"\f\u0001[\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002q\b\u0002\n\u0002"+
		"\f\u0002t\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003{\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0081\b\u0003\n\u0003\f\u0003\u0084\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008b\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0091\b\u0003"+
		"\n\u0003\f\u0003\u0094\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u009a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a3\b\u0004\n"+
		"\u0004\f\u0004\u00a6\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00af\b\u0004\n"+
		"\u0004\f\u0004\u00b2\t\u0004\u0003\u0004\u00b4\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bc"+
		"\b\u0005\n\u0005\f\u0005\u00bf\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c7\b\u0005\n\u0005"+
		"\f\u0005\u00ca\t\u0005\u0003\u0005\u00cc\b\u0005\u0001\u0006\u0005\u0006"+
		"\u00cf\b\u0006\n\u0006\f\u0006\u00d2\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00d9\b\b\n\b\f\b\u00dc\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00e1\b\t\n\t\f\t\u00e4\t\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00e9\b\n\n\n\f\n\u00ec\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f4\b\u000b\n\u000b\f\u000b\u00f7"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00ff\b\f\n\f\f\f\u0102\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r"+
		"\u0108\b\r\u000b\r\f\r\u0109\u0003\r\u010c\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0114\b\u000e"+
		"\u0001\u000e\u0000\u0003\u0000\u0002\u0004\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\t\u0001\u0000"+
		"\u001a\u001c\u0001\u0000\u0018\u0019\u0001\u0000\u001e\"\u0001\u0000#"+
		"$\u0001\u0000%&\u0001\u0000\'(\u0001\u0000)*\u0001\u0000\u0014\u0015\u0003"+
		"\u0000\u000f\u000f\u0012\u0013++\u0139\u0000%\u0001\u0000\u0000\u0000"+
		"\u0002G\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006u"+
		"\u0001\u0000\u0000\u0000\b\u00b3\u0001\u0000\u0000\u0000\n\u00cb\u0001"+
		"\u0000\u0000\u0000\f\u00d0\u0001\u0000\u0000\u0000\u000e\u00d3\u0001\u0000"+
		"\u0000\u0000\u0010\u00d5\u0001\u0000\u0000\u0000\u0012\u00dd\u0001\u0000"+
		"\u0000\u0000\u0014\u00e5\u0001\u0000\u0000\u0000\u0016\u00ef\u0001\u0000"+
		"\u0000\u0000\u0018\u00fa\u0001\u0000\u0000\u0000\u001a\u010b\u0001\u0000"+
		"\u0000\u0000\u001c\u0113\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0000"+
		"\uffff\uffff\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003\u0000\u0000"+
		"\u0000!\"\u0005\u0002\u0000\u0000\"&\u0001\u0000\u0000\u0000#&\u0005\u000f"+
		"\u0000\u0000$&\u0005+\u0000\u0000%\u001e\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&7\u0001\u0000\u0000\u0000"+
		"\'(\n\u0004\u0000\u0000(*\u0007\u0000\u0000\u0000)+\u0003\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-6\u0001\u0000\u0000\u0000./\n\u0003"+
		"\u0000\u0000/1\u0007\u0001\u0000\u000002\u0003\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u00005\'\u0001\u0000\u0000"+
		"\u00005.\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008\u0001\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0006\u0001\uffff\uffff\u0000;>\u0005\u0001"+
		"\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0002\u0000\u0000AH\u0001\u0000\u0000\u0000BH\u0005+\u0000\u0000"+
		"CH\u0005\u0011\u0000\u0000DH\u0005\u0010\u0000\u0000EH\u0005\u000f\u0000"+
		"\u0000FH\u0005\u0013\u0000\u0000G:\u0001\u0000\u0000\u0000GB\u0001\u0000"+
		"\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HY\u0001\u0000\u0000\u0000"+
		"IJ\n\u0007\u0000\u0000JL\u0005\u001d\u0000\u0000KM\u0003\u0002\u0001\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OX\u0001\u0000\u0000\u0000PQ\n\u0006\u0000"+
		"\u0000QS\u0007\u0002\u0000\u0000RT\u0003\u0002\u0001\u0000SR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WI\u0001\u0000\u0000\u0000"+
		"WP\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\c\u0006\u0002\uffff\uffff\u0000]c\u0005+\u0000\u0000"+
		"^c\u0005\u0011\u0000\u0000_c\u0005\u0010\u0000\u0000`c\u0005\u000f\u0000"+
		"\u0000ac\u0005\u0013\u0000\u0000b\\\u0001\u0000\u0000\u0000b]\u0001\u0000"+
		"\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cr\u0001\u0000\u0000\u0000"+
		"de\n\t\u0000\u0000ef\u0007\u0003\u0000\u0000fq\u0003\u0004\u0002\ngh\n"+
		"\b\u0000\u0000hi\u0007\u0004\u0000\u0000iq\u0003\u0004\u0002\tjk\n\u0007"+
		"\u0000\u0000kl\u0007\u0005\u0000\u0000lq\u0003\u0004\u0002\bmn\n\u0006"+
		"\u0000\u0000no\u0007\u0006\u0000\u0000oq\u0003\u0004\u0002\u0007pd\u0001"+
		"\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000"+
		"pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0003\u0000\u0000vz\u0005\u0001\u0000\u0000"+
		"w{\u0003\u0004\u0002\u0000x{\u0005\u0012\u0000\u0000y{\u0005+\u0000\u0000"+
		"zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000}~\u0005\u0005"+
		"\u0000\u0000~\u0082\u0005\u000e\u0000\u0000\u007f\u0081\u0003\u001a\r"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0092\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086\u008a\u0005\u0001\u0000"+
		"\u0000\u0087\u008b\u0003\u0004\u0002\u0000\u0088\u008b\u0005\u0012\u0000"+
		"\u0000\u0089\u008b\u0005+\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0004\u0000\u0000"+
		"\u008d\u008e\u0005\u0005\u0000\u0000\u008e\u008f\u0005\u000e\u0000\u0000"+
		"\u008f\u0091\u0003\u001a\r\u0000\u0090\u0085\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096"+
		"\u0097\u0005\u0005\u0000\u0000\u0097\u0098\u0005\u000e\u0000\u0000\u0098"+
		"\u009a\u0003\u001a\r\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\b\u0000\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u009e\u0003"+
		"\u0002\u0001\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0\u0005"+
		"\u0005\u0000\u0000\u00a0\u00a4\u0005\u000e\u0000\u0000\u00a1\u00a3\u0003"+
		"\u001a\r\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b4\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0005\u0001\u0000"+
		"\u0000\u00a9\u00aa\u0003\u0004\u0002\u0000\u00aa\u00ab\u0005\u0004\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u00b0\u0005\u000e\u0000"+
		"\u0000\u00ad\u00af\u0003\u001a\r\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u009b\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b4\t\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\t\u0000\u0000\u00b6\u00b7\u0003\u0002\u0001\u0000\u00b7\u00b8"+
		"\u0005\u0004\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u00bd"+
		"\u0005\u000e\u0000\u0000\u00ba\u00bc\u0003\u001a\r\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00cc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"\t\u0000\u0000\u00c1\u00c2\u0003\u0004\u0002\u0000\u00c2\u00c3\u0005\u0004"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0005\u0000\u0000\u00c4\u00c8\u0005\u000e"+
		"\u0000\u0000\u00c5\u00c7\u0003\u001a\r\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00b5\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c0\u0001\u0000\u0000\u0000\u00cc\u000b\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0007\u0007\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\r\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\b\u0000\u0000\u00d4"+
		"\u000f\u0001\u0000\u0000\u0000\u00d5\u00da\u0005+\u0000\u0000\u00d6\u00d7"+
		"\u0005\n\u0000\u0000\u00d7\u00d9\u0005+\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u0011\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e2\u0003"+
		"\u000e\u0007\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e1\u0003\u000e"+
		"\u0007\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u0013\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005+\u0000\u0000\u00e6\u00ea\u0005\u0001\u0000"+
		"\u0000\u00e7\u00e9\u0003\u0012\t\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000"+
		"\u00ee\u0015\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000b\u0000\u0000"+
		"\u00f0\u00f1\u0005+\u0000\u0000\u00f1\u00f5\u0005\u0001\u0000\u0000\u00f2"+
		"\u00f4\u0003\u0010\b\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0004\u0000\u0000\u00f9\u0017"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\u0016\u000b\u0000\u00fb\u00fc"+
		"\u0005\u0005\u0000\u0000\u00fc\u0100\u0005\u000e\u0000\u0000\u00fd\u00ff"+
		"\u0003\u001a\r\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0019\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u010c\u0003\u001c\u000e\u0000\u0104\u0105\u0005"+
		"\u0005\u0000\u0000\u0105\u0107\u0005\u000e\u0000\u0000\u0106\u0108\u0003"+
		"\u001c\u000e\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0103\u0001"+
		"\u0000\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010c\u001b\u0001"+
		"\u0000\u0000\u0000\u010d\u0114\u0003\b\u0004\u0000\u010e\u0114\u0003\n"+
		"\u0005\u0000\u010f\u0114\u0003\u0000\u0000\u0000\u0110\u0114\u0003\u0002"+
		"\u0001\u0000\u0111\u0114\u0003\u0014\n\u0000\u0112\u0114\u0003\u0016\u000b"+
		"\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000"+
		"\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u001d\u0001\u0000\u0000\u0000\"%,357>GNUWYbprz\u0082\u008a"+
		"\u0092\u0099\u00a4\u00b0\u00b3\u00bd\u00c8\u00cb\u00d0\u00da\u00e2\u00ea"+
		"\u00f5\u0100\u0109\u010b\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}