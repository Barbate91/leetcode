package leetcode75.tests;

import leetcode75.problem1768;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem1768Test {

	@Test
	void mergeAlternately() {
		assertTrue(problem1768.mergeAlternately("ABC", "123").equals("A1B2C3"));
		assertTrue(problem1768.mergeAlternately("ab","pqrs").equals("apbqrs"));
		assertTrue(problem1768.mergeAlternately("abcd","pq").equals("apbqcd"));
	}
}