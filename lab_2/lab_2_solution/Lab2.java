import acm.program.*;

public class Lab2 extends CommandLineProgram {
  public void run(){
    // // place your lab code here
    
    int num1 = 5;
    int num2 = 12;
    int num3 = 41;
    int num4 = -9;
    int num5 = 10;

    println("num1 is " + num1);
    println("num2 is " + num2);
    println("num3 is " + num3);
    println("num4 is " + num4);
    println("num5 is " + num5);
    
    
    double dbl1 = 6.25;
    double dbl2 = 3.14159254;
    double dbl3 = 1.414;
    double dbl4 = -27.003;
    double dbl5 = -54637.86121;
    
    println("dbl1 is " + dbl1);
    println("dbl2 is " + dbl2);
    println("dbl3 is " + dbl3);
    println("dbl4 is " + dbl4);
    println("dbl5 is " + dbl5);
    
    char char1 = 'p';
    char char2 = '%';
    char char3 = '7';
    
    println("char1 is " + char1);
    println("char2 is " + char2);
    println("char3 is " + char3);
    
    boolean bool1 = true;
    boolean bool2 = false;
    println("bool1 is " + bool1);
    println("bool2 is " + bool2);
    
    String str1 = "Welcome to COMP 2140";
    String str2 = "I hope you learn a lot";
    String str3 = "With a minimum amount of frustration";
    String str4 = "Programming is fun!";
    String str5 = "No, really, it is, but you have to get past the boring parts first.";
  
    println("str1 is " + str1);
    println("str2 is " + str2);
    println("str3 is " + str3);
    println("str4 is " + str4);
    println("str5 is " + str5);

    int sum;
    sum = num1 + num3 + num5;
    
    println("The sum of num1 + num3 + num5 is: " + sum);
    
    double sum2 = 4.5;
    sum2 = sum2 + dbl2 + dbl4;
    println("The sum of 4.5 + dbl2 + dbl4 is: " + sum2);
    
    println("The chars concatednated together are: " + char1 + char2 + char3);
    
    String charString = "We can concatenate almost anything with a string";
    
    println("charString is " + charString);
    
    charString = charString + char2;
    
    println("charString + char2 is " + charString);
    
    charString = charString + " " + num3;
    
    println("charString + char2 + num3 is " + charString);
    
    double convertToDouble = 0.0;
    
    convertToDouble = convertToDouble + num1;
    
    println("An integer added to a double results in a double: " + convertToDouble);

  }
}