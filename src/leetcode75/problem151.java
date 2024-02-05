
import java.util.ArrayList;
import java.util.List;

public class problem151 {
	public String reverseWords(String s) {
		// Compile individual words
		// in reverse order create new string with all words
		// O(2n) -> O(n)
		// Attempts: 1
		List<String> words = new ArrayList<>();
		StringBuilder word = new StringBuilder();
		StringBuilder reversed = new StringBuilder();

		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				word.append(c);

				if (i == s.length()-1) {
					words.add(word.toString());
					word.setLength(0);
				}
			} else {
				if (word.length() != 0) {
					words.add(word.toString());
					word.setLength(0);
				}
			}
		}

		for (int i=words.size()-1; i>=0; i--) {
			String w = words.get(i);
			reversed.append(w + ' ');
		}
		return reversed.toString().trim();
	}
}
