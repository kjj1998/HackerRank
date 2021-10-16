package easy;

import java.util.List;

public class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        for (int elem : arr) {
            if (elem > 0) {
                positive += 1;
            } else if (elem < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }

        System.out.printf("%.6f\n", positive / arr.size());
        System.out.printf("%.6f\n", negative / arr.size());
        System.out.printf("%.6f\n", zero / arr.size());
    }
}
