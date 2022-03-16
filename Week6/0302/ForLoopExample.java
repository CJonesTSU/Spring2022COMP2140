import acm.program.*;

public class ForLoopExample extends CommandLineProgram{
  public void run(){
    for(int i = 0; i < 3; i++){
      println("i is: " + i + " TSU Rocks Socks");
    }
    
    int myLoopVar;
    // code here
    myLoopVar = 8;
    
    for( ;myLoopVar < 22; myLoopVar++){
      println("myLoopVar is: " + myLoopVar);
    }
  }
}