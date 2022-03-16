// Generated from QuestionBank.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionBankParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionBankVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuestionBankParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(QuestionBankParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#questions_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions_list(QuestionBankParser.Questions_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitMultiChc}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitMultiChc(QuestionBankParser.VisitMultiChcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitMatching}
	 * labeled alternative in {@link QuestionBankParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitMatching(QuestionBankParser.VisitMatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#multiple_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice(QuestionBankParser.Multiple_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpts(QuestionBankParser.OptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(QuestionBankParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(QuestionBankParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(QuestionBankParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(QuestionBankParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#mt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMt(QuestionBankParser.MtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuestionBankParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(QuestionBankParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionBankParser#difficulty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifficulty(QuestionBankParser.DifficultyContext ctx);
}