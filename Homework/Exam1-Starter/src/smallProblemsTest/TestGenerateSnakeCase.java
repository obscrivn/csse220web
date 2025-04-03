package smallProblemsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import smallProblems.SmallProblems;

public class TestGenerateSnakeCase {

	// JUnit tests for generateCamelCase
	
	@Test
	public void testGenerateSnakeCaseN01() {
		String[] input = {"MAKE", "This", "sNake", "case"};
		String expected = "make_this_snake_case";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testGenerateSnakeCaseN02() {
		String[] input = {"SNAKESNAKESNAKE"};
		String expected = "snakesnakesnake";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testGenerateSnakeCaseN03() {
		String[] input = {"A"};
		String expected = "a";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testGenerateSnakeCaseN04() {
		String[] input = {"snake", "a", "bB", "0"};
		String expected = "snake_a_bb_0";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testGenerateSnakeCaseN05() {
		String[] input = {"C", "a", "bB", "F#"};
		String expected = "c_a_bb_f#";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testGenerateSnakeCaseN06() {
		String[] input = {"!", "", "", "[]"};
		String expected = "!_[]";
		String result = SmallProblems.generateSnakeCase(input);
		assertEquals(expected, result);
	}


}
