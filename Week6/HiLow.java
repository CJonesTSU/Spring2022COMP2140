import acm.program.*;

public class HiLow extends CommandLineProgram{
  private static final int secretNum = 92;
  public void run(){
    println("I am thinking of a number between 0 and 99...");
    int guess = readInt("Enter a guess: ");
    while(guess != secretNum){
      if (guess < secretNum){
        println("Guess is too low");
      } else {
        println("Guess is too high");
      }
      guess = readInt("Enter a guess: ");
    }
    println("You win!  Good guess.");
  }
}