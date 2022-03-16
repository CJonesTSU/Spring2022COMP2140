import acm.program.*;

public class ClassLoops extends CommandLineProgram{
  
  public void run(){
    for(int i = 1; i < 11; i++){
      println("i is: " + i);
    }
    
    println("Count from 1 to 20 by twos");
    for(int i = 1; i <= 20; i = i + 2){
       println("i is: " + i);     
    }
    
    println("Count from 7 to -3 backwards");
    for(int i = 7; i > -4; i--){
        println("i is: " + i);        
    }
    
    int bottom = readInt("Give me the lower end of a range to print: ");
    int top = readInt("Give me the upper end of a range to print: ");
    
    for(int i = bottom; i <= top; i++){
      println("i is: " + i);    
    }
    
    
    
    
    
    
    
    
    
    
    
  }
}