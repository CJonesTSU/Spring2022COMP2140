/*
 * File: DebuggingExercise.java
 * --------------------
 * This a program that doesn't quite work.
 * The goal is to ask the user for their
 * birth year and and tell them what
 * generation they are in using the
 * following table:
 *
 *
 * Gen Z	      1997 – 2012
 * Millennials	1981 – 1996
 * Gen X	      1965 – 1980	
 * Boomers 	    1946 – 1964	
 */

import acm.program.*;

public class DebuggingExercise extends CommandLineProgram {
  public void run() {
    int birthYear = readInt("What year were you born? ");
    if (1946 >= birthYear && birthYear <= 1964) {
      println("You are a Boomer");
    } else if (1964 < birthYear && birthYear <= 1980) {
      println("You are in Gen X.");
    } else if (1980 < birthYear && birthYear <= 1996) {
      println("You are a Millenial.");
    } else if (1997 < birthYear && birthYear <= 2012) {
      println("You are in Gen Z.");
    } else {
      println("Our table doesn't contain your birth year, sorry!");
    }
  }
}