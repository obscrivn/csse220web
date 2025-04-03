package mapsAndArrays2DTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mapsAndArrays2D.MapAnd2DArrayProblems;


public class TestSumBorderElements {

// JUnit tests for sumBorderElements
	
	@Test
    public void testSumBorderElementsNormalCase() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertEquals(40, MapAnd2DArrayProblems.sumBorderElements(array));
    }
	
	@Test
    public void testSumBorderElementsSingleRow() {
        int[][] array = {{1, 2, 3, 4}};
        assertEquals(10, MapAnd2DArrayProblems.sumBorderElements(array));
    }
	
	@Test
    public void testSumBorderElementsSingleColumn() {
        int[][] array = {
            {1},
            {2},
            {3}
        };
        assertEquals(6, MapAnd2DArrayProblems.sumBorderElements(array));
    }
	
	@Test
    public void testSumBorderElementsSingleElement() {
        int[][] array = {{42}};
        assertEquals(42, MapAnd2DArrayProblems.sumBorderElements(array));
    }
	
	 @Test
	    public void testSumBorderElementsEmptyArray() {
	        int[][] array = {};
	        assertEquals(0, MapAnd2DArrayProblems.sumBorderElements(array));
	    }


}
