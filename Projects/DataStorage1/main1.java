package DataStorage1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean b ;
        ArrayList<String> as = new ArrayList<String>();
        as.add("name");
        as.add("marks");
        Table t = new Table("student",as);
        while(true){
            parser p = new parser();
            System.out.print("SQL->");

            String query = sc.nextLine();
            
            
            if(query.equalsIgnoreCase("exit")){
                break;
            }
            
            
            if(query.contains("INSERT") || query.contains("SELECT") || query.contains("UPDATE"))
            p.parse8(t, query);
            else if(query.contains("ADD")){
                String column_n = query.substring(query.indexOf("ADD") + 4);
                t.addColumn(column_n);

            }
            else{
                System.out.println("Only Works for insert ,select , update and add right now ");
            }
            

        }
        sc.close();
        try{
            DataRecord dw = new DataRecord();
            for(String i : t.column_name){
                System.out.println(i);
            }
            dw.storeData(t);
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }

}
