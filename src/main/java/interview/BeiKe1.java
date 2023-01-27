package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/8 19:55
 */
public class BeiKe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, int[]> stocks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int[] value = new int[2];
            value[0] = sc.nextInt();
            value[1] = sc.nextInt();
            stocks.put(name, value);
        }
        LinkedHashMap<String, Integer> orders = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            String name = sc.next();
            int value = sc.nextInt();
            orders.put(name, orders.getOrDefault(name,0) + value);
        }

        int index = 1;
        int profit = 0;
        for (String key : orders.keySet()) {
            if (stocks.get(key) == null){
                System.out.println(-index);
                return;
            }
            int[] value = stocks.get(key);
            if (value[1] < orders.get(key)) {
                System.out.println(-index);
                return;
            }else {
                profit += value[0] * orders.get(key);
            }
            index++;
        }
        System.out.println(profit);
    }
}
