package window;

/**
 * Lab02.java
 * 
 * This lab introduces you to basic operations on arrays
 * 
 * Objectives:
 * - Practice looping over arrays to compute sums, find maximum values, and reverse arrays.
 * - Work with ArrayLists by concatenating elements into a single string.
 * - Familiarize yourself with common Java data structures and methods.
 * 
 * Instructions:
 * 1. Download this file and import it into your Eclipse project under the src folder.
 * 2. Read through the code and follow the detailed Javadoc comments.
 * 3. Complete the methods marked with TODO by writing your own implementation.
 * 4. Test your implementations by running the main method.
 * 5. Submit your completed Lab02.java file according to the course guidelines.
 * 
 * happy coding!
 * 
 * Modified for CSSE220 by: [Your Name]
 */
public class Lab02 {

    /**
     * The main method tests the various array and ArrayList operations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test Problem 1: Sum of an array
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Sum of arr1: " + sumArray(arr1)); // Expected output: 15

        // Test Problem 2: Maximum value in an array
        int[] arr2 = {7, 2, 9, 4, 1};
        System.out.println("Max of arr2: " + maxArray(arr2)); // Expected output: 9

        // Test Problem 3: Reverse an array
        int[] arr3 = {10, 20, 30, 40};
        int[] reversed = reverseArray(arr3);
        System.out.print("Reversed arr3: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println(); // Expected output: 40 30 20 10

        // Test Problem 4: Count occurrences of a value in an array
        int[] arr4 = {1, 2, 3, 2, 4, 2, 5};
        System.out.println("Occurrences of 2 in arr4: " + countOccurrences(arr4, 2)); // Expected output: 3
    }

    /**
     * Returns the sum of all integers in the given array.
     *
     * @param arr an array of integers
     * @return the sum of the integers in the array
     */
    public static int sumArray(int[] arr) {
        // TODO: Implement this method using a loop.
        return 0;
    }

    /**
     * Returns the maximum value found in the given array of integers.
     *
     * @param arr an array of integers
     * @return the maximum integer value in the array
     */
    public static int maxArray(int[] arr) {
        // TODO: Implement this method using a loop.
        return 0;
    }

    /**
     * Returns a new array that is the reverse of the input array.
     *
     * @param arr the array to be reversed
     * @return a new array containing the elements of arr in reverse order
     */
    public static int[] reverseArray(int[] arr) {
        // TODO: Implement this method.
        return null;
    }

    /**
     * Returns the number of times the specified value appears in the array.
     *
     * @param arr an array of integers
     * @param value the integer value to count
     * @return the count of occurrences of value in the array
     */
    public static int countOccurrences(int[] arr, int value) {
        // TODO: Implement this method.
        return 0;
    }
}
