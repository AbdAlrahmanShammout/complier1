// Generated from C:/Users/Abd Shammout/Documents/compiler/compilerAbdNew/src\Sql.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOLEAN=7, SCOL=8, DOT=9, 
		OPEN_PAR=10, CLOSE_PAR=11, OPEN_BRAKET=12, CLOSE_BRAKET=13, COMMA=14, 
		ASSIGN=15, STAR=16, STAR_ASSIGN=17, PLUS=18, PLUS_PLUS=19, PLUS_ASSIGN=20, 
		MINUS=21, MINUS_MINUS=22, MINUS_ASSIGN=23, POWER_ASSIGN=24, TILDE=25, 
		PIPE2=26, DIV=27, DIV_ASSIGN=28, MOD=29, MOD_ASSIGN=30, LT2=31, GT2=32, 
		AMP=33, PIPE=34, LT=35, LT_EQ=36, GT=37, GT_EQ=38, EQ=39, NOT_EQ1=40, 
		NOT=41, NOT_EQ2=42, K_ABORT=43, K_ACTION=44, K_ADD=45, K_AFTER=46, K_ALL=47, 
		K_ALTER=48, K_ANALYZE=49, K_AND=50, K_AS=51, K_ASC=52, K_ATTACH=53, K_AUTOINCREMENT=54, 
		K_BEFORE=55, K_BEGIN=56, K_BETWEEN=57, K_BY=58, K_CASCADE=59, K_CASE=60, 
		K_CAST=61, K_CHECK=62, K_COLLATE=63, K_COLUMN=64, K_COMMIT=65, K_CONFLICT=66, 
		K_CONSTRAINT=67, K_CREATE=68, K_CROSS=69, K_CURRENT_DATE=70, K_CURRENT_TIME=71, 
		K_CURRENT_TIMESTAMP=72, K_DATABASE=73, K_DEFAULT=74, K_DEFERRABLE=75, 
		K_DEFERRED=76, K_DELETE=77, K_DESC=78, K_DETACH=79, K_DISTINCT=80, K_DROP=81, 
		K_EACH=82, K_ELSE=83, K_RETURN=84, K_ELSE_IF=85, K_END=86, K_ENABLE=87, 
		K_ESCAPE=88, K_EXCEPT=89, K_EXCLUSIVE=90, K_EXISTS=91, K_EXPLAIN=92, K_FAIL=93, 
		K_FOR=94, K_FOREIGN=95, K_FROM=96, K_FULL=97, K_GLOB=98, K_GROUP=99, K_HAVING=100, 
		K_IF=101, K_IGNORE=102, K_IMMEDIATE=103, K_IN=104, K_INDEX=105, K_INDEXED=106, 
		K_INITIALLY=107, K_INNER=108, K_INSERT=109, K_INSTEAD=110, K_INTERSECT=111, 
		K_INTO=112, K_IS=113, K_ISNULL=114, K_JOIN=115, K_KEY=116, K_LEFT=117, 
		K_LIKE=118, K_LIMIT=119, K_MATCH=120, K_NATURAL=121, K_NEXTVAL=122, K_NO=123, 
		K_NOT=124, K_NOTNULL=125, K_NULL=126, K_OF=127, K_OFFSET=128, K_ON=129, 
		K_ONLY=130, K_OR=131, K_ORDER=132, K_OUTER=133, K_PLAN=134, K_PRAGMA=135, 
		K_PRIMARY=136, K_QUERY=137, K_RAISE=138, K_RECURSIVE=139, K_REFERENCES=140, 
		K_REGEXP=141, K_REINDEX=142, K_RELEASE=143, K_RENAME=144, K_REPLACE=145, 
		K_RESTRICT=146, K_RIGHT=147, K_ROLLBACK=148, K_ROW=149, K_SAVEPOINT=150, 
		K_SELECT=151, K_SET=152, K_TABLE=153, K_TEMP=154, K_TEMPORARY=155, K_THEN=156, 
		K_TO=157, K_TRANSACTION=158, K_TRIGGER=159, K_UNION=160, K_UNIQUE=161, 
		K_UPDATE=162, K_USING=163, K_VACUUM=164, K_VALUES=165, K_VIEW=166, K_VIRTUAL=167, 
		K_WHEN=168, K_DO=169, K_WHILE=170, K_SWITCH=171, K_PRINT=172, K_BREAK=173, 
		K_CONTINUE=174, K_WHERE=175, K_WITH=176, K_WITHOUT=177, K_TRUE=178, K_FALSE=179, 
		K_FUNCTION=180, K_VAR=181, IDENTIFIER=182, NUMERIC_LITERAL=183, BIND_PARAMETER=184, 
		STRING_LITERAL=185, BLOB_LITERAL=186, MULTILINE_COMMENT=187, SPACES=188, 
		UNEXPECTED_CHAR=189;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_java_stmt_list = 3, 
		RULE_sql_stmt = 4, RULE_java_stmt = 5, RULE_alter_table_stmt = 6, RULE_alter_table_add_constraint = 7, 
		RULE_alter_table_add = 8, RULE_analyze_stmt = 9, RULE_attach_stmt = 10, 
		RULE_begin_stmt = 11, RULE_commit_stmt = 12, RULE_compound_select_stmt = 13, 
		RULE_create_index_stmt = 14, RULE_create_table_stmt = 15, RULE_create_trigger_stmt = 16, 
		RULE_create_view_stmt = 17, RULE_create_virtual_table_stmt = 18, RULE_delete_stmt = 19, 
		RULE_delete_stmt_limited = 20, RULE_detach_stmt = 21, RULE_drop_index_stmt = 22, 
		RULE_drop_table_stmt = 23, RULE_drop_trigger_stmt = 24, RULE_drop_view_stmt = 25, 
		RULE_factored_select_stmt = 26, RULE_insert_stmt = 27, RULE_pragma_stmt = 28, 
		RULE_reindex_stmt = 29, RULE_release_stmt = 30, RULE_rollback_stmt = 31, 
		RULE_savepoint_stmt = 32, RULE_simple_select_stmt = 33, RULE_select_stmt = 34, 
		RULE_select_or_values = 35, RULE_update_stmt = 36, RULE_update_stmt_limited = 37, 
		RULE_vacuum_stmt = 38, RULE_declare_var_java = 39, RULE_assignment_var_list_java = 40, 
		RULE_assignment_var_java = 41, RULE_declare_array_java = 42, RULE_parameters_list = 43, 
		RULE_default_parameters = 44, RULE_arguments_list = 45, RULE_argument = 46, 
		RULE_arrow_function_java = 47, RULE_function_java_name = 48, RULE_function_java_rule = 49, 
		RULE_function_java_header = 50, RULE_function_java_call = 51, RULE_print_java = 52, 
		RULE_while_java_rule = 53, RULE_while_java_header = 54, RULE_do_while_java_rule = 55, 
		RULE_for_java_rule = 56, RULE_for_java_header = 57, RULE_shorten_operators_java = 58, 
		RULE_if_java_rule = 59, RULE_if_basic_java_rule = 60, RULE_body_brackets_java = 61, 
		RULE_condition_java = 62, RULE_switch_stmt = 63, RULE_switch_case = 64, 
		RULE_if_one_line = 65, RULE_if_one_line_return = 66, RULE_java_body = 67, 
		RULE_return_stmt = 68, RULE_array = 69, RULE_json = 70, RULE_json_style = 71, 
		RULE_json_val = 72, RULE_column_def = 73, RULE_type_name = 74, RULE_column_constraint = 75, 
		RULE_column_constraint_primary_key = 76, RULE_column_constraint_foreign_key = 77, 
		RULE_column_constraint_not_null = 78, RULE_column_constraint_null = 79, 
		RULE_column_default = 80, RULE_column_default_value = 81, RULE_conflict_clause = 82, 
		RULE_expr = 83, RULE_foreign_key_clause = 84, RULE_fk_target_column_name = 85, 
		RULE_raise_function = 86, RULE_indexed_column = 87, RULE_table_constraint = 88, 
		RULE_table_constraint_primary_key = 89, RULE_table_constraint_foreign_key = 90, 
		RULE_table_constraint_unique = 91, RULE_table_constraint_key = 92, RULE_fk_origin_column_name = 93, 
		RULE_with_clause = 94, RULE_qualified_table_name = 95, RULE_ordering_term = 96, 
		RULE_pragma_value = 97, RULE_common_table_expression = 98, RULE_result_column = 99, 
		RULE_table_or_subquery = 100, RULE_join_clause = 101, RULE_join_operator = 102, 
		RULE_join_constraint = 103, RULE_select_core = 104, RULE_compound_operator = 105, 
		RULE_cte_table_name = 106, RULE_signed_number = 107, RULE_literal_value = 108, 
		RULE_unary_operator = 109, RULE_error_message = 110, RULE_module_argument = 111, 
		RULE_column_alias = 112, RULE_keyword = 113, RULE_unknown = 114, RULE_name = 115, 
		RULE_function_name = 116, RULE_database_name = 117, RULE_source_table_name = 118, 
		RULE_table_name = 119, RULE_table_or_index_name = 120, RULE_new_table_name = 121, 
		RULE_column_name = 122, RULE_collation_name = 123, RULE_foreign_table = 124, 
		RULE_index_name = 125, RULE_trigger_name = 126, RULE_view_name = 127, 
		RULE_module_name = 128, RULE_pragma_name = 129, RULE_savepoint_name = 130, 
		RULE_table_alias = 131, RULE_transaction_name = 132, RULE_any_name = 133, 
		RULE_any_name_no_keyword = 134;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "java_stmt_list", "sql_stmt", "java_stmt", 
			"alter_table_stmt", "alter_table_add_constraint", "alter_table_add", 
			"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", 
			"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", 
			"factored_select_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", 
			"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "declare_var_java", "assignment_var_list_java", "assignment_var_java", 
			"declare_array_java", "parameters_list", "default_parameters", "arguments_list", 
			"argument", "arrow_function_java", "function_java_name", "function_java_rule", 
			"function_java_header", "function_java_call", "print_java", "while_java_rule", 
			"while_java_header", "do_while_java_rule", "for_java_rule", "for_java_header", 
			"shorten_operators_java", "if_java_rule", "if_basic_java_rule", "body_brackets_java", 
			"condition_java", "switch_stmt", "switch_case", "if_one_line", "if_one_line_return", 
			"java_body", "return_stmt", "array", "json", "json_style", "json_val", 
			"column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "conflict_clause", "expr", 
			"foreign_key_clause", "fk_target_column_name", "raise_function", "indexed_column", 
			"table_constraint", "table_constraint_primary_key", "table_constraint_foreign_key", 
			"table_constraint_unique", "table_constraint_key", "fk_origin_column_name", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name", 
			"any_name_no_keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[]'", "'{'", "'}'", "':'", "'?'", "'::'", null, "';'", "'.'", 
			"'('", "')'", "'['", "']'", "','", "'='", "'*'", "'*='", "'+'", "'++'", 
			"'+='", "'-'", "'--'", "'-='", "'^='", "'~'", "'||'", "'/'", "'/='", 
			"'%'", "'%='", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'!'", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BOOLEAN", "SCOL", "DOT", "OPEN_PAR", 
			"CLOSE_PAR", "OPEN_BRAKET", "CLOSE_BRAKET", "COMMA", "ASSIGN", "STAR", 
			"STAR_ASSIGN", "PLUS", "PLUS_PLUS", "PLUS_ASSIGN", "MINUS", "MINUS_MINUS", 
			"MINUS_ASSIGN", "POWER_ASSIGN", "TILDE", "PIPE2", "DIV", "DIV_ASSIGN", 
			"MOD", "MOD_ASSIGN", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", 
			"GT_EQ", "EQ", "NOT_EQ1", "NOT", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", 
			"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
			"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", 
			"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
			"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
			"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
			"K_EACH", "K_ELSE", "K_RETURN", "K_ELSE_IF", "K_END", "K_ENABLE", "K_ESCAPE", 
			"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
			"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_DO", "K_WHILE", "K_SWITCH", 
			"K_PRINT", "K_BREAK", "K_CONTINUE", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_TRUE", "K_FALSE", "K_FUNCTION", "K_VAR", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Java_stmt_listContext> java_stmt_list() {
			return getRuleContexts(Java_stmt_listContext.class);
		}
		public Java_stmt_listContext java_stmt_list(int i) {
			return getRuleContext(Java_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_COMMIT - 65)) | (1L << (K_CREATE - 65)) | (1L << (K_DELETE - 65)) | (1L << (K_DETACH - 65)) | (1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (K_PRAGMA - 135)) | (1L << (K_REINDEX - 135)) | (1L << (K_RELEASE - 135)) | (1L << (K_REPLACE - 135)) | (1L << (K_ROLLBACK - 135)) | (1L << (K_SAVEPOINT - 135)) | (1L << (K_SELECT - 135)) | (1L << (K_UPDATE - 135)) | (1L << (K_VACUUM - 135)) | (1L << (K_VALUES - 135)) | (1L << (K_WITH - 135)) | (1L << (K_FUNCTION - 135)) | (1L << (IDENTIFIER - 135)) | (1L << (STRING_LITERAL - 135)) | (1L << (UNEXPECTED_CHAR - 135)))) != 0)) {
				{
				setState(273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(270);
					sql_stmt_list();
					}
					break;
				case OPEN_PAR:
				case K_FUNCTION:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(271);
					java_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(272);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(283);
				match(SCOL);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			sql_stmt();
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(290);
						match(SCOL);
						}
						}
						setState(293); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(295);
					sql_stmt();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(SCOL);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_stmt_listContext extends ParserRuleContext {
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
		}
		public Java_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmt_listContext java_stmt_list() throws RecognitionException {
		Java_stmt_listContext _localctx = new Java_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307);
					java_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(310); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(312);
				match(K_EXPLAIN);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(313);
					match(K_QUERY);
					setState(314);
					match(K_PLAN);
					}
				}

				}
			}

			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(319);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(320);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(321);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(322);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(323);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(324);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(325);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(326);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(327);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(328);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(329);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(330);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(331);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(332);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(333);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(334);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(335);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(336);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(337);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(338);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(339);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(340);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(341);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(342);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(343);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(344);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(345);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(346);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(347);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(348);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_stmtContext extends ParserRuleContext {
		public Function_java_ruleContext function_java_rule() {
			return getRuleContext(Function_java_ruleContext.class,0);
		}
		public Java_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmtContext java_stmt() throws RecognitionException {
		Java_stmtContext _localctx = new Java_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_java_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			function_java_rule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_ONLY() { return getToken(SqlParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(K_ALTER);
			setState(354);
			match(K_TABLE);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(355);
				match(K_ONLY);
				}
			}

			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(358);
				database_name();
				setState(359);
				match(DOT);
				}
				break;
			}
			setState(363);
			source_table_name();
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(364);
				match(K_RENAME);
				setState(365);
				match(K_TO);
				setState(366);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(367);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(368);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(369);
				match(K_ADD);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(370);
					match(K_COLUMN);
					}
					break;
				}
				setState(373);
				column_def();
				}
				break;
			}
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(376);
				match(K_ENABLE);
				}
				break;
			}
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(379);
				unknown();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(K_ADD);
			setState(383);
			match(K_CONSTRAINT);
			setState(384);
			any_name();
			setState(385);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(K_ADD);
			setState(388);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(K_ANALYZE);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(391);
				database_name();
				}
				break;
			case 2:
				{
				setState(392);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(393);
				database_name();
				setState(394);
				match(DOT);
				setState(395);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(K_ATTACH);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(400);
				match(K_DATABASE);
				}
				break;
			}
			setState(403);
			expr(0);
			setState(404);
			match(K_AS);
			setState(405);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(K_BEGIN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_DEFERRED - 76)) | (1L << (K_EXCLUSIVE - 76)) | (1L << (K_IMMEDIATE - 76)))) != 0)) {
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_DEFERRED - 76)) | (1L << (K_EXCLUSIVE - 76)) | (1L << (K_IMMEDIATE - 76)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(411);
				match(K_TRANSACTION);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(412);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(418);
				match(K_TRANSACTION);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(419);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SqlParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SqlParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SqlParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SqlParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SqlParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SqlParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SqlParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SqlParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(424);
				match(K_WITH);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(425);
					match(K_RECURSIVE);
					}
				}

				setState(428);
				common_table_expression();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(429);
					match(COMMA);
					setState(430);
					common_table_expression();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(438);
			select_core();
			setState(448); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(439);
					match(K_UNION);
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(440);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(443);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(444);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(447);
				select_core();
				}
				}
				setState(450); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(452);
				match(K_ORDER);
				setState(453);
				match(K_BY);
				setState(454);
				ordering_term();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(455);
					match(COMMA);
					setState(456);
					ordering_term();
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(464);
				match(K_LIMIT);
				setState(465);
				expr(0);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(466);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(467);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(K_CREATE);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(473);
				match(K_UNIQUE);
				}
			}

			setState(476);
			match(K_INDEX);
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(477);
				match(K_IF);
				setState(478);
				match(K_NOT);
				setState(479);
				match(K_EXISTS);
				}
				break;
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(482);
				database_name();
				setState(483);
				match(DOT);
				}
				break;
			}
			setState(487);
			index_name();
			setState(488);
			match(K_ON);
			setState(489);
			table_name();
			setState(490);
			match(OPEN_PAR);
			setState(491);
			indexed_column();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492);
				match(COMMA);
				setState(493);
				indexed_column();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(CLOSE_PAR);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(500);
				match(K_WHERE);
				setState(501);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(K_CREATE);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(505);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(508);
			match(K_TABLE);
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(509);
				match(K_IF);
				setState(510);
				match(K_NOT);
				setState(511);
				match(K_EXISTS);
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(514);
				database_name();
				setState(515);
				match(DOT);
				}
				break;
			}
			setState(519);
			table_name();
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(520);
				match(OPEN_PAR);
				setState(521);
				column_def();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(526);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(522);
						match(COMMA);
						setState(523);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(524);
						match(COMMA);
						setState(525);
						column_def();
						}
						break;
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(CLOSE_PAR);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(532);
					match(K_WITHOUT);
					setState(533);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(536);
				match(K_AS);
				setState(537);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(540);
				unknown();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SqlParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SqlParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(K_CREATE);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(547);
			match(K_TRIGGER);
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(548);
				match(K_IF);
				setState(549);
				match(K_NOT);
				setState(550);
				match(K_EXISTS);
				}
				break;
			}
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(553);
				database_name();
				setState(554);
				match(DOT);
				}
				break;
			}
			setState(558);
			trigger_name();
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(559);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(560);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(561);
				match(K_INSTEAD);
				setState(562);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(565);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(566);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(567);
				match(K_UPDATE);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(568);
					match(K_OF);
					setState(569);
					column_name();
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(570);
						match(COMMA);
						setState(571);
						column_name();
						}
						}
						setState(576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(581);
			match(K_ON);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(582);
				database_name();
				setState(583);
				match(DOT);
				}
				break;
			}
			setState(587);
			table_name();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(588);
				match(K_FOR);
				setState(589);
				match(K_EACH);
				setState(590);
				match(K_ROW);
				}
			}

			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(593);
				match(K_WHEN);
				setState(594);
				expr(0);
				}
			}

			setState(597);
			match(K_BEGIN);
			setState(606); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(598);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(599);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(600);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(601);
					select_stmt();
					}
					break;
				}
				setState(604);
				match(SCOL);
				}
				}
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (K_REPLACE - 145)) | (1L << (K_SELECT - 145)) | (1L << (K_UPDATE - 145)) | (1L << (K_VALUES - 145)) | (1L << (K_WITH - 145)))) != 0) );
			setState(610);
			match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(K_CREATE);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(616);
			match(K_VIEW);
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(617);
				match(K_IF);
				setState(618);
				match(K_NOT);
				setState(619);
				match(K_EXISTS);
				}
				break;
			}
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(622);
				database_name();
				setState(623);
				match(DOT);
				}
				break;
			}
			setState(627);
			view_name();
			setState(628);
			match(K_AS);
			setState(629);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(K_CREATE);
			setState(632);
			match(K_VIRTUAL);
			setState(633);
			match(K_TABLE);
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(634);
				match(K_IF);
				setState(635);
				match(K_NOT);
				setState(636);
				match(K_EXISTS);
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(639);
				database_name();
				setState(640);
				match(DOT);
				}
				break;
			}
			setState(644);
			table_name();
			setState(645);
			match(K_USING);
			setState(646);
			module_name();
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(647);
				match(OPEN_PAR);
				setState(648);
				module_argument();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(649);
					match(COMMA);
					setState(650);
					module_argument();
					}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(656);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(660);
				with_clause();
				}
			}

			setState(663);
			match(K_DELETE);
			setState(664);
			match(K_FROM);
			setState(665);
			qualified_table_name();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(666);
				match(K_WHERE);
				setState(667);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(670);
				with_clause();
				}
			}

			setState(673);
			match(K_DELETE);
			setState(674);
			match(K_FROM);
			setState(675);
			qualified_table_name();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(676);
				match(K_WHERE);
				setState(677);
				expr(0);
				}
			}

			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(680);
					match(K_ORDER);
					setState(681);
					match(K_BY);
					setState(682);
					ordering_term();
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(683);
						match(COMMA);
						setState(684);
						ordering_term();
						}
						}
						setState(689);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(692);
				match(K_LIMIT);
				setState(693);
				expr(0);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(694);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(695);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(K_DETACH);
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(701);
				match(K_DATABASE);
				}
				break;
			}
			setState(704);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(K_DROP);
			setState(707);
			match(K_INDEX);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(708);
				match(K_IF);
				setState(709);
				match(K_EXISTS);
				}
				break;
			}
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(712);
				database_name();
				setState(713);
				match(DOT);
				}
				break;
			}
			setState(717);
			index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(K_DROP);
			setState(720);
			match(K_TABLE);
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(721);
				match(K_IF);
				setState(722);
				match(K_EXISTS);
				}
				break;
			}
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(725);
				database_name();
				setState(726);
				match(DOT);
				}
				break;
			}
			setState(730);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(K_DROP);
			setState(733);
			match(K_TRIGGER);
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(734);
				match(K_IF);
				setState(735);
				match(K_EXISTS);
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(738);
				database_name();
				setState(739);
				match(DOT);
				}
				break;
			}
			setState(743);
			trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(K_DROP);
			setState(746);
			match(K_VIEW);
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(747);
				match(K_IF);
				setState(748);
				match(K_EXISTS);
				}
				break;
			}
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(751);
				database_name();
				setState(752);
				match(DOT);
				}
				break;
			}
			setState(756);
			view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(758);
				match(K_WITH);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(759);
					match(K_RECURSIVE);
					}
				}

				setState(762);
				common_table_expression();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(763);
					match(COMMA);
					setState(764);
					common_table_expression();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(772);
			select_core();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(773);
				compound_operator();
				setState(774);
				select_core();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(781);
				match(K_ORDER);
				setState(782);
				match(K_BY);
				setState(783);
				ordering_term();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(784);
					match(COMMA);
					setState(785);
					ordering_term();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(793);
				match(K_LIMIT);
				setState(794);
				expr(0);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(795);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(796);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(801);
				with_clause();
				}
			}

			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(804);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(805);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(806);
				match(K_INSERT);
				setState(807);
				match(K_OR);
				setState(808);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(809);
				match(K_INSERT);
				setState(810);
				match(K_OR);
				setState(811);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(812);
				match(K_INSERT);
				setState(813);
				match(K_OR);
				setState(814);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(815);
				match(K_INSERT);
				setState(816);
				match(K_OR);
				setState(817);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(818);
				match(K_INSERT);
				setState(819);
				match(K_OR);
				setState(820);
				match(K_IGNORE);
				}
				break;
			}
			setState(823);
			match(K_INTO);
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(824);
				database_name();
				setState(825);
				match(DOT);
				}
				break;
			}
			setState(829);
			table_name();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(830);
				match(OPEN_PAR);
				setState(831);
				column_name();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(832);
					match(COMMA);
					setState(833);
					column_name();
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(839);
				match(CLOSE_PAR);
				}
			}

			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(843);
				match(K_VALUES);
				setState(844);
				match(OPEN_PAR);
				setState(845);
				expr(0);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(846);
					match(COMMA);
					setState(847);
					expr(0);
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				match(CLOSE_PAR);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(854);
					match(COMMA);
					setState(855);
					match(OPEN_PAR);
					setState(856);
					expr(0);
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(857);
						match(COMMA);
						setState(858);
						expr(0);
						}
						}
						setState(863);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(864);
					match(CLOSE_PAR);
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(871);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(872);
				match(K_DEFAULT);
				setState(873);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(K_PRAGMA);
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(877);
				database_name();
				setState(878);
				match(DOT);
				}
				break;
			}
			setState(882);
			pragma_name();
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(883);
				match(ASSIGN);
				setState(884);
				pragma_value();
				}
				break;
			case 2:
				{
				setState(885);
				match(OPEN_PAR);
				setState(886);
				pragma_value();
				setState(887);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(K_REINDEX);
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(892);
				collation_name();
				}
				break;
			case 2:
				{
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(893);
					database_name();
					setState(894);
					match(DOT);
					}
					break;
				}
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(898);
					table_name();
					}
					break;
				case 2:
					{
					setState(899);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(K_RELEASE);
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(905);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(908);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(K_ROLLBACK);
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(911);
				match(K_TRANSACTION);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(912);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(917);
				match(K_TO);
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(918);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(921);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(K_SAVEPOINT);
			setState(925);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(927);
				match(K_WITH);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(928);
					match(K_RECURSIVE);
					}
				}

				setState(931);
				common_table_expression();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					common_table_expression();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(941);
			select_core();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(942);
				match(K_ORDER);
				setState(943);
				match(K_BY);
				setState(944);
				ordering_term();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(945);
					match(COMMA);
					setState(946);
					ordering_term();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(954);
				match(K_LIMIT);
				setState(955);
				expr(0);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(956);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(957);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(962);
				match(K_WITH);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(963);
					match(K_RECURSIVE);
					}
				}

				setState(966);
				common_table_expression();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(967);
					match(COMMA);
					setState(968);
					common_table_expression();
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(976);
			select_or_values();
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(977);
					compound_operator();
					setState(978);
					select_or_values();
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(985);
				match(K_ORDER);
				setState(986);
				match(K_BY);
				setState(987);
				ordering_term();
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(988);
						match(COMMA);
						setState(989);
						ordering_term();
						}
						} 
					}
					setState(994);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				}
				break;
			}
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(997);
				match(K_LIMIT);
				setState(998);
				expr(0);
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(999);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1000);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(K_SELECT);
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1006);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1009);
				result_column();
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1010);
						match(COMMA);
						setState(1011);
						result_column();
						}
						} 
					}
					setState(1016);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1017);
					match(K_FROM);
					setState(1027);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(1018);
						table_or_subquery();
						setState(1023);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1019);
								match(COMMA);
								setState(1020);
								table_or_subquery();
								}
								} 
							}
							setState(1025);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1026);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1031);
					match(K_WHERE);
					setState(1032);
					expr(0);
					}
					break;
				}
				setState(1049);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1035);
					match(K_GROUP);
					setState(1036);
					match(K_BY);
					setState(1037);
					expr(0);
					setState(1042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1038);
							match(COMMA);
							setState(1039);
							expr(0);
							}
							} 
						}
						setState(1044);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
					}
					setState(1047);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						setState(1045);
						match(K_HAVING);
						setState(1046);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				match(K_VALUES);
				setState(1052);
				match(OPEN_PAR);
				setState(1053);
				expr(0);
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1054);
					match(COMMA);
					setState(1055);
					expr(0);
					}
					}
					setState(1060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1061);
				match(CLOSE_PAR);
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1062);
						match(COMMA);
						setState(1063);
						match(OPEN_PAR);
						setState(1064);
						expr(0);
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1065);
							match(COMMA);
							setState(1066);
							expr(0);
							}
							}
							setState(1071);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1072);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1078);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1081);
				with_clause();
				}
			}

			setState(1084);
			match(K_UPDATE);
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1085);
				match(K_OR);
				setState(1086);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1087);
				match(K_OR);
				setState(1088);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1089);
				match(K_OR);
				setState(1090);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1091);
				match(K_OR);
				setState(1092);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1093);
				match(K_OR);
				setState(1094);
				match(K_IGNORE);
				}
				break;
			}
			setState(1097);
			qualified_table_name();
			setState(1098);
			match(K_SET);
			setState(1099);
			column_name();
			setState(1100);
			match(ASSIGN);
			setState(1101);
			expr(0);
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1102);
				match(COMMA);
				setState(1103);
				column_name();
				setState(1104);
				match(ASSIGN);
				setState(1105);
				expr(0);
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1112);
				match(K_WHERE);
				setState(1113);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1116);
				with_clause();
				}
			}

			setState(1119);
			match(K_UPDATE);
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1120);
				match(K_OR);
				setState(1121);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1122);
				match(K_OR);
				setState(1123);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1124);
				match(K_OR);
				setState(1125);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1126);
				match(K_OR);
				setState(1127);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1128);
				match(K_OR);
				setState(1129);
				match(K_IGNORE);
				}
				break;
			}
			setState(1132);
			qualified_table_name();
			setState(1133);
			match(K_SET);
			setState(1134);
			column_name();
			setState(1135);
			match(ASSIGN);
			setState(1136);
			expr(0);
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1137);
				match(COMMA);
				setState(1138);
				column_name();
				setState(1139);
				match(ASSIGN);
				setState(1140);
				expr(0);
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1147);
				match(K_WHERE);
				setState(1148);
				expr(0);
				}
			}

			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1151);
					match(K_ORDER);
					setState(1152);
					match(K_BY);
					setState(1153);
					ordering_term();
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1154);
						match(COMMA);
						setState(1155);
						ordering_term();
						}
						}
						setState(1160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1163);
				match(K_LIMIT);
				setState(1164);
				expr(0);
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1165);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1166);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_javaContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Assignment_var_list_javaContext assignment_var_list_java() {
			return getRuleContext(Assignment_var_list_javaContext.class,0);
		}
		public Declare_var_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeclare_var_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeclare_var_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeclare_var_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_javaContext declare_var_java() throws RecognitionException {
		Declare_var_javaContext _localctx = new Declare_var_javaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declare_var_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(K_VAR);
			setState(1174);
			assignment_var_list_java();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_var_list_javaContext extends ParserRuleContext {
		public List<Assignment_var_javaContext> assignment_var_java() {
			return getRuleContexts(Assignment_var_javaContext.class);
		}
		public Assignment_var_javaContext assignment_var_java(int i) {
			return getRuleContext(Assignment_var_javaContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Assignment_var_list_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_list_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_list_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_list_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_list_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_list_javaContext assignment_var_list_java() throws RecognitionException {
		Assignment_var_list_javaContext _localctx = new Assignment_var_list_javaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment_var_list_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			assignment_var_java();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1177);
				match(COMMA);
				setState(1178);
				assignment_var_java();
				}
				}
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1184);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_var_javaContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_var_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_var_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_var_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_var_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_var_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_var_javaContext assignment_var_java() throws RecognitionException {
		Assignment_var_javaContext _localctx = new Assignment_var_javaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignment_var_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(IDENTIFIER);
			setState(1187);
			match(ASSIGN);
			setState(1188);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_array_javaContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Declare_array_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_array_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDeclare_array_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDeclare_array_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDeclare_array_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_array_javaContext declare_array_java() throws RecognitionException {
		Declare_array_javaContext _localctx = new Declare_array_javaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declare_array_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(K_VAR);
			setState(1191);
			match(IDENTIFIER);
			setState(1192);
			match(T__0);
			setState(1193);
			match(ASSIGN);
			setState(1194);
			expr(0);
			setState(1195);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameters_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> K_VAR() { return getTokens(SqlParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SqlParser.K_VAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Default_parametersContext> default_parameters() {
			return getRuleContexts(Default_parametersContext.class);
		}
		public Default_parametersContext default_parameters(int i) {
			return getRuleContext(Default_parametersContext.class,i);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameters_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(OPEN_PAR);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1198);
				match(K_VAR);
				setState(1199);
				match(IDENTIFIER);
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1200);
						match(COMMA);
						{
						setState(1201);
						match(K_VAR);
						setState(1202);
						match(IDENTIFIER);
						}
						}
						} 
					}
					setState(1207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				}
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1208);
					match(COMMA);
					setState(1209);
					default_parameters();
					}
					}
					setState(1214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			setState(1217);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_parametersContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Default_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefault_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefault_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefault_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parametersContext default_parameters() throws RecognitionException {
		Default_parametersContext _localctx = new Default_parametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_default_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(K_VAR);
			setState(1220);
			match(IDENTIFIER);
			setState(1221);
			match(ASSIGN);
			setState(1222);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArguments_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArguments_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArguments_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arguments_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(OPEN_PAR);
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(1225);
				argument();
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1226);
					match(COMMA);
					setState(1227);
					argument();
					}
					}
					setState(1232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1235);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Arrow_function_javaContext arrow_function_java() {
			return getRuleContext(Arrow_function_javaContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FUNCTION:
				{
				setState(1237);
				arrow_function_java();
				}
				break;
			case T__1:
			case BOOLEAN:
			case OPEN_PAR:
			case OPEN_BRAKET:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_TRUE:
			case K_FALSE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1238);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_function_javaContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Arrow_function_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_function_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArrow_function_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArrow_function_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArrow_function_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_function_javaContext arrow_function_java() throws RecognitionException {
		Arrow_function_javaContext _localctx = new Arrow_function_javaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrow_function_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(K_FUNCTION);
			setState(1242);
			parameters_list();
			setState(1243);
			match(T__1);
			setState(1244);
			match(K_RETURN);
			setState(1245);
			expr(0);
			setState(1246);
			match(SCOL);
			setState(1247);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_java_nameContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Function_java_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_nameContext function_java_name() throws RecognitionException {
		Function_java_nameContext _localctx = new Function_java_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_function_java_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			any_name_no_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_java_ruleContext extends ParserRuleContext {
		public Function_java_headerContext function_java_header() {
			return getRuleContext(Function_java_headerContext.class,0);
		}
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Function_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_ruleContext function_java_rule() throws RecognitionException {
		Function_java_ruleContext _localctx = new Function_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_function_java_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			function_java_header();
			setState(1252);
			match(T__1);
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_RETURN - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_DO - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_VAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(1253);
				java_body();
				}
				}
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1259);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_java_headerContext extends ParserRuleContext {
		public Function_java_nameContext function_java_name() {
			return getRuleContext(Function_java_nameContext.class,0);
		}
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Function_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_headerContext function_java_header() throws RecognitionException {
		Function_java_headerContext _localctx = new Function_java_headerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_function_java_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(1261);
				match(K_FUNCTION);
				}
			}

			setState(1264);
			function_java_name();
			setState(1265);
			parameters_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_java_callContext extends ParserRuleContext {
		public Function_java_nameContext function_java_name() {
			return getRuleContext(Function_java_nameContext.class,0);
		}
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Function_java_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_java_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_java_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_java_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_java_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_java_callContext function_java_call() throws RecognitionException {
		Function_java_callContext _localctx = new Function_java_callContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_function_java_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			function_java_name();
			setState(1268);
			arguments_list();
			setState(1269);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_javaContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Print_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrint_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrint_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrint_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_javaContext print_java() throws RecognitionException {
		Print_javaContext _localctx = new Print_javaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_print_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(K_PRINT);
			setState(1272);
			match(OPEN_PAR);
			setState(1273);
			expr(0);
			setState(1274);
			match(CLOSE_PAR);
			setState(1275);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_java_ruleContext extends ParserRuleContext {
		public While_java_headerContext while_java_header() {
			return getRuleContext(While_java_headerContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public While_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_java_ruleContext while_java_rule() throws RecognitionException {
		While_java_ruleContext _localctx = new While_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_while_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			while_java_header();
			setState(1278);
			body_brackets_java();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_java_headerContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public While_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_java_headerContext while_java_header() throws RecognitionException {
		While_java_headerContext _localctx = new While_java_headerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_while_java_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(K_WHILE);
			setState(1281);
			condition_java();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_java_ruleContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public While_java_headerContext while_java_header() {
			return getRuleContext(While_java_headerContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Do_while_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDo_while_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDo_while_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDo_while_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_java_ruleContext do_while_java_rule() throws RecognitionException {
		Do_while_java_ruleContext _localctx = new Do_while_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_do_while_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(K_DO);
			setState(1284);
			body_brackets_java();
			setState(1285);
			while_java_header();
			setState(1286);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_java_ruleContext extends ParserRuleContext {
		public For_java_headerContext for_java_header() {
			return getRuleContext(For_java_headerContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public For_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_java_ruleContext for_java_rule() throws RecognitionException {
		For_java_ruleContext _localctx = new For_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_for_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			for_java_header();
			setState(1289);
			body_brackets_java();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_java_headerContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Assignment_var_list_javaContext assignment_var_list_java() {
			return getRuleContext(Assignment_var_list_javaContext.class,0);
		}
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Shorten_operators_javaContext shorten_operators_java() {
			return getRuleContext(Shorten_operators_javaContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public For_java_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_java_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_java_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_java_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_java_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_java_headerContext for_java_header() throws RecognitionException {
		For_java_headerContext _localctx = new For_java_headerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_for_java_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(K_FOR);
			setState(1292);
			match(OPEN_PAR);
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1293);
				match(K_VAR);
				}
			}

			setState(1296);
			assignment_var_list_java();
			setState(1297);
			condition_java();
			setState(1298);
			match(SCOL);
			setState(1299);
			shorten_operators_java();
			setState(1300);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shorten_operators_javaContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SqlParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SqlParser.MINUS_MINUS, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(SqlParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(SqlParser.MINUS_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SqlParser.DIV_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(SqlParser.POWER_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(SqlParser.MOD_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(SqlParser.STAR_ASSIGN, 0); }
		public Shorten_operators_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorten_operators_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShorten_operators_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShorten_operators_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShorten_operators_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shorten_operators_javaContext shorten_operators_java() throws RecognitionException {
		Shorten_operators_javaContext _localctx = new Shorten_operators_javaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_shorten_operators_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			any_name_no_keyword();
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
			case MINUS_MINUS:
				{
				setState(1303);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STAR_ASSIGN:
			case PLUS_ASSIGN:
			case MINUS_ASSIGN:
			case POWER_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
				{
				setState(1304);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR_ASSIGN) | (1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << POWER_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1305);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_java_ruleContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public List<If_basic_java_ruleContext> if_basic_java_rule() {
			return getRuleContexts(If_basic_java_ruleContext.class);
		}
		public If_basic_java_ruleContext if_basic_java_rule(int i) {
			return getRuleContext(If_basic_java_ruleContext.class,i);
		}
		public List<TerminalNode> K_ELSE_IF() { return getTokens(SqlParser.K_ELSE_IF); }
		public TerminalNode K_ELSE_IF(int i) {
			return getToken(SqlParser.K_ELSE_IF, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public If_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_java_ruleContext if_java_rule() throws RecognitionException {
		If_java_ruleContext _localctx = new If_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_if_java_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(K_IF);
			setState(1309);
			if_basic_java_rule();
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ELSE_IF) {
				{
				{
				setState(1310);
				match(K_ELSE_IF);
				setState(1311);
				if_basic_java_rule();
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1317);
				match(K_ELSE);
				setState(1318);
				body_brackets_java();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_basic_java_ruleContext extends ParserRuleContext {
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public If_basic_java_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_basic_java_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_basic_java_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_basic_java_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_basic_java_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_basic_java_ruleContext if_basic_java_rule() throws RecognitionException {
		If_basic_java_ruleContext _localctx = new If_basic_java_ruleContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_if_basic_java_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			condition_java();
			setState(1322);
			body_brackets_java();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_brackets_javaContext extends ParserRuleContext {
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Body_brackets_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_brackets_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBody_brackets_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBody_brackets_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBody_brackets_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_brackets_javaContext body_brackets_java() throws RecognitionException {
		Body_brackets_javaContext _localctx = new Body_brackets_javaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_body_brackets_java);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(T__1);
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_RETURN - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_DO - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_VAR - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(1325);
				java_body();
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_javaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Condition_javaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondition_java(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondition_java(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCondition_java(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_javaContext condition_java() throws RecognitionException {
		Condition_javaContext _localctx = new Condition_javaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_switch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(K_SWITCH);
			setState(1336);
			match(OPEN_PAR);
			setState(1337);
			match(IDENTIFIER);
			setState(1338);
			match(CLOSE_PAR);
			setState(1339);
			match(T__1);
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(1340);
				switch_case();
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(1346);
				match(K_DEFAULT);
				setState(1347);
				match(T__3);
				setState(1351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1348);
						java_body();
						}
						} 
					}
					setState(1353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK) {
					{
					setState(1354);
					match(K_BREAK);
					}
				}

				setState(1357);
				match(SCOL);
				}
			}

			setState(1360);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_switch_case);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1362);
			match(K_CASE);
			setState(1363);
			expr(0);
			setState(1364);
			match(T__3);
			setState(1368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1365);
					java_body();
					}
					} 
				}
				setState(1370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1371);
			match(K_BREAK);
			setState(1372);
			match(SCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_one_lineContext extends ParserRuleContext {
		public Condition_javaContext condition_java() {
			return getRuleContext(Condition_javaContext.class,0);
		}
		public List<If_one_line_returnContext> if_one_line_return() {
			return getRuleContexts(If_one_line_returnContext.class);
		}
		public If_one_line_returnContext if_one_line_return(int i) {
			return getRuleContext(If_one_line_returnContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public If_one_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_one_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_one_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_one_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_one_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_one_lineContext if_one_line() throws RecognitionException {
		If_one_lineContext _localctx = new If_one_lineContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_if_one_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1374);
				match(NOT);
				}
			}

			setState(1377);
			condition_java();
			setState(1378);
			match(T__4);
			setState(1379);
			if_one_line_return();
			setState(1380);
			match(T__3);
			setState(1381);
			if_one_line_return();
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1382);
				match(SCOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_one_line_returnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_brackets_javaContext body_brackets_java() {
			return getRuleContext(Body_brackets_javaContext.class,0);
		}
		public If_one_line_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_one_line_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_one_line_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_one_line_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_one_line_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_one_line_returnContext if_one_line_return() throws RecognitionException {
		If_one_line_returnContext _localctx = new If_one_line_returnContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_if_one_line_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1385);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1386);
				body_brackets_java();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_bodyContext extends ParserRuleContext {
		public Declare_var_javaContext declare_var_java() {
			return getRuleContext(Declare_var_javaContext.class,0);
		}
		public Assignment_var_list_javaContext assignment_var_list_java() {
			return getRuleContext(Assignment_var_list_javaContext.class,0);
		}
		public Declare_array_javaContext declare_array_java() {
			return getRuleContext(Declare_array_javaContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Function_java_callContext function_java_call() {
			return getRuleContext(Function_java_callContext.class,0);
		}
		public If_java_ruleContext if_java_rule() {
			return getRuleContext(If_java_ruleContext.class,0);
		}
		public If_one_lineContext if_one_line() {
			return getRuleContext(If_one_lineContext.class,0);
		}
		public For_java_ruleContext for_java_rule() {
			return getRuleContext(For_java_ruleContext.class,0);
		}
		public While_java_ruleContext while_java_rule() {
			return getRuleContext(While_java_ruleContext.class,0);
		}
		public Do_while_java_ruleContext do_while_java_rule() {
			return getRuleContext(Do_while_java_ruleContext.class,0);
		}
		public Print_javaContext print_java() {
			return getRuleContext(Print_javaContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Java_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_bodyContext java_body() throws RecognitionException {
		Java_bodyContext _localctx = new Java_bodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_java_body);
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1389);
				declare_var_java();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1390);
				assignment_var_list_java();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1391);
				declare_array_java();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1392);
				switch_stmt();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1393);
				function_java_call();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1394);
				if_java_rule();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1395);
				if_one_line();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1396);
				for_java_rule();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1397);
				while_java_rule();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1398);
				do_while_java_rule();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1399);
				print_java();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1400);
				match(K_BREAK);
				setState(1401);
				match(SCOL);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1402);
				return_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public If_one_lineContext if_one_line() {
			return getRuleContext(If_one_lineContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(K_RETURN);
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1406);
				if_one_line();
				}
				break;
			case 2:
				{
				setState(1407);
				expr(0);
				}
				break;
			}
			setState(1410);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRAKET() { return getToken(SqlParser.OPEN_BRAKET, 0); }
		public TerminalNode CLOSE_BRAKET() { return getToken(SqlParser.CLOSE_BRAKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(OPEN_BRAKET);
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << OPEN_PAR) | (1L << OPEN_BRAKET) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(1413);
				expr(0);
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1414);
					match(COMMA);
					setState(1415);
					expr(0);
					}
					}
					setState(1420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1423);
			match(CLOSE_BRAKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonContext extends ParserRuleContext {
		public List<Json_styleContext> json_style() {
			return getRuleContexts(Json_styleContext.class);
		}
		public Json_styleContext json_style(int i) {
			return getRuleContext(Json_styleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(T__1);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1426);
				json_style();
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1427);
					match(COMMA);
					setState(1428);
					json_style();
					}
					}
					setState(1433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1436);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_styleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Json_valContext json_val() {
			return getRuleContext(Json_valContext.class,0);
		}
		public Json_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson_style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson_style(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson_style(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_styleContext json_style() throws RecognitionException {
		Json_styleContext _localctx = new Json_styleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_json_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(IDENTIFIER);
			setState(1439);
			match(T__3);
			setState(1440);
			json_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_valContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Json_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_valContext json_val() throws RecognitionException {
		Json_valContext _localctx = new Json_valContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_json_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1442);
				json();
				}
				break;
			case 2:
				{
				setState(1443);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			column_name();
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1447);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(1448);
						type_name();
						}
						break;
					}
					} 
				}
				setState(1453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			name();
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1455);
				match(OPEN_PAR);
				setState(1456);
				signed_number();
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1457);
					any_name();
					}
				}

				setState(1460);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1462);
				match(OPEN_PAR);
				setState(1463);
				signed_number();
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1464);
					any_name();
					}
				}

				setState(1467);
				match(COMMA);
				setState(1468);
				signed_number();
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1469);
					any_name();
					}
				}

				setState(1472);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1476);
				match(K_CONSTRAINT);
				setState(1477);
				name();
				}
			}

			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1480);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1481);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1482);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1483);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1484);
				match(K_UNIQUE);
				setState(1485);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1486);
				match(K_CHECK);
				setState(1487);
				match(OPEN_PAR);
				setState(1488);
				expr(0);
				setState(1489);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1491);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1492);
				match(K_COLLATE);
				setState(1493);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(K_PRIMARY);
			setState(1497);
			match(K_KEY);
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1498);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1501);
			conflict_clause();
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1502);
				match(K_AUTOINCREMENT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(K_NOT);
			setState(1508);
			match(K_NULL);
			setState(1509);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			match(K_NULL);
			setState(1512);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(K_DEFAULT);
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1515);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1516);
				match(OPEN_PAR);
				setState(1517);
				expr(0);
				setState(1518);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1520);
				match(K_NEXTVAL);
				setState(1521);
				match(OPEN_PAR);
				setState(1522);
				expr(0);
				setState(1523);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1525);
				any_name();
				}
				break;
			}
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1528);
				match(T__5);
				setState(1530); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1529);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1532); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1536);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1537);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1540);
				match(K_ON);
				setState(1541);
				match(K_CONFLICT);
				setState(1542);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (K_FAIL - 93)) | (1L << (K_IGNORE - 93)) | (1L << (K_REPLACE - 93)) | (1L << (K_ROLLBACK - 93)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode BOOLEAN() { return getToken(SqlParser.BOOLEAN, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SqlParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SqlParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SqlParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SqlParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1546);
				array();
				}
				break;
			case 2:
				{
				setState(1547);
				json();
				}
				break;
			case 3:
				{
				setState(1548);
				literal_value();
				}
				break;
			case 4:
				{
				setState(1549);
				match(BIND_PARAMETER);
				}
				break;
			case 5:
				{
				setState(1558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1550);
						database_name();
						setState(1551);
						match(DOT);
						}
						break;
					}
					setState(1555);
					table_name();
					setState(1556);
					match(DOT);
					}
					break;
				}
				setState(1560);
				column_name();
				}
				break;
			case 6:
				{
				setState(1561);
				unary_operator();
				setState(1562);
				expr(22);
				}
				break;
			case 7:
				{
				setState(1564);
				function_name();
				setState(1565);
				match(OPEN_PAR);
				setState(1578);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case BOOLEAN:
				case OPEN_PAR:
				case OPEN_BRAKET:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_TRUE:
				case K_FALSE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1567);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1566);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1569);
					expr(0);
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1570);
						match(COMMA);
						setState(1571);
						expr(0);
						}
						}
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1577);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1580);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1582);
				match(OPEN_PAR);
				setState(1583);
				expr(0);
				setState(1584);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1586);
				match(BOOLEAN);
				}
				break;
			case 10:
				{
				setState(1587);
				match(K_CAST);
				setState(1588);
				match(OPEN_PAR);
				setState(1589);
				expr(0);
				setState(1590);
				match(K_AS);
				setState(1591);
				type_name();
				setState(1592);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1594);
						match(K_NOT);
						}
					}

					setState(1597);
					match(K_EXISTS);
					}
				}

				setState(1600);
				match(OPEN_PAR);
				setState(1601);
				select_stmt();
				setState(1602);
				match(CLOSE_PAR);
				}
				break;
			case 12:
				{
				setState(1604);
				match(K_CASE);
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1605);
					expr(0);
					}
					break;
				}
				setState(1613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1608);
					match(K_WHEN);
					setState(1609);
					expr(0);
					setState(1610);
					match(K_THEN);
					setState(1611);
					expr(0);
					}
					}
					setState(1615); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1617);
					match(K_ELSE);
					setState(1618);
					expr(0);
					}
				}

				setState(1621);
				match(K_END);
				}
				break;
			case 13:
				{
				setState(1623);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1626);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1627);
						match(PIPE2);
						setState(1628);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1629);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1630);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1631);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1632);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1633);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1634);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1635);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1636);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1637);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1638);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1639);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1640);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1641);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1654);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
							{
							setState(1642);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1643);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1644);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1645);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1646);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1647);
							match(K_IS);
							setState(1648);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1649);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1650);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1651);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1652);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1653);
							match(K_REGEXP);
							}
							break;
						}
						setState(1656);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1657);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1658);
						match(K_AND);
						setState(1659);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1660);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1661);
						match(K_OR);
						setState(1662);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1663);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1664);
						match(K_IS);
						setState(1666);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1665);
							match(K_NOT);
							}
							break;
						}
						setState(1668);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1669);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1671);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1670);
							match(K_NOT);
							}
						}

						setState(1673);
						match(K_BETWEEN);
						setState(1674);
						expr(0);
						setState(1675);
						match(K_AND);
						setState(1676);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1678);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1679);
						match(K_COLLATE);
						setState(1680);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1681);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1683);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1682);
							match(K_NOT);
							}
						}

						setState(1685);
						_la = _input.LA(1);
						if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (K_GLOB - 98)) | (1L << (K_LIKE - 98)) | (1L << (K_MATCH - 98)) | (1L << (K_REGEXP - 98)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1686);
						expr(0);
						setState(1689);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
						case 1:
							{
							setState(1687);
							match(K_ESCAPE);
							setState(1688);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1691);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1696);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1692);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1693);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1694);
							match(K_NOT);
							setState(1695);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1698);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1700);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1699);
							match(K_NOT);
							}
						}

						setState(1702);
						match(K_IN);
						setState(1722);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
						case 1:
							{
							setState(1703);
							match(OPEN_PAR);
							setState(1713);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
							case 1:
								{
								setState(1704);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1705);
								expr(0);
								setState(1710);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1706);
									match(COMMA);
									setState(1707);
									expr(0);
									}
									}
									setState(1712);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1715);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1719);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
							case 1:
								{
								setState(1716);
								database_name();
								setState(1717);
								match(DOT);
								}
								break;
							}
							setState(1721);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(K_REFERENCES);
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1730);
				database_name();
				setState(1731);
				match(DOT);
				}
				break;
			}
			setState(1735);
			foreign_table();
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1736);
				match(OPEN_PAR);
				setState(1737);
				fk_target_column_name();
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1738);
					match(COMMA);
					setState(1739);
					fk_target_column_name();
					}
					}
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1745);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1763);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1749);
						match(K_ON);
						setState(1750);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1759);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
						case 1:
							{
							setState(1751);
							match(K_SET);
							setState(1752);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1753);
							match(K_SET);
							setState(1754);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1755);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1756);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1757);
							match(K_NO);
							setState(1758);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1761);
						match(K_MATCH);
						setState(1762);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1770);
					match(K_NOT);
					}
				}

				setState(1773);
				match(K_DEFERRABLE);
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1774);
					match(K_INITIALLY);
					setState(1775);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1776);
					match(K_INITIALLY);
					setState(1777);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1780);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(K_RAISE);
			setState(1788);
			match(OPEN_PAR);
			setState(1793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1789);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1790);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1791);
				match(COMMA);
				setState(1792);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1795);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			column_name();
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1798);
				match(K_COLLATE);
				setState(1799);
				collation_name();
				}
			}

			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1802);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1805);
				match(K_CONSTRAINT);
				setState(1806);
				name();
				}
			}

			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1809);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1810);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1811);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1812);
				match(K_CHECK);
				setState(1813);
				match(OPEN_PAR);
				setState(1814);
				expr(0);
				setState(1815);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1817);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(K_PRIMARY);
			setState(1821);
			match(K_KEY);
			setState(1822);
			match(OPEN_PAR);
			setState(1823);
			indexed_column();
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1824);
				match(COMMA);
				setState(1825);
				indexed_column();
				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1831);
			match(CLOSE_PAR);
			setState(1832);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(K_FOREIGN);
			setState(1835);
			match(K_KEY);
			setState(1836);
			match(OPEN_PAR);
			setState(1837);
			fk_origin_column_name();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1838);
				match(COMMA);
				setState(1839);
				fk_origin_column_name();
				}
				}
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1845);
			match(CLOSE_PAR);
			setState(1846);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(K_UNIQUE);
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1849);
				match(K_KEY);
				}
				break;
			}
			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1852);
				name();
				}
				break;
			}
			setState(1855);
			match(OPEN_PAR);
			setState(1856);
			indexed_column();
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1857);
				match(COMMA);
				setState(1858);
				indexed_column();
				}
				}
				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1864);
			match(CLOSE_PAR);
			setState(1865);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			match(K_KEY);
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1868);
				name();
				}
				break;
			}
			setState(1871);
			match(OPEN_PAR);
			setState(1872);
			indexed_column();
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1873);
				match(COMMA);
				setState(1874);
				indexed_column();
				}
				}
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1880);
			match(CLOSE_PAR);
			setState(1881);
			conflict_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SqlParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SqlParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			match(K_WITH);
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(1886);
				match(K_RECURSIVE);
				}
			}

			setState(1889);
			cte_table_name();
			setState(1890);
			match(K_AS);
			setState(1891);
			match(OPEN_PAR);
			setState(1892);
			select_stmt();
			setState(1893);
			match(CLOSE_PAR);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1894);
				match(COMMA);
				setState(1895);
				cte_table_name();
				setState(1896);
				match(K_AS);
				setState(1897);
				match(OPEN_PAR);
				setState(1898);
				select_stmt();
				setState(1899);
				match(CLOSE_PAR);
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1906);
				database_name();
				setState(1907);
				match(DOT);
				}
				break;
			}
			setState(1911);
			table_name();
			setState(1917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1912);
				match(K_INDEXED);
				setState(1913);
				match(K_BY);
				setState(1914);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1915);
				match(K_NOT);
				setState(1916);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case OPEN_PAR:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case K_FUNCTION:
			case IDENTIFIER:
			case STRING_LITERAL:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			expr(0);
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1920);
				match(K_COLLATE);
				setState(1921);
				collation_name();
				}
				break;
			}
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1924);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_pragma_value);
		try {
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1929);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			table_name();
			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1933);
				match(OPEN_PAR);
				setState(1934);
				column_name();
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1935);
					match(COMMA);
					setState(1936);
					column_name();
					}
					}
					setState(1941);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1942);
				match(CLOSE_PAR);
				}
			}

			setState(1946);
			match(K_AS);
			setState(1947);
			match(OPEN_PAR);
			setState(1948);
			select_stmt();
			setState(1949);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_result_column);
		int _la;
		try {
			setState(1963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				table_name();
				setState(1953);
				match(DOT);
				setState(1954);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1956);
				expr(0);
				setState(1961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1957);
						match(K_AS);
						}
					}

					setState(1960);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_table_or_subquery);
		int _la;
		try {
			setState(2012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1965);
					database_name();
					setState(1966);
					match(DOT);
					}
					break;
				}
				setState(1970);
				table_name();
				setState(1975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1972);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
					case 1:
						{
						setState(1971);
						match(K_AS);
						}
						break;
					}
					setState(1974);
					table_alias();
					}
					break;
				}
				setState(1982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1977);
					match(K_INDEXED);
					setState(1978);
					match(K_BY);
					setState(1979);
					index_name();
					}
					break;
				case 2:
					{
					setState(1980);
					match(K_NOT);
					setState(1981);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1984);
				match(OPEN_PAR);
				setState(1994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1985);
					table_or_subquery();
					setState(1990);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1986);
						match(COMMA);
						setState(1987);
						table_or_subquery();
						}
						}
						setState(1992);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1993);
					join_clause();
					}
					break;
				}
				setState(1996);
				match(CLOSE_PAR);
				setState(2001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1998);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
					case 1:
						{
						setState(1997);
						match(K_AS);
						}
						break;
					}
					setState(2000);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2003);
				match(OPEN_PAR);
				setState(2004);
				select_stmt();
				setState(2005);
				match(CLOSE_PAR);
				setState(2010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2007);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2006);
						match(K_AS);
						}
						break;
					}
					setState(2009);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			table_or_subquery();
			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2015);
					join_operator();
					setState(2016);
					table_or_subquery();
					setState(2017);
					join_constraint();
					}
					} 
				}
				setState(2023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_join_operator);
		int _la;
		try {
			setState(2037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(2025);
					match(K_NATURAL);
					}
				}

				setState(2034);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(2028);
					match(K_LEFT);
					setState(2030);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(2029);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(2032);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(2033);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(2036);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2039);
				match(K_ON);
				setState(2040);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2041);
				match(K_USING);
				setState(2042);
				match(OPEN_PAR);
				setState(2043);
				column_name();
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2044);
					match(COMMA);
					setState(2045);
					column_name();
					}
					}
					setState(2050);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2051);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_select_core);
		int _la;
		try {
			setState(2129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2055);
				match(K_SELECT);
				setState(2057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2056);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2059);
				result_column();
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2060);
					match(COMMA);
					setState(2061);
					result_column();
					}
					}
					setState(2066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(2067);
					match(K_FROM);
					setState(2077);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
					case 1:
						{
						setState(2068);
						table_or_subquery();
						setState(2073);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2069);
							match(COMMA);
							setState(2070);
							table_or_subquery();
							}
							}
							setState(2075);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(2076);
						join_clause();
						}
						break;
					}
					}
				}

				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(2081);
					match(K_WHERE);
					setState(2082);
					expr(0);
					}
				}

				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(2085);
					match(K_GROUP);
					setState(2086);
					match(K_BY);
					setState(2087);
					expr(0);
					setState(2092);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2088);
						match(COMMA);
						setState(2089);
						expr(0);
						}
						}
						setState(2094);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2097);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(2095);
						match(K_HAVING);
						setState(2096);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(K_VALUES);
				setState(2102);
				match(OPEN_PAR);
				setState(2103);
				expr(0);
				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2104);
					match(COMMA);
					setState(2105);
					expr(0);
					}
					}
					setState(2110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2111);
				match(CLOSE_PAR);
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2112);
					match(COMMA);
					setState(2113);
					match(OPEN_PAR);
					setState(2114);
					expr(0);
					setState(2119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2115);
						match(COMMA);
						setState(2116);
						expr(0);
						}
						}
						setState(2121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2122);
					match(CLOSE_PAR);
					}
					}
					setState(2128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_compound_operator);
		try {
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2131);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2132);
				match(K_UNION);
				setState(2133);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2134);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2135);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			table_name();
			setState(2150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2139);
				match(OPEN_PAR);
				setState(2140);
				column_name();
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2141);
					match(COMMA);
					setState(2142);
					column_name();
					}
					}
					setState(2147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2148);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2152);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2155);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2156);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (NUMERIC_LITERAL - 183)) | (1L << (STRING_LITERAL - 183)) | (1L << (BLOB_LITERAL - 183)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_module_argument);
		try {
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2166);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2173);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2176); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			any_name_no_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_any_name);
		try {
			setState(2221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_TRUE:
			case K_FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2216);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2217);
				match(OPEN_PAR);
				setState(2218);
				any_name();
				setState(2219);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_name_no_keywordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_name_no_keywordContext any_name_no_keyword() {
			return getRuleContext(Any_name_no_keywordContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_name_no_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_no_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name_no_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name_no_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name_no_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_name_no_keywordContext any_name_no_keyword() throws RecognitionException {
		Any_name_no_keywordContext _localctx = new Any_name_no_keywordContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_any_name_no_keyword);
		try {
			setState(2229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2223);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2225);
				match(OPEN_PAR);
				setState(2226);
				any_name_no_keyword();
				setState(2227);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bf\u08ba\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\3\2\3\2\3\2\7"+
		"\2\u0114\n\2\f\2\16\2\u0117\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u011f\n\4"+
		"\f\4\16\4\u0122\13\4\3\4\3\4\6\4\u0126\n\4\r\4\16\4\u0127\3\4\7\4\u012b"+
		"\n\4\f\4\16\4\u012e\13\4\3\4\7\4\u0131\n\4\f\4\16\4\u0134\13\4\3\5\6\5"+
		"\u0137\n\5\r\5\16\5\u0138\3\6\3\6\3\6\5\6\u013e\n\6\5\6\u0140\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0160\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u0167\n\b\3\b\3\b\3\b\5\b\u016c\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0176\n\b\3\b\5\b\u0179\n\b\3\b\5\b\u017c\n\b\3\b\5\b"+
		"\u017f\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0190\n\13\3\f\3\f\5\f\u0194\n\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\5\r\u019c\n\r\3\r\3\r\5\r\u01a0\n\r\5\r\u01a2\n\r\3\16\3\16\3\16\5\16"+
		"\u01a7\n\16\5\16\u01a9\n\16\3\17\3\17\5\17\u01ad\n\17\3\17\3\17\3\17\7"+
		"\17\u01b2\n\17\f\17\16\17\u01b5\13\17\5\17\u01b7\n\17\3\17\3\17\3\17\5"+
		"\17\u01bc\n\17\3\17\3\17\5\17\u01c0\n\17\3\17\6\17\u01c3\n\17\r\17\16"+
		"\17\u01c4\3\17\3\17\3\17\3\17\3\17\7\17\u01cc\n\17\f\17\16\17\u01cf\13"+
		"\17\5\17\u01d1\n\17\3\17\3\17\3\17\3\17\5\17\u01d7\n\17\5\17\u01d9\n\17"+
		"\3\20\3\20\5\20\u01dd\n\20\3\20\3\20\3\20\3\20\5\20\u01e3\n\20\3\20\3"+
		"\20\3\20\5\20\u01e8\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01f1"+
		"\n\20\f\20\16\20\u01f4\13\20\3\20\3\20\3\20\5\20\u01f9\n\20\3\21\3\21"+
		"\5\21\u01fd\n\21\3\21\3\21\3\21\3\21\5\21\u0203\n\21\3\21\3\21\3\21\5"+
		"\21\u0208\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0211\n\21\f\21"+
		"\16\21\u0214\13\21\3\21\3\21\3\21\5\21\u0219\n\21\3\21\3\21\5\21\u021d"+
		"\n\21\3\21\5\21\u0220\n\21\3\22\3\22\5\22\u0224\n\22\3\22\3\22\3\22\3"+
		"\22\5\22\u022a\n\22\3\22\3\22\3\22\5\22\u022f\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0236\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u023f\n"+
		"\22\f\22\16\22\u0242\13\22\5\22\u0244\n\22\5\22\u0246\n\22\3\22\3\22\3"+
		"\22\3\22\5\22\u024c\n\22\3\22\3\22\3\22\3\22\5\22\u0252\n\22\3\22\3\22"+
		"\5\22\u0256\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u025d\n\22\3\22\3\22\6"+
		"\22\u0261\n\22\r\22\16\22\u0262\3\22\3\22\3\23\3\23\5\23\u0269\n\23\3"+
		"\23\3\23\3\23\3\23\5\23\u026f\n\23\3\23\3\23\3\23\5\23\u0274\n\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0280\n\24\3\24\3\24"+
		"\3\24\5\24\u0285\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u028e\n"+
		"\24\f\24\16\24\u0291\13\24\3\24\3\24\5\24\u0295\n\24\3\25\5\25\u0298\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u029f\n\25\3\26\5\26\u02a2\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u02a9\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u02b0"+
		"\n\26\f\26\16\26\u02b3\13\26\5\26\u02b5\n\26\3\26\3\26\3\26\3\26\5\26"+
		"\u02bb\n\26\5\26\u02bd\n\26\3\27\3\27\5\27\u02c1\n\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\5\30\u02c9\n\30\3\30\3\30\3\30\5\30\u02ce\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\5\31\u02d6\n\31\3\31\3\31\3\31\5\31\u02db\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\5\32\u02e3\n\32\3\32\3\32\3\32\5\32\u02e8"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u02f0\n\33\3\33\3\33\3\33\5\33"+
		"\u02f5\n\33\3\33\3\33\3\34\3\34\5\34\u02fb\n\34\3\34\3\34\3\34\7\34\u0300"+
		"\n\34\f\34\16\34\u0303\13\34\5\34\u0305\n\34\3\34\3\34\3\34\3\34\7\34"+
		"\u030b\n\34\f\34\16\34\u030e\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u0315"+
		"\n\34\f\34\16\34\u0318\13\34\5\34\u031a\n\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0320\n\34\5\34\u0322\n\34\3\35\5\35\u0325\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0338"+
		"\n\35\3\35\3\35\3\35\3\35\5\35\u033e\n\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u0345\n\35\f\35\16\35\u0348\13\35\3\35\3\35\5\35\u034c\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u0353\n\35\f\35\16\35\u0356\13\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u035e\n\35\f\35\16\35\u0361\13\35\3\35\3\35\7\35"+
		"\u0365\n\35\f\35\16\35\u0368\13\35\3\35\3\35\3\35\5\35\u036d\n\35\3\36"+
		"\3\36\3\36\3\36\5\36\u0373\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u037c\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0383\n\37\3\37\3\37\5\37\u0387"+
		"\n\37\5\37\u0389\n\37\3 \3 \5 \u038d\n \3 \3 \3!\3!\3!\5!\u0394\n!\5!"+
		"\u0396\n!\3!\3!\5!\u039a\n!\3!\5!\u039d\n!\3\"\3\"\3\"\3#\3#\5#\u03a4"+
		"\n#\3#\3#\3#\7#\u03a9\n#\f#\16#\u03ac\13#\5#\u03ae\n#\3#\3#\3#\3#\3#\3"+
		"#\7#\u03b6\n#\f#\16#\u03b9\13#\5#\u03bb\n#\3#\3#\3#\3#\5#\u03c1\n#\5#"+
		"\u03c3\n#\3$\3$\5$\u03c7\n$\3$\3$\3$\7$\u03cc\n$\f$\16$\u03cf\13$\5$\u03d1"+
		"\n$\3$\3$\3$\3$\7$\u03d7\n$\f$\16$\u03da\13$\3$\3$\3$\3$\3$\7$\u03e1\n"+
		"$\f$\16$\u03e4\13$\5$\u03e6\n$\3$\3$\3$\3$\5$\u03ec\n$\5$\u03ee\n$\3%"+
		"\3%\5%\u03f2\n%\3%\3%\3%\7%\u03f7\n%\f%\16%\u03fa\13%\3%\3%\3%\3%\7%\u0400"+
		"\n%\f%\16%\u0403\13%\3%\5%\u0406\n%\5%\u0408\n%\3%\3%\5%\u040c\n%\3%\3"+
		"%\3%\3%\3%\7%\u0413\n%\f%\16%\u0416\13%\3%\3%\5%\u041a\n%\5%\u041c\n%"+
		"\3%\3%\3%\3%\3%\7%\u0423\n%\f%\16%\u0426\13%\3%\3%\3%\3%\3%\3%\7%\u042e"+
		"\n%\f%\16%\u0431\13%\3%\3%\7%\u0435\n%\f%\16%\u0438\13%\5%\u043a\n%\3"+
		"&\5&\u043d\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u044a\n&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\7&\u0456\n&\f&\16&\u0459\13&\3&\3&\5&\u045d\n&\3\'"+
		"\5\'\u0460\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u046d\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0479\n\'\f\'\16\'\u047c"+
		"\13\'\3\'\3\'\5\'\u0480\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u0487\n\'\f\'\16\'"+
		"\u048a\13\'\5\'\u048c\n\'\3\'\3\'\3\'\3\'\5\'\u0492\n\'\5\'\u0494\n\'"+
		"\3(\3(\3)\3)\3)\3*\3*\3*\7*\u049e\n*\f*\16*\u04a1\13*\3*\3*\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u04b6\n-\f-\16-\u04b9\13-"+
		"\3-\3-\7-\u04bd\n-\f-\16-\u04c0\13-\5-\u04c2\n-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\7/\u04cf\n/\f/\16/\u04d2\13/\5/\u04d4\n/\3/\3/\3\60\3\60\5"+
		"\60\u04da\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\7\63\u04e9\n\63\f\63\16\63\u04ec\13\63\3\63\3\63\3\64\5\64"+
		"\u04f1\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3;\3;\3;\5;\u0511"+
		"\n;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\5<\u051d\n<\3=\3=\3=\3=\7=\u0523\n="+
		"\f=\16=\u0526\13=\3=\3=\5=\u052a\n=\3>\3>\3>\3?\3?\7?\u0531\n?\f?\16?"+
		"\u0534\13?\3?\3?\3@\3@\3A\3A\3A\3A\3A\3A\7A\u0540\nA\fA\16A\u0543\13A"+
		"\3A\3A\3A\7A\u0548\nA\fA\16A\u054b\13A\3A\5A\u054e\nA\3A\5A\u0551\nA\3"+
		"A\3A\3B\3B\3B\3B\7B\u0559\nB\fB\16B\u055c\13B\3B\3B\3B\3C\5C\u0562\nC"+
		"\3C\3C\3C\3C\3C\3C\5C\u056a\nC\3D\3D\5D\u056e\nD\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\5E\u057e\nE\3F\3F\3F\5F\u0583\nF\3F\3F\3G\3G\3G"+
		"\3G\7G\u058b\nG\fG\16G\u058e\13G\5G\u0590\nG\3G\3G\3H\3H\3H\3H\7H\u0598"+
		"\nH\fH\16H\u059b\13H\5H\u059d\nH\3H\3H\3I\3I\3I\3I\3J\3J\5J\u05a7\nJ\3"+
		"K\3K\3K\7K\u05ac\nK\fK\16K\u05af\13K\3L\3L\3L\3L\5L\u05b5\nL\3L\3L\3L"+
		"\3L\3L\5L\u05bc\nL\3L\3L\3L\5L\u05c1\nL\3L\3L\5L\u05c5\nL\3M\3M\5M\u05c9"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u05d9\nM\3N\3N\3N\5N"+
		"\u05de\nN\3N\3N\5N\u05e2\nN\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\5R\u05f9\nR\3R\3R\6R\u05fd\nR\rR\16R\u05fe\5R\u0601"+
		"\nR\3S\3S\5S\u0605\nS\3T\3T\3T\5T\u060a\nT\3U\3U\3U\3U\3U\3U\3U\3U\5U"+
		"\u0614\nU\3U\3U\3U\5U\u0619\nU\3U\3U\3U\3U\3U\3U\3U\5U\u0622\nU\3U\3U"+
		"\3U\7U\u0627\nU\fU\16U\u062a\13U\3U\5U\u062d\nU\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\5U\u063e\nU\3U\5U\u0641\nU\3U\3U\3U\3U\3U\3U\5"+
		"U\u0649\nU\3U\3U\3U\3U\3U\6U\u0650\nU\rU\16U\u0651\3U\3U\5U\u0656\nU\3"+
		"U\3U\3U\5U\u065b\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0679\nU\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\5U\u0685\nU\3U\3U\3U\5U\u068a\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\5U\u0696\nU\3U\3U\3U\3U\5U\u069c\nU\3U\3U\3U\3U\3U\5U\u06a3\nU\3U\3"+
		"U\5U\u06a7\nU\3U\3U\3U\3U\3U\3U\7U\u06af\nU\fU\16U\u06b2\13U\5U\u06b4"+
		"\nU\3U\3U\3U\3U\5U\u06ba\nU\3U\5U\u06bd\nU\7U\u06bf\nU\fU\16U\u06c2\13"+
		"U\3V\3V\3V\3V\5V\u06c8\nV\3V\3V\3V\3V\3V\7V\u06cf\nV\fV\16V\u06d2\13V"+
		"\3V\3V\5V\u06d6\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u06e2\nV\3V\3V\5V"+
		"\u06e6\nV\7V\u06e8\nV\fV\16V\u06eb\13V\3V\5V\u06ee\nV\3V\3V\3V\3V\3V\5"+
		"V\u06f5\nV\3V\5V\u06f8\nV\5V\u06fa\nV\3W\3W\3X\3X\3X\3X\3X\3X\5X\u0704"+
		"\nX\3X\3X\3Y\3Y\3Y\5Y\u070b\nY\3Y\5Y\u070e\nY\3Z\3Z\5Z\u0712\nZ\3Z\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u071d\nZ\3[\3[\3[\3[\3[\3[\7[\u0725\n[\f[\16"+
		"[\u0728\13[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0733\n\\\f\\\16\\\u0736"+
		"\13\\\3\\\3\\\3\\\3]\3]\5]\u073d\n]\3]\5]\u0740\n]\3]\3]\3]\3]\7]\u0746"+
		"\n]\f]\16]\u0749\13]\3]\3]\3]\3^\3^\5^\u0750\n^\3^\3^\3^\3^\7^\u0756\n"+
		"^\f^\16^\u0759\13^\3^\3^\3^\3_\3_\3`\3`\5`\u0762\n`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\7`\u0770\n`\f`\16`\u0773\13`\3a\3a\3a\5a\u0778\na\3"+
		"a\3a\3a\3a\3a\3a\5a\u0780\na\3b\3b\3b\5b\u0785\nb\3b\5b\u0788\nb\3c\3"+
		"c\3c\5c\u078d\nc\3d\3d\3d\3d\3d\7d\u0794\nd\fd\16d\u0797\13d\3d\3d\5d"+
		"\u079b\nd\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\5e\u07a9\ne\3e\5e\u07ac"+
		"\ne\5e\u07ae\ne\3f\3f\3f\5f\u07b3\nf\3f\3f\5f\u07b7\nf\3f\5f\u07ba\nf"+
		"\3f\3f\3f\3f\3f\5f\u07c1\nf\3f\3f\3f\3f\7f\u07c7\nf\ff\16f\u07ca\13f\3"+
		"f\5f\u07cd\nf\3f\3f\5f\u07d1\nf\3f\5f\u07d4\nf\3f\3f\3f\3f\5f\u07da\n"+
		"f\3f\5f\u07dd\nf\5f\u07df\nf\3g\3g\3g\3g\3g\7g\u07e6\ng\fg\16g\u07e9\13"+
		"g\3h\3h\5h\u07ed\nh\3h\3h\5h\u07f1\nh\3h\3h\5h\u07f5\nh\3h\5h\u07f8\n"+
		"h\3i\3i\3i\3i\3i\3i\3i\7i\u0801\ni\fi\16i\u0804\13i\3i\3i\5i\u0808\ni"+
		"\3j\3j\5j\u080c\nj\3j\3j\3j\7j\u0811\nj\fj\16j\u0814\13j\3j\3j\3j\3j\7"+
		"j\u081a\nj\fj\16j\u081d\13j\3j\5j\u0820\nj\5j\u0822\nj\3j\3j\5j\u0826"+
		"\nj\3j\3j\3j\3j\3j\7j\u082d\nj\fj\16j\u0830\13j\3j\3j\5j\u0834\nj\5j\u0836"+
		"\nj\3j\3j\3j\3j\3j\7j\u083d\nj\fj\16j\u0840\13j\3j\3j\3j\3j\3j\3j\7j\u0848"+
		"\nj\fj\16j\u084b\13j\3j\3j\7j\u084f\nj\fj\16j\u0852\13j\5j\u0854\nj\3"+
		"k\3k\3k\3k\3k\5k\u085b\nk\3l\3l\3l\3l\3l\7l\u0862\nl\fl\16l\u0865\13l"+
		"\3l\3l\5l\u0869\nl\3m\5m\u086c\nm\3m\3m\5m\u0870\nm\3n\3n\3o\3o\3p\3p"+
		"\3q\3q\5q\u087a\nq\3r\3r\3s\3s\3t\6t\u0881\nt\rt\16t\u0882\3u\3u\3v\3"+
		"v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u08b0\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u08b8\n\u0088\3\u0088\2\3\u00a8\u0089\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\2\26\5\2NN\\\\ii\4\2CCXX\4\2\20\20\u0082\u0082\3\2"+
		"\u009c\u009d\4\2\61\61RR\4\2\25\25\30\30\7\2\23\23\26\26\31\32\36\36 "+
		" \4\2\66\66PP\7\2--__hh\u0093\u0093\u0096\u0096\5\2\22\22\35\35\37\37"+
		"\4\2\24\24\27\27\3\2!$\3\2%(\6\2ddxxzz\u008f\u008f\4\2OO\u00a4\u00a4\5"+
		"\2--__\u0096\u0096\6\2HJ\u0080\u0080\u00b9\u00b9\u00bb\u00bc\6\2\24\24"+
		"\27\27\33\33~~\4\2\u00b8\u00b8\u00bb\u00bb\6\2-UX\u0083\u0085\u00aa\u00b1"+
		"\u00b5\2\u09d8\2\u0115\3\2\2\2\4\u011a\3\2\2\2\6\u0120\3\2\2\2\b\u0136"+
		"\3\2\2\2\n\u013f\3\2\2\2\f\u0161\3\2\2\2\16\u0163\3\2\2\2\20\u0180\3\2"+
		"\2\2\22\u0185\3\2\2\2\24\u0188\3\2\2\2\26\u0191\3\2\2\2\30\u0199\3\2\2"+
		"\2\32\u01a3\3\2\2\2\34\u01b6\3\2\2\2\36\u01da\3\2\2\2 \u01fa\3\2\2\2\""+
		"\u0221\3\2\2\2$\u0266\3\2\2\2&\u0279\3\2\2\2(\u0297\3\2\2\2*\u02a1\3\2"+
		"\2\2,\u02be\3\2\2\2.\u02c4\3\2\2\2\60\u02d1\3\2\2\2\62\u02de\3\2\2\2\64"+
		"\u02eb\3\2\2\2\66\u0304\3\2\2\28\u0324\3\2\2\2:\u036e\3\2\2\2<\u037d\3"+
		"\2\2\2>\u038a\3\2\2\2@\u0390\3\2\2\2B\u039e\3\2\2\2D\u03ad\3\2\2\2F\u03d0"+
		"\3\2\2\2H\u0439\3\2\2\2J\u043c\3\2\2\2L\u045f\3\2\2\2N\u0495\3\2\2\2P"+
		"\u0497\3\2\2\2R\u049a\3\2\2\2T\u04a4\3\2\2\2V\u04a8\3\2\2\2X\u04af\3\2"+
		"\2\2Z\u04c5\3\2\2\2\\\u04ca\3\2\2\2^\u04d9\3\2\2\2`\u04db\3\2\2\2b\u04e3"+
		"\3\2\2\2d\u04e5\3\2\2\2f\u04f0\3\2\2\2h\u04f5\3\2\2\2j\u04f9\3\2\2\2l"+
		"\u04ff\3\2\2\2n\u0502\3\2\2\2p\u0505\3\2\2\2r\u050a\3\2\2\2t\u050d\3\2"+
		"\2\2v\u0518\3\2\2\2x\u051e\3\2\2\2z\u052b\3\2\2\2|\u052e\3\2\2\2~\u0537"+
		"\3\2\2\2\u0080\u0539\3\2\2\2\u0082\u0554\3\2\2\2\u0084\u0561\3\2\2\2\u0086"+
		"\u056d\3\2\2\2\u0088\u057d\3\2\2\2\u008a\u057f\3\2\2\2\u008c\u0586\3\2"+
		"\2\2\u008e\u0593\3\2\2\2\u0090\u05a0\3\2\2\2\u0092\u05a6\3\2\2\2\u0094"+
		"\u05a8\3\2\2\2\u0096\u05b0\3\2\2\2\u0098\u05c8\3\2\2\2\u009a\u05da\3\2"+
		"\2\2\u009c\u05e3\3\2\2\2\u009e\u05e5\3\2\2\2\u00a0\u05e9\3\2\2\2\u00a2"+
		"\u05ec\3\2\2\2\u00a4\u0604\3\2\2\2\u00a6\u0609\3\2\2\2\u00a8\u065a\3\2"+
		"\2\2\u00aa\u06c3\3\2\2\2\u00ac\u06fb\3\2\2\2\u00ae\u06fd\3\2\2\2\u00b0"+
		"\u0707\3\2\2\2\u00b2\u0711\3\2\2\2\u00b4\u071e\3\2\2\2\u00b6\u072c\3\2"+
		"\2\2\u00b8\u073a\3\2\2\2\u00ba\u074d\3\2\2\2\u00bc\u075d\3\2\2\2\u00be"+
		"\u075f\3\2\2\2\u00c0\u0777\3\2\2\2\u00c2\u0781\3\2\2\2\u00c4\u078c\3\2"+
		"\2\2\u00c6\u078e\3\2\2\2\u00c8\u07ad\3\2\2\2\u00ca\u07de\3\2\2\2\u00cc"+
		"\u07e0\3\2\2\2\u00ce\u07f7\3\2\2\2\u00d0\u0807\3\2\2\2\u00d2\u0853\3\2"+
		"\2\2\u00d4\u085a\3\2\2\2\u00d6\u085c\3\2\2\2\u00d8\u086f\3\2\2\2\u00da"+
		"\u0871\3\2\2\2\u00dc\u0873\3\2\2\2\u00de\u0875\3\2\2\2\u00e0\u0879\3\2"+
		"\2\2\u00e2\u087b\3\2\2\2\u00e4\u087d\3\2\2\2\u00e6\u0880\3\2\2\2\u00e8"+
		"\u0884\3\2\2\2\u00ea\u0886\3\2\2\2\u00ec\u0888\3\2\2\2\u00ee\u088a\3\2"+
		"\2\2\u00f0\u088c\3\2\2\2\u00f2\u088e\3\2\2\2\u00f4\u0890\3\2\2\2\u00f6"+
		"\u0892\3\2\2\2\u00f8\u0894\3\2\2\2\u00fa\u0896\3\2\2\2\u00fc\u0898\3\2"+
		"\2\2\u00fe\u089a\3\2\2\2\u0100\u089c\3\2\2\2\u0102\u089e\3\2\2\2\u0104"+
		"\u08a0\3\2\2\2\u0106\u08a2\3\2\2\2\u0108\u08a4\3\2\2\2\u010a\u08a6\3\2"+
		"\2\2\u010c\u08af\3\2\2\2\u010e\u08b7\3\2\2\2\u0110\u0114\5\6\4\2\u0111"+
		"\u0114\5\b\5\2\u0112\u0114\5\4\3\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\2"+
		"\2\3\u0119\3\3\2\2\2\u011a\u011b\7\u00bf\2\2\u011b\u011c\b\3\1\2\u011c"+
		"\5\3\2\2\2\u011d\u011f\7\n\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u012c\5\n\6\2\u0124\u0126\7\n\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\5\n\6\2\u012a\u0125\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0131\7\n\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\7\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0135\u0137\5\f\7\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\t\3\2\2\2\u013a\u013d\7^\2\2\u013b"+
		"\u013c\7\u008b\2\2\u013c\u013e\7\u0088\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u015f\3\2\2\2\u0141\u0160\5\16\b\2\u0142\u0160\5\24\13\2\u0143\u0160"+
		"\5\26\f\2\u0144\u0160\5\30\r\2\u0145\u0160\5\32\16\2\u0146\u0160\5\34"+
		"\17\2\u0147\u0160\5\36\20\2\u0148\u0160\5 \21\2\u0149\u0160\5\"\22\2\u014a"+
		"\u0160\5$\23\2\u014b\u0160\5&\24\2\u014c\u0160\5(\25\2\u014d\u0160\5*"+
		"\26\2\u014e\u0160\5,\27\2\u014f\u0160\5.\30\2\u0150\u0160\5\60\31\2\u0151"+
		"\u0160\5\62\32\2\u0152\u0160\5\64\33\2\u0153\u0160\5\66\34\2\u0154\u0160"+
		"\58\35\2\u0155\u0160\5:\36\2\u0156\u0160\5<\37\2\u0157\u0160\5> \2\u0158"+
		"\u0160\5@!\2\u0159\u0160\5B\"\2\u015a\u0160\5D#\2\u015b\u0160\5F$\2\u015c"+
		"\u0160\5J&\2\u015d\u0160\5L\'\2\u015e\u0160\5N(\2\u015f\u0141\3\2\2\2"+
		"\u015f\u0142\3\2\2\2\u015f\u0143\3\2\2\2\u015f\u0144\3\2\2\2\u015f\u0145"+
		"\3\2\2\2\u015f\u0146\3\2\2\2\u015f\u0147\3\2\2\2\u015f\u0148\3\2\2\2\u015f"+
		"\u0149\3\2\2\2\u015f\u014a\3\2\2\2\u015f\u014b\3\2\2\2\u015f\u014c\3\2"+
		"\2\2\u015f\u014d\3\2\2\2\u015f\u014e\3\2\2\2\u015f\u014f\3\2\2\2\u015f"+
		"\u0150\3\2\2\2\u015f\u0151\3\2\2\2\u015f\u0152\3\2\2\2\u015f\u0153\3\2"+
		"\2\2\u015f\u0154\3\2\2\2\u015f\u0155\3\2\2\2\u015f\u0156\3\2\2\2\u015f"+
		"\u0157\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2"+
		"\2\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\13\3\2\2\2\u0161\u0162\5d\63\2\u0162\r\3\2\2\2\u0163"+
		"\u0164\7\62\2\2\u0164\u0166\7\u009b\2\2\u0165\u0167\7\u0084\2\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u0169\5\u00ec"+
		"w\2\u0169\u016a\7\13\2\2\u016a\u016c\3\2\2\2\u016b\u0168\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0178\5\u00eex\2\u016e\u016f"+
		"\7\u0092\2\2\u016f\u0170\7\u009f\2\2\u0170\u0179\5\u00f4{\2\u0171\u0179"+
		"\5\22\n\2\u0172\u0179\5\20\t\2\u0173\u0175\7/\2\2\u0174\u0176\7B\2\2\u0175"+
		"\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\5\u0094"+
		"K\2\u0178\u016e\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178"+
		"\u0173\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\7Y\2\2\u017b\u017a\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5\u00e6t\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\17\3\2\2\2\u0180\u0181\7/\2\2"+
		"\u0181\u0182\7E\2\2\u0182\u0183\5\u010c\u0087\2\u0183\u0184\5\u00b2Z\2"+
		"\u0184\21\3\2\2\2\u0185\u0186\7/\2\2\u0186\u0187\5\u00b2Z\2\u0187\23\3"+
		"\2\2\2\u0188\u018f\7\63\2\2\u0189\u0190\5\u00ecw\2\u018a\u0190\5\u00f2"+
		"z\2\u018b\u018c\5\u00ecw\2\u018c\u018d\7\13\2\2\u018d\u018e\5\u00f2z\2"+
		"\u018e\u0190\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018b"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\25\3\2\2\2\u0191\u0193\7\67\2\2\u0192"+
		"\u0194\7K\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0196\5\u00a8U\2\u0196\u0197\7\65\2\2\u0197\u0198\5\u00ecw"+
		"\2\u0198\27\3\2\2\2\u0199\u019b\7:\2\2\u019a\u019c\t\2\2\2\u019b\u019a"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a1\3\2\2\2\u019d\u019f\7\u00a0\2"+
		"\2\u019e\u01a0\5\u010a\u0086\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u01a2\3\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\31"+
		"\3\2\2\2\u01a3\u01a8\t\3\2\2\u01a4\u01a6\7\u00a0\2\2\u01a5\u01a7\5\u010a"+
		"\u0086\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\33\3\2\2\2\u01aa\u01ac\7\u00b2"+
		"\2\2\u01ab\u01ad\7\u008d\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b3\5\u00c6d\2\u01af\u01b0\7\20\2\2\u01b0\u01b2"+
		"\5\u00c6d\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01aa"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01c2\5\u00d2j"+
		"\2\u01b9\u01bb\7\u00a2\2\2\u01ba\u01bc\7\61\2\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01c0\3\2\2\2\u01bd\u01c0\7q\2\2\u01be\u01c0\7[\2"+
		"\2\u01bf\u01b9\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c3\5\u00d2j\2\u01c2\u01bf\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01d0\3\2\2\2\u01c6\u01c7"+
		"\7\u0086\2\2\u01c7\u01c8\7<\2\2\u01c8\u01cd\5\u00c2b\2\u01c9\u01ca\7\20"+
		"\2\2\u01ca\u01cc\5\u00c2b\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01d0\u01c6\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d8\3\2\2\2\u01d2"+
		"\u01d3\7y\2\2\u01d3\u01d6\5\u00a8U\2\u01d4\u01d5\t\4\2\2\u01d5\u01d7\5"+
		"\u00a8U\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2"+
		"\u01d8\u01d2\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\35\3\2\2\2\u01da\u01dc"+
		"\7F\2\2\u01db\u01dd\7\u00a3\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\3\2\2\2\u01de\u01e2\7k\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1"+
		"\7~\2\2\u01e1\u01e3\7]\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e7\3\2\2\2\u01e4\u01e5\5\u00ecw\2\u01e5\u01e6\7\13\2\2\u01e6\u01e8"+
		"\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\5\u00fc\177\2\u01ea\u01eb\7\u0083\2\2\u01eb\u01ec\5\u00f0y\2\u01ec"+
		"\u01ed\7\f\2\2\u01ed\u01f2\5\u00b0Y\2\u01ee\u01ef\7\20\2\2\u01ef\u01f1"+
		"\5\u00b0Y\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8"+
		"\7\r\2\2\u01f6\u01f7\7\u00b1\2\2\u01f7\u01f9\5\u00a8U\2\u01f8\u01f6\3"+
		"\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\37\3\2\2\2\u01fa\u01fc\7F\2\2\u01fb\u01fd"+
		"\t\5\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0202\7\u009b\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7~\2\2\u0201\u0203\7"+
		"]\2\2\u0202\u01ff\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0207\3\2\2\2\u0204"+
		"\u0205\5\u00ecw\2\u0205\u0206\7\13\2\2\u0206\u0208\3\2\2\2\u0207\u0204"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u021c\5\u00f0y"+
		"\2\u020a\u020b\7\f\2\2\u020b\u0212\5\u0094K\2\u020c\u020d\7\20\2\2\u020d"+
		"\u0211\5\u00b2Z\2\u020e\u020f\7\20\2\2\u020f\u0211\5\u0094K\2\u0210\u020c"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0218\7\r"+
		"\2\2\u0216\u0217\7\u00b3\2\2\u0217\u0219\7\u00b8\2\2\u0218\u0216\3\2\2"+
		"\2\u0218\u0219\3\2\2\2\u0219\u021d\3\2\2\2\u021a\u021b\7\65\2\2\u021b"+
		"\u021d\5F$\2\u021c\u020a\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021f\3\2\2"+
		"\2\u021e\u0220\5\u00e6t\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"!\3\2\2\2\u0221\u0223\7F\2\2\u0222\u0224\t\5\2\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0229\7\u00a1\2\2\u0226\u0227"+
		"\7g\2\2\u0227\u0228\7~\2\2\u0228\u022a\7]\2\2\u0229\u0226\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022e\3\2\2\2\u022b\u022c\5\u00ecw\2\u022c\u022d"+
		"\7\13\2\2\u022d\u022f\3\2\2\2\u022e\u022b\3\2\2\2\u022e\u022f\3\2\2\2"+
		"\u022f\u0230\3\2\2\2\u0230\u0235\5\u00fe\u0080\2\u0231\u0236\79\2\2\u0232"+
		"\u0236\7\60\2\2\u0233\u0234\7p\2\2\u0234\u0236\7\u0081\2\2\u0235\u0231"+
		"\3\2\2\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0245\3\2\2\2\u0237\u0246\7O\2\2\u0238\u0246\7o\2\2\u0239\u0243\7\u00a4"+
		"\2\2\u023a\u023b\7\u0081\2\2\u023b\u0240\5\u00f6|\2\u023c\u023d\7\20\2"+
		"\2\u023d\u023f\5\u00f6|\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0243\u023a\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0237\3\2\2\2\u0245\u0238\3\2\2\2\u0245\u0239\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u024b\7\u0083\2\2\u0248\u0249\5\u00ecw\2\u0249\u024a\7\13\2"+
		"\2\u024a\u024c\3\2\2\2\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u0251\5\u00f0y\2\u024e\u024f\7`\2\2\u024f\u0250\7T\2\2"+
		"\u0250\u0252\7\u0097\2\2\u0251\u024e\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0254\7\u00aa\2\2\u0254\u0256\5\u00a8U\2\u0255\u0253"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0260\7:\2\2\u0258"+
		"\u025d\5J&\2\u0259\u025d\58\35\2\u025a\u025d\5(\25\2\u025b\u025d\5F$\2"+
		"\u025c\u0258\3\2\2\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7\n\2\2\u025f\u0261\3\2\2\2\u0260"+
		"\u025c\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7X\2\2\u0265#\3\2\2\2\u0266\u0268"+
		"\7F\2\2\u0267\u0269\t\5\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026e\7\u00a8\2\2\u026b\u026c\7g\2\2\u026c\u026d"+
		"\7~\2\2\u026d\u026f\7]\2\2\u026e\u026b\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0273\3\2\2\2\u0270\u0271\5\u00ecw\2\u0271\u0272\7\13\2\2\u0272\u0274"+
		"\3\2\2\2\u0273\u0270\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0276\5\u0100\u0081\2\u0276\u0277\7\65\2\2\u0277\u0278\5F$\2\u0278%\3"+
		"\2\2\2\u0279\u027a\7F\2\2\u027a\u027b\7\u00a9\2\2\u027b\u027f\7\u009b"+
		"\2\2\u027c\u027d\7g\2\2\u027d\u027e\7~\2\2\u027e\u0280\7]\2\2\u027f\u027c"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0284\3\2\2\2\u0281\u0282\5\u00ecw"+
		"\2\u0282\u0283\7\13\2\2\u0283\u0285\3\2\2\2\u0284\u0281\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\u00f0y\2\u0287\u0288"+
		"\7\u00a5\2\2\u0288\u0294\5\u0102\u0082\2\u0289\u028a\7\f\2\2\u028a\u028f"+
		"\5\u00e0q\2\u028b\u028c\7\20\2\2\u028c\u028e\5\u00e0q\2\u028d\u028b\3"+
		"\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7\r\2\2\u0293\u0295\3\2"+
		"\2\2\u0294\u0289\3\2\2\2\u0294\u0295\3\2\2\2\u0295\'\3\2\2\2\u0296\u0298"+
		"\5\u00be`\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2"+
		"\2\u0299\u029a\7O\2\2\u029a\u029b\7b\2\2\u029b\u029e\5\u00c0a\2\u029c"+
		"\u029d\7\u00b1\2\2\u029d\u029f\5\u00a8U\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f)\3\2\2\2\u02a0\u02a2\5\u00be`\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7O\2\2\u02a4\u02a5\7b\2"+
		"\2\u02a5\u02a8\5\u00c0a\2\u02a6\u02a7\7\u00b1\2\2\u02a7\u02a9\5\u00a8"+
		"U\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02bc\3\2\2\2\u02aa"+
		"\u02ab\7\u0086\2\2\u02ab\u02ac\7<\2\2\u02ac\u02b1\5\u00c2b\2\u02ad\u02ae"+
		"\7\20\2\2\u02ae\u02b0\5\u00c2b\2\u02af\u02ad\3\2\2\2\u02b0\u02b3\3\2\2"+
		"\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\7y\2\2\u02b7\u02ba\5\u00a8U\2\u02b8\u02b9\t\4\2\2\u02b9\u02bb\5"+
		"\u00a8U\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2"+
		"\u02bc\u02b4\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd+\3\2\2\2\u02be\u02c0\7"+
		"Q\2\2\u02bf\u02c1\7K\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\5\u00ecw\2\u02c3-\3\2\2\2\u02c4\u02c5\7S\2"+
		"\2\u02c5\u02c8\7k\2\2\u02c6\u02c7\7g\2\2\u02c7\u02c9\7]\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cd\3\2\2\2\u02ca\u02cb\5\u00ecw"+
		"\2\u02cb\u02cc\7\13\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02ca\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\5\u00fc\177\2\u02d0/\3"+
		"\2\2\2\u02d1\u02d2\7S\2\2\u02d2\u02d5\7\u009b\2\2\u02d3\u02d4\7g\2\2\u02d4"+
		"\u02d6\7]\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02da\3\2"+
		"\2\2\u02d7\u02d8\5\u00ecw\2\u02d8\u02d9\7\13\2\2\u02d9\u02db\3\2\2\2\u02da"+
		"\u02d7\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\5\u00f0"+
		"y\2\u02dd\61\3\2\2\2\u02de\u02df\7S\2\2\u02df\u02e2\7\u00a1\2\2\u02e0"+
		"\u02e1\7g\2\2\u02e1\u02e3\7]\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2"+
		"\2\u02e3\u02e7\3\2\2\2\u02e4\u02e5\5\u00ecw\2\u02e5\u02e6\7\13\2\2\u02e6"+
		"\u02e8\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u02ea\5\u00fe\u0080\2\u02ea\63\3\2\2\2\u02eb\u02ec\7S\2\2\u02ec"+
		"\u02ef\7\u00a8\2\2\u02ed\u02ee\7g\2\2\u02ee\u02f0\7]\2\2\u02ef\u02ed\3"+
		"\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f4\3\2\2\2\u02f1\u02f2\5\u00ecw\2"+
		"\u02f2\u02f3\7\13\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\5\u0100\u0081\2\u02f7\65\3\2"+
		"\2\2\u02f8\u02fa\7\u00b2\2\2\u02f9\u02fb\7\u008d\2\2\u02fa\u02f9\3\2\2"+
		"\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0301\5\u00c6d\2\u02fd"+
		"\u02fe\7\20\2\2\u02fe\u0300\5\u00c6d\2\u02ff\u02fd\3\2\2\2\u0300\u0303"+
		"\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0304\u02f8\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u030c\5\u00d2j\2\u0307\u0308\5\u00d4k\2\u0308\u0309\5\u00d2"+
		"j\2\u0309\u030b\3\2\2\2\u030a\u0307\3\2\2\2\u030b\u030e\3\2\2\2\u030c"+
		"\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0319\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030f\u0310\7\u0086\2\2\u0310\u0311\7<\2\2\u0311\u0316\5\u00c2b\2"+
		"\u0312\u0313\7\20\2\2\u0313\u0315\5\u00c2b\2\u0314\u0312\3\2\2\2\u0315"+
		"\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u031a\3\2"+
		"\2\2\u0318\u0316\3\2\2\2\u0319\u030f\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0321\3\2\2\2\u031b\u031c\7y\2\2\u031c\u031f\5\u00a8U\2\u031d\u031e\t"+
		"\4\2\2\u031e\u0320\5\u00a8U\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2"+
		"\u0320\u0322\3\2\2\2\u0321\u031b\3\2\2\2\u0321\u0322\3\2\2\2\u0322\67"+
		"\3\2\2\2\u0323\u0325\5\u00be`\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2"+
		"\2\u0325\u0337\3\2\2\2\u0326\u0338\7o\2\2\u0327\u0338\7\u0093\2\2\u0328"+
		"\u0329\7o\2\2\u0329\u032a\7\u0085\2\2\u032a\u0338\7\u0093\2\2\u032b\u032c"+
		"\7o\2\2\u032c\u032d\7\u0085\2\2\u032d\u0338\7\u0096\2\2\u032e\u032f\7"+
		"o\2\2\u032f\u0330\7\u0085\2\2\u0330\u0338\7-\2\2\u0331\u0332\7o\2\2\u0332"+
		"\u0333\7\u0085\2\2\u0333\u0338\7_\2\2\u0334\u0335\7o\2\2\u0335\u0336\7"+
		"\u0085\2\2\u0336\u0338\7h\2\2\u0337\u0326\3\2\2\2\u0337\u0327\3\2\2\2"+
		"\u0337\u0328\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032e\3\2\2\2\u0337\u0331"+
		"\3\2\2\2\u0337\u0334\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033d\7r\2\2\u033a"+
		"\u033b\5\u00ecw\2\u033b\u033c\7\13\2\2\u033c\u033e\3\2\2\2\u033d\u033a"+
		"\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u034b\5\u00f0y"+
		"\2\u0340\u0341\7\f\2\2\u0341\u0346\5\u00f6|\2\u0342\u0343\7\20\2\2\u0343"+
		"\u0345\5\u00f6|\2\u0344\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349"+
		"\u034a\7\r\2\2\u034a\u034c\3\2\2\2\u034b\u0340\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u036c\3\2\2\2\u034d\u034e\7\u00a7\2\2\u034e\u034f\7\f\2\2\u034f"+
		"\u0354\5\u00a8U\2\u0350\u0351\7\20\2\2\u0351\u0353\5\u00a8U\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0366\7\r\2\2\u0358\u0359\7\20"+
		"\2\2\u0359\u035a\7\f\2\2\u035a\u035f\5\u00a8U\2\u035b\u035c\7\20\2\2\u035c"+
		"\u035e\5\u00a8U\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2\2\2\u0362"+
		"\u0363\7\r\2\2\u0363\u0365\3\2\2\2\u0364\u0358\3\2\2\2\u0365\u0368\3\2"+
		"\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u036d\3\2\2\2\u0368"+
		"\u0366\3\2\2\2\u0369\u036d\5F$\2\u036a\u036b\7L\2\2\u036b\u036d\7\u00a7"+
		"\2\2\u036c\u034d\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036d"+
		"9\3\2\2\2\u036e\u0372\7\u0089\2\2\u036f\u0370\5\u00ecw\2\u0370\u0371\7"+
		"\13\2\2\u0371\u0373\3\2\2\2\u0372\u036f\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u037b\5\u0104\u0083\2\u0375\u0376\7\21\2\2\u0376"+
		"\u037c\5\u00c4c\2\u0377\u0378\7\f\2\2\u0378\u0379\5\u00c4c\2\u0379\u037a"+
		"\7\r\2\2\u037a\u037c\3\2\2\2\u037b\u0375\3\2\2\2\u037b\u0377\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c;\3\2\2\2\u037d\u0388\7\u0090\2\2\u037e\u0389\5\u00f8"+
		"}\2\u037f\u0380\5\u00ecw\2\u0380\u0381\7\13\2\2\u0381\u0383\3\2\2\2\u0382"+
		"\u037f\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0387\5\u00f0"+
		"y\2\u0385\u0387\5\u00fc\177\2\u0386\u0384\3\2\2\2\u0386\u0385\3\2\2\2"+
		"\u0387\u0389\3\2\2\2\u0388\u037e\3\2\2\2\u0388\u0382\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389=\3\2\2\2\u038a\u038c\7\u0091\2\2\u038b\u038d\7\u0098\2"+
		"\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f"+
		"\5\u0106\u0084\2\u038f?\3\2\2\2\u0390\u0395\7\u0096\2\2\u0391\u0393\7"+
		"\u00a0\2\2\u0392\u0394\5\u010a\u0086\2\u0393\u0392\3\2\2\2\u0393\u0394"+
		"\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0391\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u039c\3\2\2\2\u0397\u0399\7\u009f\2\2\u0398\u039a\7\u0098\2\2\u0399\u0398"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\5\u0106\u0084"+
		"\2\u039c\u0397\3\2\2\2\u039c\u039d\3\2\2\2\u039dA\3\2\2\2\u039e\u039f"+
		"\7\u0098\2\2\u039f\u03a0\5\u0106\u0084\2\u03a0C\3\2\2\2\u03a1\u03a3\7"+
		"\u00b2\2\2\u03a2\u03a4\7\u008d\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03aa\5\u00c6d\2\u03a6\u03a7\7\20\2\2\u03a7"+
		"\u03a9\5\u00c6d\2\u03a8\u03a6\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad"+
		"\u03a1\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03ba\5\u00d2"+
		"j\2\u03b0\u03b1\7\u0086\2\2\u03b1\u03b2\7<\2\2\u03b2\u03b7\5\u00c2b\2"+
		"\u03b3\u03b4\7\20\2\2\u03b4\u03b6\5\u00c2b\2\u03b5\u03b3\3\2\2\2\u03b6"+
		"\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bb\3\2"+
		"\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03b0\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb"+
		"\u03c2\3\2\2\2\u03bc\u03bd\7y\2\2\u03bd\u03c0\5\u00a8U\2\u03be\u03bf\t"+
		"\4\2\2\u03bf\u03c1\5\u00a8U\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2"+
		"\u03c1\u03c3\3\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3E\3"+
		"\2\2\2\u03c4\u03c6\7\u00b2\2\2\u03c5\u03c7\7\u008d\2\2\u03c6\u03c5\3\2"+
		"\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cd\5\u00c6d\2\u03c9"+
		"\u03ca\7\20\2\2\u03ca\u03cc\5\u00c6d\2\u03cb\u03c9\3\2\2\2\u03cc\u03cf"+
		"\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03d0\u03c4\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d8\5H%\2\u03d3\u03d4\5\u00d4k\2\u03d4\u03d5\5H%\2\u03d5"+
		"\u03d7\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03e5\3\2\2\2\u03da\u03d8\3\2\2\2\u03db"+
		"\u03dc\7\u0086\2\2\u03dc\u03dd\7<\2\2\u03dd\u03e2\5\u00c2b\2\u03de\u03df"+
		"\7\20\2\2\u03df\u03e1\5\u00c2b\2\u03e0\u03de\3\2\2\2\u03e1\u03e4\3\2\2"+
		"\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03db\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ed\3\2\2\2\u03e7"+
		"\u03e8\7y\2\2\u03e8\u03eb\5\u00a8U\2\u03e9\u03ea\t\4\2\2\u03ea\u03ec\5"+
		"\u00a8U\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2"+
		"\u03ed\u03e7\3\2\2\2\u03ed\u03ee\3\2\2\2\u03eeG\3\2\2\2\u03ef\u03f1\7"+
		"\u0099\2\2\u03f0\u03f2\t\6\2\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2"+
		"\u03f2\u03f3\3\2\2\2\u03f3\u03f8\5\u00c8e\2\u03f4\u03f5\7\20\2\2\u03f5"+
		"\u03f7\5\u00c8e\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u0407\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb"+
		"\u0405\7b\2\2\u03fc\u0401\5\u00caf\2\u03fd\u03fe\7\20\2\2\u03fe\u0400"+
		"\5\u00caf\2\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2"+
		"\2\u0401\u0402\3\2\2\2\u0402\u0406\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406"+
		"\5\u00ccg\2\u0405\u03fc\3\2\2\2\u0405\u0404\3\2\2\2\u0406\u0408\3\2\2"+
		"\2\u0407\u03fb\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u040a"+
		"\7\u00b1\2\2\u040a\u040c\5\u00a8U\2\u040b\u0409\3\2\2\2\u040b\u040c\3"+
		"\2\2\2\u040c\u041b\3\2\2\2\u040d\u040e\7e\2\2\u040e\u040f\7<\2\2\u040f"+
		"\u0414\5\u00a8U\2\u0410\u0411\7\20\2\2\u0411\u0413\5\u00a8U\2\u0412\u0410"+
		"\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0419\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\7f\2\2\u0418\u041a\5\u00a8"+
		"U\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b"+
		"\u040d\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u043a\3\2\2\2\u041d\u041e\7\u00a7"+
		"\2\2\u041e\u041f\7\f\2\2\u041f\u0424\5\u00a8U\2\u0420\u0421\7\20\2\2\u0421"+
		"\u0423\5\u00a8U\2\u0422\u0420\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422"+
		"\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2\2\2\u0427"+
		"\u0436\7\r\2\2\u0428\u0429\7\20\2\2\u0429\u042a\7\f\2\2\u042a\u042f\5"+
		"\u00a8U\2\u042b\u042c\7\20\2\2\u042c\u042e\5\u00a8U\2\u042d\u042b\3\2"+
		"\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0432\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0433\7\r\2\2\u0433\u0435\3\2"+
		"\2\2\u0434\u0428\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u03ef\3\2"+
		"\2\2\u0439\u041d\3\2\2\2\u043aI\3\2\2\2\u043b\u043d\5\u00be`\2\u043c\u043b"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0449\7\u00a4\2"+
		"\2\u043f\u0440\7\u0085\2\2\u0440\u044a\7\u0096\2\2\u0441\u0442\7\u0085"+
		"\2\2\u0442\u044a\7-\2\2\u0443\u0444\7\u0085\2\2\u0444\u044a\7\u0093\2"+
		"\2\u0445\u0446\7\u0085\2\2\u0446\u044a\7_\2\2\u0447\u0448\7\u0085\2\2"+
		"\u0448\u044a\7h\2\2\u0449\u043f\3\2\2\2\u0449\u0441\3\2\2\2\u0449\u0443"+
		"\3\2\2\2\u0449\u0445\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\5\u00c0a\2\u044c\u044d\7\u009a\2\2\u044d\u044e"+
		"\5\u00f6|\2\u044e\u044f\7\21\2\2\u044f\u0457\5\u00a8U\2\u0450\u0451\7"+
		"\20\2\2\u0451\u0452\5\u00f6|\2\u0452\u0453\7\21\2\2\u0453\u0454\5\u00a8"+
		"U\2\u0454\u0456\3\2\2\2\u0455\u0450\3\2\2\2\u0456\u0459\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045c\3\2\2\2\u0459\u0457\3\2"+
		"\2\2\u045a\u045b\7\u00b1\2\2\u045b\u045d\5\u00a8U\2\u045c\u045a\3\2\2"+
		"\2\u045c\u045d\3\2\2\2\u045dK\3\2\2\2\u045e\u0460\5\u00be`\2\u045f\u045e"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u046c\7\u00a4\2"+
		"\2\u0462\u0463\7\u0085\2\2\u0463\u046d\7\u0096\2\2\u0464\u0465\7\u0085"+
		"\2\2\u0465\u046d\7-\2\2\u0466\u0467\7\u0085\2\2\u0467\u046d\7\u0093\2"+
		"\2\u0468\u0469\7\u0085\2\2\u0469\u046d\7_\2\2\u046a\u046b\7\u0085\2\2"+
		"\u046b\u046d\7h\2\2\u046c\u0462\3\2\2\2\u046c\u0464\3\2\2\2\u046c\u0466"+
		"\3\2\2\2\u046c\u0468\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046f\5\u00c0a\2\u046f\u0470\7\u009a\2\2\u0470\u0471"+
		"\5\u00f6|\2\u0471\u0472\7\21\2\2\u0472\u047a\5\u00a8U\2\u0473\u0474\7"+
		"\20\2\2\u0474\u0475\5\u00f6|\2\u0475\u0476\7\21\2\2\u0476\u0477\5\u00a8"+
		"U\2\u0477\u0479\3\2\2\2\u0478\u0473\3\2\2\2\u0479\u047c\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047f\3\2\2\2\u047c\u047a\3\2"+
		"\2\2\u047d\u047e\7\u00b1\2\2\u047e\u0480\5\u00a8U\2\u047f\u047d\3\2\2"+
		"\2\u047f\u0480\3\2\2\2\u0480\u0493\3\2\2\2\u0481\u0482\7\u0086\2\2\u0482"+
		"\u0483\7<\2\2\u0483\u0488\5\u00c2b\2\u0484\u0485\7\20\2\2\u0485\u0487"+
		"\5\u00c2b\2\u0486\u0484\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2"+
		"\2\u0488\u0489\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u0481"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\7y\2\2\u048e"+
		"\u0491\5\u00a8U\2\u048f\u0490\t\4\2\2\u0490\u0492\5\u00a8U\2\u0491\u048f"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u048b\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494M\3\2\2\2\u0495\u0496\7\u00a6\2\2\u0496O\3\2\2\2\u0497"+
		"\u0498\7\u00b7\2\2\u0498\u0499\5R*\2\u0499Q\3\2\2\2\u049a\u049f\5T+\2"+
		"\u049b\u049c\7\20\2\2\u049c\u049e\5T+\2\u049d\u049b\3\2\2\2\u049e\u04a1"+
		"\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a2\u04a3\7\n\2\2\u04a3S\3\2\2\2\u04a4\u04a5\7\u00b8"+
		"\2\2\u04a5\u04a6\7\21\2\2\u04a6\u04a7\5\u00a8U\2\u04a7U\3\2\2\2\u04a8"+
		"\u04a9\7\u00b7\2\2\u04a9\u04aa\7\u00b8\2\2\u04aa\u04ab\7\3\2\2\u04ab\u04ac"+
		"\7\21\2\2\u04ac\u04ad\5\u00a8U\2\u04ad\u04ae\7\n\2\2\u04aeW\3\2\2\2\u04af"+
		"\u04c1\7\f\2\2\u04b0\u04b1\7\u00b7\2\2\u04b1\u04b7\7\u00b8\2\2\u04b2\u04b3"+
		"\7\20\2\2\u04b3\u04b4\7\u00b7\2\2\u04b4\u04b6\7\u00b8\2\2\u04b5\u04b2"+
		"\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04be\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bb\7\20\2\2\u04bb\u04bd\5"+
		"Z.\2\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04b0\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\7\r\2\2\u04c4"+
		"Y\3\2\2\2\u04c5\u04c6\7\u00b7\2\2\u04c6\u04c7\7\u00b8\2\2\u04c7\u04c8"+
		"\7\21\2\2\u04c8\u04c9\5\u00a8U\2\u04c9[\3\2\2\2\u04ca\u04d3\7\f\2\2\u04cb"+
		"\u04d0\5^\60\2\u04cc\u04cd\7\20\2\2\u04cd\u04cf\5^\60\2\u04ce\u04cc\3"+
		"\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1"+
		"\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04cb\3\2\2\2\u04d3\u04d4\3\2"+
		"\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7\r\2\2\u04d6]\3\2\2\2\u04d7\u04da"+
		"\5`\61\2\u04d8\u04da\5\u00a8U\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2"+
		"\2\u04da_\3\2\2\2\u04db\u04dc\7\u00b6\2\2\u04dc\u04dd\5X-\2\u04dd\u04de"+
		"\7\4\2\2\u04de\u04df\7V\2\2\u04df\u04e0\5\u00a8U\2\u04e0\u04e1\7\n\2\2"+
		"\u04e1\u04e2\7\5\2\2\u04e2a\3\2\2\2\u04e3\u04e4\5\u010e\u0088\2\u04e4"+
		"c\3\2\2\2\u04e5\u04e6\5f\64\2\u04e6\u04ea\7\4\2\2\u04e7\u04e9\5\u0088"+
		"E\2\u04e8\u04e7\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04ee\7\5"+
		"\2\2\u04eee\3\2\2\2\u04ef\u04f1\7\u00b6\2\2\u04f0\u04ef\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\5b\62\2\u04f3\u04f4\5X"+
		"-\2\u04f4g\3\2\2\2\u04f5\u04f6\5b\62\2\u04f6\u04f7\5\\/\2\u04f7\u04f8"+
		"\7\n\2\2\u04f8i\3\2\2\2\u04f9\u04fa\7\u00ae\2\2\u04fa\u04fb\7\f\2\2\u04fb"+
		"\u04fc\5\u00a8U\2\u04fc\u04fd\7\r\2\2\u04fd\u04fe\7\n\2\2\u04fek\3\2\2"+
		"\2\u04ff\u0500\5n8\2\u0500\u0501\5|?\2\u0501m\3\2\2\2\u0502\u0503\7\u00ac"+
		"\2\2\u0503\u0504\5~@\2\u0504o\3\2\2\2\u0505\u0506\7\u00ab\2\2\u0506\u0507"+
		"\5|?\2\u0507\u0508\5n8\2\u0508\u0509\7\n\2\2\u0509q\3\2\2\2\u050a\u050b"+
		"\5t;\2\u050b\u050c\5|?\2\u050cs\3\2\2\2\u050d\u050e\7`\2\2\u050e\u0510"+
		"\7\f\2\2\u050f\u0511\7\u00b7\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2"+
		"\2\u0511\u0512\3\2\2\2\u0512\u0513\5R*\2\u0513\u0514\5~@\2\u0514\u0515"+
		"\7\n\2\2\u0515\u0516\5v<\2\u0516\u0517\7\r\2\2\u0517u\3\2\2\2\u0518\u051c"+
		"\5\u010e\u0088\2\u0519\u051d\t\7\2\2\u051a\u051b\t\b\2\2\u051b\u051d\5"+
		"\u00a8U\2\u051c\u0519\3\2\2\2\u051c\u051a\3\2\2\2\u051dw\3\2\2\2\u051e"+
		"\u051f\7g\2\2\u051f\u0524\5z>\2\u0520\u0521\7W\2\2\u0521\u0523\5z>\2\u0522"+
		"\u0520\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2"+
		"\2\2\u0525\u0529\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0528\7U\2\2\u0528"+
		"\u052a\5|?\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052ay\3\2\2\2\u052b"+
		"\u052c\5~@\2\u052c\u052d\5|?\2\u052d{\3\2\2\2\u052e\u0532\7\4\2\2\u052f"+
		"\u0531\5\u0088E\2\u0530\u052f\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0536\7\5\2\2\u0536}\3\2\2\2\u0537\u0538\5\u00a8U\2\u0538\177\3\2\2\2"+
		"\u0539\u053a\7\u00ad\2\2\u053a\u053b\7\f\2\2\u053b\u053c\7\u00b8\2\2\u053c"+
		"\u053d\7\r\2\2\u053d\u0541\7\4\2\2\u053e\u0540\5\u0082B\2\u053f\u053e"+
		"\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u0550\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0545\7L\2\2\u0545\u0549\7\6"+
		"\2\2\u0546\u0548\5\u0088E\2\u0547\u0546\3\2\2\2\u0548\u054b\3\2\2\2\u0549"+
		"\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2"+
		"\2\2\u054c\u054e\7\u00af\2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e"+
		"\u054f\3\2\2\2\u054f\u0551\7\n\2\2\u0550\u0544\3\2\2\2\u0550\u0551\3\2"+
		"\2\2\u0551\u0552\3\2\2\2\u0552\u0553\7\5\2\2\u0553\u0081\3\2\2\2\u0554"+
		"\u0555\7>\2\2\u0555\u0556\5\u00a8U\2\u0556\u055a\7\6\2\2\u0557\u0559\5"+
		"\u0088E\2\u0558\u0557\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2"+
		"\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u055e"+
		"\7\u00af\2\2\u055e\u055f\7\n\2\2\u055f\u0083\3\2\2\2\u0560\u0562\7+\2"+
		"\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564"+
		"\5~@\2\u0564\u0565\7\7\2\2\u0565\u0566\5\u0086D\2\u0566\u0567\7\6\2\2"+
		"\u0567\u0569\5\u0086D\2\u0568\u056a\7\n\2\2\u0569\u0568\3\2\2\2\u0569"+
		"\u056a\3\2\2\2\u056a\u0085\3\2\2\2\u056b\u056e\5\u00a8U\2\u056c\u056e"+
		"\5|?\2\u056d\u056b\3\2\2\2\u056d\u056c\3\2\2\2\u056e\u0087\3\2\2\2\u056f"+
		"\u057e\5P)\2\u0570\u057e\5R*\2\u0571\u057e\5V,\2\u0572\u057e\5\u0080A"+
		"\2\u0573\u057e\5h\65\2\u0574\u057e\5x=\2\u0575\u057e\5\u0084C\2\u0576"+
		"\u057e\5r:\2\u0577\u057e\5l\67\2\u0578\u057e\5p9\2\u0579\u057e\5j\66\2"+
		"\u057a\u057b\7\u00af\2\2\u057b\u057e\7\n\2\2\u057c\u057e\5\u008aF\2\u057d"+
		"\u056f\3\2\2\2\u057d\u0570\3\2\2\2\u057d\u0571\3\2\2\2\u057d\u0572\3\2"+
		"\2\2\u057d\u0573\3\2\2\2\u057d\u0574\3\2\2\2\u057d\u0575\3\2\2\2\u057d"+
		"\u0576\3\2\2\2\u057d\u0577\3\2\2\2\u057d\u0578\3\2\2\2\u057d\u0579\3\2"+
		"\2\2\u057d\u057a\3\2\2\2\u057d\u057c\3\2\2\2\u057e\u0089\3\2\2\2\u057f"+
		"\u0582\7V\2\2\u0580\u0583\5\u0084C\2\u0581\u0583\5\u00a8U\2\u0582\u0580"+
		"\3\2\2\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0585\7\n\2\2\u0585\u008b\3\2\2\2\u0586\u058f\7\16\2\2\u0587\u058c\5"+
		"\u00a8U\2\u0588\u0589\7\20\2\2\u0589\u058b\5\u00a8U\2\u058a\u0588\3\2"+
		"\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0587\3\2\2\2\u058f\u0590\3\2"+
		"\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7\17\2\2\u0592\u008d\3\2\2\2\u0593"+
		"\u059c\7\4\2\2\u0594\u0599\5\u0090I\2\u0595\u0596\7\20\2\2\u0596\u0598"+
		"\5\u0090I\2\u0597\u0595\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2"+
		"\2\u0599\u059a\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u0594"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\7\5\2\2\u059f"+
		"\u008f\3\2\2\2\u05a0\u05a1\7\u00b8\2\2\u05a1\u05a2\7\6\2\2\u05a2\u05a3"+
		"\5\u0092J\2\u05a3\u0091\3\2\2\2\u05a4\u05a7\5\u008eH\2\u05a5\u05a7\5\u00a8"+
		"U\2\u05a6\u05a4\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7\u0093\3\2\2\2\u05a8"+
		"\u05ad\5\u00f6|\2\u05a9\u05ac\5\u0098M\2\u05aa\u05ac\5\u0096L\2\u05ab"+
		"\u05a9\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2"+
		"\2\2\u05ad\u05ae\3\2\2\2\u05ae\u0095\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0"+
		"\u05c4\5\u00e8u\2\u05b1\u05b2\7\f\2\2\u05b2\u05b4\5\u00d8m\2\u05b3\u05b5"+
		"\5\u010c\u0087\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3"+
		"\2\2\2\u05b6\u05b7\7\r\2\2\u05b7\u05c5\3\2\2\2\u05b8\u05b9\7\f\2\2\u05b9"+
		"\u05bb\5\u00d8m\2\u05ba\u05bc\5\u010c\u0087\2\u05bb\u05ba\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\7\20\2\2\u05be\u05c0\5"+
		"\u00d8m\2\u05bf\u05c1\5\u010c\u0087\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\7\r\2\2\u05c3\u05c5\3\2\2\2\u05c4"+
		"\u05b1\3\2\2\2\u05c4\u05b8\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u0097\3\2"+
		"\2\2\u05c6\u05c7\7E\2\2\u05c7\u05c9\5\u00e8u\2\u05c8\u05c6\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u05d8\3\2\2\2\u05ca\u05d9\5\u009aN\2\u05cb\u05d9"+
		"\5\u009cO\2\u05cc\u05d9\5\u009eP\2\u05cd\u05d9\5\u00a0Q\2\u05ce\u05cf"+
		"\7\u00a3\2\2\u05cf\u05d9\5\u00a6T\2\u05d0\u05d1\7@\2\2\u05d1\u05d2\7\f"+
		"\2\2\u05d2\u05d3\5\u00a8U\2\u05d3\u05d4\7\r\2\2\u05d4\u05d9\3\2\2\2\u05d5"+
		"\u05d9\5\u00a2R\2\u05d6\u05d7\7A\2\2\u05d7\u05d9\5\u00f8}\2\u05d8\u05ca"+
		"\3\2\2\2\u05d8\u05cb\3\2\2\2\u05d8\u05cc\3\2\2\2\u05d8\u05cd\3\2\2\2\u05d8"+
		"\u05ce\3\2\2\2\u05d8\u05d0\3\2\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d6\3\2"+
		"\2\2\u05d9\u0099\3\2\2\2\u05da\u05db\7\u008a\2\2\u05db\u05dd\7v\2\2\u05dc"+
		"\u05de\t\t\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e1\5\u00a6T\2\u05e0\u05e2\78\2\2\u05e1\u05e0\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u009b\3\2\2\2\u05e3\u05e4\5\u00aaV\2\u05e4\u009d"+
		"\3\2\2\2\u05e5\u05e6\7~\2\2\u05e6\u05e7\7\u0080\2\2\u05e7\u05e8\5\u00a6"+
		"T\2\u05e8\u009f\3\2\2\2\u05e9\u05ea\7\u0080\2\2\u05ea\u05eb\5\u00a6T\2"+
		"\u05eb\u00a1\3\2\2\2\u05ec\u05f8\7L\2\2\u05ed\u05f9\5\u00a4S\2\u05ee\u05ef"+
		"\7\f\2\2\u05ef\u05f0\5\u00a8U\2\u05f0\u05f1\7\r\2\2\u05f1\u05f9\3\2\2"+
		"\2\u05f2\u05f3\7|\2\2\u05f3\u05f4\7\f\2\2\u05f4\u05f5\5\u00a8U\2\u05f5"+
		"\u05f6\7\r\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f9\5\u010c\u0087\2\u05f8\u05ed"+
		"\3\2\2\2\u05f8\u05ee\3\2\2\2\u05f8\u05f2\3\2\2\2\u05f8\u05f7\3\2\2\2\u05f9"+
		"\u0600\3\2\2\2\u05fa\u05fc\7\b\2\2\u05fb\u05fd\5\u010c\u0087\2\u05fc\u05fb"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0601\3\2\2\2\u0600\u05fa\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u00a3\3\2"+
		"\2\2\u0602\u0605\5\u00d8m\2\u0603\u0605\5\u00dan\2\u0604\u0602\3\2\2\2"+
		"\u0604\u0603\3\2\2\2\u0605\u00a5\3\2\2\2\u0606\u0607\7\u0083\2\2\u0607"+
		"\u0608\7D\2\2\u0608\u060a\t\n\2\2\u0609\u0606\3\2\2\2\u0609\u060a\3\2"+
		"\2\2\u060a\u00a7\3\2\2\2\u060b\u060c\bU\1\2\u060c\u065b\5\u008cG\2\u060d"+
		"\u065b\5\u008eH\2\u060e\u065b\5\u00dan\2\u060f\u065b\7\u00ba\2\2\u0610"+
		"\u0611\5\u00ecw\2\u0611\u0612\7\13\2\2\u0612\u0614\3\2\2\2\u0613\u0610"+
		"\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\5\u00f0y"+
		"\2\u0616\u0617\7\13\2\2\u0617\u0619\3\2\2\2\u0618\u0613\3\2\2\2\u0618"+
		"\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u065b\5\u00f6|\2\u061b\u061c"+
		"\5\u00dco\2\u061c\u061d\5\u00a8U\30\u061d\u065b\3\2\2\2\u061e\u061f\5"+
		"\u00eav\2\u061f\u062c\7\f\2\2\u0620\u0622\7R\2\2\u0621\u0620\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0628\5\u00a8U\2\u0624\u0625"+
		"\7\20\2\2\u0625\u0627\5\u00a8U\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2"+
		"\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062d\3\2\2\2\u062a\u0628"+
		"\3\2\2\2\u062b\u062d\7\22\2\2\u062c\u0621\3\2\2\2\u062c\u062b\3\2\2\2"+
		"\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\7\r\2\2\u062f\u065b"+
		"\3\2\2\2\u0630\u0631\7\f\2\2\u0631\u0632\5\u00a8U\2\u0632\u0633\7\r\2"+
		"\2\u0633\u065b\3\2\2\2\u0634\u065b\7\t\2\2\u0635\u0636\7?\2\2\u0636\u0637"+
		"\7\f\2\2\u0637\u0638\5\u00a8U\2\u0638\u0639\7\65\2\2\u0639\u063a\5\u0096"+
		"L\2\u063a\u063b\7\r\2\2\u063b\u065b\3\2\2\2\u063c\u063e\7~\2\2\u063d\u063c"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\7]\2\2\u0640"+
		"\u063d\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\7\f"+
		"\2\2\u0643\u0644\5F$\2\u0644\u0645\7\r\2\2\u0645\u065b\3\2\2\2\u0646\u0648"+
		"\7>\2\2\u0647\u0649\5\u00a8U\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2"+
		"\u0649\u064f\3\2\2\2\u064a\u064b\7\u00aa\2\2\u064b\u064c\5\u00a8U\2\u064c"+
		"\u064d\7\u009e\2\2\u064d\u064e\5\u00a8U\2\u064e\u0650\3\2\2\2\u064f\u064a"+
		"\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0655\3\2\2\2\u0653\u0654\7U\2\2\u0654\u0656\5\u00a8U\2\u0655\u0653\3"+
		"\2\2\2\u0655\u0656\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\7X\2\2\u0658"+
		"\u065b\3\2\2\2\u0659\u065b\5\u00aeX\2\u065a\u060b\3\2\2\2\u065a\u060d"+
		"\3\2\2\2\u065a\u060e\3\2\2\2\u065a\u060f\3\2\2\2\u065a\u0618\3\2\2\2\u065a"+
		"\u061b\3\2\2\2\u065a\u061e\3\2\2\2\u065a\u0630\3\2\2\2\u065a\u0634\3\2"+
		"\2\2\u065a\u0635\3\2\2\2\u065a\u0640\3\2\2\2\u065a\u0646\3\2\2\2\u065a"+
		"\u0659\3\2\2\2\u065b\u06c0\3\2\2\2\u065c\u065d\f\27\2\2\u065d\u065e\7"+
		"\34\2\2\u065e\u06bf\5\u00a8U\30\u065f\u0660\f\26\2\2\u0660\u0661\t\13"+
		"\2\2\u0661\u06bf\5\u00a8U\27\u0662\u0663\f\25\2\2\u0663\u0664\t\f\2\2"+
		"\u0664\u06bf\5\u00a8U\26\u0665\u0666\f\24\2\2\u0666\u0667\t\r\2\2\u0667"+
		"\u06bf\5\u00a8U\25\u0668\u0669\f\23\2\2\u0669\u066a\t\16\2\2\u066a\u06bf"+
		"\5\u00a8U\24\u066b\u0678\f\22\2\2\u066c\u0679\7\21\2\2\u066d\u0679\7)"+
		"\2\2\u066e\u0679\7*\2\2\u066f\u0679\7,\2\2\u0670\u0679\7s\2\2\u0671\u0672"+
		"\7s\2\2\u0672\u0679\7~\2\2\u0673\u0679\7j\2\2\u0674\u0679\7x\2\2\u0675"+
		"\u0679\7d\2\2\u0676\u0679\7z\2\2\u0677\u0679\7\u008f\2\2\u0678\u066c\3"+
		"\2\2\2\u0678\u066d\3\2\2\2\u0678\u066e\3\2\2\2\u0678\u066f\3\2\2\2\u0678"+
		"\u0670\3\2\2\2\u0678\u0671\3\2\2\2\u0678\u0673\3\2\2\2\u0678\u0674\3\2"+
		"\2\2\u0678\u0675\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0677\3\2\2\2\u0679"+
		"\u067a\3\2\2\2\u067a\u06bf\5\u00a8U\23\u067b\u067c\f\21\2\2\u067c\u067d"+
		"\7\64\2\2\u067d\u06bf\5\u00a8U\22\u067e\u067f\f\20\2\2\u067f\u0680\7\u0085"+
		"\2\2\u0680\u06bf\5\u00a8U\21\u0681\u0682\f\b\2\2\u0682\u0684\7s\2\2\u0683"+
		"\u0685\7~\2\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2"+
		"\2\2\u0686\u06bf\5\u00a8U\t\u0687\u0689\f\7\2\2\u0688\u068a\7~\2\2\u0689"+
		"\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\7;"+
		"\2\2\u068c\u068d\5\u00a8U\2\u068d\u068e\7\64\2\2\u068e\u068f\5\u00a8U"+
		"\b\u068f\u06bf\3\2\2\2\u0690\u0691\f\13\2\2\u0691\u0692\7A\2\2\u0692\u06bf"+
		"\5\u00f8}\2\u0693\u0695\f\n\2\2\u0694\u0696\7~\2\2\u0695\u0694\3\2\2\2"+
		"\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\t\17\2\2\u0698\u069b"+
		"\5\u00a8U\2\u0699\u069a\7Z\2\2\u069a\u069c\5\u00a8U\2\u069b\u0699\3\2"+
		"\2\2\u069b\u069c\3\2\2\2\u069c\u06bf\3\2\2\2\u069d\u06a2\f\t\2\2\u069e"+
		"\u06a3\7t\2\2\u069f\u06a3\7\177\2\2\u06a0\u06a1\7~\2\2\u06a1\u06a3\7\u0080"+
		"\2\2\u06a2\u069e\3\2\2\2\u06a2\u069f\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a3"+
		"\u06bf\3\2\2\2\u06a4\u06a6\f\6\2\2\u06a5\u06a7\7~\2\2\u06a6\u06a5\3\2"+
		"\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06bc\7j\2\2\u06a9"+
		"\u06b3\7\f\2\2\u06aa\u06b4\5F$\2\u06ab\u06b0\5\u00a8U\2\u06ac\u06ad\7"+
		"\20\2\2\u06ad\u06af\5\u00a8U\2\u06ae\u06ac\3\2\2\2\u06af\u06b2\3\2\2\2"+
		"\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0"+
		"\3\2\2\2\u06b3\u06aa\3\2\2\2\u06b3\u06ab\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4"+
		"\u06b5\3\2\2\2\u06b5\u06bd\7\r\2\2\u06b6\u06b7\5\u00ecw\2\u06b7\u06b8"+
		"\7\13\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06b6\3\2\2\2\u06b9\u06ba\3\2\2\2"+
		"\u06ba\u06bb\3\2\2\2\u06bb\u06bd\5\u00f0y\2\u06bc\u06a9\3\2\2\2\u06bc"+
		"\u06b9\3\2\2\2\u06bd\u06bf\3\2\2\2\u06be\u065c\3\2\2\2\u06be\u065f\3\2"+
		"\2\2\u06be\u0662\3\2\2\2\u06be\u0665\3\2\2\2\u06be\u0668\3\2\2\2\u06be"+
		"\u066b\3\2\2\2\u06be\u067b\3\2\2\2\u06be\u067e\3\2\2\2\u06be\u0681\3\2"+
		"\2\2\u06be\u0687\3\2\2\2\u06be\u0690\3\2\2\2\u06be\u0693\3\2\2\2\u06be"+
		"\u069d\3\2\2\2\u06be\u06a4\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0\u06be\3\2"+
		"\2\2\u06c0\u06c1\3\2\2\2\u06c1\u00a9\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c3"+
		"\u06c7\7\u008e\2\2\u06c4\u06c5\5\u00ecw\2\u06c5\u06c6\7\13\2\2\u06c6\u06c8"+
		"\3\2\2\2\u06c7\u06c4\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06d5\5\u00fa~\2\u06ca\u06cb\7\f\2\2\u06cb\u06d0\5\u00acW\2\u06cc\u06cd"+
		"\7\20\2\2\u06cd\u06cf\5\u00acW\2\u06ce\u06cc\3\2\2\2\u06cf\u06d2\3\2\2"+
		"\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d0"+
		"\3\2\2\2\u06d3\u06d4\7\r\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06ca\3\2\2\2\u06d5"+
		"\u06d6\3\2\2\2\u06d6\u06e9\3\2\2\2\u06d7\u06d8\7\u0083\2\2\u06d8\u06e1"+
		"\t\20\2\2\u06d9\u06da\7\u009a\2\2\u06da\u06e2\7\u0080\2\2\u06db\u06dc"+
		"\7\u009a\2\2\u06dc\u06e2\7L\2\2\u06dd\u06e2\7=\2\2\u06de\u06e2\7\u0094"+
		"\2\2\u06df\u06e0\7}\2\2\u06e0\u06e2\7.\2\2\u06e1\u06d9\3\2\2\2\u06e1\u06db"+
		"\3\2\2\2\u06e1\u06dd\3\2\2\2\u06e1\u06de\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2"+
		"\u06e6\3\2\2\2\u06e3\u06e4\7z\2\2\u06e4\u06e6\5\u00e8u\2\u06e5\u06d7\3"+
		"\2\2\2\u06e5\u06e3\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8"+
		"\u06eb\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06f9\3\2"+
		"\2\2\u06eb\u06e9\3\2\2\2\u06ec\u06ee\7~\2\2\u06ed\u06ec\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f4\7M\2\2\u06f0\u06f1\7m\2"+
		"\2\u06f1\u06f5\7N\2\2\u06f2\u06f3\7m\2\2\u06f3\u06f5\7i\2\2\u06f4\u06f0"+
		"\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6"+
		"\u06f8\7Y\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2"+
		"\2\2\u06f9\u06ed\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u00ab\3\2\2\2\u06fb"+
		"\u06fc\5\u00e8u\2\u06fc\u00ad\3\2\2\2\u06fd\u06fe\7\u008c\2\2\u06fe\u0703"+
		"\7\f\2\2\u06ff\u0704\7h\2\2\u0700\u0701\t\21\2\2\u0701\u0702\7\20\2\2"+
		"\u0702\u0704\5\u00dep\2\u0703\u06ff\3\2\2\2\u0703\u0700\3\2\2\2\u0704"+
		"\u0705\3\2\2\2\u0705\u0706\7\r\2\2\u0706\u00af\3\2\2\2\u0707\u070a\5\u00f6"+
		"|\2\u0708\u0709\7A\2\2\u0709\u070b\5\u00f8}\2\u070a\u0708\3\2\2\2\u070a"+
		"\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c\u070e\t\t\2\2\u070d\u070c\3\2"+
		"\2\2\u070d\u070e\3\2\2\2\u070e\u00b1\3\2\2\2\u070f\u0710\7E\2\2\u0710"+
		"\u0712\5\u00e8u\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u071c"+
		"\3\2\2\2\u0713\u071d\5\u00b4[\2\u0714\u071d\5\u00ba^\2\u0715\u071d\5\u00b8"+
		"]\2\u0716\u0717\7@\2\2\u0717\u0718\7\f\2\2\u0718\u0719\5\u00a8U\2\u0719"+
		"\u071a\7\r\2\2\u071a\u071d\3\2\2\2\u071b\u071d\5\u00b6\\\2\u071c\u0713"+
		"\3\2\2\2\u071c\u0714\3\2\2\2\u071c\u0715\3\2\2\2\u071c\u0716\3\2\2\2\u071c"+
		"\u071b\3\2\2\2\u071d\u00b3\3\2\2\2\u071e\u071f\7\u008a\2\2\u071f\u0720"+
		"\7v\2\2\u0720\u0721\7\f\2\2\u0721\u0726\5\u00b0Y\2\u0722\u0723\7\20\2"+
		"\2\u0723\u0725\5\u00b0Y\2\u0724\u0722\3\2\2\2\u0725\u0728\3\2\2\2\u0726"+
		"\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0729\3\2\2\2\u0728\u0726\3\2"+
		"\2\2\u0729\u072a\7\r\2\2\u072a\u072b\5\u00a6T\2\u072b\u00b5\3\2\2\2\u072c"+
		"\u072d\7a\2\2\u072d\u072e\7v\2\2\u072e\u072f\7\f\2\2\u072f\u0734\5\u00bc"+
		"_\2\u0730\u0731\7\20\2\2\u0731\u0733\5\u00bc_\2\u0732\u0730\3\2\2\2\u0733"+
		"\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2"+
		"\2\2\u0736\u0734\3\2\2\2\u0737\u0738\7\r\2\2\u0738\u0739\5\u00aaV\2\u0739"+
		"\u00b7\3\2\2\2\u073a\u073c\7\u00a3\2\2\u073b\u073d\7v\2\2\u073c\u073b"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0740\5\u00e8u"+
		"\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742"+
		"\7\f\2\2\u0742\u0747\5\u00b0Y\2\u0743\u0744\7\20\2\2\u0744\u0746\5\u00b0"+
		"Y\2\u0745\u0743\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747"+
		"\u0748\3\2\2\2\u0748\u074a\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074b\7\r"+
		"\2\2\u074b\u074c\5\u00a6T\2\u074c\u00b9\3\2\2\2\u074d\u074f\7v\2\2\u074e"+
		"\u0750\5\u00e8u\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751"+
		"\3\2\2\2\u0751\u0752\7\f\2\2\u0752\u0757\5\u00b0Y\2\u0753\u0754\7\20\2"+
		"\2\u0754\u0756\5\u00b0Y\2\u0755\u0753\3\2\2\2\u0756\u0759\3\2\2\2\u0757"+
		"\u0755\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a\3\2\2\2\u0759\u0757\3\2"+
		"\2\2\u075a\u075b\7\r\2\2\u075b\u075c\5\u00a6T\2\u075c\u00bb\3\2\2\2\u075d"+
		"\u075e\5\u00f6|\2\u075e\u00bd\3\2\2\2\u075f\u0761\7\u00b2\2\2\u0760\u0762"+
		"\7\u008d\2\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\3\2\2"+
		"\2\u0763\u0764\5\u00d6l\2\u0764\u0765\7\65\2\2\u0765\u0766\7\f\2\2\u0766"+
		"\u0767\5F$\2\u0767\u0771\7\r\2\2\u0768\u0769\7\20\2\2\u0769\u076a\5\u00d6"+
		"l\2\u076a\u076b\7\65\2\2\u076b\u076c\7\f\2\2\u076c\u076d\5F$\2\u076d\u076e"+
		"\7\r\2\2\u076e\u0770\3\2\2\2\u076f\u0768\3\2\2\2\u0770\u0773\3\2\2\2\u0771"+
		"\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u00bf\3\2\2\2\u0773\u0771\3\2"+
		"\2\2\u0774\u0775\5\u00ecw\2\u0775\u0776\7\13\2\2\u0776\u0778\3\2\2\2\u0777"+
		"\u0774\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077f\5\u00f0"+
		"y\2\u077a\u077b\7l\2\2\u077b\u077c\7<\2\2\u077c\u0780\5\u00fc\177\2\u077d"+
		"\u077e\7~\2\2\u077e\u0780\7l\2\2\u077f\u077a\3\2\2\2\u077f\u077d\3\2\2"+
		"\2\u077f\u0780\3\2\2\2\u0780\u00c1\3\2\2\2\u0781\u0784\5\u00a8U\2\u0782"+
		"\u0783\7A\2\2\u0783\u0785\5\u00f8}\2\u0784\u0782\3\2\2\2\u0784\u0785\3"+
		"\2\2\2\u0785\u0787\3\2\2\2\u0786\u0788\t\t\2\2\u0787\u0786\3\2\2\2\u0787"+
		"\u0788\3\2\2\2\u0788\u00c3\3\2\2\2\u0789\u078d\5\u00d8m\2\u078a\u078d"+
		"\5\u00e8u\2\u078b\u078d\7\u00bb\2\2\u078c\u0789\3\2\2\2\u078c\u078a\3"+
		"\2\2\2\u078c\u078b\3\2\2\2\u078d\u00c5\3\2\2\2\u078e\u079a\5\u00f0y\2"+
		"\u078f\u0790\7\f\2\2\u0790\u0795\5\u00f6|\2\u0791\u0792\7\20\2\2\u0792"+
		"\u0794\5\u00f6|\2\u0793\u0791\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793"+
		"\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0798\3\2\2\2\u0797\u0795\3\2\2\2\u0798"+
		"\u0799\7\r\2\2\u0799\u079b\3\2\2\2\u079a\u078f\3\2\2\2\u079a\u079b\3\2"+
		"\2\2\u079b\u079c\3\2\2\2\u079c\u079d\7\65\2\2\u079d\u079e\7\f\2\2\u079e"+
		"\u079f\5F$\2\u079f\u07a0\7\r\2\2\u07a0\u00c7\3\2\2\2\u07a1\u07ae\7\22"+
		"\2\2\u07a2\u07a3\5\u00f0y\2\u07a3\u07a4\7\13\2\2\u07a4\u07a5\7\22\2\2"+
		"\u07a5\u07ae\3\2\2\2\u07a6\u07ab\5\u00a8U\2\u07a7\u07a9\7\65\2\2\u07a8"+
		"\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\5\u00e2"+
		"r\2\u07ab\u07a8\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\3\2\2\2\u07ad"+
		"\u07a1\3\2\2\2\u07ad\u07a2\3\2\2\2\u07ad\u07a6\3\2\2\2\u07ae\u00c9\3\2"+
		"\2\2\u07af\u07b0\5\u00ecw\2\u07b0\u07b1\7\13\2\2\u07b1\u07b3\3\2\2\2\u07b2"+
		"\u07af\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b9\5\u00f0"+
		"y\2\u07b5\u07b7\7\65\2\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7"+
		"\u07b8\3\2\2\2\u07b8\u07ba\5\u0108\u0085\2\u07b9\u07b6\3\2\2\2\u07b9\u07ba"+
		"\3\2\2\2\u07ba\u07c0\3\2\2\2\u07bb\u07bc\7l\2\2\u07bc\u07bd\7<\2\2\u07bd"+
		"\u07c1\5\u00fc\177\2\u07be\u07bf\7~\2\2\u07bf\u07c1\7l\2\2\u07c0\u07bb"+
		"\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07df\3\2\2\2\u07c2"+
		"\u07cc\7\f\2\2\u07c3\u07c8\5\u00caf\2\u07c4\u07c5\7\20\2\2\u07c5\u07c7"+
		"\5\u00caf\2\u07c6\u07c4\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3\2\2"+
		"\2\u07c8\u07c9\3\2\2\2\u07c9\u07cd\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb\u07cd"+
		"\5\u00ccg\2\u07cc\u07c3\3\2\2\2\u07cc\u07cb\3\2\2\2\u07cd\u07ce\3\2\2"+
		"\2\u07ce\u07d3\7\r\2\2\u07cf\u07d1\7\65\2\2\u07d0\u07cf\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d4\5\u0108\u0085\2\u07d3\u07d0"+
		"\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07df\3\2\2\2\u07d5\u07d6\7\f\2\2\u07d6"+
		"\u07d7\5F$\2\u07d7\u07dc\7\r\2\2\u07d8\u07da\7\65\2\2\u07d9\u07d8\3\2"+
		"\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dd\5\u0108\u0085"+
		"\2\u07dc\u07d9\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\3\2\2\2\u07de\u07b2"+
		"\3\2\2\2\u07de\u07c2\3\2\2\2\u07de\u07d5\3\2\2\2\u07df\u00cb\3\2\2\2\u07e0"+
		"\u07e7\5\u00caf\2\u07e1\u07e2\5\u00ceh\2\u07e2\u07e3\5\u00caf\2\u07e3"+
		"\u07e4\5\u00d0i\2\u07e4\u07e6\3\2\2\2\u07e5\u07e1\3\2\2\2\u07e6\u07e9"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00cd\3\2\2\2\u07e9"+
		"\u07e7\3\2\2\2\u07ea\u07f8\7\20\2\2\u07eb\u07ed\7{\2\2\u07ec\u07eb\3\2"+
		"\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f4\3\2\2\2\u07ee\u07f0\7w\2\2\u07ef"+
		"\u07f1\7\u0087\2\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f5"+
		"\3\2\2\2\u07f2\u07f5\7n\2\2\u07f3\u07f5\7G\2\2\u07f4\u07ee\3\2\2\2\u07f4"+
		"\u07f2\3\2\2\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\3\2"+
		"\2\2\u07f6\u07f8\7u\2\2\u07f7\u07ea\3\2\2\2\u07f7\u07ec\3\2\2\2\u07f8"+
		"\u00cf\3\2\2\2\u07f9\u07fa\7\u0083\2\2\u07fa\u0808\5\u00a8U\2\u07fb\u07fc"+
		"\7\u00a5\2\2\u07fc\u07fd\7\f\2\2\u07fd\u0802\5\u00f6|\2\u07fe\u07ff\7"+
		"\20\2\2\u07ff\u0801\5\u00f6|\2\u0800\u07fe\3\2\2\2\u0801\u0804\3\2\2\2"+
		"\u0802\u0800\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\3\2\2\2\u0804\u0802"+
		"\3\2\2\2\u0805\u0806\7\r\2\2\u0806\u0808\3\2\2\2\u0807\u07f9\3\2\2\2\u0807"+
		"\u07fb\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u00d1\3\2\2\2\u0809\u080b\7\u0099"+
		"\2\2\u080a\u080c\t\6\2\2\u080b\u080a\3\2\2\2\u080b\u080c\3\2\2\2\u080c"+
		"\u080d\3\2\2\2\u080d\u0812\5\u00c8e\2\u080e\u080f\7\20\2\2\u080f\u0811"+
		"\5\u00c8e\2\u0810\u080e\3\2\2\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2"+
		"\2\u0812\u0813\3\2\2\2\u0813\u0821\3\2\2\2\u0814\u0812\3\2\2\2\u0815\u081f"+
		"\7b\2\2\u0816\u081b\5\u00caf\2\u0817\u0818\7\20\2\2\u0818\u081a\5\u00ca"+
		"f\2\u0819\u0817\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b"+
		"\u081c\3\2\2\2\u081c\u0820\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u0820\5\u00cc"+
		"g\2\u081f\u0816\3\2\2\2\u081f\u081e\3\2\2\2\u0820\u0822\3\2\2\2\u0821"+
		"\u0815\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0825\3\2\2\2\u0823\u0824\7\u00b1"+
		"\2\2\u0824\u0826\5\u00a8U\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826"+
		"\u0835\3\2\2\2\u0827\u0828\7e\2\2\u0828\u0829\7<\2\2\u0829\u082e\5\u00a8"+
		"U\2\u082a\u082b\7\20\2\2\u082b\u082d\5\u00a8U\2\u082c\u082a\3\2\2\2\u082d"+
		"\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0833\3\2"+
		"\2\2\u0830\u082e\3\2\2\2\u0831\u0832\7f\2\2\u0832\u0834\5\u00a8U\2\u0833"+
		"\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0836\3\2\2\2\u0835\u0827\3\2"+
		"\2\2\u0835\u0836\3\2\2\2\u0836\u0854\3\2\2\2\u0837\u0838\7\u00a7\2\2\u0838"+
		"\u0839\7\f\2\2\u0839\u083e\5\u00a8U\2\u083a\u083b\7\20\2\2\u083b\u083d"+
		"\5\u00a8U\2\u083c\u083a\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2"+
		"\2\u083e\u083f\3\2\2\2\u083f\u0841\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u0850"+
		"\7\r\2\2\u0842\u0843\7\20\2\2\u0843\u0844\7\f\2\2\u0844\u0849\5\u00a8"+
		"U\2\u0845\u0846\7\20\2\2\u0846\u0848\5\u00a8U\2\u0847\u0845\3\2\2\2\u0848"+
		"\u084b\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084c\3\2"+
		"\2\2\u084b\u0849\3\2\2\2\u084c\u084d\7\r\2\2\u084d\u084f\3\2\2\2\u084e"+
		"\u0842\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0850\u0851\3\2"+
		"\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3\2\2\2\u0853\u0809\3\2\2\2\u0853"+
		"\u0837\3\2\2\2\u0854\u00d3\3\2\2\2\u0855\u085b\7\u00a2\2\2\u0856\u0857"+
		"\7\u00a2\2\2\u0857\u085b\7\61\2\2\u0858\u085b\7q\2\2\u0859\u085b\7[\2"+
		"\2\u085a\u0855\3\2\2\2\u085a\u0856\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u0859"+
		"\3\2\2\2\u085b\u00d5\3\2\2\2\u085c\u0868\5\u00f0y\2\u085d\u085e\7\f\2"+
		"\2\u085e\u0863\5\u00f6|\2\u085f\u0860\7\20\2\2\u0860\u0862\5\u00f6|\2"+
		"\u0861\u085f\3\2\2\2\u0862\u0865\3\2\2\2\u0863\u0861\3\2\2\2\u0863\u0864"+
		"\3\2\2\2\u0864\u0866\3\2\2\2\u0865\u0863\3\2\2\2\u0866\u0867\7\r\2\2\u0867"+
		"\u0869\3\2\2\2\u0868\u085d\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u00d7\3\2"+
		"\2\2\u086a\u086c\t\f\2\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0870\7\u00b9\2\2\u086e\u0870\7\22\2\2\u086f\u086b"+
		"\3\2\2\2\u086f\u086e\3\2\2\2\u0870\u00d9\3\2\2\2\u0871\u0872\t\22\2\2"+
		"\u0872\u00db\3\2\2\2\u0873\u0874\t\23\2\2\u0874\u00dd\3\2\2\2\u0875\u0876"+
		"\7\u00bb\2\2\u0876\u00df\3\2\2\2\u0877\u087a\5\u00a8U\2\u0878\u087a\5"+
		"\u0094K\2\u0879\u0877\3\2\2\2\u0879\u0878\3\2\2\2\u087a\u00e1\3\2\2\2"+
		"\u087b\u087c\t\24\2\2\u087c\u00e3\3\2\2\2\u087d\u087e\t\25\2\2\u087e\u00e5"+
		"\3\2\2\2\u087f\u0881\13\2\2\2\u0880\u087f\3\2\2\2\u0881\u0882\3\2\2\2"+
		"\u0882\u0880\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u00e7\3\2\2\2\u0884\u0885"+
		"\5\u010c\u0087\2\u0885\u00e9\3\2\2\2\u0886\u0887\5\u010c\u0087\2\u0887"+
		"\u00eb\3\2\2\2\u0888\u0889\5\u010c\u0087\2\u0889\u00ed\3\2\2\2\u088a\u088b"+
		"\5\u010c\u0087\2\u088b\u00ef\3\2\2\2\u088c\u088d\5\u010e\u0088\2\u088d"+
		"\u00f1\3\2\2\2\u088e\u088f\5\u010c\u0087\2\u088f\u00f3\3\2\2\2\u0890\u0891"+
		"\5\u010c\u0087\2\u0891\u00f5\3\2\2\2\u0892\u0893\5\u010c\u0087\2\u0893"+
		"\u00f7\3\2\2\2\u0894\u0895\5\u010c\u0087\2\u0895\u00f9\3\2\2\2\u0896\u0897"+
		"\5\u010c\u0087\2\u0897\u00fb\3\2\2\2\u0898\u0899\5\u010c\u0087\2\u0899"+
		"\u00fd\3\2\2\2\u089a\u089b\5\u010c\u0087\2\u089b\u00ff\3\2\2\2\u089c\u089d"+
		"\5\u010c\u0087\2\u089d\u0101\3\2\2\2\u089e\u089f\5\u010c\u0087\2\u089f"+
		"\u0103\3\2\2\2\u08a0\u08a1\5\u010c\u0087\2\u08a1\u0105\3\2\2\2\u08a2\u08a3"+
		"\5\u010c\u0087\2\u08a3\u0107\3\2\2\2\u08a4\u08a5\5\u010c\u0087\2\u08a5"+
		"\u0109\3\2\2\2\u08a6\u08a7\5\u010c\u0087\2\u08a7\u010b\3\2\2\2\u08a8\u08b0"+
		"\7\u00b8\2\2\u08a9\u08b0\5\u00e4s\2\u08aa\u08b0\7\u00bb\2\2\u08ab\u08ac"+
		"\7\f\2\2\u08ac\u08ad\5\u010c\u0087\2\u08ad\u08ae\7\r\2\2\u08ae\u08b0\3"+
		"\2\2\2\u08af\u08a8\3\2\2\2\u08af\u08a9\3\2\2\2\u08af\u08aa\3\2\2\2\u08af"+
		"\u08ab\3\2\2\2\u08b0\u010d\3\2\2\2\u08b1\u08b8\7\u00b8\2\2\u08b2\u08b8"+
		"\7\u00bb\2\2\u08b3\u08b4\7\f\2\2\u08b4\u08b5\5\u010e\u0088\2\u08b5\u08b6"+
		"\7\r\2\2\u08b6\u08b8\3\2\2\2\u08b7\u08b1\3\2\2\2\u08b7\u08b2\3\2\2\2\u08b7"+
		"\u08b3\3\2\2\2\u08b8\u010f\3\2\2\2\u0125\u0113\u0115\u0120\u0127\u012c"+
		"\u0132\u0138\u013d\u013f\u015f\u0166\u016b\u0175\u0178\u017b\u017e\u018f"+
		"\u0193\u019b\u019f\u01a1\u01a6\u01a8\u01ac\u01b3\u01b6\u01bb\u01bf\u01c4"+
		"\u01cd\u01d0\u01d6\u01d8\u01dc\u01e2\u01e7\u01f2\u01f8\u01fc\u0202\u0207"+
		"\u0210\u0212\u0218\u021c\u021f\u0223\u0229\u022e\u0235\u0240\u0243\u0245"+
		"\u024b\u0251\u0255\u025c\u0262\u0268\u026e\u0273\u027f\u0284\u028f\u0294"+
		"\u0297\u029e\u02a1\u02a8\u02b1\u02b4\u02ba\u02bc\u02c0\u02c8\u02cd\u02d5"+
		"\u02da\u02e2\u02e7\u02ef\u02f4\u02fa\u0301\u0304\u030c\u0316\u0319\u031f"+
		"\u0321\u0324\u0337\u033d\u0346\u034b\u0354\u035f\u0366\u036c\u0372\u037b"+
		"\u0382\u0386\u0388\u038c\u0393\u0395\u0399\u039c\u03a3\u03aa\u03ad\u03b7"+
		"\u03ba\u03c0\u03c2\u03c6\u03cd\u03d0\u03d8\u03e2\u03e5\u03eb\u03ed\u03f1"+
		"\u03f8\u0401\u0405\u0407\u040b\u0414\u0419\u041b\u0424\u042f\u0436\u0439"+
		"\u043c\u0449\u0457\u045c\u045f\u046c\u047a\u047f\u0488\u048b\u0491\u0493"+
		"\u049f\u04b7\u04be\u04c1\u04d0\u04d3\u04d9\u04ea\u04f0\u0510\u051c\u0524"+
		"\u0529\u0532\u0541\u0549\u054d\u0550\u055a\u0561\u0569\u056d\u057d\u0582"+
		"\u058c\u058f\u0599\u059c\u05a6\u05ab\u05ad\u05b4\u05bb\u05c0\u05c4\u05c8"+
		"\u05d8\u05dd\u05e1\u05f8\u05fe\u0600\u0604\u0609\u0613\u0618\u0621\u0628"+
		"\u062c\u063d\u0640\u0648\u0651\u0655\u065a\u0678\u0684\u0689\u0695\u069b"+
		"\u06a2\u06a6\u06b0\u06b3\u06b9\u06bc\u06be\u06c0\u06c7\u06d0\u06d5\u06e1"+
		"\u06e5\u06e9\u06ed\u06f4\u06f7\u06f9\u0703\u070a\u070d\u0711\u071c\u0726"+
		"\u0734\u073c\u073f\u0747\u074f\u0757\u0761\u0771\u0777\u077f\u0784\u0787"+
		"\u078c\u0795\u079a\u07a8\u07ab\u07ad\u07b2\u07b6\u07b9\u07c0\u07c8\u07cc"+
		"\u07d0\u07d3\u07d9\u07dc\u07de\u07e7\u07ec\u07f0\u07f4\u07f7\u0802\u0807"+
		"\u080b\u0812\u081b\u081f\u0821\u0825\u082e\u0833\u0835\u083e\u0849\u0850"+
		"\u0853\u085a\u0863\u0868\u086b\u086f\u0879\u0882\u08af\u08b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}