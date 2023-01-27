package NiuKe;

import java.util.Arrays;

public class JZ66 {
    /*
    地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
    每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
    例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
    但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */


    public int movingCount(int threshold, int rows, int cols) {
        int array[][] = new int[rows][cols];
        boolean flag[][] = new boolean[rows][cols];
        for (int i = 0; i < flag.length; i++) {
            Arrays.fill(flag[i], false);
        }
        return dfs(array, flag, 0, 0, threshold);

    }

    public int dfs(int array[][], boolean flag[][], int i, int j, int threshold) {
        if (i >= array.length || j >= array[i].length ||
                ! helper(array, i, j, threshold) || flag[i][j])
            return 0;
        flag[i][j] = true;
        return 1 + dfs(array, flag, i + 1, j, threshold) +
                dfs(array, flag, i, j + 1, threshold);
    }

    public boolean helper(int array[][], int i, int j, int threshold) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum <= threshold ? true : false;
    }


    public static void main(String[] args) {
        JZ66 jz66 = new JZ66();
        System.out.println(jz66.movingCount(15, 20, 20));
    }
}
