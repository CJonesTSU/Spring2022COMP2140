import acm.program.*;
import java.util.Random;

public class HiLowAdvanced extends CommandLineProgram{
  public void run(){
    Random rand = new Random();
    int secretNum = rand.nextInt(99);
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