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
public class FixedQueue implements ICharQ {
    private char q[]; // this array holds the queue    
  private int putloc, getloc; // the put and get indices    
    
  // Construct an empty queue given its size.   
  public FixedQueue(int size) {    
    q = new char[size]; // allocate memory for queue    
    putloc = getloc = 0;    
  }    
   
  // Put a characer into the queue.    
  public void put(char ch) {    
    if(putloc==q.length) {    
      System.out.println(" -- Queue is full.");    
      return;    
    }    
        
    q[putloc++] = ch;    
  }    
    
  // Get a character from the queue.   
  public char get() {    
    if(getloc == putloc) {    
      System.out.println(" -- Queue is empty.");    
      return (char) 0;     
    }    
      
    return q[getloc++];    
  }
    
}
