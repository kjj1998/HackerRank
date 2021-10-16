package easy;

public class Staircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        int spaces = n - 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < spaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
            spaces--;
        }
    }
}
