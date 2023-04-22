package LeetCode.LeetCode;

public class T62 {
    public static int uniquePaths(int m, int n) {
        int[][] num = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 ||j == 0) num[i][j] = 1;
                else num[i][j] = num[i - 1][j] + num[i][j - 1];
            }
        }
        return num[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(T62.uniquePaths(3, 3));
    }
}
