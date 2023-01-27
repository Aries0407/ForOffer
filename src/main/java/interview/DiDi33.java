package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/12 19:24
 */
public class DiDi33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[100000+1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            count[tmp]++;
        }
        int c = m;
        int index = 100000;
        while (c > 0) {
            if (count[index] != 0) {
                if (c >= count[index]) {
                    sum += index * count[index];
                    c -= count[index];
                } else {
                    sum += index * c;
                    c = 0;
                }
            }
            index--;
        }
        System.out.println(sum);
    }
}
