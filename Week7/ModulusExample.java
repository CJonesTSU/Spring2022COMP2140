import acm.program.*;
public class ModulusExample extends CommandLineProgram{
  public void run(){
    int num = readInt("Enter an integer: ");
    int onesDigit = num % 10;
    int tensDigit = (num / 10) % 10;
    println("Ones digit was: " + onesDigit);
    println("Tens digit was: " + tensDigit);
  }
}

// 45621 % 10 = 1


// 45621 / 10 = 4562

// 4562 * 10 = 45620