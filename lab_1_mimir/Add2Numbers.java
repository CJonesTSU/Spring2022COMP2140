/*
 * File: Add2Numbers.java
 * --------------------
 * This program adds two numbers provided by the user.
 */

import acm.program.*;

public class Add2Numbers extends CommandLineProgram {

  public void run() {
    println("This program adds two numbers.");
    int n1 = readInt("Enter n1: ");
    int n2 = readInt("Enter n2: ");
    int total = n1 + n2;
    println("The total is " + total + ".");
  }

}
