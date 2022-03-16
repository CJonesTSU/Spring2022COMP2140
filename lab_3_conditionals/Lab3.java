import java.util.Random;   // Needed for the Random class
import acm.program.*;     //the ACM helper file for Java teaching.
/**
This class simulates rolling a pair of dice 10,000 times
and counts the number of times doubles of are rolled for
each different pair of doubles.
*/

public class Lab3 extends CommandLineProgram{
  private static final int NUMBER = 10000;  // Number of dice rolls
  public void run(){
    // A random number generator used in
    // simulating the rolling of dice
    Random generator = new Random();
    
    int die1Value;       // Value of the first die
    int die2Value;       // Value of the second die
    int count = 0;       // Total number of dice rolls
    int snakeEyes = 0;   // Number of snake eyes rolls
    int twos = 0;        // Number of double two rolls
    int threes = 0;      // Number of double three rolls
    int fours = 0;       // Number of double four rolls
    int fives = 0;       // Number of double five rolls
    int sixes = 0;       // Number of double six rolls
    
    for(int i = 0; i < NUMBER; i++) {
      die1Value = generator.nextInt(6) + 1;
      die2Value = generator.nextInt(6) + 1;
      //println("die1: " + die1Value + " die2: " + die2Value );
      if(die1Value == die2Value){
        //println("die1: " + die1Value + " die2: " + die2Value );
        if(die1Value == 1){
          snakeEyes = snakeEyes + 1;
        } else if(die1Value == 2){
          twos += 1;
        } else if(die1Value == 3){
          threes++;
        } else if(die1Value == 4){
          fours = fours + 1;
        } else if (die1Value == 5){
          fives++;
        } else if (die1Value == 6){
          sixes += 1;
        }
      }
      count++;
      // This is equivalent to count = count + 1; or count += 1;
    }
    
    // TASK #1 Enter your code for the algorithm here
    
    // HINT: To get a random number between 1 and 6 use the 
    // following code.
    
    // value generator.nextInt(6) + 1;
    
    
    // Display the results
    println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    println("You rolled double twos " + twos + " out of " + count + " rolls.");
    println("You rolled double threes " + threes + " out of " + count + " rolls.");
    println("You rolled double fours " + fours + " out of " + count + " rolls.");
    println("You rolled double fives " + fives + " out of " + count + " rolls.");
    println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
    
    
    // Clean up for while loop version
    
    count = 0;       // Total number of dice rolls
    snakeEyes = 0;   // Number of snake eyes rolls
    twos = 0;        // Number of double two rolls
    threes = 0;      // Number of double three rolls
    fours = 0;       // Number of double four rolls
    fives = 0;       // Number of double five rolls
    sixes = 0;       // Number of double six rolls
    
    int loopVar = 0; // the loop variable for our while loop
    
    while(loopVar < NUMBER){
      //println("LoopVar: " + loopVar);
      die1Value = generator.nextInt(6) + 1;
      die2Value = generator.nextInt(6) + 1;
      //println("die1: " + die1Value + " die2: " + die2Value );
      if(die1Value == die2Value){
        //println("die1: " + die1Value + " die2: " + die2Value );
        if(die1Value == 1){
          snakeEyes++;
        } else if(die1Value == 2){
          twos += 1;
        } else if(die1Value == 3){
          threes++;
        } else if(die1Value == 4){
          fours = fours + 1;
        } else if(die1Value == 5){
          fives++;
        } else if(die1Value == 6){
          sixes = sixes + 1;
        }
      }
      loopVar = loopVar + 1;
      count = count + 1;
    }
    // Display the resultsn for while loop
    println("\n\nRolling using a while loop");
    println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    println("You rolled double twos " + twos + " out of " + count + " rolls.");
    println("You rolled double threes " + threes + " out of " + count + " rolls.");
    println("You rolled double fours " + fours + " out of " + count + " rolls.");
    println("You rolled double fives " + fives + " out of " + count + " rolls.");
    println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
    
    
  }
}