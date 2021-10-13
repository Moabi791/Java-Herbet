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
public class QueueFullException extends Exception {
    int size; 
 
  QueueFullException(int s) { size = s; } 
 
  public String toString() { 
   return "\nQueue is full. Maximum size is " + 
          size; 
  }
    
}
