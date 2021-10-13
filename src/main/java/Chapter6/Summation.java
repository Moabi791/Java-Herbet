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
public class Summation {
    
        int sum;

    // Construct from an int. 
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
    }

    // Construct from another object. 
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
