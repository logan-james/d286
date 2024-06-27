
import java.util.Scanner;

public class q3 {
  public static void main(String[] args) {
    // Create a Scanner object for input
    Scanner scnr = new Scanner(System.in);

    // Read the number of guests from the user
    int guests = scnr.nextInt();

    // Each table can seat 10 guests
    int tableSize = 10;

    // Calculate the number of full tables
    // Since int type 349 guest size / 10 will only be 34, no float
    int tablesFilled = guests / tableSize;

    // Output the number of tables filled
    System.out.println("Tables filled: " + tablesFilled);
  }
}
