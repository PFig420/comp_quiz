// Generated from quiz.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link quizParser}.
 */
public interface quizListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void enterQuiz(quizParser.QuizContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void exitQuiz(quizParser.QuizContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(quizParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(quizParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defQuiz}
	 * labeled alternative in {@link quizParser#def_quiz}.
	 * @param ctx the parse tree
	 */
	void enterDefQuiz(quizParser.DefQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defQuiz}
	 * labeled alternative in {@link quizParser#def_quiz}.
	 * @param ctx the parse tree
	 */
	void exitDefQuiz(quizParser.DefQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defBlock}
	 * labeled alternative in {@link quizParser#def_block}.
	 * @param ctx the parse tree
	 */
	void enterDefBlock(quizParser.DefBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defBlock}
	 * labeled alternative in {@link quizParser#def_block}.
	 * @param ctx the parse tree
	 */
	void exitDefBlock(quizParser.DefBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defQuestionQMC}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 */
	void enterDefQuestionQMC(quizParser.DefQuestionQMCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defQuestionQMC}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 */
	void exitDefQuestionQMC(quizParser.DefQuestionQMCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defQuestionQM}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 */
	void enterDefQuestionQM(quizParser.DefQuestionQMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defQuestionQM}
	 * labeled alternative in {@link quizParser#def_question}.
	 * @param ctx the parse tree
	 */
	void exitDefQuestionQM(quizParser.DefQuestionQMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defBlockquiz}
	 * labeled alternative in {@link quizParser#def_blockquiz}.
	 * @param ctx the parse tree
	 */
	void enterDefBlockquiz(quizParser.DefBlockquizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defBlockquiz}
	 * labeled alternative in {@link quizParser#def_blockquiz}.
	 * @param ctx the parse tree
	 */
	void exitDefBlockquiz(quizParser.DefBlockquizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodAdd}
	 * labeled alternative in {@link quizParser#method_add}.
	 * @param ctx the parse tree
	 */
	void enterMethodAdd(quizParser.MethodAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodAdd}
	 * labeled alternative in {@link quizParser#method_add}.
	 * @param ctx the parse tree
	 */
	void exitMethodAdd(quizParser.MethodAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodRemove}
	 * labeled alternative in {@link quizParser#method_remove}.
	 * @param ctx the parse tree
	 */
	void enterMethodRemove(quizParser.MethodRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodRemove}
	 * labeled alternative in {@link quizParser#method_remove}.
	 * @param ctx the parse tree
	 */
	void exitMethodRemove(quizParser.MethodRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodShuffle}
	 * labeled alternative in {@link quizParser#method_shuffle}.
	 * @param ctx the parse tree
	 */
	void enterMethodShuffle(quizParser.MethodShuffleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodShuffle}
	 * labeled alternative in {@link quizParser#method_shuffle}.
	 * @param ctx the parse tree
	 */
	void exitMethodShuffle(quizParser.MethodShuffleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExecute}
	 * labeled alternative in {@link quizParser#method_execute}.
	 * @param ctx the parse tree
	 */
	void enterMethodExecute(quizParser.MethodExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExecute}
	 * labeled alternative in {@link quizParser#method_execute}.
	 * @param ctx the parse tree
	 */
	void exitMethodExecute(quizParser.MethodExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_qmc_q_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 */
	void enterDef_qmc_q_attr(quizParser.Def_qmc_q_attrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_qmc_q_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 */
	void exitDef_qmc_q_attr(quizParser.Def_qmc_q_attrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_qmc_qmc_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 */
	void enterDef_qmc_qmc_attr(quizParser.Def_qmc_qmc_attrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_qmc_qmc_attr}
	 * labeled alternative in {@link quizParser#def_qmc_attr}.
	 * @param ctx the parse tree
	 */
	void exitDef_qmc_qmc_attr(quizParser.Def_qmc_qmc_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#def_qmc}.
	 * @param ctx the parse tree
	 */
	void enterDef_qmc(quizParser.Def_qmcContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#def_qmc}.
	 * @param ctx the parse tree
	 */
	void exitDef_qmc(quizParser.Def_qmcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_qm_q_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 */
	void enterDef_qm_q_attr(quizParser.Def_qm_q_attrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_qm_q_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 */
	void exitDef_qm_q_attr(quizParser.Def_qm_q_attrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code def_qm_qm_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 */
	void enterDef_qm_qm_attr(quizParser.Def_qm_qm_attrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code def_qm_qm_attr}
	 * labeled alternative in {@link quizParser#def_qm_attr}.
	 * @param ctx the parse tree
	 */
	void exitDef_qm_qm_attr(quizParser.Def_qm_qm_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#def_qm}.
	 * @param ctx the parse tree
	 */
	void enterDef_qm(quizParser.Def_qmContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#def_qm}.
	 * @param ctx the parse tree
	 */
	void exitDef_qm(quizParser.Def_qmContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(quizParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(quizParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignGenEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignGenEquals(quizParser.AssignGenEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignGenEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignGenEquals(quizParser.AssignGenEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignGenPlusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignGenPlusEquals(quizParser.AssignGenPlusEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignGenPlusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignGenPlusEquals(quizParser.AssignGenPlusEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignGenMinusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignGenMinusEquals(quizParser.AssignGenMinusEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignGenMinusEquals}
	 * labeled alternative in {@link quizParser#generic_assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignGenMinusEquals(quizParser.AssignGenMinusEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAssign}
	 * labeled alternative in {@link quizParser#number_assign}.
	 * @param ctx the parse tree
	 */
	void enterNumberAssign(quizParser.NumberAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAssign}
	 * labeled alternative in {@link quizParser#number_assign}.
	 * @param ctx the parse tree
	 */
	void exitNumberAssign(quizParser.NumberAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textAssign}
	 * labeled alternative in {@link quizParser#text_assign}.
	 * @param ctx the parse tree
	 */
	void enterTextAssign(quizParser.TextAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textAssign}
	 * labeled alternative in {@link quizParser#text_assign}.
	 * @param ctx the parse tree
	 */
	void exitTextAssign(quizParser.TextAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listAssign}
	 * labeled alternative in {@link quizParser#group_assign}.
	 * @param ctx the parse tree
	 */
	void enterListAssign(quizParser.ListAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listAssign}
	 * labeled alternative in {@link quizParser#group_assign}.
	 * @param ctx the parse tree
	 */
	void exitListAssign(quizParser.ListAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link quizParser#bool_assign}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssign(quizParser.BoolAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link quizParser#bool_assign}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssign(quizParser.BoolAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrAssign}
	 * labeled alternative in {@link quizParser#attr_assign}.
	 * @param ctx the parse tree
	 */
	void enterAttrAssign(quizParser.AttrAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrAssign}
	 * labeled alternative in {@link quizParser#attr_assign}.
	 * @param ctx the parse tree
	 */
	void exitAttrAssign(quizParser.AttrAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodPrint}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethodPrint(quizParser.MethodPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodPrint}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethodPrint(quizParser.MethodPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodPrintln}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethodPrintln(quizParser.MethodPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodPrintln}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethodPrintln(quizParser.MethodPrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodLoad}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethodLoad(quizParser.MethodLoadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodLoad}
	 * labeled alternative in {@link quizParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethodLoad(quizParser.MethodLoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(quizParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(quizParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(quizParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(quizParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(quizParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(quizParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprType}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprType(quizParser.ExprTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprType}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprType(quizParser.ExprTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOperator}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOperator(quizParser.ExprOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOperator}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOperator(quizParser.ExprOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInput}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(quizParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInput}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(quizParser.ExprInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAttrAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAttrAccess(quizParser.ExprAttrAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAttrAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAttrAccess(quizParser.ExprAttrAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprGroup(quizParser.ExprGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGroup}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprGroup(quizParser.ExprGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIdxAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIdxAccess(quizParser.ExprIdxAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIdxAccess}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIdxAccess(quizParser.ExprIdxAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(quizParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprVar}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(quizParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMatch}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMatch(quizParser.ExprMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMatch}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMatch(quizParser.ExprMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprQCheckanswer}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprQCheckanswer(quizParser.ExprQCheckanswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprQCheckanswer}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprQCheckanswer(quizParser.ExprQCheckanswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOption}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOption(quizParser.ExprOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOption}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOption(quizParser.ExprOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(quizParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFunctionCall}
	 * labeled alternative in {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(quizParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopsStructFor}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoopsStructFor(quizParser.LoopsStructForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopsStructFor}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoopsStructFor(quizParser.LoopsStructForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopsStructIf}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoopsStructIf(quizParser.LoopsStructIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopsStructIf}
	 * labeled alternative in {@link quizParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoopsStructIf(quizParser.LoopsStructIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(quizParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(quizParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link quizParser#def_function}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(quizParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defFunction}
	 * labeled alternative in {@link quizParser#def_function}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(quizParser.DefFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link quizParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(quizParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link quizParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(quizParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#function_ret}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ret(quizParser.Function_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#function_ret}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ret(quizParser.Function_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#structure_if}.
	 * @param ctx the parse tree
	 */
	void enterStructure_if(quizParser.Structure_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#structure_if}.
	 * @param ctx the parse tree
	 */
	void exitStructure_if(quizParser.Structure_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condIf}
	 * labeled alternative in {@link quizParser#condition_if}.
	 * @param ctx the parse tree
	 */
	void enterCondIf(quizParser.CondIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condIf}
	 * labeled alternative in {@link quizParser#condition_if}.
	 * @param ctx the parse tree
	 */
	void exitCondIf(quizParser.CondIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#structure_for}.
	 * @param ctx the parse tree
	 */
	void enterStructure_for(quizParser.Structure_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#structure_for}.
	 * @param ctx the parse tree
	 */
	void exitStructure_for(quizParser.Structure_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#expr_ifor}.
	 * @param ctx the parse tree
	 */
	void enterExpr_ifor(quizParser.Expr_iforContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#expr_ifor}.
	 * @param ctx the parse tree
	 */
	void exitExpr_ifor(quizParser.Expr_iforContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(quizParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(quizParser.GroupContext ctx);
}