/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
//import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.Bytes;

import au.com.bytecode.opencsv.CSVReader;


public class Business {
    
    public void businessinsert() throws IOException
    {
    		
        System.out.println("Inserting into business table");
        Configuration config = HBaseConfiguration.create();
        
        
        HTable table = new HTable(config, "businestable");
        

        
        CSVReader reader = new CSVReader(new FileReader("/Users/yanglintong/7250/finalProject/Hbase/Data/business_small.csv"));
        String[] header = reader.readNext();
                
        
        String line[]; 
        while((line = reader.readNext())!=null)
        {
            //String[] line = line1.split(",");
            //String[] line = line1.replaceAll("^\"", "").split("\"?(,|$)(?=(([^\"]*\"){2})*[^\"]*$) *\"?");
            
        	Put p = new Put(Bytes.toBytes(line[16]));            
            
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[46]),Bytes.toBytes(line[46]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[39]),Bytes.toBytes(line[39]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[67]),Bytes.toBytes(line[67]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[10]),Bytes.toBytes(line[10]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[74]),Bytes.toBytes(line[74]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[22]),Bytes.toBytes(line[22]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[99]),Bytes.toBytes(line[99]));
            p.add(Bytes.toBytes("binfo"), Bytes.toBytes(header[61]),Bytes.toBytes(line[61]));
            
            
            p.add(Bytes.toBytes("ratings"), Bytes.toBytes(header[37]),Bytes.toBytes(line[37]));
            p.add(Bytes.toBytes("ratings"), Bytes.toBytes(header[65]),Bytes.toBytes(line[65]));
        
            p.add(Bytes.toBytes("categories"), Bytes.toBytes(header[9]),Bytes.toBytes(line[9]));
                                
            
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[0]),Bytes.toBytes(line[0]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[1]),Bytes.toBytes(line[1]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[2]),Bytes.toBytes(line[2]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[4]),Bytes.toBytes(line[4]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[5]),Bytes.toBytes(line[5]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[6]),Bytes.toBytes(line[6]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[7]),Bytes.toBytes(line[7]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[11]),Bytes.toBytes(line[11]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[12]),Bytes.toBytes(line[12]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[13]),Bytes.toBytes(line[13]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[14]),Bytes.toBytes(line[14]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[15]),Bytes.toBytes(line[15]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[17]),Bytes.toBytes(line[17]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[18]),Bytes.toBytes(line[18]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[20]),Bytes.toBytes(line[20]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[21]),Bytes.toBytes(line[21]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[24]),Bytes.toBytes(line[24]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[25]),Bytes.toBytes(line[25]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[26]),Bytes.toBytes(line[26]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[27]),Bytes.toBytes(line[27]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[28]),Bytes.toBytes(line[28]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[29]),Bytes.toBytes(line[29]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[30]),Bytes.toBytes(line[30]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[31]),Bytes.toBytes(line[31]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[32]),Bytes.toBytes(line[32]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[33]),Bytes.toBytes(line[33]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[34]),Bytes.toBytes(line[34]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[35]),Bytes.toBytes(line[35]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[36]),Bytes.toBytes(line[36]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[38]),Bytes.toBytes(line[38]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[39]),Bytes.toBytes(line[39]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[41]),Bytes.toBytes(line[41]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[42]),Bytes.toBytes(line[42]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[43]),Bytes.toBytes(line[43]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[44]),Bytes.toBytes(line[44]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[47]),Bytes.toBytes(line[47]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[48]),Bytes.toBytes(line[48]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[49]),Bytes.toBytes(line[49]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[50]),Bytes.toBytes(line[50]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[51]),Bytes.toBytes(line[51]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[52]),Bytes.toBytes(line[52]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[54]),Bytes.toBytes(line[54]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[55]),Bytes.toBytes(line[55]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[56]),Bytes.toBytes(line[56]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[58]),Bytes.toBytes(line[58]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[61]),Bytes.toBytes(line[61]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[62]),Bytes.toBytes(line[62]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[63]),Bytes.toBytes(line[63]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[65]),Bytes.toBytes(line[65]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[67]),Bytes.toBytes(line[67]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[68]),Bytes.toBytes(line[68]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[69]),Bytes.toBytes(line[69]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[70]),Bytes.toBytes(line[70]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[71]),Bytes.toBytes(line[71]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[72]),Bytes.toBytes(line[72]));
            p.add(Bytes.toBytes("attributes"), Bytes.toBytes(header[73]),Bytes.toBytes(line[73]));
            
            table.put(p);
            
        }
    }
    
}
