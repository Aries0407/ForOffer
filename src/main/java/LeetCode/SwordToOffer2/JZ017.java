package LeetCode.SwordToOffer2;

/**
 * @author Aries
 * @date 2021/9/5 10:51
 */
public class JZ017 {
    public String minWindow(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] scount = new int[128];
        int[] tcount = new int[128];
        for (char c : tt) {
            tcount[c]++;
        }
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = -1;
        String ret = "";
        int yes = 0;
        while (right < s.length()) {
            right++;
            if (yes < t.length() && right < s.length()) {
                scount[ss[right]]++;
                if (scount[ss[right]] <= tcount[ss[right]]) {
                    yes++;
                }
            }
            if (yes == t.length()) {
                while (left <= right) {
                    if (scount[ss[left]] == tcount[ss[left]] && tcount[ss[left]] > 0) {
                        if (minLen > right - left + 1) {
                            ret = "";
                            minLen = right - left + 1;
                            for (int i = left; i <= right; i++) {
                                ret += ss[i];
                            }
                        }
                        scount[ss[left]]--;
                        left++;
                        yes--;
                        break;
                    }
                    scount[ss[left]]--;
                    left++;
                }
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        JZ017 jz017 = new JZ017();
        System.out.println(jz017.minWindow("A", "A"));
    }
}
