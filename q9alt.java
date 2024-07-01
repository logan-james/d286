import java.util.Scanner;
import java.util.Random;

public class q9alt {
  /* Define your method here */

  public static boolean showResults(Random rand) {
    return rand.nextInt(2) == 1;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random(2); // Seed used in develop mode
    /* Type your code here. */

    int count = scnr.nextInt();

    for (int i = 0; i < count; i++) {
      System.out.println(showResults(rand));
    }

  }
}
