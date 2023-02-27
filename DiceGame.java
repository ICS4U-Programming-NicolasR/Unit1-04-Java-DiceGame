import java.util.Random;
import java.util.Scanner;
/**
* Creates a Dice game.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-27
*/

public final class DiceGame {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private DiceGame() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(final String[] args) {
        // Create the constants
        final Random rand = new Random();
        final int upperbound = 7;
        final int randomNum = rand.nextInt(upperbound);
        final int zero = 0;
        int userNum = 0;
        int counter = 0;
        // Created a scanner object
        final Scanner inputScan = new Scanner(System.in);
        do {
            try {
                // get the users number as an int
                System.out.printf("Please enter in a number for the %d"
                            + " time\n", counter + 1);
                userNum = inputScan.nextInt();
                // If statement to check how close it is
                if (userNum < zero || userNum > upperbound - 1) {
                    System.out.println("You have entered a number outside of"
                                    + " the bounds");
                } else if (userNum > randomNum) {
                    System.out.println("Your number is too high!");
                } else if (userNum < randomNum) {
                    System.out.println("Your number is too low");
                }
                // Increase the counter
                counter++;
            // catch the error
            } catch (NumberFormatException error) {
                System.out.println("You have entered a string "
                        + "You must enter a real number\n"
                        + error);
            }
        } while (userNum != randomNum);
        // output that they got it correct
        System.out.printf("You got the correct number! It took you %d tries."
                + " \n", counter);
        // close the scanner
        inputScan.close();
    }
}
