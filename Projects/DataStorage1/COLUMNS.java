package DataStorage1;

import java.util.*;
import java.io.*;


class ADD_FOR_COLUMN{
    ArrayList<COLUMN> arr;

    public ADD_FOR_COLUMN(ArrayList<COLUMN> arr){
        this.arr = new ArrayList<>(arr);
    }
    public COLUMN addColumn(COLUMN column_name){
        this.arr.add(column_name);
        return null; 
    }
    public int size(){
        return arr.size();
    }
}
class DELETE_FOR_COLUMN{
    ArrayList<COLUMN> arr;
    public DELETE_FOR_COLUMN(ArrayList<COLUMN> arr){
        this.arr = new ArrayList<>(arr);
    }
    public void delete(String column_name) {
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).getColumnName().equals(column_name)) {
            arr.remove(i);
            break;
        }
    }
}
}
class COLUMN{
    String column_name;
    ArrayList<String> column_value;
    public String primary_key;
    public COLUMN(String column_name,ArrayList<String> column_value){
        this.column_name = column_name;
        this.column_value = column_value;
    }
    public String getColumnName(){
        return this.column_name;
    }
    public ArrayList<String> getColumnValue(){
        return this.column_value;

    }
    public void setValue(String column_name){
        this.column_name = column_name;
    }
    public void setValueAt(int index, String value) {
        this.column_value.set(index, value);
    }
    
}
