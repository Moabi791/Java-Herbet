/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moabi
 */
class Example { 
  // A Java program begins with a call to main(). 
  public static void main(String args[]) { 
    System.out.println("Java drives the Web."); 
  } 
}
    
class Example2 {   
  public static void main(String args[]) {   
    int myVar1; // this declares a variable  
    int myVar2; // this declares another variable  
  
    myVar1 = 1024; // this assigns 1024 to myVar1  
  
    System.out.println("myVar1 contains " + myVar1);   
  
    myVar2 = myVar1 / 2;  
  
    System.out.print("myVar2 contains myVar1 / 2: ");  
    System.out.println(myVar2);  
  }   
}

class Example3 {  
  public static void main(String args[]) {  
    int v;  // this declares an int variable 
    double x; // this declares a floating-point variable 
 
    v = 10; // assign v the value 10 
    
    x = 10.0; // assign x the value 10.0 
 
    System.out.println("Original value of v: " + v); 
    System.out.println("Original value of x: " + x); 
 
    System.out.println(); // print a blank line 
 
    // now, divide both by 4 
    v = v / 4;  
    x = x / 4; 
 
    System.out.println("v after division: " + v); 
    System.out.println("x after division: " + x); 
  }  
}

class GalToLit {  
  public static void main(String args[]) {  
    double gallons; // holds the number of gallons 
    double liters;  // holds conversion to liters 
 
    gallons = 10; // start with 10 gallons 
 
    liters = gallons * 3.7854; // convert to liters 
 
    System.out.println(gallons + " gallons is " + liters + " liters."); 
  }  
}

class IfDemo {  
  public static void main(String args[]) {  
    int a, b, c;  
  
    a = 2;  
    b = 3;  
  
    if(a < b) System.out.println("a is less than b"); 
 
    // this won't display anything  
    if(a == b) System.out.println("you won't see this");  
 
    System.out.println(); 
 
    c = a - b; // c contains -1 
 
    System.out.println("c contains -1"); 
    if(c >= 0) System.out.println("c is non-negative"); 
    if(c < 0) System.out.println("c is negative"); 
 
    System.out.println(); 
 
    c = b - a; // c now contains 1 
    System.out.println("c contains 1"); 
    if(c >= 0) System.out.println("c is non-negative"); 
    if(c < 0) System.out.println("c is negative"); 
 
  }  
}

class ForDemo { 
  public static void main(String args[]) { 
    int count; 
 
    for(count = 0; count < 5; count = count+1) 
      System.out.println("This is count: " + count); 
 
    System.out.println("Done!"); 
  } 
}

class BlockDemo { 
  public static void main(String args[]) { 
    double i, j, d; 
 
    i = 5; 
    j = 10; 
 
    // the target of this if is a block 
    if(i != 0) { 
      System.out.println("i does not equal zero"); 
      d = j / i; 
      System.out.println("j / i is " + d); 
    } 
  } 
}

class GalToLitTable {  
  public static void main(String args[]) {  
    double gallons, liters; 
    int counter; 
 
    counter = 0; 
    for(gallons = 1; gallons <= 100; gallons++) { 
      liters = gallons * 3.7854; // convert to liters 
      System.out.println(gallons + " gallons is " + 
                         liters + " liters."); 
 
      counter++; 
      // every 10th line, print a blank line        
      if(counter == 10) { 
        System.out.println(); 
        counter = 0; // reset the line counter 
      } 
    } 
  }  
}