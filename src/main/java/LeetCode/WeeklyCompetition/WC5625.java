package LeetCode.WeeklyCompetition;

public class WC5625 {
    public static int numberOfMatches(int n) {
        int ret = 0;
        int pair = 0;
        while (n > 1) {
            pair = (int) Math.floor(n / 2.0);
            n = (int) Math.ceil(n / 2.0);
            ret += pair;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(WC5625.numberOfMatches(14));
    }
}
