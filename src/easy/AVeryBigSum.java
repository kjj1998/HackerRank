package easy;

import java.util.List;

public class AVeryBigSum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;

        for (long elem : ar) {
            result += elem;
        }

        return result;
    }
}
