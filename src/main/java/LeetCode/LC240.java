package LeetCode;

/**
 * @author Aries
 * @date 2021/2/12 19:30
 */
public class LC240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length - 1;
        for (int i = 0, j = n; i < m && j >= 0; ) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
