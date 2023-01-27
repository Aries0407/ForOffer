package interview;


import java.util.HashSet;

public class DiDi2 {
    /*
    数字去重
     */

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] num = {3, 8, 1, 2, 2, 3, 3, 3, 0, 9, 65535, 65536};
        for (int n : num)
            set.add(n);
        System.out.println(set);

        System.out.println(Math.pow(2, 16));
    }
}
