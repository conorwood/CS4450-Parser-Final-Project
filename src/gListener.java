// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operations(gParser.Arithmetic_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operations(gParser.Arithmetic_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment_operations}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operations(gParser.Assignment_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment_operations}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operations(gParser.Assignment_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statements(gParser.Conditional_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statements(gParser.Conditional_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#if_else_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_block(gParser.If_else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#if_else_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_block(gParser.If_else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(gParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(gParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(gParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(gParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(gParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(gParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arg_types}.
	 * @param ctx the parse tree
	 */
	void enterArg_types(gParser.Arg_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arg_types}.
	 * @param ctx the parse tree
	 */
	void exitArg_types(gParser.Arg_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(gParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(gParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function_call_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_args(gParser.Function_call_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function_call_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_args(gParser.Function_call_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(gParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(gParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(gParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(gParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(gParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(gParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
}