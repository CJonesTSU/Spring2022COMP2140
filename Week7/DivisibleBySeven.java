import acm.program.*;
public class DivisibleBySeven extends CommandLineProgram{
  public void run(){
    int num = readInt("Enter an integer: ");
    if((num % 7) == 0){
      println(num + " is divisible by 7");
    }else{
      println(num + " is not divisible by 7");
    }
  }
}