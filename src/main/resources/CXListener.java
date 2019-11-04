package resources; 
// Generated from src\main\resources\CX.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link CXParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(CXParser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(CXParser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(CXParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(CXParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(CXParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(CXParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(CXParser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(CXParser.IterationstatementContext ctx);
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
	 * Enter a parse tree produced by {@link CXParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(CXParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(CXParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(CXParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(CXParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(CXParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(CXParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(CXParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(CXParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(CXParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(CXParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(CXParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(CXParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(CXParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(CXParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(CXParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(CXParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(CXParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(CXParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(CXParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(CXParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(CXParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(CXParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(CXParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(CXParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(CXParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(CXParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CXParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CXParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CXParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CXParser.ConstantContext ctx);
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