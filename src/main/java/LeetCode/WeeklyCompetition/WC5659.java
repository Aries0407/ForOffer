package LeetCode.WeeklyCompetition;

public class WC5659 {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                while (i + 1 < j - 1) {
                    if (s.charAt(i - 1) != s.charAt(j + 1)) {
                        return j - i + 1;
                    }
                }
            } else {
                break;
            }
        }
        return j - i + 1;
    }

}
