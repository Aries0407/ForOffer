package LeetCode.WeeklyCompetition;

public class WC5666 {
    public boolean checkPartitioning(String s) {
        if (s.length() == 3) return true;
        if (s.length() <= 2) return false;
        return false;
    }
}
