/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moabi
 */

class KbIn {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    System.out.print("Press a key followed by ENTER: "); 
 
    ch = (char) System.in.read(); // get a char 
    
    System.out.println("Your key is: " + ch); 
  }   
}

class Guess {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch, answer = 'K'; 
 
    System.out.println("I'm thinking of a letter between A and Z."); 
    System.out.print("Can you guess it: "); 
 
    ch = (char) System.in.read(); // read a char from the keyboard 
    
    if(ch == answer) System.out.println("** Right **"); 
  }   
}

class Guess2 {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch, answer = 'K'; 
 
    System.out.println("I'm thinking of a letter between A and Z."); 
    System.out.print("Can you guess it: "); 
 
    ch = (char) System.in.read(); // get a char 
    
    if(ch == answer) System.out.println("** Right **"); 
    else System.out.println("...Sorry, you're wrong."); 
  }   
}

class Guess3 {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch, answer = 'K'; 
 
    System.out.println("I'm thinking of a letter between A and Z."); 
    System.out.print("Can you guess it: "); 
 
    ch = (char) System.in.read(); // get a char 
    
    if(ch == answer) System.out.println("** Right **"); 
    else { 
      System.out.print("...Sorry, you're "); 
 
      // a nested if 
      if(ch < answer) System.out.println("too low"); 
      else System.out.println("too high"); 
    } 
  }   
}

class Ladder {    
  public static void main(String args[]) {    
    int x; 
  
    for(x=0; x<6; x++) {  
      if(x==1) 
        System.out.println("x is one");  
      else if(x==2)  
        System.out.println("x is two"); 
      else if(x==3)  
        System.out.println("x is three");  
      else if(x==4)  
        System.out.println("x is four");  
      else  
        System.out.println("x is not between 1 and 4");  
    }  
  } 
}

class SwitchDemo {   
  public static void main(String args[]) { 
    int i; 
 
    for(i=0; i<10; i++) 
      switch(i) { 
        case 0:  
          System.out.println("i is zero"); 
          break; 
        case 1:  
          System.out.println("i is one"); 
          break; 
        case 2:  
          System.out.println("i is two"); 
          break; 
        case 3:  
          System.out.println("i is three"); 
          break; 
        case 4:  
          System.out.println("i is four"); 
          break; 
        default:  
          System.out.println("i is five or more"); 
      } 
      
  }   
}

class NoBreak {   
  public static void main(String args[]) { 
    int i; 
 
    for(i=0; i<=5; i++) { 
      switch(i) { 
        case 0:  
          System.out.println("i is less than one"); 
        case 1:  
          System.out.println("i is less than two"); 
        case 2:  
          System.out.println("i is less than three"); 
        case 3:  
          System.out.println("i is less than four"); 
        case 4:  
          System.out.println("i is less than five"); 
      } 
      System.out.println(); 
    } 
  }   
}

class Help { 
  public static void main(String args[])  
    throws java.io.IOException { 
    char choice; 
 
    System.out.println("Help on:"); 
    System.out.println("  1. if"); 
    System.out.println("  2. switch"); 
    System.out.print("Choose one: "); 
    choice = (char) System.in.read(); 
 
    System.out.println("\n"); 
  
    switch(choice) { 
      case '1': 
        System.out.println("The if:\n"); 
        System.out.println("if(condition) statement;"); 
        System.out.println("else statement;"); 
        break; 
      case '2': 
        System.out.println("The switch:\n"); 
        System.out.println("switch(expression) {"); 
        System.out.println("  case constant:"); 
        System.out.println("    statement sequence"); 
        System.out.println("    break;"); 
        System.out.println("  // ..."); 
        System.out.println("}"); 
        break; 
      default: 
        System.out.print("Selection not found."); 
    } 
  } 
}

class SqrRoot {     
  public static void main(String args[]) {     
    double num, sroot, rerr;  
 
    for(num = 1.0; num < 100.0; num++) {  
      sroot = Math.sqrt(num); 
      System.out.println("Square root of " + num + 
                          " is " + sroot); 
 
      // compute rounding error 
      rerr = num - (sroot * sroot); 
      System.out.println("Rounding error is " + rerr); 
      System.out.println(); 
    }  
  }     
}

class DecrFor {     
  public static void main(String args[]) {     
    int x; 
 
    for(x = 100; x > -100; x -= 5) 
      System.out.println(x); 
  }     
}

class Comma {    
  public static void main(String args[]) {    
    int i, j; 
 
    for(i=0, j=10; i < j; i++, j--) 
      System.out.println("i and j: " + i + " " + j); 
 
   
  }    
}

class ForTest {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    int i; 
 
    System.out.println("Press S to stop."); 
 
    for(i = 0; (char) System.in.read() != 'S'; i++) 
      System.out.println("Pass #" + i); 
  }   
}

class Empty {   
  public static void main(String args[]) { 
    int i; 
 
    for(i = 0; i < 10; ) { 
      System.out.println("Pass #" + i); 
      i++; // increment loop control var 
    } 
  }   
}

class Empty2 {   
  public static void main(String args[]) { 
    int i; 
 
    i = 0; // move initialization out of loop 
    for(; i < 10; ) { 
      System.out.println("Pass #" + i); 
      i++; // increment loop control var 
    } 
  }   
}

class Empty3 {   
  public static void main(String args[]) { 
    int i; 
    int sum = 0; 
 
    // sum the numbers through 5  
    for(i = 1; i <= 5; sum += i++) ; 
 
    System.out.println("Sum is " + sum); 
  }   
}

class ForVar {   
  public static void main(String args[]) { 
    int sum = 0; 
    int fact = 1; 
 
    // compute the factorial of the numbers through 5  
    for(int i = 1; i <= 5; i++) {  
      sum += i;  // i is known throughout the loop 
      fact *= i; 
    } 
 
    // but, i is not known here. 
 
    System.out.println("Sum is " + sum); 
    System.out.println("Factorial is " + fact); 
  }   
}

class WhileDemo {   
  public static void main(String args[]) { 
    char ch; 
 
    // print the alphabet using a while loop 
    ch = 'a'; 
    while(ch <= 'z') { 
      System.out.print(ch); 
      ch++; 
    } 
  }   
}

class Power {   
  public static void main(String args[]) { 
    int e; 
    int result; 
 
    for(int i=0; i < 10; i++) { 
      result = 1; 
      e = i; 
      while(e > 0) { 
        result *= 2; 
        e--; 
      } 
 
      System.out.println("2 to the " + i +  
                         " power is " + result);        
    } 
  }   
}

class DWDemo {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    do { 
      System.out.print("Press a key following by ENTER: "); 
      ch = (char) System.in.read(); // get a char 
    } while(ch != 'q'); 
  }   
}

class Guess4 {
  public static void main(String args[])
    throws java.io.IOException {

    char ch, ignore, answer = 'K';

    do {
      System.out.println("I'm thinking of a letter between A and Z.");
      System.out.print("Can you guess it: ");

      // read a character
      ch = (char) System.in.read();

      // discard any other characters in the input buffer
      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');

      if(ch == answer) System.out.println("** Right **");
      else {
        System.out.print("...Sorry, you're ");
        if(ch < answer) System.out.println("too low");
        else System.out.println("too high");
        System.out.println("Try again!\n");
      }
    } while(answer != ch);
  }
}

class Help2 {
  public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;

    do {
      System.out.println("Help on:");
      System.out.println("  1. if");
      System.out.println("  2. switch");
      System.out.println("  3. for");
      System.out.println("  4. while");
      System.out.println("  5. do-while\n");
      System.out.print("Choose one: ");

      choice = (char) System.in.read();

      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');
    } while( choice < '1' | choice > '5');

    System.out.println("\n");

    switch(choice) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
        break;
      case '2':
        System.out.println("The switch:\n");
        System.out.println("switch(expression) {");
        System.out.println("  case constant:");
        System.out.println("    statement sequence");
        System.out.println("    break;");
        System.out.println("  // ...");
        System.out.println("}");
        break;
      case '3':
        System.out.println("The for:\n");
        System.out.print("for(init; condition; iteration)");
        System.out.println(" statement;");
        break;
      case '4':
        System.out.println("The while:\n");
        System.out.println("while(condition) statement;");
        break;
      case '5':
        System.out.println("The do-while:\n");
        System.out.println("do {");
        System.out.println("  statement;");
        System.out.println("} while (condition);");
        break;
    }
  }
}

class BreakDemo {  
  public static void main(String args[]) {  
    int num; 
 
    num = 100; 
 
    // loop while i-squared is less than num 
    for(int i=0; i < num; i++) {  
      if(i*i >= num) break; // terminate loop if i*i >= 100  
      System.out.print(i + " ");  
    }  
    System.out.println("Loop complete.");  
  }  
}

class Break2 {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    for( ; ; ) { 
      ch = (char) System.in.read(); // get a char 
      if(ch == 'q') break; 
    } 
    System.out.println("You pressed q!"); 
  }   
}

class Break3 {  
  public static void main(String args[]) {  
  
    for(int i=0; i<3; i++) {  
      System.out.println("Outer loop count: " + i);  
      System.out.print("    Inner loop count: "); 
 
      int t = 0;             
      while(t < 100) {  
        if(t == 10) break; // terminate loop if t is 10  
        System.out.print(t + " ");  
        t++; 
      }  
      System.out.println();  
    }  
    System.out.println("Loops complete.");  
  }  
}

class Break4 {  
  public static void main(String args[]) {  
    int i; 
     
    for(i=1; i<4; i++) { 
one:  { 
two:    { 
three:    { 
            System.out.println("\ni is " + i); 
            if(i==1) break one; 
            if(i==2) break two; 
            if(i==3) break three; 
              
            // this is never reached 
            System.out.println("won't print"); 
          } 
          System.out.println("After block three."); 
        } 
        System.out.println("After block two."); 
      } 
      System.out.println("After block one."); 
    } 
    System.out.println("After for."); 
   
  }  
}

class Break5 {  
  public static void main(String args[]) {  
 
done: 
    for(int i=0; i<10; i++) { 
      for(int j=0; j<10; j++) { 
        for(int k=0; k<10; k++) { 
          System.out.println(k + " "); 
          if(k == 5) break done; // jump to done 
        } 
        System.out.println("After k loop"); // won't execute 
      } 
      System.out.println("After j loop"); // won't execute 
    } 
    System.out.println("After i loop");  
  }  
}

class Break6 {  
  public static void main(String args[]) {  
    int x=0, y=0; 
 
// here, put label before for statement. 
stop1: for(x=0; x < 5; x++) { 
         for(y = 0; y < 5; y++) { 
           if(y == 2) break stop1; 
           System.out.println("x and y: " + x + " " + y);  
         } 
       } 
 
       System.out.println(); 
 
// now, put label immediately before { 
      for(x=0; x < 5; x++) 
stop2: { 
         for(y = 0; y < 5; y++) { 
           if(y == 2) break stop2; 
           System.out.println("x and y: " + x + " " + y);  
         } 
       } 
 
  }  
}

// This program contains an error. 
class BreakErr { 
  public static void main(String args[]) { 
 
    one: for(int i=0; i<3; i++) { 
      System.out.print("Pass " + i + ": "); 
    } 
 
    for(int j=0; j<100; j++) { 
      if(j == 10) break one; // WRONG 
      System.out.print(j + " "); 
    } 
  } 
}

// Use continue. 
class ContDemo {   
  public static void main(String args[]) { 
    int i; 
 
    // print even number between 0 and 100 
    for(i = 0; i<=100; i++) {  
      if((i%2) != 0) continue; // iterate 
      System.out.println(i); 
    } 
  }   
}

// Use continue with a label. 
class ContToLabel {   
  public static void main(String args[]) { 
 
outerloop: 
    for(int i=1; i < 10; i++) { 
      System.out.print("\nOuter loop pass " + i + 
                       ", Inner loop: "); 
      for(int j = 1; j < 10; j++) { 
        if(j == 5) continue outerloop; // continue outer loop 
        System.out.print(j); 
      } 
    } 
  }   
}

class Help3 {
  public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;

    for(;;) {
      do {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Choose one (q to quit): ");

        choice = (char) System.in.read();
  
        do {
          ignore = (char) System.in.read();
        } while(ignore != '\n');
      } while( choice < '1' | choice > '7' & choice != 'q');

      if(choice == 'q') break;

      System.out.println("\n");

      switch(choice) {
        case '1':
          System.out.println("The if:\n");
          System.out.println("if(condition) statement;");
          System.out.println("else statement;");
          break;
        case '2':
          System.out.println("The switch:\n");
          System.out.println("switch(expression) {");
          System.out.println("  case constant:");
          System.out.println("    statement sequence");
          System.out.println("    break;");
          System.out.println("  // ...");
          System.out.println("}");
          break;
        case '3':
          System.out.println("The for:\n");
          System.out.print("for(init; condition; iteration)");
          System.out.println(" statement;");
          break;
        case '4':
          System.out.println("The while:\n");
          System.out.println("while(condition) statement;");
          break;
        case '5':
          System.out.println("The do-while:\n");
          System.out.println("do {");
          System.out.println("  statement;");
          System.out.println("} while (condition);");
          break;
        case '6':
          System.out.println("The break:\n");
          System.out.println("break; or break label;");
          break;
        case '7':
          System.out.println("The continue:\n");
          System.out.println("continue; or continue label;");
          break;
      }
      System.out.println();
    }
  }
}

class FindFac {   
  public static void main(String args[]) { 
 
    for(int i=2; i <= 100; i++) { 
      System.out.print("Factors of " + i + ": "); 
      for(int j = 2; j < i; j++) 
        if((i%j) == 0) System.out.print(j + " "); 
      System.out.println(); 
    } 
  }   
}