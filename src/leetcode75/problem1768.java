package leetcode75;

public class problem1768 {
	public String mergeAlternately(String word1, String word2) {
		StringBuilder mergedString = new StringBuilder();
		int boundary = Math.min(word1.length(), word2.length());

		for (int i=0; i < boundary; i++) {
			mergedString.append(word1.charAt(i));
			mergedString.append(word2.charAt(i));
		}

		String remainder = (boundary == word2.length()) ? word1.substring(boundary) : word2.substring(boundary);
		mergedString.append(remainder);

		return mergedString.toString();
	}
}
