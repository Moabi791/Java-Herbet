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
public class PassOb {
    
        public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: "
                + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: "
                + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: "
                + ob1.sameVolume(ob3));
    }
}
