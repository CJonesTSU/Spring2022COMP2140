import acm.program.*;

public class Homework31 extends CommandLineProgram{
  public static final int START = 10;
  public void run(){
    println("Liftoff!");
    
    for(int i = START; i > 0; i--){
      println(i);
    }
  }
}