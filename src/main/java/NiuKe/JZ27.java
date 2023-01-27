package NiuKe;

import java.util.*;

public class JZ27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, list);
            Collections.sort(list);
        }
        return list;
    }

    public void PermutationHelper(char[] c, int current, ArrayList<String> list) {
        if (c.length - 1 == current) {
            String val = String.valueOf(c);
            if (!list.contains(val)) {
                list.add(val);
            }
        } else {
            for (int i = current; i < c.length; i++) {
                swap(c, i, current);
                PermutationHelper(c, current + 1, list);
                swap(c, i, current);
            }
        }
    }

    public void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    //动态规划
    public static void main(String[] args) {
        JZ27 jz27 = new JZ27();
        System.out.println(jz27.Permutation("abc"));
    }
}
