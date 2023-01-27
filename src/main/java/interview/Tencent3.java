package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/3/21 21:32
 */
public class Tencent3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix1 = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] temp = new int[m];
            for (int j = 0; j < m; j++) {
                temp[j] = sc.nextInt();
            }
            matrix1[i] = temp;
        }
        int q = sc.nextInt();
        int[][] matrix2 = new int[q][];
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            int[] temp = new int[m + 1];
            for (int j = 0; j < m + 1; j++) {
                temp[j] = sc.nextInt();
            }
        }

        int []ret = new int[matrix2.length];
        int index = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 1; j < matrix2[i].length - 1; j++) {
                list.add(matrix2[i][j]);
            }
            Collections.sort(list);
            ret[index++] = list.get(matrix2[i][matrix2[i].length - 1]);
            list.clear();
        }

        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
