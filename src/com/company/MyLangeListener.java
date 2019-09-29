// Generated from MyLange.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangeParser}.
 */
public interface MyLangeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MyLangeParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MyLangeParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#primaryExpresion}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpresion(MyLangeParser.PrimaryExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#primaryExpresion}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpresion(MyLangeParser.PrimaryExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(MyLangeParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(MyLangeParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MyLangeParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MyLangeParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MyLangeParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MyLangeParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MyLangeParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MyLangeParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#assigmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentExpression(MyLangeParser.AssigmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#assigmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentExpression(MyLangeParser.AssigmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLangeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLangeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(MyLangeParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(MyLangeParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#expressionStatment}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatment(MyLangeParser.ExpressionStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#expressionStatment}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatment(MyLangeParser.ExpressionStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(MyLangeParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(MyLangeParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MyLangeParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MyLangeParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(MyLangeParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(MyLangeParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangeParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(MyLangeParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangeParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(MyLangeParser.BlockItemContext ctx);
}