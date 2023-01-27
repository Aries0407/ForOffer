package LeetCode.SwordToOffer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aries
 * @date 2021/9/4 16:24
 */
public class JZ015 {


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        int[] scount = new int[128];
        int[] pcount = new int[128];
        for (char c : pp) {
            pcount[c]++;
        }

        int left = 0;
        int right = 0;
        int yes = 0;
        while (right < ss.length) {
            if (scount[ss[right]] < pcount[ss[right]]) {
                scount[ss[right]]++;
                yes++;
            } else {
                if (yes == pp.length) {
                    list.add(left);
                    scount[ss[left]]--;
                    yes--;
                    left++;
                    continue;
                } else if (scount[ss[right]] >= pcount[ss[right]]) {
                    if (pcount[ss[right]] == 0) {
                        Arrays.fill(scount, 0);
                        yes = 0;
                        left = right + 1;
                        right++;
                        continue;
                    }

                    while (ss[left] != ss[right]) {
                        scount[ss[left]]--;
                        yes--;
                        left++;
                    }
                    left++;
                }
            }
            right++;
        }
        if (yes == pp.length) list.add(left);
        return list;
    }

    public static void main(String[] args) {

        JZ015 jz015 = new JZ015();
        System.out.println(jz015.findAnagrams("abab", "ab"));

    }
}
