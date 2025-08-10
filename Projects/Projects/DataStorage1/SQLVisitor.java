// Generated from /Users/arnaavsinghsandhu/Projects/SQL.g4 by ANTLR 4.13.2
package DataStorage1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(SQLParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(SQLParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valueterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueterm(SQLParser.ValuetermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(SQLParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SQLParser.TermContext ctx);
}