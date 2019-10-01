// Generated from ExpressionTest.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionTestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionTestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionTestParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(ExpressionTestParser.RContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpressionTestParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calc}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(ExpressionTestParser.CalcContext ctx);
}