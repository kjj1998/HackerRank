package easy;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;

        for (int elem : ar) {
            sum += elem;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(10);
        arr.add(11);

        System.out.println(simpleArraySum(arr));
    }
}
