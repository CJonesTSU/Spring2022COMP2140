import acm.program.*;

public class SlideExample extends CommandLineProgram{
  public void run(){
    int a = readInt("Enter an integer: ");
    int b = readInt("Enter another integer: ");
    calcAndPrint(a, b);
    calcAndPrint(b, a);
    calcAndPrint(27, 4);
    
  }
  
  private void calcAndPrint(int x, int y){
    int quotient = x / y;
    int remainder = x % y;
    
    println("Dividend is: " + x);
    println("Divsor is: " + y);
    println("Quotient is: " + quotient);
    println("Remainder is: " + remainder);
  }
}