package easy;

public class TimeConversion {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        String[] components = s.split(":", 0);
        String hour = components[0];
        String min = components[1];
        String sec = components[2].substring(0, 2);
        String format = components[2].substring(2, 4);


        System.out.println(format);
        if (format.equals("AM")) {
            if (hour.equals("12")) {
                return "00:" + min + ":" + sec;
            } else {
                return hour + ":" + min + ":" + sec;
            }
        } else {
            if (!hour.equals("12")) {
                hour = Integer.toString(Integer.parseInt(hour) + 12);
            }
            return hour + ":" + min + ":" + sec;
        }
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22AM"));
    }
}
