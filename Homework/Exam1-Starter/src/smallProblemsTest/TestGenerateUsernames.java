package smallProblemsTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import smallProblems.SmallProblems;

public class TestGenerateUsernames {

	@Test
    public void testGenerateUsernamesWithMatchingLength() {
        String[] names = {"John", "Jane"};
        String[] numbers = {"123", "456"};
        int usernameLength = 7;
        ArrayList<String> result = SmallProblems.generateUsernames(names, numbers, usernameLength);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("John123", "John456", "Jane123",  "Jane456"));

        assertEquals(result.size(), expected.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    public void testGenerateUsernamesWithNonMatchingLength() {
        String[] names = {"Tom", "Sara"};
        String[] numbers = {"7890", "12345"};
        int usernameLength = 10;

        ArrayList<String> result = SmallProblems.generateUsernames(names, numbers, usernameLength);
        
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateUsernamesEmptyArrays() {
        String[] names = {};
        String[] numbers = {};
        int usernameLength = 5;
        ArrayList<String> result = SmallProblems.generateUsernames(names, numbers, usernameLength);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateUsernamesWithExactLength() {
        String[] names = {"Amy"};
        String[] numbers = {"12", "345"};
        int usernameLength = 5;
        
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Amy12"));
        ArrayList<String> result = SmallProblems.generateUsernames(names, numbers, usernameLength);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

}
