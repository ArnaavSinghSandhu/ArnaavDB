package DataStorage1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class DataRecord implements Serializable {

    public void storeData(Table t) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter("datastorage2.csv"));
        pw.println(String.join(",",t.column_name));
         
        for(ROW i :t.row){
            
            List<String> values = new ArrayList<String>();
            for(String f: t.column_name){
                String val = i.getValue(f, t.column_name);
                
                values.add(val != null ? val : "");
            }
            
            pw.println(String.join(",",values));
        }
        
        pw.flush();
        pw.close();
    }

}
