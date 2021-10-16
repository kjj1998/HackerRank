package easy;

import java.util.List;

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int lastIndex = arr.size() - 1;

        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonalSum += arr.get(i).get(i);
        }

        for (List<Integer> integers : arr) {
            secondaryDiagonalSum += integers.get(lastIndex);
            lastIndex--;
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
