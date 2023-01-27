package LeetCode.WeeklyCompetition;

/**
 * @author Aries
 * @date 2021/2/21 11:11
 */
public class WC5685 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < len1 && j < len2) {
            if (i == j) {
                sb.append(c1[i]);
                i++;
            } else {
                sb.append(c2[j]);
                j++;
            }
        }

        while (i < len1) {
            sb.append(c1[i]);
            i++;
        }
        while (j < len2) {
            sb.append(c2[j]);
            j++;
        }
        return sb.toString();
    }
}
