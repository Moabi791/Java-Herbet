/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author moabi
 */
class DecrFor {
    
        public static void main(String args[]) {
        int x;

        for (x = 100; x > -100; x -= 5) {
            System.out.println(x);
            
//            for(count=10; count < 5; count++) 
//                x += count; // this statement will not execute
        }
    }
}
