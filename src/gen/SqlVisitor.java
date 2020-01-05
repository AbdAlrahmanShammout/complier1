// Generated from C:/Users/Abd Shammout/Documents/compiler/compilerAbdNew/src\Sql.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt_list(SqlParser.Java_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(SqlParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(SqlParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(SqlParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(SqlParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(SqlParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(SqlParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(SqlParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(SqlParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(SqlParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(SqlParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(SqlParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(SqlParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(SqlParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(SqlParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(SqlParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(SqlParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(SqlParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(SqlParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(SqlParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_var_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_java(SqlParser.Declare_var_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_list_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_list_java(SqlParser.Assignment_var_list_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_var_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_var_java(SqlParser.Assignment_var_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_array_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_array_java(SqlParser.Declare_array_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(SqlParser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#default_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameters(SqlParser.Default_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(SqlParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#arrow_function_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_function_java(SqlParser.Arrow_function_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_name(SqlParser.Function_java_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_rule(SqlParser.Function_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_header(SqlParser.Function_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_java_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_java_call(SqlParser.Function_java_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_java(SqlParser.Print_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_java_rule(SqlParser.While_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_java_header(SqlParser.While_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#do_while_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_java_rule(SqlParser.Do_while_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_java_rule(SqlParser.For_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_java_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_java_header(SqlParser.For_java_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#shorten_operators_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorten_operators_java(SqlParser.Shorten_operators_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_java_rule(SqlParser.If_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_basic_java_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_basic_java_rule(SqlParser.If_basic_java_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#body_brackets_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_brackets_java(SqlParser.Body_brackets_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#condition_java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_java(SqlParser.Condition_javaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_one_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_one_line(SqlParser.If_one_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_one_line_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_one_line_return(SqlParser.If_one_line_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_body(SqlParser.Java_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SqlParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(SqlParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_style(SqlParser.Json_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#json_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_val(SqlParser.Json_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(SqlParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(SqlParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SqlParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SqlParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(SqlParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SqlParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name_no_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_no_keyword(SqlParser.Any_name_no_keywordContext ctx);
}