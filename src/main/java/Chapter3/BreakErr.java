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
class BreakErr {
// This program contains an error.

    public static void main(String args[]) {

        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            if (j == 10) {
                break one; // WRONG 
            }
        }
        System.out.print(j + " ");
    }
}
}
