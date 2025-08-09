package DataStorage1;

import java.util.*;
import java.io.*;


class DELETE_FOR_ROW{
    ArrayList<ROW> arr;
    public DELETE_FOR_ROW(ArrayList<ROW> arr){
        this.arr = new ArrayList<>(arr);
    }
    public void delete(String column_name,ArrayList<String> column_names){
        if (arr.isEmpty()) return;
        int index = column_names.indexOf(column_name);
        if (index == -1) return;
        for(ROW i : arr){
            i.values.remove(index);
        }

    }
}
public class ROW implements Serializable{
    ArrayList<String> values;
    String primary_key;

    public ROW(ArrayList<String> values,Table t){
        this.values = values;

        int pk_index = t.column_name.indexOf("name");
        if(pk_index != -1){
            this.primary_key = values.get(pk_index);
        }
    }
    public String getValue(String column_name,ArrayList<String> column_names){
        int index = column_names.indexOf(column_name);
        if(index != -1){
            return values.get(index);
        }
        return null;
    }
    public void setValue(String original_value,String new_value,ArrayList<String> column_name){
        int index = column_name.indexOf(original_value);
        if (index != -1) {
            values.set(index, new_value);
        }
        else{
            return ;
        }
    }
}