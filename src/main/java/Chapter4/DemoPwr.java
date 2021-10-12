/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author moabi
 */
public class DemoPwr {
    
    public static void main(String args[]) {   
    Pwr x = new Pwr(4.0, 2); 
    Pwr y = new Pwr(2.5, 1); 
    Pwr z = new Pwr(5.7, 0); 
 
    System.out.println(x.b + " raised to the " + x.e +  
                       " power is " + x.get_pwr()); 
    System.out.println(y.b + " raised to the " + y.e +  
                       " power is " + y.get_pwr()); 
    System.out.println(z.b + " raised to the " + z.e +  
      
}
