package leetcode75;

public class problem1071 {

    public static String gcdOfStrings(String str1, String str2) {
        // Original solution is SLOW -> O(n^2*m^2)

		// Instead of iterating and removing prefix
		// We can check if str1+str2 == str2+str1, if they are equal we know there's a repeating prefix shared
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0,gcd);
    }

    private static int gcd(int lenA, int lenB) {
        // Call gcd until we have exhausted the shortest word
        // Check the remainder of the two words to determine the length of the denominator
        // ABC, ABCABC
        // gcd(3,6) -> gcd(6,3) -> gcd(3,0) -> return 3
        // ABABABAB, ABABAB
        // gcd(8,6) -> gcd(6,2) -> gcd(2,0) -> return 2
        return (lenB == 0) ? lenA : gcd(lenB, lenA % lenB);
    }
}