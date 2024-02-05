
public class problem605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // O(N)
        // Attempts: 4
        int flowersLeftToPlant = n;
        int[] flowerbedCopy = flowerbed;

        for (int i = 0; i < flowerbedCopy.length; i++) {
            if (flowerbedCopy[i] == 0 &&
                    (i == 0 || flowerbedCopy[i-1] == 0) &&
                    (i == flowerbedCopy.length-1 || flowerbedCopy[i+1] == 0)) {
                flowerbedCopy[i] = 1;
                flowersLeftToPlant--;
            }

            if (flowersLeftToPlant == 0)
                break;
        }

        return flowersLeftToPlant <= 0;
    }
}