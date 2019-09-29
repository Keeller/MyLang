// Generated from C:/Users/kolya/IdeaProjects/MyLang2/src/com/company\MyLange.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLangeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLangeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MyLangeParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#primaryExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpresion(MyLangeParser.PrimaryExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(MyLangeParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MyLangeParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(MyLangeParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MyLangeParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#assigmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentExpression(MyLangeParser.AssigmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyLangeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(MyLangeParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#expressionStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatment(MyLangeParser.ExpressionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(MyLangeParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MyLangeParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(MyLangeParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangeParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(MyLangeParser.BlockItemContext ctx);
}