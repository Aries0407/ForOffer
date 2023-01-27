package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/21 20:15
 */
public class GLD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            sum += t;
            list.add(t);
        }
        int re = sum - k;
        int a = n - n / 2;
        int result = re / n * 2;
        if (re % n != 0) result++;
        if (re % n > a) result++;
        System.out.println(result);
    }
}
