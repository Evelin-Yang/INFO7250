/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessreco;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;





public class BusinessReco {

     public static void main(String args[]){ 
         
        try{ 
         
        //Loading the DATA;    
            
         DataModel dm = new FileDataModel(new File("/Users/yanglintong/7250/finalProject/Mahout/data/busirec_new.csv"));
	
        // We use the below line to relate businesses. 
         //ItemSimilarity sim = new LogLikelihoodSimilarity(dm);
	 
         TanimotoCoefficientSimilarity sim = new TanimotoCoefficientSimilarity((dm));
         
         //Using the below line get recommendations
	     GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(dm, sim);
	
         //Looping through every business.
            for(LongPrimitiveIterator items = dm.getItemIDs(); items.hasNext();) 
                {             
                long itemId = items.nextLong();
                
                // For each business we recommend 3 businesses.
                
                List<RecommendedItem> recommendations = recommender.mostSimilarItems(itemId, 2);
				
                for(RecommendedItem recommendation : recommendations) 
                    {
	                             
                    System.out.println(itemId + "," + recommendation.getItemID() + "," + recommendation.getValue());
	    
                    }
				
                }
            }
        
        catch(IOException | TasteException e)
        {
            System.out.println(e);
        }
        
  
    }
    
}
