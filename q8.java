import java.util.Scanner;

public class q8 {
  public static void main(String[] args) {
    // Create a Scanner object for input
    Scanner scnr = new Scanner(System.in);

    // Create an array to hold three double values
    double[] values = new double[3];

    // Collect the three double values as input and store them in the array
    for (int i = 0; i < 3; i++) {
      values[i] = scnr.nextDouble();
    }

    // Calculate the sum of the array values
    double sum = 0.0;
    for (int i = 0; i < 3; i++) {
      sum += values[i];
    }

    // Calculate the average value of the array
    double average = sum / 3.0;

    // Output the array values
    System.out.print("Array items: ");
    for (int i = 0; i < 3; i++) {
      System.out.print(values[i]);
      if (i < 2) {
        System.out.print(", ");
      }
    }
    System.out.println();

    // Output the calculated average value
    System.out.println("Average: " + average);

    // Close the scanner
    scnr.close();
  }
}
