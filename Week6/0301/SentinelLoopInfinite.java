import acm.program.*;

public class SentinelLoopInfinite extends CommandLineProgram{
  public void run(){
    int sum = 0;
    int number = 0;
    println("This program will sum numbers. Enter -1 to end.");
    
    while(true){
      number = readInt("Enter a number: ");
      if(number == -1){
        break;
      }
      sum += number;
      // how long does this execute?
    }
    println("Loop ended!");
    println("Sum is: " + sum);
  }
}