package LeetCode.WeeklyCompetition;

public class WC5661 {
    public String maximumTime(String time) {
        String s1 = time.substring(0, 2);
        char[] c1 = s1.toCharArray();
        String s2 = time.substring(3);
        char[] c2 = s2.toCharArray();

        if (s1.charAt(0) <= '1' && s1.charAt(1) == '?') {
            c1[1] = '9';
        } else if (s1.charAt(0) == '2' && s1.charAt(1) == '?') {
            c1[1] = '3';
        }
        if (s1.charAt(0) == '?' && s1.charAt(1) != '?') {
            if (s1.charAt(1) > '3') c1[0] = '1';
            else c1[0] = '2';
        }
        if (s1.charAt(0) == '?' && s1.charAt(1) == '?') {
            c1[0] = '2';
            c1[1] = '3';
        }

        if (s2.charAt(0) == '?' && s2.charAt(1) != '?') {
            c2[0] = '5';
        } else if (s2.charAt(0) != '?' && s2.charAt(1) == '?') {
            c2[1] = '9';
        }
        if (s2.charAt(0) == '?') {
            c2[0] = '5';
        }
        if (s2.charAt(1) == '?'){
            c2[1] = '9';
        }
        return c1[0] + "" + c1[1] + "" + ":" + c2[0] + "" + c2[1];
    }

    public static void main(String[] args) {
        WC5661 w = new WC5661();
        System.out.println(w.maximumTime("2?:?0"));
    }
}
