package DataStorage1;

import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvBindByPosition;


public class DataRecord implements Serializable {

    public void storeData(Table t,boolean append) throws IOException{
        boolean fileExists = new File("datastorage2.csv").exists();
        try(PrintWriter pw = new PrintWriter(new FileWriter("datastorage2.csv",append))){
            if (!append || !fileExists) {
            pw.println(String.join(",", t.column_name));
        }
            
            for (ROW row : t.row) {
            List<String> values = new ArrayList<>();
            for (int i = 0; i < t.column_name.size(); i++) {
                String val = (i < row.values.size()) ? row.getValue(t.column_name.get(i),t.column_name) : "";
                values.add(val);
            }
            pw.println(String.join(",", values));
        }
            
            pw.flush();
            pw.close();
        }
    }
    public void readData(Table t){
        t.column_name.clear();
        t.row.clear();
        int i = 0;
        try{
            FileReader fr = new FileReader("datastorage2.csv");
            CSVReader sc = new CSVReader(fr);
            String[] nextRecord ;

            while((nextRecord = sc.readNext()) != null){
                List<String> arr1 = Arrays.asList(nextRecord);
                ArrayList<String> arr = new ArrayList<>(arr1);
                if(i == 0){
                    for(String i2 : arr){
                        t.column_name.add(i2);
                    }
                    
                }
                else{
                    while (arr.size() < t.column_name.size()) {
                        arr.add("");
                    }
                    ROW j = new ROW(arr, t);
                    t.row.add(j);
                    
                }
                i++;
            }
            fr.close();
            sc.close();

        }catch(Exception ie){
            ie.printStackTrace();
        }
        
        
    }

}
