import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    /* Type your code here. */

    // Read the full name from the user
    String fullName = scnr.nextLine();

    // Split the name into parts
    String[] nameParts = fullName.split(" ");

    // Extract the first name
    String firstName = nameParts[0];

    // Extract the last name initial
    // substring(0,1) is used to get the first letter
    String lastInitial = nameParts[nameParts.length - 1].substring(0, 1) + ".";

    // Check if there's a middle name
    // if theres three elements get the second or first index and extract the first
    // letter
    String middleInitial = "";
    if (nameParts.length == 3) {
      middleInitial = " " + nameParts[1].substring(0, 1) + ".";
    }

    // Output the formatted name
    System.out.println(lastInitial + ", " + firstName + middleInitial);

    // Close the scanner
    scnr.close();
  }
}
