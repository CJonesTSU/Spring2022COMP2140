import acm.program.*;

public class Inputs extends CommandLineProgram{
  public void run(){
    int kids = readInt("How many children? ");
    println("kids has the value: " + kids);
    double tip = readDouble("Tip? $");
    println("tip has the value: " + tip);
    boolean edible = readBoolean("Can rabbits eat celery?");
    println("edible has the value: " + edible);
  }
}