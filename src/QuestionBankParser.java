// Generated from QuestionBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuestionBankParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, SEPARATOR=14, NEWLINE=15, COMMENT_SINGLE=16, 
		COMMENT_MULTI=17, TEXT=18, Integer=19, WS=20;
	public static final int
		RULE_program = 0, RULE_theme = 1, RULE_questions_list = 2, RULE_question = 3, 
		RULE_multiple_choice = 4, RULE_opts = 5, RULE_matching = 6, RULE_column = 7, 
		RULE_match = 8, RULE_element = 9, RULE_mt = 10, RULE_id = 11, RULE_description = 12, 
		RULE_difficulty = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "theme", "questions_list", "question", "multiple_choice", 
			"opts", "matching", "column", "match", "element", "mt", "id", "description", 
			"difficulty"
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

	@Override
	public String getGrammarFileName() { return "QuestionBank.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionBankParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ThemeContext theme() {
			return getRuleContext(ThemeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QuestionBankParser.EOF, 0); }
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(28);
				match(SEPARATOR);
				}
			}

			setState(31);
			theme();
			setState(32);
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

	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(QuestionBankParser.TEXT, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(QuestionBankParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(QuestionBankParser.SEPARATOR, i);
		}
		public Questions_listContext questions_list() {
			return getRuleContext(Questions_listContext.class,0);
		}
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitTheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_theme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			match(TEXT);
			setState(37);
			match(SEPARATOR);
			setState(38);
			questions_list();
			setState(39);
			match(T__2);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(40);
				match(SEPARATOR);
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

	public static class Questions_listContext extends ParserRuleContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public Questions_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterQuestions_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitQuestions_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitQuestions_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Questions_listContext questions_list() throws RecognitionException {
		Questions_listContext _localctx = new Questions_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questions_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__5) {
				{
				{
				setState(43);
				question();
				}
				}
				setState(48);
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

	public static class QuestionContext extends ParserRuleContext {
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	 
		public QuestionContext() { }
		public void copyFrom(QuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VisitMultiChcContext extends QuestionContext {
		public Multiple_choiceContext multiple_choice() {
			return getRuleContext(Multiple_choiceContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public VisitMultiChcContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterVisitMultiChc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitVisitMultiChc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitVisitMultiChc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VisitMatchingContext extends QuestionContext {
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public VisitMatchingContext(QuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterVisitMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitVisitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitVisitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new VisitMultiChcContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__3);
				setState(50);
				match(T__4);
				setState(51);
				multiple_choice();
				setState(52);
				match(SEPARATOR);
				}
				break;
			case T__5:
				_localctx = new VisitMatchingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__5);
				setState(55);
				match(T__4);
				setState(56);
				matching();
				setState(57);
				match(SEPARATOR);
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

	public static class Multiple_choiceContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public List<OptsContext> opts() {
			return getRuleContexts(OptsContext.class);
		}
		public OptsContext opts(int i) {
			return getRuleContext(OptsContext.class,i);
		}
		public Multiple_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterMultiple_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitMultiple_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitMultiple_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choiceContext multiple_choice() throws RecognitionException {
		Multiple_choiceContext _localctx = new Multiple_choiceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiple_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			id();
			setState(62);
			match(T__4);
			setState(63);
			difficulty();
			setState(64);
			match(T__4);
			setState(65);
			description();
			setState(66);
			match(T__1);
			setState(67);
			match(SEPARATOR);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(68);
				opts();
				}
				}
				setState(73);
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

	public static class OptsContext extends ParserRuleContext {
		public Token value;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(QuestionBankParser.TEXT, 0); }
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public OptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitOpts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptsContext opts() throws RecognitionException {
		OptsContext _localctx = new OptsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			id();
			setState(75);
			match(T__4);
			setState(76);
			match(TEXT);
			setState(77);
			match(T__6);
			setState(78);
			((OptsContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
				((OptsContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			match(SEPARATOR);
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

	public static class MatchingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matching);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			id();
			setState(82);
			match(T__4);
			setState(83);
			difficulty();
			setState(84);
			match(T__4);
			setState(85);
			description();
			setState(86);
			match(T__1);
			setState(87);
			match(SEPARATOR);
			setState(88);
			match(T__9);
			setState(89);
			match(T__4);
			setState(90);
			column();
			setState(91);
			match(T__10);
			setState(92);
			match(T__4);
			setState(93);
			column();
			setState(94);
			match();
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(96);
				element();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(SEPARATOR);
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

	public static class MatchContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(QuestionBankParser.SEPARATOR, 0); }
		public List<MtContext> mt() {
			return getRuleContexts(MtContext.class);
		}
		public MtContext mt(int i) {
			return getRuleContext(MtContext.class,i);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__11);
			setState(105);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(106);
				mt();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(SEPARATOR);
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

	public static class ElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(QuestionBankParser.TEXT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_element);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				id();
				setState(115);
				match(T__4);
				setState(116);
				match(TEXT);
				setState(117);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				id();
				setState(120);
				match(T__4);
				setState(121);
				match(TEXT);
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

	public static class MtContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public MtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterMt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitMt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitMt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MtContext mt() throws RecognitionException {
		MtContext _localctx = new MtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				id();
				setState(126);
				match(T__4);
				setState(127);
				id();
				setState(128);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				id();
				setState(131);
				match(T__4);
				setState(132);
				id();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(QuestionBankParser.TEXT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(TEXT);
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(QuestionBankParser.TEXT, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TEXT);
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

	public static class DifficultyContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(QuestionBankParser.Integer, 0); }
		public DifficultyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difficulty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).enterDifficulty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionBankListener ) ((QuestionBankListener)listener).exitDifficulty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionBankVisitor ) return ((QuestionBankVisitor<? extends T>)visitor).visitDifficulty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DifficultyContext difficulty() throws RecognitionException {
		DifficultyContext _localctx = new DifficultyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_difficulty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Integer);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\7\td\n\t\f\t\16\t"+
		"g\13\t\3\t\3\t\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\n\13\2\u008b\2\37\3\2\2\2\4$\3"+
		"\2\2\2\6\60\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fL\3\2\2\2\16S\3\2\2\2\20e\3"+
		"\2\2\2\22j\3\2\2\2\24}\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u008c"+
		"\3\2\2\2\34\u008e\3\2\2\2\36 \7\20\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2"+
		"\2\2!\"\5\4\3\2\"#\7\2\2\3#\3\3\2\2\2$%\7\3\2\2%&\7\4\2\2&\'\7\24\2\2"+
		"\'(\7\20\2\2()\5\6\4\2)+\7\5\2\2*,\7\20\2\2+*\3\2\2\2+,\3\2\2\2,\5\3\2"+
		"\2\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\7\3"+
		"\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\65\7\7\2\2\65\66\5\n\6\2\66\67\7"+
		"\20\2\2\67>\3\2\2\289\7\b\2\29:\7\7\2\2:;\5\16\b\2;<\7\20\2\2<>\3\2\2"+
		"\2=\63\3\2\2\2=8\3\2\2\2>\t\3\2\2\2?@\5\30\r\2@A\7\7\2\2AB\5\34\17\2B"+
		"C\7\7\2\2CD\5\32\16\2DE\7\4\2\2EI\7\20\2\2FH\5\f\7\2GF\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\5\30\r\2MN\7\7\2\2NO\7"+
		"\24\2\2OP\7\t\2\2PQ\t\2\2\2QR\7\20\2\2R\r\3\2\2\2ST\5\30\r\2TU\7\7\2\2"+
		"UV\5\34\17\2VW\7\7\2\2WX\5\32\16\2XY\7\4\2\2YZ\7\20\2\2Z[\7\f\2\2[\\\7"+
		"\7\2\2\\]\5\20\t\2]^\7\r\2\2^_\7\7\2\2_`\5\20\t\2`a\5\22\n\2a\17\3\2\2"+
		"\2bd\5\24\13\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2"+
		"\2\2hi\7\20\2\2i\21\3\2\2\2jk\7\16\2\2ko\7\7\2\2ln\5\26\f\2ml\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\20\2\2s\23\3\2"+
		"\2\2tu\5\30\r\2uv\7\7\2\2vw\7\24\2\2wx\7\17\2\2x~\3\2\2\2yz\5\30\r\2z"+
		"{\7\7\2\2{|\7\24\2\2|~\3\2\2\2}t\3\2\2\2}y\3\2\2\2~\25\3\2\2\2\177\u0080"+
		"\5\30\r\2\u0080\u0081\7\7\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\t\2\2"+
		"\u0083\u0089\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\7\2\2\u0086\u0087"+
		"\5\30\r\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0084\3\2\2\2\u0089"+
		"\27\3\2\2\2\u008a\u008b\7\24\2\2\u008b\31\3\2\2\2\u008c\u008d\7\24\2\2"+
		"\u008d\33\3\2\2\2\u008e\u008f\7\25\2\2\u008f\35\3\2\2\2\13\37+\60=Ieo"+
		"}\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}