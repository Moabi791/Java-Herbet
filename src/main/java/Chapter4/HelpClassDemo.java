/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author moabi
 */
public class HelpClassDemo {
    
        public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for (;;) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice));

            if (choice == 'q') {
                break;
            }

            System.out.println("\n");

            hlpobj.helpOn(choice);
        }
    }
}
