package smallProblems;

import java.util.ArrayList;

public class SmallProblems {
	
	/**
	 * In this problem, you will determine whether the magic garden achieved its full magical power.
	 * <br><br>
	 * A magical garden is considered to be in full magic power if it contains at least one "Magic Flower",
	 * has no "Weeds", and the total number of plants (flowers and weeds combined) is an odd number greater than 3.
	 * This method checks an array of plant names representing the garden's current state to determine if these
	 * conditions are met.
	 * <br><br>
	 * Example 1:
	 * A garden of ["Magic Flower", "Sunflower", "Daisy", "Rose", "Lily"] should return true because it contains at least one "Magic Flower", has an odd number of plants greater than 3, and contains no "Weeds".
	 * <br><br>
	 * Example 2:
	 * A garden of ["Sunflower", "Daisy", "Weeds", "Rose", "Lily"] should return false because it contains "Weeds".
	 * <br><br>
	 * Example 3:
	 * A garden of ["Magic Flower", "Daisy"] should return false because the total number of plants is not greater than 3.
	 * <br><br>
	 * @param gardenState An array of Strings where each element represents the name of a plant in the garden
	 * @return true if the garden meets the specifications
	 */	
	public static boolean isGardenInFullMagic(String[] gardenState) {
		// TODO: Implement isGardenInFullMagic method
		throw new UnsupportedOperationException("isGardenInFullMagic has not yet been implemented.");
	}
	
	
	/**
	 * In this problem, you will generates a list of usernames by concatenating elements from two arrays. The first array containing names and the second contains numbers.
	 * A valid username must match the specified length.
	 * <br><br>
	 * Example 1:
	 * The combination of names ["John", "Jane"] and numbers ["123", "45"] with the length of 7
	 * should return the list: ["John123", "Jane123"].
	 * <br><br>
	 * Example 2:
	 * The combination of names ["hope", "han"] and numbers ["123", "45"] with the length of 8 should
	 * should return an empty list.
	 * <br><br>
	 * Note: The method does not check for duplicate entries in the input arrays.
	 * <br><br>
	 * @param names An array of Strings representing names
	 * @param numbers An array of Strings representing numbers
	 * @param usernameLength The target length to generate usernames
	 * @return An ArrayList <Strings> containing all possible usernames that meet the required specifications. Order does not matter.
	 */
	
	public static ArrayList<String> generateUsernames(String[] names, String[] numbers, int usernameLength) {
		// TODO: Implement generateUsernames method
		throw new UnsupportedOperationException("generateUsernames has not yet been implemented.");	
	}
	
	/**
	 * In this problem, you will generate a single string from an array of strings using 
	 * a "snake" style. In this style, the format of Word1 Word2 Word3 becomes word1_word2_word3, with the following rules:
	 * 1) All letters are lower case. 2) Words are concatenated with "_" (underscore). 3) Non-letters (symbols, numbers, punctuation, etc.) are unaffected.
	 * 4) Empty strings are ignored.   
	 * <br><br>
	 * Example 1: The array of ["MAKE", "This", "snake", "case"] will return "make_this_snake_case".
	 * <br><br>
	 * Example 2: The array of ["snake", "a", "", "bB", "0"] will return "snake_a_b8_0".
	 * <br><br>
	 * @param input An array of Strings representing words
	 * @return String in a Snake Case format
	 */
	
	public static String generateSnakeCase(String[] input) {
		// TODO: Implement generateCamelCase method
		throw new UnsupportedOperationException("generateSnakeCase has not yet been implemented.");		
	}
	
}
