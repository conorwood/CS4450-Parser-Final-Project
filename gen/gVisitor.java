// Generated from C:/Users/Conor Wood/Documents/GitHub/CS4450-Parser-Final-Project/src\g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#arithmetic_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operations(gParser.Arithmetic_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operations(gParser.Assignment_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statements(gParser.Conditional_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#if_else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_block(gParser.If_else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(gParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(gParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(gParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(gParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_call_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_args(gParser.Function_call_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(gParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(gParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(gParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
}