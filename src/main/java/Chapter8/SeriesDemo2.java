/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author moabi
 */
public class SeriesDemo2 {
        public static void main(String args[]) { 
        ByTwos twoOb = new ByTwos(); 
        ByThrees threeOb = new ByThrees(); 
        Series ob; 

        for(int i=0; i < 5; i++) { 
          ob = twoOb; 
          System.out.println("Next ByTwos value is " + 
                              ob.getNext()); 
          ob = threeOb; 
          System.out.println("Next ByThrees value is " + 
                              ob.getNext()); 
        } 
    } 
}
