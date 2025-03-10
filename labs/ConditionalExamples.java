package testing; // modify the name of your package. If you are using default package, comment this line out


/**
 * A class containing several functions for learning basic Java programming.
 *
 * In this exercise, you will:
 *  - Implement missing methods and test them from the main method.
 *  - Learn about basic arithmetic, conditionals, and method calls.
 *  - Follow naming conventions: Class names use PascalCase and method/variable names use camelCase.
 *
 * Instructions:
 *  1. Review the code below.
 *  2. Implement methods according to the instructions provided in the comments.
 *  3. Note - returms methods are placed as placeholders. You need to provide the correct return per instructions
 *
 * To test your code in Eclipse:
 *  - Create a new Java project and add this file to your src folder.
 *  - Right-click on the file and select "Run As > Java Application".
 *
 * Modified for clarity by OS, developed MH
 */
public class ConditionalExamples {

    public static void main(String[] args) {
        // Test computeAverage
        System.out.println("Average of 3, 4, 5 is " + computeAverage(3, 4, 5));
        System.out.println("Average of 3, 4, 6 is " + computeAverage(3, 4, 6));

        // Test printDivisibleBy3
        printDivisibleBy3(12); // Expected: "12 is divisible by 3"
        printDivisibleBy3(13); // Expected: "13 is NOT divisible by 3"

        // Test printCubed: Multiply the input number three times and print the result.
        printCubed(2); // Expected: "2 cubed is 8.0"
        
        // Test guessCubeRoot: Provide different guesses and see if the output is "Higher", "Lower", or "Perfect"
        guessCubeRoot(27, 2.5); // Expected output: "Higher"
        guessCubeRoot(27, 3.3); // Expected output: "Lower"
        guessCubeRoot(27, 3);   // Expected output: "Perfect"
        
        // Test isWayBigger: Should return true if the first parameter is at least 100 times the second.
        System.out.println("isWayBigger(500, 5) = " + isWayBigger(500, 5));  // Expected: true
        System.out.println("isWayBigger(500, 10) = " + isWayBigger(500, 10)); // Expected: false
        
        // Test isGreaterThan3: Should return true if at least one input value is greater than 3.
        System.out.println("isGreaterThan3(1, 2, 3) = " + isGreaterThan3(1, 2, 3));  // Expected: false
        System.out.println("isGreaterThan3(1, 4, 2) = " + isGreaterThan3(1, 4, 2));  // Expected: true
    }

    /**
     * Computes and returns the average of the three input numbers.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the average of a, b, and c
     */
    public static double computeAverage(double a, double b, double c) {
    	// TODO Implement this method
    	// Temporary placeholder to avoid a compile error:
        return 0;
    }

    /**
     * Computes and prints the cube of the provided number.
     *
     * Instructions:
     *  - Multiply the number by itself three times.
     *  - Print the result in the format: "[number] cubed is [result]".
     *
     * For example, if numberToCube is 2, the output should be "2 cubed is 8.0".
     *
     * @param numberToCube the number to be cubed
     */
    public static void printCubed(double numberToCube) {
    	// TODO Implement this method
    }

    /**
     * Checks if the input number is divisible by 3 and prints an appropriate message.
     *
     * If the number is divisible by 3, prints: "[number] is divisible by 3".
     * Otherwise, prints: "[number] is NOT divisible by 3".
     *
     * @param number the number to check for divisibility by 3
     */
    public static void printDivisibleBy3(int number) {
    	// TODO Implement this method
    }

    /**
     * Compares the cube of the guess with the original number and prints feedback.
     *
     * If the cube of the guess is greater than the number, prints "Lower".
     * If the cube of the guess is less than the number, prints "Higher".
     * If the cube of the guess equals the number, prints "Perfect".
     *
     * Examples:
     *  - guessCubeRoot(27, 2.5) should print "Higher"
     *  - guessCubeRoot(27, 3.3) should print "Lower"
     *  - guessCubeRoot(27, 3) should print "Perfect"
     *
     * @param number the number whose cube root is being guessed
     * @param guess  the guess for the cube root
     */
    public static void guessCubeRoot(double number, double guess) {
    	// TODO Implement this method
    }

    /**
     * Returns true if the first number is at least 100 times larger than the second.
     *
     * Precondition: The first number (bigger) is assumed to be greater than the second.
     *
     * @param bigger  the larger number
     * @param smaller the smaller number
     * @return true if bigger is at least 100 times the value of smaller; false otherwise
     */
    public static boolean isWayBigger(int bigger, int smaller) {
    	// TODO Implement this method
    	// Temporary placeholder to avoid a compile error:
        return false;
    }

    /**
     * Returns true if at least one of the three input values is greater than 3.
     *
     * Use the logical OR (||) operator to combine conditions.
     *
     * @param one   first value
     * @param two   second value
     * @param three third value
     * @return true if any of the inputs is greater than 3; false otherwise
     */
    public static boolean isGreaterThan3(int one, int two, int three) {
    	// TODO Implement this method
    	// Temporary placeholder to avoid a compile error:
        return false;
    }
}
