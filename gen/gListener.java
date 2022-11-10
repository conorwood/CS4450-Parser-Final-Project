// Generated from /Users/dillahuntym/Documents/Fall_2022/CS4450-PoPL/CS4450-Parser-Final-Project/src/g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#addition_operator}.
	 * @param ctx the parse tree
	 */
	void enterAddition_operator(gParser.Addition_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#addition_operator}.
	 * @param ctx the parse tree
	 */
	void exitAddition_operator(gParser.Addition_operatorContext ctx);
}