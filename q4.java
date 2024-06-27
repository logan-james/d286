import java.util.Scanner;

public class q4 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    /* Type your code here. */

    // Read the full name from the user
    String name = scnr.nextLine();

    // Read the age from the user
    String age = scnr.nextLine();

    // Read the salary from the user
    String salary = scnr.nextLine();

    // Output the formatted message
    System.out.println(name + " is " + age + " and makes $" + salary + ".");

    // Close the scanner
    scnr.close();
  }
}