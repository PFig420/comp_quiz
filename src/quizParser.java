// Generated from quiz.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class quizParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, SHUFFLE=31, 
		LIST=32, ADD=33, REMOVE=34, EXECUTE=35, END=36, CREATE=37, INPUT=38, QMC=39, 
		QM=40, RET=41, TYPEQUESTION=42, QMC_ATTR=43, QM_ATTR=44, Q_ATTR=45, BLOCKQUIZ_ATTR=46, 
		Q_CHECKANSWER=47, ALL_ATTR=48, SEPARATOR=49, OPERATOR_ALG=50, ANDOR=51, 
		OPERATOR=52, NOT=53, ENDQUIZ=54, TYPE=55, BOOL=56, VAR=57, STRING=58, 
		NUMBER=59, INTEGER=60, DOUBLE=61, NEWLINE=62, COMMENT_NLINES=63, WS=64;
	public static final int
		RULE_quiz = 0, RULE_instruction = 1, RULE_def_quiz = 2, RULE_def_block = 3, 
		RULE_def_question = 4, RULE_def_blockquiz = 5, RULE_method_add = 6, RULE_method_remove = 7, 
		RULE_method_shuffle = 8, RULE_method_execute = 9, RULE_def_qmc_attr = 10, 
		RULE_def_qmc = 11, RULE_def_qm_attr = 12, RULE_def_qm = 13, RULE_assign = 14, 
		RULE_generic_assign = 15, RULE_number_assign = 16, RULE_text_assign = 17, 
		RULE_group_assign = 18, RULE_bool_assign = 19, RULE_attr_assign = 20, 
		RULE_methods = 21, RULE_load = 22, RULE_print = 23, RULE_println = 24, 
		RULE_expr = 25, RULE_loops = 26, RULE_function_header = 27, RULE_def_function = 28, 
		RULE_function_call = 29, RULE_function_ret = 30, RULE_structure_if = 31, 
		RULE_condition_if = 32, RULE_structure_for = 33, RULE_expr_ifor = 34, 
		RULE_group = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"quiz", "instruction", "def_quiz", "def_block", "def_question", "def_blockquiz", 
			"method_add", "method_remove", "method_shuffle", "method_execute", "def_qmc_attr", 
			"def_qmc", "def_qm_attr", "def_qm", "assign", "generic_assign", "number_assign", 
			"text_assign", "group_assign", "bool_assign", "attr_assign", "methods", 
			"load", "print", "println", "expr", "loops", "function_header", "def_function", 
			"function_call", "function_ret", "structure_if", "condition_if", "structure_for", 
			"expr_ifor", "group"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'quiz'", "'block'", "'blockquiz'", "':'", "'='", "'+='", "'-='", 
			"'number'", "'text'", "'bool'", "'.'", "'load'", "'from'", "'as'", "'show'", 
			"'('", "')'", "'showln'", "'['", "']'", "'->'", "'question'", "'nothing'", 
			"','", "'function'", "'if'", "'else'", "'foreach'", "'in'", "'group'", 
			"'shuffle'", "'list'", "'add'", "'remove'", "'execute'", "'end'", "'create'", 
			"'input'", "'qmc'", "'qm'", "'ret'", null, null, null, null, null, "'checkanswer'", 
			null, null, null, null, null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "SHUFFLE", "LIST", "ADD", "REMOVE", 
			"EXECUTE", "END", "CREATE", "INPUT", "QMC", "QM", "RET", "TYPEQUESTION", 
			"QMC_ATTR", "QM_ATTR", "Q_ATTR", "BLOCKQUIZ_ATTR", "Q_CHECKANSWER", "ALL_ATTR", 
			"SEPARATOR", "OPERATOR_ALG", "ANDOR", "OPERATOR", "NOT", "ENDQUIZ", "TYPE", 
			"BOOL", "VAR", "STRING", "NUMBER", "INTEGER", "DOUBLE", "NEWLINE", "COMMENT_NLINES", 
			"WS"
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
	public String getGrammarFileName() { return "quiz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public quizParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QuizContext extends ParserRuleContext {
		public TerminalNode ENDQUIZ() { return getToken(quizParser.ENDQUIZ, 0); }
		public TerminalNode EOF() { return getToken(quizParser.EOF, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public QuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizContext quiz() throws RecognitionException {
		QuizContext _localctx = new QuizContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_quiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(72);
				match(SEPARATOR);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << LIST) | (1L << CREATE) | (1L << INPUT) | (1L << RET) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(78);
				instruction();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(ENDQUIZ);
			setState(85);
			match(EOF);
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

	public static class InstructionContext extends ParserRuleContext {
		public Def_questionContext def_question() {
			return getRuleContext(Def_questionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Method_addContext method_add() {
			return getRuleContext(Method_addContext.class,0);
		}
		public Method_removeContext method_remove() {
			return getRuleContext(Method_removeContext.class,0);
		}
		public Method_shuffleContext method_shuffle() {
			return getRuleContext(Method_shuffleContext.class,0);
		}
		public Method_executeContext method_execute() {
			return getRuleContext(Method_executeContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public Def_blockContext def_block() {
			return getRuleContext(Def_blockContext.class,0);
		}
		public Def_quizContext def_quiz() {
			return getRuleContext(Def_quizContext.class,0);
		}
		public Def_blockquizContext def_blockquiz() {
			return getRuleContext(Def_blockquizContext.class,0);
		}
		public Function_retContext function_ret() {
			return getRuleContext(Function_retContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				def_question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				method_add();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				method_remove();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				method_shuffle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				method_execute();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				methods();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				def_function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				function_call();
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(SEPARATOR);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				loops();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				def_block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(103);
				def_quiz();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(104);
				def_blockquiz();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(105);
				function_ret();
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

	public static class Def_quizContext extends ParserRuleContext {
		public Def_quizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_quiz; }
	 
		public Def_quizContext() { }
		public void copyFrom(Def_quizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefQuizContext extends Def_quizContext {
		public TerminalNode CREATE() { return getToken(quizParser.CREATE, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public DefQuizContext(Def_quizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_quizContext def_quiz() throws RecognitionException {
		Def_quizContext _localctx = new Def_quizContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_quiz);
		int _la;
		try {
			_localctx = new DefQuizContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CREATE);
			setState(109);
			match(T__0);
			setState(110);
			match(VAR);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(SEPARATOR);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Def_blockContext extends ParserRuleContext {
		public Def_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_block; }
	 
		public Def_blockContext() { }
		public void copyFrom(Def_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefBlockContext extends Def_blockContext {
		public TerminalNode CREATE() { return getToken(quizParser.CREATE, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public DefBlockContext(Def_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_blockContext def_block() throws RecognitionException {
		Def_blockContext _localctx = new Def_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_block);
		int _la;
		try {
			_localctx = new DefBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CREATE);
			setState(117);
			match(T__1);
			setState(118);
			match(VAR);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(SEPARATOR);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Def_questionContext extends ParserRuleContext {
		public Def_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_question; }
	 
		public Def_questionContext() { }
		public void copyFrom(Def_questionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefQuestionQMCContext extends Def_questionContext {
		public Def_qmcContext def_qmc() {
			return getRuleContext(Def_qmcContext.class,0);
		}
		public DefQuestionQMCContext(Def_questionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefQuestionQMC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefQuestionQMC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefQuestionQMC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefQuestionQMContext extends Def_questionContext {
		public Def_qmContext def_qm() {
			return getRuleContext(Def_qmContext.class,0);
		}
		public DefQuestionQMContext(Def_questionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefQuestionQM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefQuestionQM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefQuestionQM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_questionContext def_question() throws RecognitionException {
		Def_questionContext _localctx = new Def_questionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_question);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DefQuestionQMCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				def_qmc();
				}
				break;
			case 2:
				_localctx = new DefQuestionQMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				def_qm();
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

	public static class Def_blockquizContext extends ParserRuleContext {
		public Def_blockquizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_blockquiz; }
	 
		public Def_blockquizContext() { }
		public void copyFrom(Def_blockquizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefBlockquizContext extends Def_blockquizContext {
		public Token BLOCKQUIZ_ATTR;
		public List<Token> blockQuizList = new ArrayList<Token>();
		public ExprContext expr;
		public List<ExprContext> exprList = new ArrayList<ExprContext>();
		public TerminalNode CREATE() { return getToken(quizParser.CREATE, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<TerminalNode> BLOCKQUIZ_ATTR() { return getTokens(quizParser.BLOCKQUIZ_ATTR); }
		public TerminalNode BLOCKQUIZ_ATTR(int i) {
			return getToken(quizParser.BLOCKQUIZ_ATTR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DefBlockquizContext(Def_blockquizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefBlockquiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefBlockquiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefBlockquiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_blockquizContext def_blockquiz() throws RecognitionException {
		Def_blockquizContext _localctx = new Def_blockquizContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def_blockquiz);
		int _la;
		try {
			_localctx = new DefBlockquizContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CREATE);
			setState(129);
			match(T__2);
			setState(130);
			match(VAR);
			setState(131);
			match(T__3);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(132);
				match(SEPARATOR);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLOCKQUIZ_ATTR) {
				{
				{
				setState(138);
				((DefBlockquizContext)_localctx).BLOCKQUIZ_ATTR = match(BLOCKQUIZ_ATTR);
				((DefBlockquizContext)_localctx).blockQuizList.add(((DefBlockquizContext)_localctx).BLOCKQUIZ_ATTR);
				setState(139);
				match(T__4);
				setState(140);
				((DefBlockquizContext)_localctx).expr = expr(0);
				((DefBlockquizContext)_localctx).exprList.add(((DefBlockquizContext)_localctx).expr);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(SEPARATOR);
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(END);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				match(SEPARATOR);
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Method_addContext extends ParserRuleContext {
		public Method_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_add; }
	 
		public Method_addContext() { }
		public void copyFrom(Method_addContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodAddContext extends Method_addContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode ADD() { return getToken(quizParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public MethodAddContext(Method_addContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_addContext method_add() throws RecognitionException {
		Method_addContext _localctx = new Method_addContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_add);
		int _la;
		try {
			_localctx = new MethodAddContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(VAR);
			setState(158);
			match(ADD);
			setState(159);
			expr(0);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				match(SEPARATOR);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Method_removeContext extends ParserRuleContext {
		public Method_removeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_remove; }
	 
		public Method_removeContext() { }
		public void copyFrom(Method_removeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodRemoveContext extends Method_removeContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode REMOVE() { return getToken(quizParser.REMOVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public MethodRemoveContext(Method_removeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_removeContext method_remove() throws RecognitionException {
		Method_removeContext _localctx = new Method_removeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_remove);
		int _la;
		try {
			_localctx = new MethodRemoveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(VAR);
			setState(166);
			match(REMOVE);
			setState(167);
			expr(0);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(SEPARATOR);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Method_shuffleContext extends ParserRuleContext {
		public Method_shuffleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_shuffle; }
	 
		public Method_shuffleContext() { }
		public void copyFrom(Method_shuffleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodShuffleContext extends Method_shuffleContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode SHUFFLE() { return getToken(quizParser.SHUFFLE, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public MethodShuffleContext(Method_shuffleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodShuffle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodShuffle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodShuffle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_shuffleContext method_shuffle() throws RecognitionException {
		Method_shuffleContext _localctx = new Method_shuffleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_shuffle);
		int _la;
		try {
			_localctx = new MethodShuffleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(VAR);
			setState(174);
			match(SHUFFLE);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(SEPARATOR);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Method_executeContext extends ParserRuleContext {
		public Method_executeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_execute; }
	 
		public Method_executeContext() { }
		public void copyFrom(Method_executeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodExecuteContext extends Method_executeContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode EXECUTE() { return getToken(quizParser.EXECUTE, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public MethodExecuteContext(Method_executeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_executeContext method_execute() throws RecognitionException {
		Method_executeContext _localctx = new Method_executeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_execute);
		int _la;
		try {
			_localctx = new MethodExecuteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(VAR);
			setState(181);
			match(EXECUTE);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(SEPARATOR);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Def_qmc_attrContext extends ParserRuleContext {
		public Def_qmc_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_qmc_attr; }
	 
		public Def_qmc_attrContext() { }
		public void copyFrom(Def_qmc_attrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Def_qmc_q_attrContext extends Def_qmc_attrContext {
		public TerminalNode Q_ATTR() { return getToken(quizParser.Q_ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public Def_qmc_q_attrContext(Def_qmc_attrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qmc_q_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qmc_q_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qmc_q_attr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Def_qmc_qmc_attrContext extends Def_qmc_attrContext {
		public TerminalNode QMC_ATTR() { return getToken(quizParser.QMC_ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public Def_qmc_qmc_attrContext(Def_qmc_attrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qmc_qmc_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qmc_qmc_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qmc_qmc_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_qmc_attrContext def_qmc_attr() throws RecognitionException {
		Def_qmc_attrContext _localctx = new Def_qmc_attrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_qmc_attr);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_ATTR:
				_localctx = new Def_qmc_q_attrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(187);
				match(Q_ATTR);
				setState(188);
				match(T__4);
				setState(189);
				expr(0);
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					match(SEPARATOR);
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				}
				break;
			case QMC_ATTR:
				_localctx = new Def_qmc_qmc_attrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(195);
				match(QMC_ATTR);
				setState(196);
				match(T__4);
				setState(197);
				expr(0);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					match(SEPARATOR);
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
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

	public static class Def_qmcContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(quizParser.CREATE, 0); }
		public TerminalNode QMC() { return getToken(quizParser.QMC, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<Def_qmc_attrContext> def_qmc_attr() {
			return getRuleContexts(Def_qmc_attrContext.class);
		}
		public Def_qmc_attrContext def_qmc_attr(int i) {
			return getRuleContext(Def_qmc_attrContext.class,i);
		}
		public Def_qmcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_qmc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qmc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qmc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qmc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_qmcContext def_qmc() throws RecognitionException {
		Def_qmcContext _localctx = new Def_qmcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def_qmc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CREATE);
			setState(206);
			match(QMC);
			setState(207);
			match(VAR);
			setState(208);
			match(T__3);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(209);
				match(SEPARATOR);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QMC_ATTR || _la==Q_ATTR) {
				{
				{
				setState(215);
				def_qmc_attr();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(END);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(SEPARATOR);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Def_qm_attrContext extends ParserRuleContext {
		public Def_qm_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_qm_attr; }
	 
		public Def_qm_attrContext() { }
		public void copyFrom(Def_qm_attrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Def_qm_qm_attrContext extends Def_qm_attrContext {
		public TerminalNode QM_ATTR() { return getToken(quizParser.QM_ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public Def_qm_qm_attrContext(Def_qm_attrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qm_qm_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qm_qm_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qm_qm_attr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Def_qm_q_attrContext extends Def_qm_attrContext {
		public TerminalNode Q_ATTR() { return getToken(quizParser.Q_ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public Def_qm_q_attrContext(Def_qm_attrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qm_q_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qm_q_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qm_q_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_qm_attrContext def_qm_attr() throws RecognitionException {
		Def_qm_attrContext _localctx = new Def_qm_attrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_def_qm_attr);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_ATTR:
				_localctx = new Def_qm_q_attrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(227);
				match(Q_ATTR);
				setState(228);
				match(T__4);
				setState(229);
				expr(0);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					match(SEPARATOR);
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				}
				break;
			case QM_ATTR:
				_localctx = new Def_qm_qm_attrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(235);
				match(QM_ATTR);
				setState(236);
				match(T__4);
				setState(237);
				expr(0);
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					match(SEPARATOR);
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
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

	public static class Def_qmContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(quizParser.CREATE, 0); }
		public TerminalNode QM() { return getToken(quizParser.QM, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<Def_qm_attrContext> def_qm_attr() {
			return getRuleContexts(Def_qm_attrContext.class);
		}
		public Def_qm_attrContext def_qm_attr(int i) {
			return getRuleContext(Def_qm_attrContext.class,i);
		}
		public Def_qmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_qm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDef_qm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDef_qm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDef_qm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_qmContext def_qm() throws RecognitionException {
		Def_qmContext _localctx = new Def_qmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_def_qm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(CREATE);
			setState(246);
			match(QM);
			setState(247);
			match(VAR);
			setState(248);
			match(T__3);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(249);
				match(SEPARATOR);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QM_ATTR || _la==Q_ATTR) {
				{
				{
				setState(255);
				def_qm_attr();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(END);
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(SEPARATOR);
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class AssignContext extends ParserRuleContext {
		public Number_assignContext number_assign() {
			return getRuleContext(Number_assignContext.class,0);
		}
		public Text_assignContext text_assign() {
			return getRuleContext(Text_assignContext.class,0);
		}
		public Bool_assignContext bool_assign() {
			return getRuleContext(Bool_assignContext.class,0);
		}
		public Group_assignContext group_assign() {
			return getRuleContext(Group_assignContext.class,0);
		}
		public Generic_assignContext generic_assign() {
			return getRuleContext(Generic_assignContext.class,0);
		}
		public Attr_assignContext attr_assign() {
			return getRuleContext(Attr_assignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				number_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				text_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				bool_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				group_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				generic_assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				attr_assign();
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

	public static class Generic_assignContext extends ParserRuleContext {
		public Generic_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_assign; }
	 
		public Generic_assignContext() { }
		public void copyFrom(Generic_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignGenMinusEqualsContext extends Generic_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public AssignGenMinusEqualsContext(Generic_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAssignGenMinusEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAssignGenMinusEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAssignGenMinusEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignGenEqualsContext extends Generic_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public AssignGenEqualsContext(Generic_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAssignGenEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAssignGenEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAssignGenEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignGenPlusEqualsContext extends Generic_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public AssignGenPlusEqualsContext(Generic_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAssignGenPlusEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAssignGenPlusEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAssignGenPlusEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_assignContext generic_assign() throws RecognitionException {
		Generic_assignContext _localctx = new Generic_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_generic_assign);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new AssignGenEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(VAR);
				setState(276);
				match(T__4);
				setState(277);
				expr(0);
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					match(SEPARATOR);
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				break;
			case 2:
				_localctx = new AssignGenPlusEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(VAR);
				setState(284);
				match(T__5);
				setState(285);
				expr(0);
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					match(SEPARATOR);
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				break;
			case 3:
				_localctx = new AssignGenMinusEqualsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(VAR);
				setState(292);
				match(T__6);
				setState(293);
				expr(0);
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					match(SEPARATOR);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
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

	public static class Number_assignContext extends ParserRuleContext {
		public Number_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_assign; }
	 
		public Number_assignContext() { }
		public void copyFrom(Number_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberAssignContext extends Number_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public NumberAssignContext(Number_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterNumberAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitNumberAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitNumberAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_assignContext number_assign() throws RecognitionException {
		Number_assignContext _localctx = new Number_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number_assign);
		int _la;
		try {
			_localctx = new NumberAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__7);
			setState(302);
			match(VAR);
			setState(303);
			match(T__4);
			setState(304);
			expr(0);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				match(SEPARATOR);
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Text_assignContext extends ParserRuleContext {
		public Text_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_assign; }
	 
		public Text_assignContext() { }
		public void copyFrom(Text_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextAssignContext extends Text_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public TextAssignContext(Text_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterTextAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitTextAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitTextAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_assignContext text_assign() throws RecognitionException {
		Text_assignContext _localctx = new Text_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_text_assign);
		int _la;
		try {
			_localctx = new TextAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__8);
			setState(311);
			match(VAR);
			setState(312);
			match(T__4);
			setState(313);
			expr(0);
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314);
				match(SEPARATOR);
				}
				}
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Group_assignContext extends ParserRuleContext {
		public Group_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_assign; }
	 
		public Group_assignContext() { }
		public void copyFrom(Group_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListAssignContext extends Group_assignContext {
		public TerminalNode LIST() { return getToken(quizParser.LIST, 0); }
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public ListAssignContext(Group_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterListAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitListAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitListAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_assignContext group_assign() throws RecognitionException {
		Group_assignContext _localctx = new Group_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_group_assign);
		int _la;
		try {
			_localctx = new ListAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LIST);
			setState(320);
			match(VAR);
			setState(321);
			match(T__4);
			setState(322);
			expr(0);
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				match(SEPARATOR);
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Bool_assignContext extends ParserRuleContext {
		public Bool_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_assign; }
	 
		public Bool_assignContext() { }
		public void copyFrom(Bool_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolAssignContext extends Bool_assignContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public BoolAssignContext(Bool_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterBoolAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitBoolAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitBoolAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_assignContext bool_assign() throws RecognitionException {
		Bool_assignContext _localctx = new Bool_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool_assign);
		int _la;
		try {
			_localctx = new BoolAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__9);
			setState(329);
			match(VAR);
			setState(330);
			match(T__4);
			setState(331);
			expr(0);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(SEPARATOR);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Attr_assignContext extends ParserRuleContext {
		public Attr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_assign; }
	 
		public Attr_assignContext() { }
		public void copyFrom(Attr_assignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrAssignContext extends Attr_assignContext {
		public Token attr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<TerminalNode> ALL_ATTR() { return getTokens(quizParser.ALL_ATTR); }
		public TerminalNode ALL_ATTR(int i) {
			return getToken(quizParser.ALL_ATTR, i);
		}
		public List<TerminalNode> Q_ATTR() { return getTokens(quizParser.Q_ATTR); }
		public TerminalNode Q_ATTR(int i) {
			return getToken(quizParser.Q_ATTR, i);
		}
		public List<TerminalNode> QMC_ATTR() { return getTokens(quizParser.QMC_ATTR); }
		public TerminalNode QMC_ATTR(int i) {
			return getToken(quizParser.QMC_ATTR, i);
		}
		public List<TerminalNode> QM_ATTR() { return getTokens(quizParser.QM_ATTR); }
		public TerminalNode QM_ATTR(int i) {
			return getToken(quizParser.QM_ATTR, i);
		}
		public List<TerminalNode> BLOCKQUIZ_ATTR() { return getTokens(quizParser.BLOCKQUIZ_ATTR); }
		public TerminalNode BLOCKQUIZ_ATTR(int i) {
			return getToken(quizParser.BLOCKQUIZ_ATTR, i);
		}
		public AttrAssignContext(Attr_assignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAttrAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAttrAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAttrAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_assignContext attr_assign() throws RecognitionException {
		Attr_assignContext _localctx = new Attr_assignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attr_assign);
		int _la;
		try {
			_localctx = new AttrAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			expr(0);
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				match(T__10);
				setState(339);
				((AttrAssignContext)_localctx).attr = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QMC_ATTR) | (1L << QM_ATTR) | (1L << Q_ATTR) | (1L << BLOCKQUIZ_ATTR) | (1L << ALL_ATTR))) != 0)) ) {
					((AttrAssignContext)_localctx).attr = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(344);
			match(T__4);
			setState(345);
			expr(0);
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				match(SEPARATOR);
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class MethodsContext extends ParserRuleContext {
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
	 
		public MethodsContext() { }
		public void copyFrom(MethodsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodPrintlnContext extends MethodsContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public MethodPrintlnContext(MethodsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodLoadContext extends MethodsContext {
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public MethodLoadContext(MethodsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodLoad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodPrintContext extends MethodsContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public MethodPrintContext(MethodsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMethodPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMethodPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMethodPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methods);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new MethodPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				print();
				}
				break;
			case T__17:
				_localctx = new MethodPrintlnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				println();
				}
				break;
			case T__11:
				_localctx = new MethodLoadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				load();
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

	public static class LoadContext extends ParserRuleContext {
		public Token VAR;
		public List<Token> varsLoad = new ArrayList<Token>();
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(quizParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(quizParser.VAR, i);
		}
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_load);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__11);
			setState(357);
			match(T__12);
			setState(358);
			expr(0);
			setState(359);
			match(T__3);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(360);
				match(SEPARATOR);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				match(VAR);
				setState(367);
				match(T__13);
				setState(368);
				((LoadContext)_localctx).VAR = match(VAR);
				((LoadContext)_localctx).varsLoad.add(((LoadContext)_localctx).VAR);
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(369);
					match(SEPARATOR);
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				}
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
			setState(378);
			match(END);
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				match(SEPARATOR);
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__14);
			setState(385);
			match(T__15);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				setState(386);
				expr(0);
				}
			}

			setState(389);
			match(T__16);
			setState(391); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390);
				match(SEPARATOR);
				}
				}
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(T__17);
			setState(396);
			match(T__15);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				setState(397);
				expr(0);
				}
			}

			setState(400);
			match(T__16);
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				match(SEPARATOR);
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class ExprContext extends ParserRuleContext {
		public String var = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.var = ctx.var;
		}
	}
	public static class ExprTypeContext extends ExprContext {
		public TerminalNode TYPE() { return getToken(quizParser.TYPE, 0); }
		public ExprTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOperatorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERATOR_ALG() { return getToken(quizParser.OPERATOR_ALG, 0); }
		public ExprOperatorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInputContext extends ExprContext {
		public TerminalNode INPUT() { return getToken(quizParser.INPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprInputContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAttrAccessContext extends ExprContext {
		public Token attr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ALL_ATTR() { return getTokens(quizParser.ALL_ATTR); }
		public TerminalNode ALL_ATTR(int i) {
			return getToken(quizParser.ALL_ATTR, i);
		}
		public List<TerminalNode> Q_ATTR() { return getTokens(quizParser.Q_ATTR); }
		public TerminalNode Q_ATTR(int i) {
			return getToken(quizParser.Q_ATTR, i);
		}
		public List<TerminalNode> QMC_ATTR() { return getTokens(quizParser.QMC_ATTR); }
		public TerminalNode QMC_ATTR(int i) {
			return getToken(quizParser.QMC_ATTR, i);
		}
		public List<TerminalNode> QM_ATTR() { return getTokens(quizParser.QM_ATTR); }
		public TerminalNode QM_ATTR(int i) {
			return getToken(quizParser.QM_ATTR, i);
		}
		public List<TerminalNode> BLOCKQUIZ_ATTR() { return getTokens(quizParser.BLOCKQUIZ_ATTR); }
		public TerminalNode BLOCKQUIZ_ATTR(int i) {
			return getToken(quizParser.BLOCKQUIZ_ATTR, i);
		}
		public ExprAttrAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprAttrAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprAttrAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprAttrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGroupContext extends ExprContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ExprGroupContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdxAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprIdxAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprIdxAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprIdxAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprIdxAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprVarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMatchContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprQCheckanswerContext extends ExprContext {
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public TerminalNode Q_CHECKANSWER() { return getToken(quizParser.Q_CHECKANSWER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprQCheckanswerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprQCheckanswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprQCheckanswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprQCheckanswer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOptionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOptionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprOption(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExprFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExprFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ExprInputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(407);
				match(INPUT);
				setState(408);
				expr(9);
				}
				break;
			case 2:
				{
				_localctx = new ExprQCheckanswerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				match(VAR);
				setState(410);
				match(Q_CHECKANSWER);
				setState(411);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new ExprTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(TYPE);
				}
				break;
			case 4:
				{
				_localctx = new ExprGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				group();
				}
				break;
			case 5:
				{
				_localctx = new ExprVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(414);
				match(VAR);
				}
				break;
			case 6:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOperatorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(418);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(419);
						match(OPERATOR_ALG);
						setState(420);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprOptionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(421);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(422);
						match(T__20);
						setState(423);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprMatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(424);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(425);
						match(T__3);
						setState(426);
						expr(2);
						}
						break;
					case 4:
						{
						_localctx = new ExprAttrAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(427);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(430); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(428);
								match(T__10);
								setState(429);
								((ExprAttrAccessContext)_localctx).attr = _input.LT(1);
								_la = _input.LA(1);
								if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QMC_ATTR) | (1L << QM_ATTR) | (1L << Q_ATTR) | (1L << BLOCKQUIZ_ATTR) | (1L << ALL_ATTR))) != 0)) ) {
									((ExprAttrAccessContext)_localctx).attr = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(432); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 5:
						{
						_localctx = new ExprIdxAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(434);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(435);
						match(T__18);
						setState(436);
						expr(0);
						setState(437);
						match(T__19);
						}
						break;
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class LoopsContext extends ParserRuleContext {
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	 
		public LoopsContext() { }
		public void copyFrom(LoopsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopsStructIfContext extends LoopsContext {
		public Structure_ifContext structure_if() {
			return getRuleContext(Structure_ifContext.class,0);
		}
		public LoopsStructIfContext(LoopsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterLoopsStructIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitLoopsStructIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitLoopsStructIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopsStructForContext extends LoopsContext {
		public Structure_forContext structure_for() {
			return getRuleContext(Structure_forContext.class,0);
		}
		public LoopsStructForContext(LoopsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterLoopsStructFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitLoopsStructFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitLoopsStructFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loops);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new LoopsStructForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				structure_for();
				}
				break;
			case T__25:
				_localctx = new LoopsStructIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				structure_if();
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

	public static class Function_headerContext extends ParserRuleContext {
		public Token retType;
		public Token type1;
		public Token LIST;
		public List<Token> typeRest = new ArrayList<Token>();
		public Token s8;
		public Token s9;
		public Token s10;
		public Token s1;
		public Token s2;
		public Token s22;
		public Token _tset877;
		public List<TerminalNode> VAR() { return getTokens(quizParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(quizParser.VAR, i);
		}
		public List<TerminalNode> LIST() { return getTokens(quizParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(quizParser.LIST, i);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			((Function_headerContext)_localctx).retType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__21) | (1L << T__22) | (1L << LIST))) != 0)) ) {
				((Function_headerContext)_localctx).retType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(449);
			match(VAR);
			setState(450);
			match(T__15);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__21) | (1L << LIST))) != 0)) {
				{
				setState(451);
				((Function_headerContext)_localctx).type1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__21) | (1L << LIST))) != 0)) ) {
					((Function_headerContext)_localctx).type1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				match(VAR);
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(455);
				match(T__23);
				setState(456);
				((Function_headerContext)_localctx)._tset877 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__21) | (1L << LIST))) != 0)) ) {
					((Function_headerContext)_localctx)._tset877 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Function_headerContext)_localctx).typeRest.add(((Function_headerContext)_localctx)._tset877);
				setState(457);
				match(VAR);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(T__16);
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

	public static class Def_functionContext extends ParserRuleContext {
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
	 
		public Def_functionContext() { }
		public void copyFrom(Def_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefFunctionContext extends Def_functionContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public DefFunctionContext(Def_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_def_function);
		int _la;
		try {
			_localctx = new DefFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__24);
			setState(466);
			function_header();
			setState(467);
			match(T__3);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(468);
				match(SEPARATOR);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << LIST) | (1L << CREATE) | (1L << INPUT) | (1L << RET) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(474);
				instruction();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(END);
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(481);
				match(SEPARATOR);
				}
				}
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Function_callContext {
		public ExprContext singleExpr;
		public ExprContext expr;
		public List<ExprContext> manyExprs = new ArrayList<ExprContext>();
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(VAR);
			setState(487);
			match(T__15);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				setState(488);
				((FunctionCallContext)_localctx).singleExpr = expr(0);
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(491);
				match(T__23);
				setState(492);
				((FunctionCallContext)_localctx).expr = expr(0);
				((FunctionCallContext)_localctx).manyExprs.add(((FunctionCallContext)_localctx).expr);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(T__16);
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

	public static class Function_retContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(quizParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public Function_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterFunction_ret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitFunction_ret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitFunction_ret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_retContext function_ret() throws RecognitionException {
		Function_retContext _localctx = new Function_retContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(RET);
			setState(501);
			expr(0);
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				match(SEPARATOR);
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Structure_ifContext extends ParserRuleContext {
		public Condition_ifContext ifcond;
		public Expr_iforContext expr_ifor;
		public List<Expr_iforContext> ifInst = new ArrayList<Expr_iforContext>();
		public List<Expr_iforContext> elseInst = new ArrayList<Expr_iforContext>();
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public Condition_ifContext condition_if() {
			return getRuleContext(Condition_ifContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<Expr_iforContext> expr_ifor() {
			return getRuleContexts(Expr_iforContext.class);
		}
		public Expr_iforContext expr_ifor(int i) {
			return getRuleContext(Expr_iforContext.class,i);
		}
		public Structure_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterStructure_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitStructure_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitStructure_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_ifContext structure_if() throws RecognitionException {
		Structure_ifContext _localctx = new Structure_ifContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structure_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__25);
			setState(508);
			((Structure_ifContext)_localctx).ifcond = condition_if();
			setState(509);
			match(T__3);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(510);
				match(SEPARATOR);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				((Structure_ifContext)_localctx).expr_ifor = expr_ifor();
				((Structure_ifContext)_localctx).ifInst.add(((Structure_ifContext)_localctx).expr_ifor);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0) );
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(521);
				match(T__26);
				setState(522);
				match(T__3);
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(523);
					match(SEPARATOR);
					}
					}
					setState(526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(528);
					((Structure_ifContext)_localctx).expr_ifor = expr_ifor();
					((Structure_ifContext)_localctx).elseInst.add(((Structure_ifContext)_localctx).expr_ifor);
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0) );
				}
			}

			setState(535);
			match(END);
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(536);
				match(SEPARATOR);
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Condition_ifContext extends ParserRuleContext {
		public Condition_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_if; }
	 
		public Condition_ifContext() { }
		public void copyFrom(Condition_ifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondIfContext extends Condition_ifContext {
		public ExprContext expr;
		public List<ExprContext> extraExp1 = new ArrayList<ExprContext>();
		public List<ExprContext> extraExp2 = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(quizParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(quizParser.OPERATOR, i);
		}
		public TerminalNode NOT() { return getToken(quizParser.NOT, 0); }
		public List<TerminalNode> ANDOR() { return getTokens(quizParser.ANDOR); }
		public TerminalNode ANDOR(int i) {
			return getToken(quizParser.ANDOR, i);
		}
		public CondIfContext(Condition_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCondIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCondIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCondIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_ifContext condition_if() throws RecognitionException {
		Condition_ifContext _localctx = new Condition_ifContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condition_if);
		int _la;
		try {
			_localctx = new CondIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(541);
				match(NOT);
				}
			}

			setState(544);
			expr(0);
			setState(545);
			match(OPERATOR);
			setState(546);
			expr(0);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOR) {
				{
				{
				setState(547);
				match(ANDOR);
				setState(548);
				((CondIfContext)_localctx).expr = expr(0);
				((CondIfContext)_localctx).extraExp1.add(((CondIfContext)_localctx).expr);
				setState(549);
				match(OPERATOR);
				setState(550);
				((CondIfContext)_localctx).expr = expr(0);
				((CondIfContext)_localctx).extraExp2.add(((CondIfContext)_localctx).expr);
				}
				}
				setState(556);
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

	public static class Structure_forContext extends ParserRuleContext {
		public Token forT;
		public TerminalNode VAR() { return getToken(quizParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(quizParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(quizParser.NEWLINE, i);
		}
		public Structure_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterStructure_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitStructure_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitStructure_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_forContext structure_for() throws RecognitionException {
		Structure_forContext _localctx = new Structure_forContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structure_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__27);
			setState(558);
			((Structure_forContext)_localctx).forT = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__21))) != 0)) ) {
				((Structure_forContext)_localctx).forT = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
			match(VAR);
			setState(560);
			match(T__28);
			setState(561);
			expr(0);
			setState(562);
			match(T__3);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(563);
				match(SEPARATOR);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(571);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
				case T__8:
				case T__9:
				case T__11:
				case T__14:
				case T__17:
				case T__24:
				case T__25:
				case T__27:
				case T__29:
				case LIST:
				case CREATE:
				case INPUT:
				case RET:
				case TYPE:
				case VAR:
					{
					setState(569);
					instruction();
					}
					break;
				case NEWLINE:
					{
					setState(570);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << LIST) | (1L << CREATE) | (1L << INPUT) | (1L << RET) | (1L << TYPE) | (1L << VAR) | (1L << NEWLINE))) != 0) );
			setState(575);
			match(END);
			setState(577); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(576);
				match(SEPARATOR);
				}
				}
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARATOR );
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

	public static class Expr_iforContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Generic_assignContext generic_assign() {
			return getRuleContext(Generic_assignContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public Expr_iforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExpr_ifor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExpr_ifor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExpr_ifor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_iforContext expr_ifor() throws RecognitionException {
		Expr_iforContext _localctx = new Expr_iforContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_ifor);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				generic_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				methods();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				loops();
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(quizParser.END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(quizParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(quizParser.SEPARATOR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SHUFFLE() { return getToken(quizParser.SHUFFLE, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__29);
			setState(588);
			match(T__3);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(589);
				match(SEPARATOR);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << INPUT) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(595);
				expr(0);
				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(596);
					match(SEPARATOR);
					}
					}
					setState(599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEPARATOR );
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(END);
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(607);
				match(SHUFFLE);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0265\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6"+
		"\3d\n\3\r\3\16\3e\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\4\3\4\6\4s\n"+
		"\4\r\4\16\4t\3\5\3\5\3\5\3\5\6\5{\n\5\r\5\16\5|\3\6\3\6\5\6\u0081\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3\7\3\7"+
		"\6\7\u0091\n\7\r\7\16\7\u0092\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3"+
		"\7\6\7\u009c\n\7\r\7\16\7\u009d\3\b\3\b\3\b\3\b\6\b\u00a4\n\b\r\b\16\b"+
		"\u00a5\3\t\3\t\3\t\3\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\n\3\n\3\n\6\n\u00b3"+
		"\n\n\r\n\16\n\u00b4\3\13\3\13\3\13\6\13\u00ba\n\13\r\13\16\13\u00bb\3"+
		"\f\3\f\3\f\3\f\6\f\u00c2\n\f\r\f\16\f\u00c3\3\f\3\f\3\f\3\f\6\f\u00ca"+
		"\n\f\r\f\16\f\u00cb\5\f\u00ce\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00d5\n\r\f"+
		"\r\16\r\u00d8\13\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\r\3\r\6\r\u00e2"+
		"\n\r\r\r\16\r\u00e3\3\16\3\16\3\16\3\16\6\16\u00ea\n\16\r\16\16\16\u00eb"+
		"\3\16\3\16\3\16\3\16\6\16\u00f2\n\16\r\16\16\16\u00f3\5\16\u00f6\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00fd\n\17\f\17\16\17\u0100\13\17\3\17"+
		"\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\17\3\17\6\17\u010a\n\17\r\17"+
		"\16\17\u010b\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0114\n\20\3\21\3\21\3"+
		"\21\3\21\6\21\u011a\n\21\r\21\16\21\u011b\3\21\3\21\3\21\3\21\6\21\u0122"+
		"\n\21\r\21\16\21\u0123\3\21\3\21\3\21\3\21\6\21\u012a\n\21\r\21\16\21"+
		"\u012b\5\21\u012e\n\21\3\22\3\22\3\22\3\22\3\22\6\22\u0135\n\22\r\22\16"+
		"\22\u0136\3\23\3\23\3\23\3\23\3\23\6\23\u013e\n\23\r\23\16\23\u013f\3"+
		"\24\3\24\3\24\3\24\3\24\6\24\u0147\n\24\r\24\16\24\u0148\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u0150\n\25\r\25\16\25\u0151\3\26\3\26\3\26\6\26\u0157"+
		"\n\26\r\26\16\26\u0158\3\26\3\26\3\26\6\26\u015e\n\26\r\26\16\26\u015f"+
		"\3\27\3\27\3\27\5\27\u0165\n\27\3\30\3\30\3\30\3\30\3\30\7\30\u016c\n"+
		"\30\f\30\16\30\u016f\13\30\3\30\3\30\3\30\3\30\6\30\u0175\n\30\r\30\16"+
		"\30\u0176\6\30\u0179\n\30\r\30\16\30\u017a\3\30\3\30\6\30\u017f\n\30\r"+
		"\30\16\30\u0180\3\31\3\31\3\31\5\31\u0186\n\31\3\31\3\31\6\31\u018a\n"+
		"\31\r\31\16\31\u018b\3\32\3\32\3\32\5\32\u0191\n\32\3\32\3\32\6\32\u0195"+
		"\n\32\r\32\16\32\u0196\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u01a3\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\6\33\u01b1\n\33\r\33\16\33\u01b2\3\33\3\33\3\33\3\33\3\33\7"+
		"\33\u01ba\n\33\f\33\16\33\u01bd\13\33\3\34\3\34\5\34\u01c1\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u01c8\n\35\3\35\3\35\3\35\7\35\u01cd\n\35\f\35"+
		"\16\35\u01d0\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u01d8\n\36\f\36"+
		"\16\36\u01db\13\36\3\36\7\36\u01de\n\36\f\36\16\36\u01e1\13\36\3\36\3"+
		"\36\6\36\u01e5\n\36\r\36\16\36\u01e6\3\37\3\37\3\37\5\37\u01ec\n\37\3"+
		"\37\3\37\7\37\u01f0\n\37\f\37\16\37\u01f3\13\37\3\37\3\37\3 \3 \3 \6 "+
		"\u01fa\n \r \16 \u01fb\3!\3!\3!\3!\7!\u0202\n!\f!\16!\u0205\13!\3!\6!"+
		"\u0208\n!\r!\16!\u0209\3!\3!\3!\6!\u020f\n!\r!\16!\u0210\3!\6!\u0214\n"+
		"!\r!\16!\u0215\5!\u0218\n!\3!\3!\6!\u021c\n!\r!\16!\u021d\3\"\5\"\u0221"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u022b\n\"\f\"\16\"\u022e\13\""+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u0237\n#\f#\16#\u023a\13#\3#\3#\6#\u023e\n#\r"+
		"#\16#\u023f\3#\3#\6#\u0244\n#\r#\16#\u0245\3$\3$\3$\3$\5$\u024c\n$\3%"+
		"\3%\3%\7%\u0251\n%\f%\16%\u0254\13%\3%\3%\6%\u0258\n%\r%\16%\u0259\7%"+
		"\u025c\n%\f%\16%\u025f\13%\3%\3%\5%\u0263\n%\3%\2\3\64&\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\6\4\2-\60\62"+
		"\62\6\2\3\4\n\f\30\31\"\"\6\2\3\4\n\f\30\30\"\"\5\2\3\5\n\f\30\30\2\u02a8"+
		"\2M\3\2\2\2\4l\3\2\2\2\6n\3\2\2\2\bv\3\2\2\2\n\u0080\3\2\2\2\f\u0082\3"+
		"\2\2\2\16\u009f\3\2\2\2\20\u00a7\3\2\2\2\22\u00af\3\2\2\2\24\u00b6\3\2"+
		"\2\2\26\u00cd\3\2\2\2\30\u00cf\3\2\2\2\32\u00f5\3\2\2\2\34\u00f7\3\2\2"+
		"\2\36\u0113\3\2\2\2 \u012d\3\2\2\2\"\u012f\3\2\2\2$\u0138\3\2\2\2&\u0141"+
		"\3\2\2\2(\u014a\3\2\2\2*\u0153\3\2\2\2,\u0164\3\2\2\2.\u0166\3\2\2\2\60"+
		"\u0182\3\2\2\2\62\u018d\3\2\2\2\64\u01a2\3\2\2\2\66\u01c0\3\2\2\28\u01c2"+
		"\3\2\2\2:\u01d3\3\2\2\2<\u01e8\3\2\2\2>\u01f6\3\2\2\2@\u01fd\3\2\2\2B"+
		"\u0220\3\2\2\2D\u022f\3\2\2\2F\u024b\3\2\2\2H\u024d\3\2\2\2JL\7\63\2\2"+
		"KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\4\3\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\78\2\2"+
		"WX\7\2\2\3X\3\3\2\2\2Ym\5\n\6\2Zm\5\36\20\2[m\5\16\b\2\\m\5\20\t\2]m\5"+
		"\22\n\2^m\5\24\13\2_m\5,\27\2`m\5:\36\2ac\5<\37\2bd\7\63\2\2cb\3\2\2\2"+
		"de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fm\3\2\2\2gm\5\66\34\2hm\5\b\5\2im\5\6\4"+
		"\2jm\5\f\7\2km\5> \2lY\3\2\2\2lZ\3\2\2\2l[\3\2\2\2l\\\3\2\2\2l]\3\2\2"+
		"\2l^\3\2\2\2l_\3\2\2\2l`\3\2\2\2la\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2"+
		"\2lj\3\2\2\2lk\3\2\2\2m\5\3\2\2\2no\7\'\2\2op\7\3\2\2pr\7;\2\2qs\7\63"+
		"\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\7\3\2\2\2vw\7\'\2\2wx\7"+
		"\4\2\2xz\7;\2\2y{\7\63\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\t"+
		"\3\2\2\2~\u0081\5\30\r\2\177\u0081\5\34\17\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\7\'\2\2\u0083\u0084\7\5\2\2\u0084"+
		"\u0085\7;\2\2\u0085\u0089\7\6\2\2\u0086\u0088\7\63\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0096\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\60\2\2\u008d\u008e\7"+
		"\7\2\2\u008e\u0090\5\64\33\2\u008f\u0091\7\63\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u008c\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7&"+
		"\2\2\u009a\u009c\7\63\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\7;\2\2"+
		"\u00a0\u00a1\7#\2\2\u00a1\u00a3\5\64\33\2\u00a2\u00a4\7\63\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\17\3\2\2\2\u00a7\u00a8\7;\2\2\u00a8\u00a9\7$\2\2\u00a9\u00ab\5\64\33"+
		"\2\u00aa\u00ac\7\63\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\7;\2\2"+
		"\u00b0\u00b2\7!\2\2\u00b1\u00b3\7\63\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\23\3\2\2\2\u00b6"+
		"\u00b7\7;\2\2\u00b7\u00b9\7%\2\2\u00b8\u00ba\7\63\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\25\3\2\2\2\u00bd\u00be\7/\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\5\64\33"+
		"\2\u00c0\u00c2\7\63\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ce\3\2\2\2\u00c5\u00c6\7-"+
		"\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\5\64\33\2\u00c8\u00ca\7\63\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00bd\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce"+
		"\27\3\2\2\2\u00cf\u00d0\7\'\2\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\7;\2\2"+
		"\u00d2\u00d6\7\6\2\2\u00d3\u00d5\7\63\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\5\26\f\2\u00da\u00d9\3\2\2\2\u00db\u00de\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e1\7&\2\2\u00e0\u00e2\7\63\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\31\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\7\7\2\2\u00e7\u00e9\5\64\33"+
		"\2\u00e8\u00ea\7\63\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f6\3\2\2\2\u00ed\u00ee\7."+
		"\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f1\5\64\33\2\u00f0\u00f2\7\63\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f6"+
		"\33\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7*\2\2\u00f9\u00fa\7;\2\2"+
		"\u00fa\u00fe\7\6\2\2\u00fb\u00fd\7\63\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\5\32\16\2\u0102\u0101\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0109\7&\2\2\u0108\u010a\7\63\2\2\u0109\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\35\3\2\2\2\u010d\u0114\5\"\22\2\u010e\u0114\5$\23\2\u010f\u0114\5(\25"+
		"\2\u0110\u0114\5&\24\2\u0111\u0114\5 \21\2\u0112\u0114\5*\26\2\u0113\u010d"+
		"\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\37\3\2\2\2\u0115\u0116\7;\2\2"+
		"\u0116\u0117\7\7\2\2\u0117\u0119\5\64\33\2\u0118\u011a\7\63\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u012e\3\2\2\2\u011d\u011e\7;\2\2\u011e\u011f\7\b\2\2\u011f"+
		"\u0121\5\64\33\2\u0120\u0122\7\63\2\2\u0121\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012e\3\2\2\2\u0125"+
		"\u0126\7;\2\2\u0126\u0127\7\t\2\2\u0127\u0129\5\64\33\2\u0128\u012a\7"+
		"\63\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u0115\3\2\2\2\u012d\u011d\3\2"+
		"\2\2\u012d\u0125\3\2\2\2\u012e!\3\2\2\2\u012f\u0130\7\n\2\2\u0130\u0131"+
		"\7;\2\2\u0131\u0132\7\7\2\2\u0132\u0134\5\64\33\2\u0133\u0135\7\63\2\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137#\3\2\2\2\u0138\u0139\7\13\2\2\u0139\u013a\7;\2\2\u013a"+
		"\u013b\7\7\2\2\u013b\u013d\5\64\33\2\u013c\u013e\7\63\2\2\u013d\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"%\3\2\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7;\2\2\u0143\u0144\7\7\2\2\u0144"+
		"\u0146\5\64\33\2\u0145\u0147\7\63\2\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\'\3\2\2\2\u014a"+
		"\u014b\7\f\2\2\u014b\u014c\7;\2\2\u014c\u014d\7\7\2\2\u014d\u014f\5\64"+
		"\33\2\u014e\u0150\7\63\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152)\3\2\2\2\u0153\u0156\5\64\33"+
		"\2\u0154\u0155\7\r\2\2\u0155\u0157\t\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\7\7\2\2\u015b\u015d\5\64\33\2\u015c\u015e\7\63\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"+\3\2\2\2\u0161\u0165\5\60\31\2\u0162\u0165\5\62\32\2\u0163\u0165\5.\30"+
		"\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165-"+
		"\3\2\2\2\u0166\u0167\7\16\2\2\u0167\u0168\7\17\2\2\u0168\u0169\5\64\33"+
		"\2\u0169\u016d\7\6\2\2\u016a\u016c\7\63\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0178\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7;\2\2\u0171\u0172\7\20\2\2\u0172"+
		"\u0174\7;\2\2\u0173\u0175\7\63\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0170\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7&\2\2\u017d\u017f\7\63\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181/\3\2\2\2\u0182\u0183\7\21\2\2\u0183\u0185\7\22\2\2\u0184\u0186"+
		"\5\64\33\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2"+
		"\u0187\u0189\7\23\2\2\u0188\u018a\7\63\2\2\u0189\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\61\3\2\2\2\u018d"+
		"\u018e\7\24\2\2\u018e\u0190\7\22\2\2\u018f\u0191\5\64\33\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\7\23\2\2"+
		"\u0193\u0195\7\63\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\63\3\2\2\2\u0198\u0199\b\33\1\2\u0199"+
		"\u019a\7(\2\2\u019a\u01a3\5\64\33\13\u019b\u019c\7;\2\2\u019c\u019d\7"+
		"\61\2\2\u019d\u01a3\5\64\33\n\u019e\u01a3\79\2\2\u019f\u01a3\5H%\2\u01a0"+
		"\u01a3\7;\2\2\u01a1\u01a3\5<\37\2\u01a2\u0198\3\2\2\2\u01a2\u019b\3\2"+
		"\2\2\u01a2\u019e\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01bb\3\2\2\2\u01a4\u01a5\f\r\2\2\u01a5\u01a6\7\64"+
		"\2\2\u01a6\u01ba\5\64\33\16\u01a7\u01a8\f\4\2\2\u01a8\u01a9\7\27\2\2\u01a9"+
		"\u01ba\5\64\33\5\u01aa\u01ab\f\3\2\2\u01ab\u01ac\7\6\2\2\u01ac\u01ba\5"+
		"\64\33\4\u01ad\u01b0\f\f\2\2\u01ae\u01af\7\r\2\2\u01af\u01b1\t\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01ba\3\2\2\2\u01b4\u01b5\f\5\2\2\u01b5\u01b6\7\25\2\2\u01b6"+
		"\u01b7\5\64\33\2\u01b7\u01b8\7\26\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01a4"+
		"\3\2\2\2\u01b9\u01a7\3\2\2\2\u01b9\u01aa\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9"+
		"\u01b4\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\65\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\5D#\2\u01bf\u01c1"+
		"\5@!\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\67\3\2\2\2\u01c2"+
		"\u01c3\t\3\2\2\u01c3\u01c4\7;\2\2\u01c4\u01c7\7\22\2\2\u01c5\u01c6\t\4"+
		"\2\2\u01c6\u01c8\7;\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ce\3\2\2\2\u01c9\u01ca\7\32\2\2\u01ca\u01cb\t\4\2\2\u01cb\u01cd\7"+
		";\2\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\23"+
		"\2\2\u01d29\3\2\2\2\u01d3\u01d4\7\33\2\2\u01d4\u01d5\58\35\2\u01d5\u01d9"+
		"\7\6\2\2\u01d6\u01d8\7\63\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01df\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01de\5\4\3\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e4\7&\2\2\u01e3\u01e5\7\63\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7;\3\2\2\2"+
		"\u01e8\u01e9\7;\2\2\u01e9\u01eb\7\22\2\2\u01ea\u01ec\5\64\33\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f1\3\2\2\2\u01ed\u01ee\7\32\2\2"+
		"\u01ee\u01f0\5\64\33\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\7\23\2\2\u01f5=\3\2\2\2\u01f6\u01f7\7+\2\2\u01f7\u01f9\5\64\33"+
		"\2\u01f8\u01fa\7\63\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc?\3\2\2\2\u01fd\u01fe\7\34\2\2"+
		"\u01fe\u01ff\5B\"\2\u01ff\u0203\7\6\2\2\u0200\u0202\7\63\2\2\u0201\u0200"+
		"\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\5F$\2\u0207\u0206\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0217"+
		"\3\2\2\2\u020b\u020c\7\35\2\2\u020c\u020e\7\6\2\2\u020d\u020f\7\63\2\2"+
		"\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\5F$\2\u0213\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2"+
		"\2\2\u0217\u020b\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021b\7&\2\2\u021a\u021c\7\63\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021eA\3\2\2\2\u021f\u0221"+
		"\7\67\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2"+
		"\u0222\u0223\5\64\33\2\u0223\u0224\7\66\2\2\u0224\u022c\5\64\33\2\u0225"+
		"\u0226\7\65\2\2\u0226\u0227\5\64\33\2\u0227\u0228\7\66\2\2\u0228\u0229"+
		"\5\64\33\2\u0229\u022b\3\2\2\2\u022a\u0225\3\2\2\2\u022b\u022e\3\2\2\2"+
		"\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dC\3\2\2\2\u022e\u022c\3"+
		"\2\2\2\u022f\u0230\7\36\2\2\u0230\u0231\t\5\2\2\u0231\u0232\7;\2\2\u0232"+
		"\u0233\7\37\2\2\u0233\u0234\5\64\33\2\u0234\u0238\7\6\2\2\u0235\u0237"+
		"\7\63\2\2\u0236\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2"+
		"\u0238\u0239\3\2\2\2\u0239\u023d\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023e"+
		"\5\4\3\2\u023c\u023e\7@\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0243\7&\2\2\u0242\u0244\7\63\2\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246E\3\2\2\2"+
		"\u0247\u024c\5\64\33\2\u0248\u024c\5 \21\2\u0249\u024c\5,\27\2\u024a\u024c"+
		"\5\66\34\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2"+
		"\u024b\u024a\3\2\2\2\u024cG\3\2\2\2\u024d\u024e\7 \2\2\u024e\u0252\7\6"+
		"\2\2\u024f\u0251\7\63\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u025d\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0255\u0257\5\64\33\2\u0256\u0258\7\63\2\2\u0257\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2"+
		"\2\2\u025b\u0255\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\7&"+
		"\2\2\u0261\u0263\7!\2\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"I\3\2\2\2OMSelt|\u0080\u0089\u0092\u0096\u009d\u00a5\u00ad\u00b4\u00bb"+
		"\u00c3\u00cb\u00cd\u00d6\u00dc\u00e3\u00eb\u00f3\u00f5\u00fe\u0104\u010b"+
		"\u0113\u011b\u0123\u012b\u012d\u0136\u013f\u0148\u0151\u0158\u015f\u0164"+
		"\u016d\u0176\u017a\u0180\u0185\u018b\u0190\u0196\u01a2\u01b2\u01b9\u01bb"+
		"\u01c0\u01c7\u01ce\u01d9\u01df\u01e6\u01eb\u01f1\u01fb\u0203\u0209\u0210"+
		"\u0215\u0217\u021d\u0220\u022c\u0238\u023d\u023f\u0245\u024b\u0252\u0259"+
		"\u025d\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}