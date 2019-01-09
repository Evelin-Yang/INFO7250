/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;


public class YelpInsertInHbase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Business b = new Business();
        b.businessinsert();
        
        Reviews r = new Reviews();
        r.reviewinsert();
        
        User u = new User();
        u.userinsert();
    }
    
}
