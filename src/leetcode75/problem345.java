
import java.util.LinkedHashMap;

public class problem345 {
    public static String reverseVowels(String s) {
        // If character is a vowel save the vowel and position
        // On 2nd pass replace vowels in reverse order
        // O(n log n) time complexity
        // Attempts: 2

        StringBuilder sb = new StringBuilder(s);
        LinkedHashMap<Integer,Character> vowelPositions = new LinkedHashMap<>();

        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if (isVowel(String.valueOf(c)))
                vowelPositions.put(i,c);
        }

        Object[] positionArray = vowelPositions.keySet().toArray();
        Integer startOfPos = 0;
        for (int i=positionArray.length-1; i>=0; i--) {
            Integer replaceKey = (Integer) positionArray[i];
            Character swappedVowel = vowelPositions.get(replaceKey);
            Integer initialKey = (Integer) positionArray[startOfPos];
            sb.setCharAt(initialKey,swappedVowel);
            startOfPos++;
        }

        return sb.toString();
    }

    private static boolean isVowel(String c) {
        String l = c.toLowerCase();
        return l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u");
    }
}