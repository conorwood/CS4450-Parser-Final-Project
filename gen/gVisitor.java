// Generated from C:/Users/Conor Wood/Documents/4450 Parser/SimpleAntlrMavenProject/parser/src\g.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(gParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gParser.ValueContext ctx);
}