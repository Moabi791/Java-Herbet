/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author moabi
 */
public class ThrowDemo {
    public static void main(String args[]) { 
    try { 
      System.out.println("Before throw."); 
      throw new ArithmeticException(); 
    } 
    catch (ArithmeticException exc) { 
      // catch the exception 
      System.out.println("Exception caught."); 
    } 
    System.out.println("After try/catch block."); 
  }
}
