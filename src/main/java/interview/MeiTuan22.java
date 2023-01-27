package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/11 16:30
 */
public class MeiTuan22 {

    private static int tmp = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    }

    public static void teat() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[] result = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            result[x]++;
            result[y]++;
        }
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            swap(x, y, result);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void swap(int x, int y, int[] nums) {
        tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
