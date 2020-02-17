import java.util.Scanner;

/**
* This program calculates the number of logs
* that a logging truck can carry with user input.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-11
*/

public class MapleLogs {
  /**
  * This program calculates the number of logs
  * that a logging truck can carry with user input.
  */
  public static void main(String []args) {
    // variables
    
    final int logWeight = 20;
    final int truckCapacity = 1100;
    final double numOfLogs;
    final double logLength;
    
    // output
    System.out.println("Welcome to the Maple Log delivery.");
    System.out.println("The valid choices for cut logs are 0.25m, 0.5m or 1m.");
  
    // input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("\nEnter the length of the logs in meters: ");
  
    // process
    logLength = myObj.nextDouble();  // Read user input
    numOfLogs = truckCapacity / (logWeight * logLength);

    System.out.print("\nThe truck can carry " + numOfLogs + " logs that are " 
                     + logLength + " meter(s) long.");

  }
}