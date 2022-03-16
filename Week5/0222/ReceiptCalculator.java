import acm.program.*;

public class ReceiptCalculator extends CommandLineProgram{
  private static final double TAX_RATE = 9.25;
  public void run(){
    double costOfMeal = readDouble("What was the cost of the meal? $");
    double tipPercentage = readDouble("What percentage do you want to tip? (Enter 20 for 20%) % ");
    double taxAmount = costOfMeal * TAX_RATE / 100;
    double tipAmount = costOfMeal * tipPercentage / 100;
    double grandTotal = costOfMeal + taxAmount + tipAmount;
    println("Tax: $ " + taxAmount);
    println("Tip: $ " + tipAmount);
    println("Total: $ " + grandTotal);
    
    
    
    
    
  }
}