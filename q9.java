import java.util.Scanner;
import java.util.Random;

public class q9 {
  /* Define your method here */

  public static boolean showResults(Random rand) {
    int randomNumber = rand.nextInt(2);
    return randomNumber == 1;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random(2); // Seed used in develop mode
    /* Type your code here. */

    int num = scnr.nextInt();

    for (int i = 0; i < num; i++) {
      boolean result = showResults(rand);
      System.out.println(result);
    }

    scnr.close();

  }
}