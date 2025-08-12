package DataStorage1;

import java.io.Serializable;
import java.util.*;


class UPDATE_FOR_ROW {
    ArrayList<ROW> arr;
    ArrayList<String> column_names;

    public UPDATE_FOR_ROW(ArrayList<ROW> arr,ArrayList<String> column_names) {
        this.arr = new ArrayList<ROW>(arr);
        this.column_names = new ArrayList<String>(column_names);
    }

    public void updateROW(Table t,String column_to_update, String new_value,String column_to_check, String operation, String operand,HashMap<String,ROW> ar1) {
        ArrayList<ROW> tempRows;
        if(ar1.isEmpty()){
        tempRows = this.from_for_row_2(column_names,column_to_check,t,operation,operand,ar1);
        }
        else{
            tempRows = this.from_for_row(column_names, column_to_check, t, operation, operand);
        }
        if (tempRows.isEmpty()) {
            System.out.println("No matching rows found.");
            return;
        }

        for (ROW row : arr) {
            for(ROW row1 : tempRows){
                if(row.primary_key == row1.primary_key){
                    row.setValue(column_to_update, new_value,column_names);
                }
            }
        }

        System.out.println("Updated column '" + column_to_update + "' in matching rows.");
    }
    public ArrayList<ROW> from_for_row_2(ArrayList<String> column_name,String column_to_check,Table t,String operation,String operand1,HashMap<String,ROW> ar1){
        Where_1 w = new Where_1();
        ArrayList<ROW> arr = new ArrayList<ROW>();
        ArrayList<ROW> arr3 = new ArrayList<ROW>();
        HashSet<String> s = new HashSet<String>();

        if(!ar1.isEmpty()){
            for(ROW i:w.where_for_row_for_hashmaps(t,ar1, column_to_check, operation, operand1)){
                
                s.add(i.primary_key);
                arr3.add(i);
            }
            w.matching.clear();
        for(ROW i : t.row){
            String value = i.getValue(column_to_check,t.column_name);
            if (value == null) continue; 
            if (s.contains(i.primary_key)) continue;
            w.where_for_row_for_operations(i,column_to_check, operation, value,operand1);
        }
        arr3.addAll(w.matching);
        for(ROW i1:arr3){
            ArrayList<String> arr1 = new ArrayList<String>();
            for(String i:column_name){
                arr1.add(i1.getValue(i,t.column_name));
            }
            ROW newrow = new ROW(arr1,t);
            arr.add(newrow);
        }
    }
        return arr;
    
    }

    public ArrayList<ROW> from_for_row(ArrayList<String> column_name,String column_to_check,Table t,String operation,String operand1){
        Where_1 w = new Where_1();
        ArrayList<ROW> arr = new ArrayList<ROW>();
        ArrayList<ROW> arr3 = new ArrayList<ROW>();
        HashSet<String> s = new HashSet<String>();

        
        for(ROW i : t.row){
            String value = i.getValue(column_to_check,t.column_name);
            if (value == null) continue; 
            w.where_for_row_for_operations(i,column_to_check, operation, value,operand1);
        }
        arr3.addAll(w.matching);
        for(ROW i1:arr3){
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

class Where_2 implements where_select{
    List<ROW> matching = new ArrayList<>();
    public void where(){

    }
    public void where_for_row_for_operations(ROW t,String column_to_check, String operation, String value,String operand) {
        

            try{
                int va = Integer.parseInt(value);
                int op = Integer.parseInt(operand);
                
                switch (operation) {
                    case ">":
                        if (va > op){
                            matching.add(t);
                        } 
                        break;
                    case "<":
                        if (va < op) {
                            matching.add(t);
                        }
                        break;
                    case "=":
                        if (va == op){
                            matching.add(t);
                        }
                        break;
                }
            }catch(NumberFormatException ne){
                
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
        public ArrayList<ROW> where_for_row_for_hashmaps(Table t,HashMap<String,ROW> arr,String column_to_check,String operation,String operand){
   
        matching.clear();
        ArrayList<ROW> matching1 = new ArrayList<>();


        for(Map.Entry<String,ROW> e : arr.entrySet()){
            String value = e.getValue().getValue(column_to_check, t.column_name);
            try{
                int va = Integer.parseInt(value);
                int op = Integer.parseInt(operand);
                
                switch (operation) {
                    case ">":
                        if (va > op){
                            matching1.add(e.getValue());
                        } 
                        break;
                    case "<":
                        if (va < op) {
                            matching1.add(e.getValue());
                        }
                        break;
                    case "=":
                        if (va == op){
                            matching1.add(e.getValue());
                        }
                        break;
                }
            }catch(NumberFormatException ne){
                
                int cmp = value.compareTo(operand);
                switch (operation) {
                        case ">":
                            if (cmp > 0){
                                matching1.add(e.getValue());
                            } 
                            break;
                        case "<":
                            if (cmp < 0) {
                                matching1.add(e.getValue());
                            }
                            break;
                        case "=":
                            if (cmp == 0){
                                matching1.add(e.getValue());
                            }
                            break;
                    }
            }
            


        }
        return matching1;
            
    }
}


