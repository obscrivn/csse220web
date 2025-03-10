package testing; // replace with your package name or remove if your package is default

/**
 * LoopProbs.java
 *
 * This lab contains exercises to practice using for loops.
 *
 * In this lab, you will:
 * - Implement a method to calculate the factorial of a number.
 * - Test the provided methods that use loops.
 *
 * Instructions:
 * 1. Read through the code and comments carefully.
 * 2. Complete the missing methods
 * 3. Test your implementation by running the main method.
 * 4. Add at least 2 tests for countXX method which is not provided in the main method.
 * 4. When finished, save your file and submit it according to the course instructions.
 *
 * To test your code in Eclipse:
 * - Download this file and import it into your Eclipse project under the src folder.
 * - Right-click on the file and select "Run As > Java Application".
 */
public class ForLoops {

    public static void main(String[] args) {
        // Test bunchOfOnes (provided)
        System.out.println("bunchOfOnes(3) returns: " + bunchOfOnes(3)); // Expected: 111
        System.out.println("bunchOfOnes(6) returns: " + bunchOfOnes(6)); // Expected: 111111
        
        // Test fact - complete this method!
        System.out.println("fact(3) should return 6: " + fact(3));    // Expected: 6
        System.out.println("fact(5) should return 120: " + fact(5));  // Expected: 120
        
        // Test countXX (TODO)

    }
    
    /**
     * Returns a number consisting of only 1s of the given length.
     * 
     * @param length the number of digits (1s) to generate; must be positive
     * @return a long value consisting of "1" repeated 'length' times
     * 
     * For example:
     *   - bunchOfOnes(3) returns 111
     *   - bunchOfOnes(6) returns 111111
     *   - bunchOfOnes(1) returns 1
     *
     * Assumes length is positive and the result fits in a long data type.
     */
    public static long bunchOfOnes(int length) {
    	// TODO Implement this method
    	// Temporary placeholder to avoid a compile error:
        return 0;
    }
    
    /**
     * Returns the factorial of the given number
     * 
     * @param num a positive integer whose factorial is to be calculated
     * @return the factorial of num
     * 
     * For example:
     *   - fact(3) should return 6 (3 * 2 * 1)
     *   - fact(5) should return 120 (5 * 4 * 3 * 2 * 1)
     *
     * Instructions:
     *   - Use a for loop to multiply the numbers from num down to 1.
     *   - Replace the temporary return statement with your implementation.
     */
    public static long fact(int num) {
        // TODO: Implement the factorial calculation using a for loop.
        // Hint: Initialize a variable (e.g., result) to 1, then multiply it by each integer from num down to 1.
        return 0; // Temporary return. Replace with your code.
    }
    
    /**
     * Returns the number of times the substring "xx" appears in the given string.
     * 
     * @param str the input string to search for "xx"
     * @return the count of "xx" occurrences in str
     * 
     * Overlapping occurrences are allowed (e.g., "xxx" contains 2 occurrences of "xx").
     * For example:
     *   - countXX("abcxx") returns 1
     *   - countXX("xxxx") returns 3
     *
     * This method is provided. You need to write a test
     */
    public static int countXX(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (index < str.length() - 1) {
            if (str.charAt(index) == 'x' && str.charAt(index + 1) == 'x') {
                ++count;
            }
            ++index;
        }
        return count;
    }
}

