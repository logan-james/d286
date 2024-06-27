import java.util.Scanner;

public class q5 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    /* Type your code here. */

    // Read the three digits from the user
    int digit1 = scnr.nextInt();
    int digit2 = scnr.nextInt();
    int digit3 = scnr.nextInt();

    // Check if any input is negative
    if (digit1 < 0 || digit2 < 0 || digit3 < 0) {
      System.out.println("Invalid input!");
    } else {
      // Calculate the sum of the digits
      int sum = digit1 + digit2 + digit3;

      // Construct the three-digit number
      String number = "" + digit1 + digit2 + digit3;

      // Determine if the sum is divisible by 3
      if (sum % 3 == 0) {
        System.out.println(number + " is divisible by 3!");
      } else {
        System.out.println(number + " is not divisible by 3!");
      }
    }

    // Close the scanner
    scnr.close();
  }
}
