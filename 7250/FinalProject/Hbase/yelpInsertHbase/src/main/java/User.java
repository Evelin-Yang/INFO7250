/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;


public class User {
    
    public void userinsert() throws IOException
    {
        
        System.out.println("Inserting into user table");
        Configuration config = HBaseConfiguration.create();
        
        
        String tableName = "users";
        
        //Connection connection = null;
        //Table table = null;
        
        HTable table = new HTable(config, "usertable");        
        
         CSVReader reader = new CSVReader(new FileReader("/Users/yanglintong/7250/finalProject/Hbase/Data/user_small.csv"));
         String [] header = reader.readNext();
         
         String[] line;
         
        while((line = reader.readNext()) != null) 
        {
            
            Put p = new Put(Bytes.toBytes(line[16]));
            
            p.add(Bytes.toBytes("votes"), Bytes.toBytes(header[19]),Bytes.toBytes(line[19]));
            p.add(Bytes.toBytes("votes"), Bytes.toBytes(header[22]),Bytes.toBytes(line[22]));                                    
            p.add(Bytes.toBytes("votes"), Bytes.toBytes(header[17]),Bytes.toBytes(line[17]));
            
            
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[2]),Bytes.toBytes(line[2]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[15]),Bytes.toBytes(line[15]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[6]),Bytes.toBytes(line[6]));            
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[8]),Bytes.toBytes(line[8]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[12]),Bytes.toBytes(line[12]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[0]),Bytes.toBytes(line[0]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[3]),Bytes.toBytes(line[3]));
            p.add(Bytes.toBytes("uinfo"), Bytes.toBytes(header[14]),Bytes.toBytes(line[14]));
            
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[1]),Bytes.toBytes(line[1]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[4]),Bytes.toBytes(line[4]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[5]),Bytes.toBytes(line[5]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[7]),Bytes.toBytes(line[7]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[9]),Bytes.toBytes(line[9]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[10]),Bytes.toBytes(line[10]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[11]),Bytes.toBytes(line[11]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[13]),Bytes.toBytes(line[13]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[18]),Bytes.toBytes(line[18]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[20]),Bytes.toBytes(line[20]));
            p.add(Bytes.toBytes("compliments"), Bytes.toBytes(header[21]),Bytes.toBytes(line[21]));
                        
            
            table.put(p);
            
        }
        
        
        
    }
    
}
