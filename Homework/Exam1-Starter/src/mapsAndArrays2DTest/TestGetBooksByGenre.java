package mapsAndArrays2DTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import mapsAndArrays2D.MapAnd2DArrayProblems;

public class TestGetBooksByGenre {

	private HashMap<String, String> genreMap;
    private HashMap<String, String> subgenreMap;

    @Before
    public void setUp() {
        genreMap = new HashMap<>();
        subgenreMap = new HashMap<>();

        genreMap.put("Book1", "Fantasy");
        subgenreMap.put("Book2", "Science Fiction");
        genreMap.put("Book3", "High Fantasy");
        subgenreMap.put("Book2", "Cyberpunk");
    }
    
    @Test
    public void testGetBooksByGenre() {
        ArrayList<String> result = MapAnd2DArrayProblems.getBooksByGenre(genreMap, subgenreMap, "Fantasy");
        assertEquals(1, result.size());
        assertTrue(result.contains("Book1"));
    }
    
    @Test
    public void testGetBooksBySubGenre() {
        ArrayList<String> result = MapAnd2DArrayProblems.getBooksByGenre(genreMap, subgenreMap, "Cyberpunk");
        assertEquals(1, result.size());
        assertTrue(result.contains("Book2"));
    }
    
    @Test
    public void testGetBooksByNonExistingGenre() {
        ArrayList<String> result = MapAnd2DArrayProblems.getBooksByGenre(genreMap, subgenreMap, "Mystery");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetBooksByGenreWithDuplicates() {
        genreMap.put("Book4", "Fantasy");
        subgenreMap.put("Book4", "High Fantasy");
        ArrayList<String> result = MapAnd2DArrayProblems.getBooksByGenre(genreMap, subgenreMap, "Fantasy");
        assertEquals(2, result.size());
        assertTrue(result.contains("Book1"));
        assertTrue(result.contains("Book4"));
    }

}
