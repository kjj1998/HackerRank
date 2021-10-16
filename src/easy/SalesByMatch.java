package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        HashMap<Integer, Integer> map = new HashMap<>();
        int totalPairs = 0;

        for (Integer i : ar) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            totalPairs += entry.getValue() / 2;
        }

        return totalPairs;
    }

    public static void main(String[] args) {

        int n = 7;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);

        System.out.println(sockMerchant(n, ar));

    }

}
