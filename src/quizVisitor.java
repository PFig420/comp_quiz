// Generated from quiz.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link quizParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface quizVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuiz(quizParser.QuizContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(quizParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defQuiz}
	 * labeled alternative in {@link quizParser#def_quiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefQuiz(quizParser.DefQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defBlock}
	 * labeled alternative in {@link quizParser#def_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefBlock(quizParser.DefBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defQuestionQMC}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefQuestionQMC(quizParser.DefQuestionQMCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defQuestionQM}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefQuestionQM(quizParser.DefQuestionQMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defBlockquiz}
	 * labeled alternative in {@link quizParser#def_blockquiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefBlockquiz(quizParser.DefBlockquizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodAdd}
	 * labeled alternative in {@link quizParser#method_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAdd(quizParser.MethodAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodRemove}
	 * labeled alternative in {@link quizParser#method_remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodRemove(quizParser.MethodRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodShuffle}
	 * labeled alternative in {@link quizParser#method_shuffle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodShuffle(quizParser.MethodShuffleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodExecute}
	 * labeled alternative in {@link quizParser#method_execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExecute(quizParser.MethodExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_qmc_q_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qmc_q_attr(quizParser.Def_qmc_q_attrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_qmc_qmc_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qmc_qmc_attr(quizParser.Def_qmc_qmc_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#def_qmc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qmc(quizParser.Def_qmcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_qm_q_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qm_q_attr(quizParser.Def_qm_q_attrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_qm_qm_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qm_qm_attr(quizParser.Def_qm_qm_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#def_qm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_qm(quizParser.Def_qmContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(quizParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignGenEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGenEquals(quizParser.AssignGenEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignGenPlusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGenPlusEquals(quizParser.AssignGenPlusEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignGenMinusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignGenMinusEquals(quizParser.AssignGenMinusEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAssign}
	 * labeled alternative in {@link quizParser#number_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAssign(quizParser.NumberAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textAssign}
	 * labeled alternative in {@link quizParser#text_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAssign(quizParser.TextAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAssign}
	 * labeled alternative in {@link quizParser#group_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssign(quizParser.ListAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link quizParser#bool_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssign(quizParser.BoolAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrAssign}
	 * labeled alternative in {@link quizParser#attr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrAssign(quizParser.AttrAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodPrint}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPrint(quizParser.MethodPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodPrintln}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPrintln(quizParser.MethodPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodLoad}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodLoad(quizParser.MethodLoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(quizParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(quizParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(quizParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprType}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprType(quizParser.ExprTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOperator}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOperator(quizParser.ExprOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInput}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInput(quizParser.ExprInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAttrAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAttrAccess(quizParser.ExprAttrAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGroup(quizParser.ExprGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdxAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdxAccess(quizParser.ExprIdxAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(quizParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMatch}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMatch(quizParser.ExprMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprQCheckanswer}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprQCheckanswer(quizParser.ExprQCheckanswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOption}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOption(quizParser.ExprOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunctionCall(quizParser.ExprFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopsStructFor}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopsStructFor(quizParser.LoopsStructForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopsStructIf}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopsStructIf(quizParser.LoopsStructIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(quizParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link quizParser#def_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(quizParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link quizParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(quizParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#function_ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ret(quizParser.Function_retContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#structure_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_if(quizParser.Structure_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condIf}
	 * labeled alternative in {@link quizParser#condition_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIf(quizParser.CondIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#structure_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_for(quizParser.Structure_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#expr_ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_ifor(quizParser.Expr_iforContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(quizParser.GroupContext ctx);
}