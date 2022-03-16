/*
 * File: Madlib.java
 * --------------------
 * This program prints a silly story.
 * Name:
 * Pod Leader:
 */

import acm.program.*;

public class Madlib extends CommandLineProgram
{
    public void run()
    {
        String adj1 = readLine("Enter an adjective: ");
        String noun1 = readLine("Enter a noun: ");
        println("That sure is a " + adj1 + " more text here " + noun1);
    }

}
