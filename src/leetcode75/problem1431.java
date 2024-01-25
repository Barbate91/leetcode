public class problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // O(2N) -> O(N)
        // Attempts: 1

        List<Boolean> result = new ArrayList<Boolean>();
        int greatest = candies[0];

        for (int i=1; i<candies.length; i++) {
            if (candies[i] > greatest)
                greatest = candies[i];
        }

        for (int i=0; i<candies.length; i++) {
            if (candies[i]+extraCandies >= greatest)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}