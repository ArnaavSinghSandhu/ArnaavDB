package DataStorage1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Table implements Serializable{
    ArrayList<ROW> row;
    ArrayList<String> column_name;
    ArrayList<COLUMN> columns;
    String tablename;
    
  


    public Table(String tablename,ArrayList<String> column_name){
        this.tablename = tablename;
        this.row = new ArrayList<>();
        this.columns = new ArrayList<>();
        this.column_name = new ArrayList<String>(column_name);
    }

    public void addColumn(String column){
        COLUMN column2 = new COLUMN(column, new ArrayList<String>());
        columns.add(column2);

        for(ROW i : row){
            i.values.add("");
        }
        this.column_name.add(column);

        
    }
    public void deleteColumn(String column){
        Iterator<COLUMN> it = columns.iterator();
            while(it.hasNext()){
                if(it.next().column_name.equals(column)) it.remove();
            }
          
        for(ROW i: row){
            int index = this.column_name.indexOf(column);
            if (index >= 0) {
                i.values.remove(index);
            }
        }
        this.column_name.remove(column); 
    }
    public void updateCOLUMN(String column,String new_column_value,String column_to_check,String operand,String operation){

            UPDATE_FOR_ROW up1 = new UPDATE_FOR_ROW(row,this.column_name);
            up1.updateROW(column,new_column_value,column_to_check,operation,operand);
    }
}
class select_for_Row{
    public ArrayList<ROW> select_Function_for_Row(ArrayList<String> column_name,String column_to_check,Table t,String operation,String operand1){
        from_1 f = new from_1();

        return f.from_for_row(column_name, column_to_check, t, operation, operand1);
    }
}
class from_1 implements from_select{
    public void from(){

    }
    public ArrayList<ROW> from_for_row(ArrayList<String> column_name,String column_to_check,Table t,String operation,String operand1){
        Where_1 w = new Where_1();
        ArrayList<ROW> arr = new ArrayList<ROW>();
        

        for(ROW i:t.row){
            String value = i.getValue(column_to_check,t.column_name);
            if(value == null)
            continue;
            w.where_for_row_for_operations(i,column_to_check, operation, value,operand1);
        }
        for(ROW i1:w.matching){
            ArrayList<String> arr1 = new ArrayList<String>();
            for(String i:column_name){
                arr1.add(i1.getValue(i,t.column_name));
            }
            ROW newrow = new ROW(arr1,t);
            arr.add(newrow);
        }
        return arr;
    }
}
class Where_1 implements where_select{
    List<ROW> matching = new ArrayList<>();
    public void where(){

    }
    public void where_for_row_for_operations(ROW t,String column_to_check, String operation, String value,String operand) {

            int cmp = value.compareTo(operand);


            switch (operation) {
                case ">":
                    if (cmp > 0){
                        matching.add(t);
                    } 
                    break;
                case "<":
                    if (cmp < 0) {
                        matching.add(t);
                    }
                    break;
                case "=":
                    if (cmp == 0){
                        matching.add(t);
                    }
                    break;
            }
    }
}

class insert{

    public void insertColumn(ArrayList<String>  column_to_update,ArrayList<ArrayList<String>> arr,Table t){
        for(int i = 0; i < arr.size();i++){
            ArrayList<String> arrTemp = new ArrayList<String>();
            for(String columns : column_to_update){
                if (t.column_name.contains(columns)) {
                    int index = column_to_update.indexOf(columns);
                    arrTemp.add(arr.get(i).get(index));
                }
                else{
                    arrTemp.add("0");
                }
            }
            ROW i1 = new ROW(arrTemp, t);
            t.row.add(i1);
        }
    }
    public void insert_for_row(Table t,ROW i){
        t.row.add(i);
    }
    public void insert_into_select(ArrayList<String> column_to_update,String column_to_check,String operation,String operand1,Table t){
        from_1 f = new from_1();
        List<ROW> arr = f.from_for_row(column_to_update, column_to_check, t, operation, operand1);
        for(int i = 0; i < arr.size();i++){
            ArrayList<String> arr1 = new ArrayList<String>();
            for(String columns : column_to_update){
                if (!t.row.isEmpty() && t.column_name.contains(columns)) {
                    int index = t.column_name.indexOf(columns);
                    arr1.add(arr.get(i).values.get(index));
                }
                else{
                    arr1.add("0");
                }
            }
            ROW i1 = new ROW(arr1, t);
            t.row.add(i1);
        }
    }
}
class Databasehandler{

    public ArrayList<ROW> search_for_row(Table t,ArrayList<String> column_names,String column_to_check,String pathname_operation,String pathname_operand) throws IOException{
        select_for_Row s = new select_for_Row();
        return s.select_Function_for_Row(column_names, column_to_check, t,pathname_operation,pathname_operand);
    }
    public void insert_for_row(Table t,ArrayList<String> column_names,String column_to_check,String pathname_operation,String pathname_operand) throws IOException{
        insert i = new insert();
        File f = new File(pathname_operation);
        Scanner sc = new Scanner(f);
        File f1 = new File(pathname_operand);
        Scanner sc1 = new Scanner(f1);
        i.insert_into_select(column_names, column_to_check,sc.nextLine(),sc1.nextLine(),t);
        sc.close();
        sc1.close();
        
    }


}
