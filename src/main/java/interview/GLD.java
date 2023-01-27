package interview;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Aries
 * @date 2021/4/21 19:45
 */
public class GLD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m % 2 == 1) {
                str[i] = "NO";
                continue;
            }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int j = 0; j < m; j++) {
                int temp = sc.nextInt();
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
            boolean flag = true;
            if (map.size() != 2 ) {
                str[i] = "NO";
                flag = false;
            } else {
                int i1 = map.firstKey();
                int i1v = map.get(i1);
                int i2 = map.lastKey();
                int i2v = map.get(i2);
                if (i1v != i2v) {
                    flag = false;
                }
            }
            if (flag) {
                str[i] = "YES";
            }
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}
