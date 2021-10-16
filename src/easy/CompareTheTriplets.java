package easy;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> ranking = new ArrayList<Integer>();
        ranking.add(0);
        ranking.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                ranking.set(0, ranking.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                ranking.set(1, ranking.get(1) + 1);
            }
        }

        return ranking;
    }
}
