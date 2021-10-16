package easy;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long min = 9223372036854775807L;
        long max = -9223372036854775808L;
        long total = 0;

        for (Integer elem : arr) {
            total += elem;
        }

        for (Integer elem : arr) {
            if (total - elem < min) {
                min = total - elem;
            }

            if (total - elem > max) {
                max = total - elem;
            }
        }

        System.out.println(min + " " + max);

    }
}
