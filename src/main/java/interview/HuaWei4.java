package interview;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 * @author Aries
 * @date 2021/5/9 16:46
 */
public class HuaWei4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Vector<Integer>> ma = new Vector<>();
        Vector<Vector<Integer>> dis = new Vector<>();
        Vector<Vector<Integer>> sw = new Vector<>();
        TreeMap<Integer, Integer> mom = new TreeMap<>();
        TreeMap<Integer, Integer> bob = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Vector<Integer> tt = new Vector<>();
            Vector<Integer> tt2 = new Vector<>();
            Vector<Integer> tt3 = new Vector<>();
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == -3) mom.put(i, j);
                if (temp == -2) bob.put(i, j);
                tt.add(temp);
                tt2.add(99999999);
                tt3.add(-1);
            }
            ma.add(tt);
            dis.add(tt2);
            sw.add(tt3);
        }
    }
}
