import acm.program.*;

public class IntegerDivision extends CommandLineProgram{
  public void run(){
    double c = 100;
    double f = 9.0 / 5 * c + 32; // hacky but works
    double alternateF = (double) 9 / 5 * c + 32;
    System.out.println("Degrees f is: " + f);
    System.out.println("Degrees alternateF is: " + alternateF);

  }
}