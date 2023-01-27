package LeetCode.WeeklyCompetition;

/**
 * @author Aries
 * @date 2021/7/25 10:45
 */
public class WC5823 {

    public int getLucky(String s, int k) {
        String sb = "";
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'a' + 1;
            sb += tmp;
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < sb.length(); j++) {
                result += sb.charAt(j) - '0';
            }
            sb = result + "";
            result = 0;
        }
        return Integer.parseInt(sb);
    }

    public static void main(String[] args) {

        WC5823 wc5823 = new WC5823();
        System.out.println(wc5823.getLucky("iiii",1));

    }
}
