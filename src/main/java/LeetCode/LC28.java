package LeetCode;

/**
 * @author Aries
 * @date 2021/4/20 9:14
 */
public class LC28 {
    public int strStr(String haystack, String needle) {
        char[] hc = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        int i = 0;
        int j = 0;
        int start = 0;
        if (nc.length > hc.length) return -1;
        if (nc.length == 0) return 0;
        while (i + nc.length <= hc.length) {
            if (hc[i] == nc[j]) {
                start = i;
                while (j < nc.length && i < hc.length && hc[i] == nc[j]) {
                    i++;
                    j++;
                }
                if (j == nc.length) {
                    return start;
                }
            }
            if (hc[i] != nc[j]) {
                start = -1;
                j = 0;
                i++;
            }
        }
        return start;
    }

}
