package leetcode75.tests;

import org.junit.jupiter.api.Test;
import leetcode75.problem1071;

import static org.junit.jupiter.api.Assertions.*;

class problem1071Test {

	@Test
	void gcdOfStrings() {
		assertTrue(problem1071.gcdOfStrings("ABCABC", "ABC").equals("ABC"));
		assertTrue(problem1071.gcdOfStrings("ABABAB","ABAB").equals("AB"));
		assertTrue(problem1071.gcdOfStrings("LEET","CODE").equals(""));
	}
}