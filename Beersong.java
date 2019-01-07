/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author user
 */
public class Beersong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numBeers = 99;
        String word = "bottles";
        
        while (numBeers > 0){
            
            if (numBeers == 0){
                word = "bottle"; //singular bottle
            }
        
        
        System.out.println(numBeers +" "+word+" on the wall!");
                //99 beers on the wall
        System.out.println(numBeers+ " "+word+"!");
                //99 beers
                
        System.out.println("Take on down.");
        System.out.println("PASS IT AROUND");
        
        numBeers -=1;
        System.out.println(numBeers+" "+word+" ON THE WALL !!!\n\n");
        
        }
        
    }
    
}
