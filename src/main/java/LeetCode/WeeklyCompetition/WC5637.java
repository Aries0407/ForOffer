package LeetCode.WeeklyCompetition;

import java.util.HashSet;

public class WC5637 {
    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int s1c = 0;
        int s2c = 0;
        int i = 0;
        int j = s.length() / 2 ;
        while (i < s.length() / 2) {
            if (set.contains(s.charAt(i))) {
                s1c++;
            }
            if (set.contains(s.charAt(j))) {
                s2c++;
            }
            i++;
            j++;
        }
        return s1c == s2c;
    }

    public static void main(String[] args) {
        System.out.println(WC5637.halvesAreAlike("book"));
    }
}
