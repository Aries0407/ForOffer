package LeetCode.SwordToOffer;

public class JZ4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length <= 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            while (i < matrix.length && matrix[i][j] < target) {
                i++;
            }
            if (i >= matrix.length) return false;
            while (j >= 0 && matrix[i][j] > target) {
                j--;
            }
            if (j < 0) return false;
            if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] test = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 10;
        JZ4 jz4 = new JZ4();
        System.out.println(jz4.findNumberIn2DArray(test, target));
    }
}
