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
public class Vehicle {
    
        int passengers; // number of passengers  
    int fuelcap;    // fuel capacity in gallons 
    int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for Vehicle. 
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range. 
    int range() {
        return mpg * fuelcap;
    }
    // Compute fuel needed for a given distance. 
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
