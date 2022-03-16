import acm.program.*;
public class LossyConversion extends CommandLineProgram {
 private static final double KG_PER_LBS = 2.2;

  public void run(){
    int kg = readInt("Enter weight in kilograms: ");
    int pounds = kg / KG_PER_LBS;
    println("That's around " + pounds + " lbs.");
  }
}