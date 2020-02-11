/**
* This program calculates the number of logs
* that a logging truck can carry with user input.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-10 
*/

import java.util.Scanner;

public class MapleLogs {
  public static void main(String []args) {
    
    // variables
    int logWeight = 20;
    int truckCapacity = 1100;
    double numOfLogs;
    double logLength;
  
    System.out.println("Welcome to the Maple Log delivery.\nThe only valid choices for cut logs are 0.25m, 0.5m or 1m.\n");
    
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter the length of the logs in meters: ");
    
    logLength = myObj.nextDouble();  // Read user input
    numOfLogs = truckCapacity/ (logWeight*logLength);
    System.out.println("The truck can carry " + numOfLogs + " logs that are " + logLength + " meter(s) long.");
    
  }
}
