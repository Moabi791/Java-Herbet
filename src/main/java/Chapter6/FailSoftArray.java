/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author moabi
 */
public class FailSoftArray {
        private int a[]; // reference to array 
  private int errval; // value to return if get() fails 
 
  public int length; // length is public 
   
  /* Construct array given its size and the value to 
     return if get() fails. */ 
  public FailSoftArray(int size, int errv) { 
    a = new int[size]; 
    errval = errv; 
    length = size;  
  } 
 
  // Return value at given index. 
  public int get(int index) { 
    if(indexOK(index)) return a[index]; 
    return errval; 
  } 
 
  // Put a value at an index. Return false on failure. 
  public boolean put(int index, int val) { 
    if(indexOK(index)) { 
      a[index] = val; 
      return true; 
    } 
    return false; 
  } 
 
  // Return true if index is within bounds. 
  private boolean indexOK(int index) { 
   if(index >= 0 & index < length) return true; 
   return false; 
  } 
}
