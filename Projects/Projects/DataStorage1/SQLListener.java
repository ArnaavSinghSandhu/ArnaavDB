// Generated from /Users/arnaavsinghsandhu/Projects/SQL.g4 by ANTLR 4.13.2
package DataStorage1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(SQLParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(SQLParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(SQLParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(SQLParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valueterm}.
	 * @param ctx the parse tree
	 */
	void enterValueterm(SQLParser.ValuetermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valueterm}.
	 * @param ctx the parse tree
	 */
	void exitValueterm(SQLParser.ValuetermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(SQLParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(SQLParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SQLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SQLParser.TermContext ctx);
}