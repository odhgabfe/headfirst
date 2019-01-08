/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phraseomatic;

/**
 *
 * @author user
 */
public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] wordList1 = {
            "big", "robust", "automatic", "intensive", "mild", "slight",
            "uplifting", "upgradable", "scalable", "flexible", "focused"
        };
        
        String[] wordList2 = {
            "new", "authentic", "innovative", "dazzling", "awe-inspiring", 
            "gorgeous"
        };
          
        String[] wordList3 = {
          "solution", "idea", "breakthrough", "discovery", "lead", "space",
            "resource", "perspective", "technique", "possibility"
        };
        
        int length1 = wordList1.length;
        int length2 = wordList2.length;
        int length3 = wordList3.length;
        
        //RANDOM NUMBERS
        int ran1 = (int) (Math.random() * length1);
        int ran2 = (int) (Math.random() * length2);
        int ran3 = (int) (Math.random() * length3);
        
        // PRINTING RANDOM NUMBERS FOR MYSELF
        System.out.println("OUR RANDOMS: 1. "+ran1+"\t2. "+ran2+"\t3. "+ran3);
        
        String phrase = "All we need is "+wordList1[ran1]+ " " +
                wordList2[ran2] + " " + wordList3[ran3];
        System.out.println(phrase);
         
    }
    
}
