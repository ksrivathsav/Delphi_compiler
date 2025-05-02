// Generated from src/Delphi.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DelphiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DelphiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DelphiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DelphiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(DelphiParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DelphiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DelphiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(DelphiParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(DelphiParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(DelphiParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DelphiParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DelphiParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DelphiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(DelphiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(DelphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorDeclaration(DelphiParser.DestructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DelphiParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#visibilitySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilitySpecifier(DelphiParser.VisibilitySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DelphiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DelphiParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(DelphiParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DelphiParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DelphiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DelphiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DelphiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DelphiParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DelphiParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(DelphiParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(DelphiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(DelphiParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DelphiParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(DelphiParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(DelphiParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DelphiParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(DelphiParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link DelphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(DelphiParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DelphiParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelphiParser#integerOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOutput(DelphiParser.IntegerOutputContext ctx);
}