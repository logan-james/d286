
import java.util.Scanner;

public class q2 {
  public static void main(String[] args) {
    // Create a Scanner object for input
    Scanner scanner = new Scanner(System.in);

    // Read the starting number and multiplier from the user
    System.out.print("Starting Number: ");
    int startingNum = scanner.nextInt();
    System.out.print("Multiplier: ");
    int multiplier = scanner.nextInt();

    // Initialize the result with the starting number
    int result = startingNum;

    // Initialize an empty string to store the output
    String output = "";

    // Loop to perform the multiplication three times
    for (int i = 0; i < 3; i++) {
      result *= multiplier; // Multiply result by multiplier
      if (i < 2) {
        // Append the result to the output string followed by a space
        output += result + " ";
      } else {
        // Append the result to the output string without a trailing space
        output += result;
      }
    }

    // Print the final output
    System.out.println(output);
  }
}
