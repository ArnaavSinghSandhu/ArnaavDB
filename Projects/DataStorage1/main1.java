package DataStorage1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main1 {
    public static void main(String[] args) throws Exception {
        DataRecord dw = new DataRecord();
        Scanner sc = new Scanner(System.in);
        boolean b ;
        ArrayList<String> as = new ArrayList<String>();
        Table t = new Table("student",as);
        File f = new File("datastorage2.csv");
        t.column_name.clear();
        t.row.clear();  
        if(f.exists()){
            dw.readData(t);
        }
       
        
        

        while(true){
            parser p = new parser();
            System.out.print("SQL->");

            String query = sc.nextLine();
            
            
            if(query.equalsIgnoreCase("exit")){
                break;
            }
            
            long startTime = System.nanoTime();
            if(query.contains("INSERT") || query.contains("SELECT") || query.contains("UPDATE"))
            p.parse8(t, query);
            else if(query.contains("ADD")){
                String column_n = query.substring(query.indexOf("ADD") + 4);
                t.addColumn(column_n);

            }
            else{
                System.out.println("Only Works for insert ,select , update and add right now ");
            }
            long endTime = System.nanoTime();
            long durationInNano = endTime - startTime;
            double durationInMillis = (double) durationInNano / 1_000_000;
            System.out.println(durationInMillis);
            

        }
        sc.close();
        dw.storeData(t, false);
    }

}
