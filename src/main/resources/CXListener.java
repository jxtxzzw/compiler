package resources;// Generated from src\main\resources\CX.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CXParser}.
 */
public interface CXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CXParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(CXParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(CXParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CXParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CXParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CXParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CXParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(CXParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(CXParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CXParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CXParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CXParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CXParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CXParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CXParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CXParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CXParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CXParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CXParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#basetype}.
	 * @param ctx the parse tree
	 */
	void enterBasetype(CXParser.BasetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#basetype}.
	 * @param ctx the parse tree
	 */
	void exitBasetype(CXParser.BasetypeContext ctx);
}