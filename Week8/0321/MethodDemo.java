import acm.program.*;

public class MethodDemo extends CommandLineProgram{

  public void run(){
    String s = readLine("Enter your text: ");
    println("You entered: " + s);
    printStringUsingMethod(s);
  }
  
  private void printStringUsingMethod(String myString){
    println("In the print string method, string is: " + myString );
  }
}