package LeetCode.SimulationOfInterview;

import java.util.ArrayList;
import java.util.List;

public class TouTiao2 {
    /**
     * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
     */

    /*
    1 2 3 4
    5 6 7 8
    9 10 11 12
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top > bottom || left > right) break;

            //从上到下
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top > bottom || left > right) break;

            //从右到左
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom || left > right) break;

            //从下到上
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (top > bottom || left > right) break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3,4}, {5, 6,7,8}, { 9,10,11,12}};
        System.out.println(TouTiao2.spiralOrder(nums).toString());
    }
}
