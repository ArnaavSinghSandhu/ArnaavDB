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

    public void updateROW(String column_to_update, String new_value,String column_to_check, String operation, String operand) {
        List<ROW> tempRows = WHERE(column_to_check, operation, operand);
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

    public List<ROW> WHERE(String column_to_check, String operation, String operand) {
        List<ROW> matching = new ArrayList<>();

        for (ROW row : arr) {
            String value = row.getValue(column_to_check,column_names);
            if (value == null) continue;

            int cmp = value.compareTo(operand);

            switch (operation) {
                case ">":
                    if (cmp > 0) matching.add(row);
                    break;
                case "<":
                    if (cmp < 0) matching.add(row);
                    break;
                case "=":
                    if (cmp == 0) matching.add(row);
                    break;
            }
        }

        return matching;
    }
}


