// Generated from /Users/dillahuntym/Documents/Fall_2022/CS4450-PoPL/CS4450-Parser-Final-Project/src/g.g4 by ANTLR 4.10.1
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
}