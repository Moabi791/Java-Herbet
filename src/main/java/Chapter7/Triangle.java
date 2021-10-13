/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author moabi
 */
public class Triangle {
     private String style;  
    
  // A default constructor.  
  Triangle() {  
    super();  
    style = "none";  
  }  
  
  // Constructor for Triangle.  
  Triangle(String s, double w, double h) {  
    super(w, h, "triangle");  
  
    style = s;   
  }  
  
  // One argument constructor 
  Triangle(double x) {  
//    super(x, "triangle"); // call superclass constructor  
  
    style = "filled";   
  }  
  
  // Construct an object from an object.  
  Triangle(Triangle ob) {  
   super(ob); // pass object to TwoDShape constructor  
    style = ob.style;  
  }  
  
  double area() {  
  return getWidth() * getHeight() / 2;  
  }  
  
  void showStyle() {  
    System.out.println("Triangle is " + style);  
  } 
}
