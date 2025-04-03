package mapsAndArrays2D;

import java.util.ArrayList;
import java.util.HashMap;

public class MapAnd2DArrayProblems {

	/**
	 * Find a treasure based on the map location in the game Treasure Hunt. You are passed a map that includes treasures' names with their corresponding map location.
	 * <br><br>
	 * Example: An entry in the map could be "Gold Coin" indicating the treasure and "A4" indicating the map location where the Gold Coin is hidden. 
	 * <br><br>
	 * If a treasure is found at the given map location, you will remove the treasure from the map and return the treasure name and its location.
	 * Example, if a map location at "A4" uncovers the "Gold Coin" treasure, the method should return "Found Gold Coin at A4".
	 * <br>
	 * If the map does not uncover any treasure, the method returns: "No treasure found".
	 * Note: This method updates the treasure map by removing the discovered treasure.
	 * @param treasureMap map of each treasure and the grid location where it is hidden
	 * @param dig String representing the map location for digging
	 * @return String containing the result of the digging
	 */
	
	public static String findTreasure(HashMap<String, String> treasureMap, String dig) {
		// TODO: Implement findTreasure method
		throw new UnsupportedOperationException("findTreasure has not yet been implemented.");
	}
	

	/**
	 * You are given a 2D array of integers. Write a method to calculate and return the sum of all the elements on the border of the array. 
	 * If the input array is empty or null, your method should return 0.
	 * Example 1:
	 * <pre>[[1, 2, 3],
 	 * [4, 5, 6],
 	 * [7, 8, 9]]</pre>
     * The sum of border elements is 40 because 1+2+3+6+9+8+7+4 = 40.
     * <br> <br>
     * Example 2: [[1]] The sum of border elements is 1.  
	 * <br><br>
	 * @param array a 2D int array   
	 * @return int 
	 */
	
	public static int sumBorderElements(int[][] array) {
		// TODO: Implement sumBorderElements method
		throw new UnsupportedOperationException("sumBorderElements has not yet been implemented.");
	}
	
	/**
	 * In a library system, books are categorized by genres (e.g., Fiction, Non-Fiction) and sub-genres (e.g., Mystery, Biography).
	 * This method retrieves a list of book titles associated with a specified genre or subgenre 
	 * <br><br>
	 * This method searches through two HashMaps: one mapping book titles to their genres and another mapping
	 * book titles to their subgenres. It compiles a list of books that are categorized under the specified genre
	 * or subgenre. The list does not contain duplicate titles. If no books match the specified genre or subgenre an empty list is returned.
	 * <br><br>
	 * Note: Each book title is added to the list only once, even if it can appear both under
	 * the specified genre and subgenre.
	 * <br><br>
	 * @param genreMap A HashMap where each key is a book title and the value is the genre of that book
	 * @param subgenreMap A HashMap where each key is a book title, and the value is the subgenre
     * @param search A String representing a search term for genre or subgenre
     * @return An ArrayList of Strings containing the titles of all books that are categorized under the specified genre or subgenre. 
	 */
	
	public static ArrayList<String> getBooksByGenre(HashMap<String, String> genreMap, HashMap<String, String> subgenreMap, String search){
		// TODO: Implement getBooksByGenre method
		throw new UnsupportedOperationException("getBooksByGenre has not yet been implemented.");
	}	
	
}
