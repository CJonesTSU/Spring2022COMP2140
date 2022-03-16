import acm.program.*;
public class ForLoopScopeExample extends CommandLineProgram
{
  public void run()
  {
    int lastI = 0; 
    for(int i = 0; i < 3; i++){
      println(i * 2);
      lastI = i;
    }
    println("The last value of i was: " + lastI);
  }
}
