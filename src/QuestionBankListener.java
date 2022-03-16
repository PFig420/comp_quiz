// Generated from QuestionBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionBankParser}.
 */
public interface QuestionBankListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuestionBankParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuestionBankParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(QuestionBankParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(QuestionBankParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#questions_list}.
	 * @param ctx the parse tree
	 */
	void enterQuestions_list(QuestionBankParser.Questions_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#questions_list}.
	 * @param ctx the parse tree
	 */
	void exitQuestions_list(QuestionBankParser.Questions_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitMultiChc}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 */
	void enterVisitMultiChc(QuestionBankParser.VisitMultiChcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitMultiChc}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 */
	void exitVisitMultiChc(QuestionBankParser.VisitMultiChcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitMatching}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 */
	void enterVisitMatching(QuestionBankParser.VisitMatchingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitMatching}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 */
	void exitVisitMatching(QuestionBankParser.VisitMatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#multiple_choice}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_choice(QuestionBankParser.Multiple_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#multiple_choice}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_choice(QuestionBankParser.Multiple_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#opts}.
	 * @param ctx the parse tree
	 */
	void enterOpts(QuestionBankParser.OptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#opts}.
	 * @param ctx the parse tree
	 */
	void exitOpts(QuestionBankParser.OptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(QuestionBankParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(QuestionBankParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(QuestionBankParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(QuestionBankParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(QuestionBankParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(QuestionBankParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(QuestionBankParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(QuestionBankParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#mt}.
	 * @param ctx the parse tree
	 */
	void enterMt(QuestionBankParser.MtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#mt}.
	 * @param ctx the parse tree
	 */
	void exitMt(QuestionBankParser.MtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QuestionBankParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QuestionBankParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(QuestionBankParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(QuestionBankParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionBankParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void enterDifficulty(QuestionBankParser.DifficultyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionBankParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void exitDifficulty(QuestionBankParser.DifficultyContext ctx);
}