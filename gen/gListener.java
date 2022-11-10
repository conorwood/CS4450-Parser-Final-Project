// Generated from C:/Users/Conor Wood/Documents/4450 Parser/SimpleAntlrMavenProject/parser/src\g.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gParser.ValueContext ctx);
}