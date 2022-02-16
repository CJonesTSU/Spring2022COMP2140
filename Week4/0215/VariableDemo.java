import acm.program.*;

public class VariableDemo extends CommandLineProgram {
  
  public void run(){
    // how to declare an integer variable
    int classNumber = 35;
    println(classNumber);
    
    // how to declare a double variable
    double temperature = 98.6;
    println(temperature);
    
    // how to declare a boolean variable
    boolean haveMoney = true;
    println(haveMoney);
    
    // how to declare a String variable
    String myName = "Chris";
    println(myName);
    
    // how to declare a char variable
    char myChar = 'U'; 
    println(myChar);
    
    // this prints string literal 
    println("This is a string literal");
    
    // this prints a concatination of
    // a string literal and variable
    println("The value of classNumber is: "+ classNumber);
    
    // Variables can change!
    println("Changing the value of classNumber to 78");
    
    classNumber = 78;
    
    println("The value of classNumber is: "+ classNumber);
    
    // We can declare a variable and assign a value later
    int numChild;
    numChild = 12;
    
    // ACM library 'read' methods
    int numStudents = readInt("How many students are in the class? ");
    
    println("You entered " + numStudents + " for the number of students.");
    
    // variable values can be set by expressions
    
    int a = 3;
    int b = 2;
    int c = (2*(a + b) - 56) * -16;
    println("The value of c is: " + c);
    println("Changing value of a to 15");
    a = 15;
    println("The value of c is: " + c);
    
    int result = 4 + 2 * 3;
    println("result is: " + result);
    
    int sum = 1 + 2 + (3 * 4);
    println("sum is: " + sum);
    
    double successRate =  1 / 2;
    println("successRate is: " + successRate);
    double successRate2 =  1.0 / 2;
    println("successRate2 is: " + successRate2);
    double successRate3 =  (double) 1 / 2;
    println("successRate3 is: " + successRate3);

  }
}












































