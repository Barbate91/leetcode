package leetcode75.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import leetcode75.problem151;

class problem151Test {

	@Test
	void reverseWords() {
		problem151 prob = new problem151();
		assertEquals("world hello", prob.reverseWords(" hello world "));
		assertEquals("example good a", prob.reverseWords("a good   example"));
		assertEquals("blue is sky the", prob.reverseWords("the sky is blue"));
	}
}