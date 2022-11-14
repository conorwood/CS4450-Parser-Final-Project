// Generated from /Users/dillahuntym/Documents/Fall_2022/CS4450-PoPL/CS4450-Parser-Final-Project/src/g.g4 by ANTLR 4.10.1
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
}