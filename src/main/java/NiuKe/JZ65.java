package NiuKe;

import java.util.Arrays;

public class JZ65 {
    /*
    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
    路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，
    向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
    例如：
    a b c e
    s f c s
    a d e e
    矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
    因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
     */

    /*
    与leetCode中的区别：增加了二维地址转一维地址要求
     */

    public boolean hasPath(char[] board, int rows, int cols, char[] word) {
        boolean visited[][] = new boolean[board.length][cols];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], false);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0, visited, rows, cols))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[] board, char[] word, int i, int j,
                       int cur, boolean[][] visited, int rows, int cols) {
        int index = i * cols + j;
        if (i >= rows || j >= cols || i < 0 || j < 0
                || visited[i][j] || cur >= word.length ||
                board[index] != word[cur])
            return false;
        if (cur == word.length - 1) return true;
        visited[i][j] = true;
        boolean res = dfs(board, word, i, j + 1, cur + 1, visited, rows, cols) ||
                dfs(board, word, i + 1, j, cur + 1, visited, rows, cols) ||
                dfs(board, word, i - 1, j, cur + 1, visited, rows, cols) ||
                dfs(board, word, i, j - 1, cur + 1, visited, rows, cols);
        visited[i][j] = false;
        return res;
    }
}