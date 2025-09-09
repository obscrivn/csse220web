package lab03;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingBatPracticeTest {
    @Test
    public void testFizzArray3_NormalRange() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, CodingBatPractice.fizzArray3(5, 10));
    }

    @Test
    public void testFizzArray3_EmptyRange() {
        assertArrayEquals(new int[]{}, CodingBatPractice.fizzArray3(10, 10));
        assertArrayEquals(new int[]{}, CodingBatPractice.fizzArray3(10, 5));
    }

    @Test
    public void testFizzArray3_SingleElement() {
        assertArrayEquals(new int[]{3}, CodingBatPractice.fizzArray3(3, 4));
    }

    @Test
    public void testFizzArray3_NegativeStart() {
        assertArrayEquals(new int[]{-2, -1, 0, 1}, CodingBatPractice.fizzArray3(-2, 2));
    }
    
    @Test
    public void testFilterEvenNumbers_Mixed() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 7, 8, 10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 8, 10));
        assertEquals(expected, CodingBatPractice.filterEvenNumbers(input));
    }

    @Test
    public void testFilterEvenNumbers_AllEven() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 6));
        assertEquals(expected, CodingBatPractice.filterEvenNumbers(input));
    }

    @Test
    public void testFilterEvenNumbers_AllOdd() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, CodingBatPractice.filterEvenNumbers(input));
    }

    
}
