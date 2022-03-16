import acm.program.*;

public class SentinelLoop extends CommandLineProgram{
  public void run(){
    println("This program will sum values.  Enter -1 to end.");
    int input = readInt("Enter a number: ");
    
    int sum = 0;
    
    while(input != -1){
      sum += input;
      input = readInt("Enter a number: ");
    }
    
    println("The sum was: " + sum);
    
  }
}