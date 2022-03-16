import acm.program.*;

public class PrintEvenNums extends CommandLineProgram{
  private static final int NUM_TO_DO = 11;
  
  public void run(){
    for(int i = 0; i < NUM_TO_DO; i++){
      println(i * 2);
      //println("i is: " + i + " TSU Rocks Socks");
    }
    println();
    for(int i = 0; i < NUM_TO_DO * 2; i = i + 2){
      println(i);
      //println("i is: " + i + " TSU Rocks Socks");
    }
  }
}