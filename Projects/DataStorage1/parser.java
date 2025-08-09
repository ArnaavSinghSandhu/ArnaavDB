package DataStorage1;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import DataStorage1.SQLLexer;
import DataStorage1.SQLParser;
import DataStorage1.SQLBaseVisitor;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class parser{
    public void parse8(Table table,String query){
        CharStream i = CharStreams.fromString(query);
        SQLLexer sql = new SQLLexer(i);
        CommonTokenStream c = new CommonTokenStream(sql);
        DataStorage1.SQLParser pas = new SQLParser(c);
        ParseTree pas1 = pas.program();
        SqlexecutorVisitor s = new SqlexecutorVisitor(table);
        s.visit(pas1);
    }
}
class SqlexecutorVisitor extends SQLBaseVisitor<Void>{
    Databasehandler dbHandler = new Databasehandler();
    Table table;

    public SqlexecutorVisitor(Table table) {
        this.table = table;
    }
    @Override
    public Void visitExpression(SQLParser.ExpressionContext ctx) {
         ArrayList<String> col = new ArrayList<>();
         ArrayList<ROW> r= new ArrayList<>();
        if (ctx == null) {
        System.err.println("ExpressionContext is null — parsing failed.");
        return null;
    }

    

    
        if(ctx.SELECT() != null){
            for(int j = 0;j < ctx.valueterm(0).term().size();j++){
        String column = ctx.valueterm(0).term(j).getText();
        
        col.add(column);
    }
            Clause c = evaluateClause(ctx.clause(), table,col);
            for (String primaryKey : c.s) {
                for(ROW i : c.arr){
                    
                    if(i.getValue(table.column_name.get(0), table.column_name).equals(primaryKey)){
                        for(String j : col){
                            System.out.print(i.getValue(j, col) + " ");
                        }
                    System.out.println();
                }
            }
        }
        }
        
        else if(ctx.INSERT() != null){
            for(int j = 0;j < ctx.valueterm(0).term().size();j++){
        String column = ctx.valueterm(0).term(j).getText();
        
        col.add(column);
    }
            for(int i = 0 ; i < ctx.valueterm(1).term().size() / col.size();i++){
                
                ArrayList<String> values = new ArrayList<>();
                int index;
                for(int j = 0;j < col.size();j++){
                    index = i*col.size() + j;
                    String value = ctx.valueterm(1).term(index).getText();
                    values.add(value);
                }
                
                insert i1 = new insert();
                ROW i0 = new ROW(values, table);
                i1.insert_for_row(table, i0);
            }
        }
        else if (ctx.UPDATE() != null) {
            String tableName = ctx.term().getText(); 
            ArrayList<String> arr = new ArrayList<>();

            Map<String, String> updates = new HashMap<>();
            for (SQLParser.AssignmentContext assignCtx : ctx.setClause().assignment()) {
                String colName = assignCtx.IDENTIFIER().getText();
                String value = assignCtx.term().getText();
                updates.put(colName, value);
            }
            for(String j : updates.keySet()){
                arr.add(j);
            }
            if(ctx.WHERE() != null){
                Clause c = evaluateClause(ctx.clause(), table, arr);
                if(ctx.clause().AND() != null){
                    for(Map.Entry<String,String> e : updates.entrySet()){
                        table.updateCOLUMN(e.getKey(), e.getValue(),c.left.lhs, c.left.rhs, c.left.op);
                        table.updateCOLUMN(e.getKey(), e.getValue(), c.right.rhs,c.right.rhs, c.left.op);
                    }
                }
                else{
                    for(Map.Entry<String,String> e : updates.entrySet()){
                            table.updateCOLUMN(e.getKey(), e.getValue(),c.lhs, c.rhs, c.op);
                        }
                    }
            }
            else{
            for(ROW i : table.row){
                for(Map.Entry<String,String> e : updates.entrySet()){
                    i.setValue(i.getValue(e.getKey(), table.column_name), e.getValue(), table.column_name);
                }
            }
        }
            
        }
        return null;
    }
    public Clause evaluateClause(SQLParser.ClauseContext ctx,Table table,ArrayList<String> col){
        Set<String> s = new HashSet<>();
        if(ctx.clause().isEmpty()){
            String lhs = ctx.term(0).getText();
            String op = ctx.comparator().getText();
            String rhs = ctx.term(1).getText();
            return new Clause(lhs,op,rhs,s,table,col);
        }
        else if(ctx.AND() != null){
            Clause left = evaluateClause(ctx.clause(0),table,col);
            Clause right = evaluateClause(ctx.clause(1),table,col);
            return new Clause(left,right);
        }
        else if (ctx.OR() != null) {





            Clause left = evaluateClause(ctx.clause(0),table,col);
            Clause right = evaluateClause(ctx.clause(1),table,col);
            return new Clause(right, left,s);
        }
        return null;

    }
}
class Clause{
    String lhs;
    String rhs;
    String op;
    Set<String> s ;
    Clause left;
    Clause right;
    HashMap<String,ROW> has = new HashMap<>();
    ArrayList<ROW> arr = new ArrayList<>();
    public Clause(String lhs ,String op,String rhs,Set<String> s,Table t,ArrayList<String> column){
        this.lhs = lhs;
        
        this.op = op;
        
        this.rhs = rhs;
        
        this.s = new HashSet<String>(s);
        Databasehandler db = new Databasehandler();
        try{
            arr = db.search_for_row(t,column,lhs,op,rhs);
        }catch(IOException ie){
            ie.printStackTrace();
        }
        
        for(ROW i : arr){
            has.put(i.getValue(t.column_name.get(0), t.column_name),i);
        }
        
        this.s.addAll(has.keySet());
    }
    public Clause(Clause left,Clause right){
        this.left = left;
        this.right = right;
        this.s = new HashSet<>(left.s);
        this.arr.addAll(left.arr);
        this.s.retainAll(right.s);
        
        
    }
    public Clause(Clause right ,Clause left,Set<String> s){
        this.left = left;
        this.right = right;
        this.s = new HashSet<>(left.s);
        this.arr = new ArrayList<>(left.arr);
        this.s.addAll(right.s);
        this.arr.addAll(right.arr);
        }

}