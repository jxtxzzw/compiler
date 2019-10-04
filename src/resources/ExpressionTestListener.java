package resources;// Generated from ExpressionTest.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionTestParser}.
 */
public interface ExpressionTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionTestParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(ExpressionTestParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionTestParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(ExpressionTestParser.RContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpressionTestParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpressionTestParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExpressionTestParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExpressionTestParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(ExpressionTestParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link ExpressionTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(ExpressionTestParser.ArithmeticContext ctx);
}