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
public class MyIFImp implements MyIF {
     // Only getUserID() defined by MyIF needs to be implemented. 
  // getAdminID() can be allowed to default. 
  public int getUserID() { 
    return 100; 
  } 
    
}
