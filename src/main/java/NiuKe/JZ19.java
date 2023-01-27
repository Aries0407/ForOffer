package NiuKe;


import java.util.ArrayList;

public class JZ19 {
    /*
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
    例如，如果输入如下4 X 4矩阵：
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
    则依次打印出数字
    1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int total = (bottom + 1) * (right + 1);
        while (true) {
            //上
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
                total--;
            }
            top++;
            if (total==0) break;
            //右
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
                total--;
            }
            right--;
            if (total==0) break;

            //下
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
                total--;
            }
            bottom--;
            if (total==0) break;

            //左
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
                total--;
            }
            left++;
            if (total==0) break;
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] a = new int[5][1];
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                a[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        JZ19 jz19 = new JZ19();
        System.out.println(jz19.printMatrix(a));
    }
}
