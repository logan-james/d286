import java.util.Scanner;
import java.util.Random;

public class q9 {
  /* Define your method here */

  /*
   * showResults method with one parameter
   * reference a random object 'rand'
   * if random number generated is equal to 1 return 'true'
   * if random number is equal to 0 return 'false'
   */
  public static boolean showResults(Random rand) {
    // rand is name of parameter that receives a random object
    // 2 is the bound or limit, meaning either 0 or 1 not including 2
    int randomNumber = rand.nextInt(2);
    // true or false if random number is 1 or not
    return randomNumber == 1;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    // rand is name of Random Object we're creating
    // 2 in the parameter is the 'seed' or starting internal state
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

/*
 * This exercise we're creating a method that returns true or false
 * with a random number which is either 0 or 1.
 * 
 * In the main() we accept input via scanner to create a limit for
 * how many times we want our for loop to run for. The loop uses
 * the method which we created to return true or false if the number is
 * 0 or 1, loop x amount of times based on input, each loop prints out result.
 */