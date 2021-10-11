/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moabi
 */
public class Chapter4 {
    // A program that uses the Vehicle class.  

class Vehicle {  
  int passengers; // number of passengers  
  int fuelcap;    // fuel capacity in gallons 
  int mpg;        // fuel consumption in miles per gallon 
} 
    
}

class VehicleDemo {  
  public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    int range;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // compute the range assuming a full tank of gas 
    range = minivan.fuelcap * minivan.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range);  
  }  
}

// This program creates two Vehicle objects. 
 
class Vehicle {  
  int passengers; // number of passengers  
  int fuelcap;    // fuel capacity in gallons 
  int mpg;        // fuel consumption in miles per gallon 
}  
  
// This class declares an object of type Vehicle.  
class TwoVehicles {  
  public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    Vehicle sportscar = new Vehicle();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
    // compute the ranges assuming a full tank of gas 
    range1 = minivan.fuelcap * minivan.mpg; 
    range2 = sportscar.fuelcap * sportscar.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range1);  
 
    System.out.println("Sportscar can carry " + sportscar.passengers + 
                       " with a range of " + range2);  
  }  
}