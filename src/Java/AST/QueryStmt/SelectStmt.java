package Java.AST.QueryStmt;


public class SelectStmt extends Statement {

//    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;
    private String fromItem;


//    private List<Join> joins;
//    private Expression where;
//    private GroupByElement groupBy;
//    private List<OrderByElement> orderByElements;
//    private Expression having;
//    private Limit limit;
//    private Offset offset;

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }

    public String getFromItem() {
        return fromItem;
    }
//
//    @Override
//    public void accept(ASTVisitor astVisitor){
//        astVisitor.visit(this);
//    }
}
