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

public interface ICharQ {
    // Put a characer into the queue.     
    void put(char ch) throws QueueFullException;

    // Get a character from the queue.    
    char get() throws QueueEmptyException;
}
