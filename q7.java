import java.util.Scanner;

public class q7 {
  public static void main(String[] args) {
    // Create a Scanner object for input
    Scanner scnr = new Scanner(System.in);

    // Initialize variables
    int sum = 0; // To store the sum of non-negative integers
    int smallest = Integer.MAX_VALUE; // To store the smallest non-negative integer
    int num; // To store the current input number

    // Loop to collect inputs until a negative number is entered
    while (true) {
      num = scnr.nextInt(); // Read the next integer from the user
      if (num < 0) { // If the number is negative
        break; // Exit the loop
      }
      sum += num; // Add the number to the sum
      if (num < smallest) { // Check if the current number is the smallest
        smallest = num; // Update the smallest number
      }
    }

    // Output the smallest non-negative number and the sum of non-negative numbers
    System.out.println("Smallest: " + smallest);
    System.out.println("Sum: " + sum);

    // Close the scanner
    scnr.close();
  }
}
