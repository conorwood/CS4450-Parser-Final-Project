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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NL=15, WS=16, TAB=17, 
		NUM=18, INT=19, FLOAT=20, BOOL=21, STRING=22, SINGLE_LINE_COMMENT=23, 
		MULTI_LINE_COMMENT=24, COLON=25, FOR=26, PLUS=27, MINUS=28, MULTIPLY=29, 
		DIVIDE=30, MOD=31, ASSIGN=32, PLUS_EQUAL=33, MINUS_EQUAL=34, MULTI_EQUAL=35, 
		DIVIDE_EQUAL=36, MOD_EQUAL=37, EQUAL_EQUAL=38, DOESNOT_EQUAL=39, LESS_THAN=40, 
		LESS_THAN_EQUAL=41, GREATER_THAN=42, GREATER_THAN_EQUAL=43, AND=44, OR=45, 
		VAR_NAME=46, ANYTHING=47, INDENT=48, DEDENT=49;
	public static final int
		RULE_arithmetic_operations = 0, RULE_assignment_operations = 1, RULE_conditional_statements = 2, 
		RULE_if_else_block = 3, RULE_while_block = 4, RULE_for_block = 5, RULE_comments = 6, 
		RULE_function_args = 7, RULE_function_call_args = 8, RULE_function_call = 9, 
		RULE_function_declaration = 10, RULE_function_block = 11, RULE_block = 12, 
		RULE_statement = 13, RULE_denter_tester = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_operations", "assignment_operations", "conditional_statements", 
			"if_else_block", "while_block", "for_block", "comments", "function_args", 
			"function_call_args", "function_call", "function_declaration", "function_block", 
			"block", "statement", "denter_tester"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'):'", "'\\n'", "'elif'", "'else'", "'while'", 
			"'for ('", "','", "'def '", "'<-'", "'hello'", "'there'", null, null, 
			"'   '", null, null, null, null, null, null, null, "':'", "'for'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NL", "WS", "TAB", "NUM", "INT", "FLOAT", "BOOL", "STRING", 
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "COLON", "FOR", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MULTI_EQUAL", "DIVIDE_EQUAL", "MOD_EQUAL", "EQUAL_EQUAL", "DOESNOT_EQUAL", 
			"LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", 
			"AND", "OR", "VAR_NAME", "ANYTHING", "INDENT", "DEDENT"
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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(39);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(40);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						arithmetic_operations(5);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_operations);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						arithmetic_operations(4);
						}
						break;
					}
					} 
				}
				setState(49);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(51);
				match(T__0);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(53);
					arithmetic_operations(0);
					}
					break;
				}
				setState(56);
				match(T__1);
				}
				break;
			case VAR_NAME:
				{
				setState(58);
				match(VAR_NAME);
				}
				break;
			case FLOAT:
				{
				setState(59);
				match(FLOAT);
				}
				break;
			case INT:
				{
				setState(60);
				match(INT);
				}
				break;
			case NUM:
				{
				setState(61);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(62);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(ASSIGN);
						setState(67);
						assignment_operations(8);
						}
						break;
					case 2:
						{
						_localctx = new Assignment_operationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignment_operations);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 266287972352L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						assignment_operations(7);
						}
						break;
					}
					} 
				}
				setState(75);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(77);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(79);
				match(INT);
				}
				break;
			case 5:
				{
				setState(80);
				match(NUM);
				}
				break;
			case 6:
				{
				setState(81);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(84);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==DOESNOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						conditional_statements(10);
						}
						break;
					case 2:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==LESS_THAN || _la==LESS_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						conditional_statements(9);
						}
						break;
					case 3:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(90);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(91);
						_la = _input.LA(1);
						if ( !(_la==GREATER_THAN || _la==GREATER_THAN_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						conditional_statements(8);
						}
						break;
					case 4:
						{
						_localctx = new Conditional_statementsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional_statements);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						conditional_statements(7);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public Assignment_operationsContext assignment_operations() {
			return getRuleContext(Assignment_operationsContext.class,0);
		}
		public Conditional_statementsContext conditional_statements() {
			return getRuleContext(Conditional_statementsContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(gParser.BOOL, 0); }
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<If_else_blockContext> if_else_block() {
			return getRuleContexts(If_else_blockContext.class);
		}
		public If_else_blockContext if_else_block(int i) {
			return getRuleContext(If_else_blockContext.class,i);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
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
			int _alt;
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__2);
				setState(102);
				match(T__0);
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(103);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(104);
					conditional_statements(0);
					}
					break;
				case 3:
					{
					setState(105);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(106);
					match(VAR_NAME);
					}
					break;
				}
				setState(109);
				match(T__3);
				setState(110);
				match(T__4);
				setState(111);
				match(TAB);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750207778L) != 0) {
					{
					{
					setState(112);
					block();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						if_else_block();
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__5);
				setState(125);
				match(T__0);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(126);
					assignment_operations(0);
					}
					break;
				case 2:
					{
					setState(127);
					conditional_statements(0);
					}
					break;
				case 3:
					{
					setState(128);
					match(BOOL);
					}
					break;
				case 4:
					{
					setState(129);
					match(VAR_NAME);
					}
					break;
				}
				setState(132);
				match(T__3);
				setState(133);
				match(T__4);
				setState(134);
				match(TAB);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750207778L) != 0) {
					{
					{
					setState(135);
					block();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						if_else_block();
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__6);
				setState(148);
				match(COLON);
				setState(149);
				match(T__4);
				setState(150);
				match(TAB);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750207778L) != 0) {
					{
					{
					setState(151);
					block();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(157);
						if_else_block();
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__7);
				setState(166);
				match(T__0);
				setState(167);
				assignment_operations(0);
				setState(168);
				match(T__3);
				setState(169);
				match(T__4);
				setState(170);
				match(TAB);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						block();
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__7);
				setState(178);
				match(T__0);
				setState(179);
				conditional_statements(0);
				setState(180);
				match(T__3);
				setState(181);
				match(T__4);
				setState(182);
				match(TAB);
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						block();
						}
						} 
					}
					setState(188);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__8);
				setState(192);
				assignment_operations(0);
				setState(193);
				match(T__3);
				setState(194);
				match(T__4);
				setState(195);
				match(TAB);
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						block();
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__8);
				setState(203);
				conditional_statements(0);
				setState(204);
				match(T__3);
				setState(205);
				match(T__4);
				setState(206);
				match(TAB);
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						block();
						}
						} 
					}
					setState(212);
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
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(215);
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
				setState(220);
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
		enterRule(_localctx, 14, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			match(VAR_NAME);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(222);
				match(T__9);
				setState(223);
				match(VAR_NAME);
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
	public static class Function_call_argsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(gParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(gParser.VAR_NAME, i);
		}
		public List<TerminalNode> NUM() { return getTokens(gParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gParser.NUM, i);
		}
		public List<TerminalNode> STRING() { return getTokens(gParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(gParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(gParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(gParser.BOOL, i);
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
		enterRule(_localctx, 16, RULE_function_call_args);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(229);
				match(VAR_NAME);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(230);
					match(T__9);
					setState(231);
					match(VAR_NAME);
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(237);
				match(NUM);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(238);
					match(T__9);
					setState(239);
					match(NUM);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(245);
				match(STRING);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(246);
					match(T__9);
					setState(247);
					match(STRING);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(253);
				match(BOOL);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(254);
					match(T__9);
					setState(255);
					match(BOOL);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(VAR_NAME);
			setState(264);
			match(T__0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750731264L) != 0) {
				{
				{
				setState(265);
				function_call_args();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		enterRule(_localctx, 20, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__10);
			setState(274);
			match(VAR_NAME);
			setState(275);
			match(T__0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME) {
				{
				{
				setState(276);
				function_args();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
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
		enterRule(_localctx, 22, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			function_declaration();
			setState(285);
			match(T__4);
			setState(286);
			match(TAB);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750207778L) != 0) {
				{
				{
				setState(287);
				block();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(T__11);
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
		public TerminalNode TAB() { return getToken(gParser.TAB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368750207746L) != 0) {
				{
				{
				setState(295);
				statement();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(T__4);
			setState(302);
			match(TAB);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					statement();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public TerminalNode VAR_NAME() { return getToken(gParser.VAR_NAME, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				while_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				for_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				arithmetic_operations(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				assignment_operations(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				match(VAR_NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				function_call();
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
	public static class Denter_testerContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(gParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(gParser.DEDENT, 0); }
		public Denter_testerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_denter_tester; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDenter_tester(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDenter_tester(this);
		}
	}

	public final Denter_testerContext denter_tester() throws RecognitionException {
		Denter_testerContext _localctx = new Denter_testerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_denter_tester);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__12);
			setState(318);
			match(INDENT);
			setState(319);
			match(T__13);
			setState(320);
			match(DEDENT);
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
		"\u0004\u00011\u0143\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002a\b\u0002\n\u0002\f\u0002d\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003l\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003r\b\u0003\n\u0003\f\u0003u\t\u0003\u0001\u0003\u0005\u0003"+
		"x\b\u0003\n\u0003\f\u0003{\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0083\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0089\b\u0003\n\u0003"+
		"\f\u0003\u008c\t\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n\u0003\f"+
		"\u0003\u0092\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0099\b\u0003\n\u0003\f\u0003\u009c\t\u0003\u0001\u0003"+
		"\u0005\u0003\u009f\b\u0003\n\u0003\f\u0003\u00a2\t\u0003\u0003\u0003\u00a4"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00ad\b\u0004\n\u0004\f\u0004\u00b0\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00b9\b\u0004\n\u0004\f\u0004\u00bc\t\u0004\u0003"+
		"\u0004\u00be\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00c6\b\u0005\n\u0005\f\u0005\u00c9\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00d1\b\u0005\n\u0005\f\u0005\u00d4\t\u0005\u0003\u0005\u00d6"+
		"\b\u0005\u0001\u0006\u0005\u0006\u00d9\b\u0006\n\u0006\f\u0006\u00dc\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e1\b\u0007\n"+
		"\u0007\f\u0007\u00e4\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00e9\b\b"+
		"\n\b\f\b\u00ec\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f1\b\b\n\b\f\b\u00f4"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f9\b\b\n\b\f\b\u00fc\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0101\b\b\n\b\f\b\u0104\t\b\u0003\b\u0106\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u010b\b\t\n\t\f\t\u010e\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0116\b\n\n\n\f\n\u0119"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0121\b\u000b\n\u000b\f\u000b\u0124\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0005\f\u0129\b\f\n\f\f\f\u012c\t\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0131\b\f\n\f\f\f\u0134\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u013c\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0003\u0000\u0002\u0004\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\b\u0001\u0000\u001d\u001f\u0001\u0000\u001b\u001c\u0001\u0000!%\u0001"+
		"\u0000&\'\u0001\u0000()\u0001\u0000*+\u0001\u0000,-\u0001\u0000\u0017"+
		"\u0018\u016f\u0000%\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004R\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000\u0000\b"+
		"\u00bd\u0001\u0000\u0000\u0000\n\u00d5\u0001\u0000\u0000\u0000\f\u00da"+
		"\u0001\u0000\u0000\u0000\u000e\u00dd\u0001\u0000\u0000\u0000\u0010\u0105"+
		"\u0001\u0000\u0000\u0000\u0012\u0107\u0001\u0000\u0000\u0000\u0014\u0111"+
		"\u0001\u0000\u0000\u0000\u0016\u011c\u0001\u0000\u0000\u0000\u0018\u012a"+
		"\u0001\u0000\u0000\u0000\u001a\u013b\u0001\u0000\u0000\u0000\u001c\u013d"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0000\uffff\uffff\u0000\u001f"+
		" \u0005\u0001\u0000\u0000 !\u0003\u0000\u0000\u0000!\"\u0005\u0002\u0000"+
		"\u0000\"&\u0001\u0000\u0000\u0000#&\u0005\u0012\u0000\u0000$&\u0005.\u0000"+
		"\u0000%\u001e\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001"+
		"\u0000\u0000\u0000&/\u0001\u0000\u0000\u0000\'(\n\u0004\u0000\u0000()"+
		"\u0007\u0000\u0000\u0000).\u0003\u0000\u0000\u0005*+\n\u0003\u0000\u0000"+
		"+,\u0007\u0001\u0000\u0000,.\u0003\u0000\u0000\u0004-\'\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0001\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000023\u0006\u0001\uffff\uffff\u000036\u0005\u0001"+
		"\u0000\u000047\u0003\u0002\u0001\u000057\u0003\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0005\u0002\u0000\u00009@\u0001\u0000\u0000\u0000:@\u0005.\u0000\u0000"+
		";@\u0005\u0014\u0000\u0000<@\u0005\u0013\u0000\u0000=@\u0005\u0012\u0000"+
		"\u0000>@\u0005\u0016\u0000\u0000?2\u0001\u0000\u0000\u0000?:\u0001\u0000"+
		"\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@I\u0001\u0000\u0000\u0000"+
		"AB\n\u0007\u0000\u0000BC\u0005 \u0000\u0000CH\u0003\u0002\u0001\bDE\n"+
		"\u0006\u0000\u0000EF\u0007\u0002\u0000\u0000FH\u0003\u0002\u0001\u0007"+
		"GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LS\u0006\u0002\uffff\uffff"+
		"\u0000MS\u0005.\u0000\u0000NS\u0005\u0014\u0000\u0000OS\u0005\u0013\u0000"+
		"\u0000PS\u0005\u0012\u0000\u0000QS\u0005\u0016\u0000\u0000RL\u0001\u0000"+
		"\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"Sb\u0001\u0000\u0000\u0000TU\n\t\u0000\u0000UV\u0007\u0003\u0000\u0000"+
		"Va\u0003\u0004\u0002\nWX\n\b\u0000\u0000XY\u0007\u0004\u0000\u0000Ya\u0003"+
		"\u0004\u0002\tZ[\n\u0007\u0000\u0000[\\\u0007\u0005\u0000\u0000\\a\u0003"+
		"\u0004\u0002\b]^\n\u0006\u0000\u0000^_\u0007\u0006\u0000\u0000_a\u0003"+
		"\u0004\u0002\u0007`T\u0001\u0000\u0000\u0000`W\u0001\u0000\u0000\u0000"+
		"`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0005\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0003\u0000\u0000"+
		"fk\u0005\u0001\u0000\u0000gl\u0003\u0002\u0001\u0000hl\u0003\u0004\u0002"+
		"\u0000il\u0005\u0015\u0000\u0000jl\u0005.\u0000\u0000kg\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u0004\u0000\u0000no\u0005"+
		"\u0005\u0000\u0000os\u0005\u0011\u0000\u0000pr\u0003\u0018\f\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vx\u0003\u0006\u0003\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u00a4"+
		"\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0006\u0000"+
		"\u0000}\u0082\u0005\u0001\u0000\u0000~\u0083\u0003\u0002\u0001\u0000\u007f"+
		"\u0083\u0003\u0004\u0002\u0000\u0080\u0083\u0005\u0015\u0000\u0000\u0081"+
		"\u0083\u0005.\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0004\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u008a\u0005"+
		"\u0011\u0000\u0000\u0087\u0089\u0003\u0018\f\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0090\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0006"+
		"\u0003\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u00a4\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u0005\u0019"+
		"\u0000\u0000\u0095\u0096\u0005\u0005\u0000\u0000\u0096\u009a\u0005\u0011"+
		"\u0000\u0000\u0097\u0099\u0003\u0018\f\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a0\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0006\u0003"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3e\u0001\u0000\u0000\u0000\u00a3|\u0001\u0000\u0000\u0000\u00a3"+
		"\u0093\u0001\u0000\u0000\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\b\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0002\u0001\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0005\u0000\u0000\u00aa\u00ae\u0005\u0011\u0000\u0000\u00ab\u00ad"+
		"\u0003\u0018\f\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00be\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0005\u0001"+
		"\u0000\u0000\u00b3\u00b4\u0003\u0004\u0002\u0000\u00b4\u00b5\u0005\u0004"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00ba\u0005\u0011"+
		"\u0000\u0000\u00b7\u00b9\u0003\u0018\f\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00a5\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000\u00be\t\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c1\u0003\u0002\u0001\u0000\u00c1"+
		"\u00c2\u0005\u0004\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3"+
		"\u00c7\u0005\u0011\u0000\u0000\u00c4\u00c6\u0003\u0018\f\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\t\u0000\u0000\u00cb\u00cc\u0003\u0004\u0002\u0000\u00cc\u00cd\u0005"+
		"\u0004\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce\u00d2\u0005"+
		"\u0011\u0000\u0000\u00cf\u00d1\u0003\u0018\f\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00bf\u0001\u0000"+
		"\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d6\u000b\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d9\u0007\u0007\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\r\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e2\u0005.\u0000\u0000"+
		"\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e1\u0005.\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u000f\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"\u00ea\u0005.\u0000\u0000\u00e6\u00e7\u0005\n\u0000\u0000\u00e7\u00e9"+
		"\u0005.\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u0106\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f2\u0005\u0012\u0000\u0000\u00ee\u00ef\u0005"+
		"\n\u0000\u0000\u00ef\u00f1\u0005\u0012\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u0106\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00fa\u0005\u0016"+
		"\u0000\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00f9\u0005\u0016\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u0106\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u0102\u0005\u0015\u0000\u0000\u00fe\u00ff\u0005\n\u0000\u0000"+
		"\u00ff\u0101\u0005\u0015\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u00e5\u0001\u0000\u0000\u0000"+
		"\u0105\u00ed\u0001\u0000\u0000\u0000\u0105\u00f5\u0001\u0000\u0000\u0000"+
		"\u0105\u00fd\u0001\u0000\u0000\u0000\u0106\u0011\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0005.\u0000\u0000\u0108\u010c\u0005\u0001\u0000\u0000\u0109"+
		"\u010b\u0003\u0010\b\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0013"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u000b\u0000\u0000\u0112\u0113"+
		"\u0005.\u0000\u0000\u0113\u0117\u0005\u0001\u0000\u0000\u0114\u0116\u0003"+
		"\u000e\u0007\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001"+
		"\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005\u0004\u0000\u0000\u011b\u0015\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0003\u0014\n\u0000\u011d\u011e\u0005\u0005"+
		"\u0000\u0000\u011e\u0122\u0005\u0011\u0000\u0000\u011f\u0121\u0003\u0018"+
		"\f\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005\f\u0000\u0000\u0126\u0017\u0001\u0000\u0000\u0000"+
		"\u0127\u0129\u0003\u001a\r\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0005\u0000\u0000\u012e"+
		"\u0132\u0005\u0011\u0000\u0000\u012f\u0131\u0003\u001a\r\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0019"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u013c"+
		"\u0003\b\u0004\u0000\u0136\u013c\u0003\n\u0005\u0000\u0137\u013c\u0003"+
		"\u0000\u0000\u0000\u0138\u013c\u0003\u0002\u0001\u0000\u0139\u013c\u0005"+
		".\u0000\u0000\u013a\u013c\u0003\u0012\t\u0000\u013b\u0135\u0001\u0000"+
		"\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013b\u0137\u0001\u0000"+
		"\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u001b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005\r\u0000\u0000\u013e\u013f\u00050\u0000"+
		"\u0000\u013f\u0140\u0005\u000e\u0000\u0000\u0140\u0141\u00051\u0000\u0000"+
		"\u0141\u001d\u0001\u0000\u0000\u0000&%-/6?GIR`bksy\u0082\u008a\u0090\u009a"+
		"\u00a0\u00a3\u00ae\u00ba\u00bd\u00c7\u00d2\u00d5\u00da\u00e2\u00ea\u00f2"+
		"\u00fa\u0102\u0105\u010c\u0117\u0122\u012a\u0132\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}