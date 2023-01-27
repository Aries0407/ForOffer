package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/11 19:52
 */

/*

3 2
1 2
1 3
0
1 1
0 2
 */
public class JD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int mm = sc.nextInt();
            int[] nums1 = new int[mm];
            for (int j = 0; j < mm; j++) {
                nums1[j] = sc.nextInt();
            }
            list.add(nums1);
        }

        int[][] nums2 = new int[q][2];
        int[] fuwu = new int[n + 1];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i][0] = sc.nextInt();
            nums2[i][1] = sc.nextInt();
            int a = nums2[i][0];
            int b = nums2[i][1];
            if (a == 0) {
                fuwu[b] = 0;
            } else {
                fuwu[b] = 1;
            }

            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                int k = 1;
                for (int m : list.get(j)) {
                    if (m == 0) {
                        k = 0;
                        break;
                    }
                }
                if (k == 1) {
                    count++;
                }
            }
            System.out.println(count);

        }


    }
}
