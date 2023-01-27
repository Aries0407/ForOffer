package LeetCode.WeeklyCompetition;

/**
 * @author Aries
 * @date 2021/7/25 10:58
 */
public class WC5824 {
    public String maximumNumber(String num, int[] change) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        int sub = Integer.MAX_VALUE;
        for (int i = 0; i < num.length(); i++) {
            int tmp = num.charAt(i)-'0';
            if (tmp < change[tmp] && count == 0){
                res.append(change[tmp]);
                sub = i - count;
                count++;
                continue;
            }
            if (tmp <= change[tmp] && sub == i-count){
                res.append(change[tmp]);
                count++;
                continue;
            }
            res.append(tmp);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        WC5824 wc5824 = new WC5824();
        String num = "214010";
        int []change = {6,7,9,7,4,0,3,4,4,7};
        System.out.println(wc5824.maximumNumber(num,change));
    }
}
