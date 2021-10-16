package easy;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int tallest = 0;
        int count = 0;

        for (Integer elem : candles) {
            if (elem > tallest) {
                tallest = elem;
            }
        }

        for (Integer elem : candles) {
            if (elem == tallest) {
                count++;
            }
        }

        return count;
    }
}
