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
public class Rectangle extends TwoDShape {
    // A default constructor.  
  Rectangle() {  
    super();  
  }  
  
  // Constructor for Rectangle.  
  Rectangle(double w, double h) {  
    super(w, h, "rectangle"); // call superclass constructor  
  }  
  
  // Construct a square.  
  Rectangle(double x) {  
    super(x, "rectangle"); // call superclass constructor  
  }  
  
  // Construct an object from an object.  
  Rectangle(Rectangle ob) {  
    super(ob); // pass object to TwoDShape constructor  
  }  
  
  boolean isSquare() {   
    if(getWidth() == getHeight()) return true;   
    return false;   
  }   
     
  double area() {   
    return getWidth() * getHeight();   
  }
}
