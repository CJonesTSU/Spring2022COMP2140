import acm.program.*;
public class KilogramsToPounds extends CommandLineProgram
{
 private static final double KG_PER_LBS = 2.2;

  public void run()
  {
    int kg = readInt("Enter weight in kilograms: ");
    double pounds = kg / KG_PER_LBS;
    println("That's around " + (int) pounds + " lbs.");
  }
}
