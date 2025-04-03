package mapsAndArrays2DTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import mapsAndArrays2D.MapAnd2DArrayProblems;

public class TestFindTreasure {

	// JUnit tests for findTreasure
		private HashMap<String, String> treasureMap;

		@Before
		public void setUp() {
			treasureMap = new HashMap<>();
	        treasureMap.put("Gold Coin", "A1");
	        treasureMap.put("Silver Ring", "C3");	 
			
		}
	
		@Test
	    public void testFindTreasureFound() {
			String result = MapAnd2DArrayProblems.findTreasure(treasureMap, "A1");
	        assertEquals("Found Gold Coin at A1", result);
	        assertFalse(treasureMap.containsKey("Gold Coin"));
		}
		
		@Test
		public void testFindTreasureNotFound() {
			String result = MapAnd2DArrayProblems.findTreasure(treasureMap, "B2");
	        assertEquals("No treasure found", result);
	        assertTrue(treasureMap.containsKey("Gold Coin"));
	        assertTrue(treasureMap.containsKey("Silver Ring"));
		}
	        
		@Test
	    public void testFindTreasureRemoved() {
			MapAnd2DArrayProblems.findTreasure(treasureMap, "C3");
	        assertFalse(treasureMap.containsKey("Silver Ring"));
	    }

}
