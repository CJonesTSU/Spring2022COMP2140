import acm.program.*;

public class FizzBuzz extends CommandLineProgram{
  public static final int TOP_VALUE = 20;
  public void run(){
    /*
    Write a program that takes in a number and outputs each number from 1 to that number, replacing multiples of 3 with Fizz, multiples of 5 with Buzz, and multiples of both with FizzBuzz.
    */
    for(int i = 1; i <= TOP_VALUE; i++){
      if((i % 5 == 0) && (i % 3 == 0)){
        println("i is: " + i + " FizzBuzz");
      }else if(i % 5 == 0){
      println("i is: " + i +" Buzz");
      }else if(i % 3 == 0){
         println("i is: " + i + " Fizz");
      }else{
         println("i is: " + i);
      }
    }
    
    
  }
}