/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author moabi
 */
class NestVar {

    public static void main(String args[]) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);
            
            //Count cant be declared again
            //int count; // illegal!!! 
            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}
