package LeetCode.SwordToOffer;

import java.util.Arrays;

public class JZ12 {

    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < visited.length; i++) {
            Arrays.fill(visited[i], false);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j,
                       int cur, boolean[][] visited) {
        if (i >= board.length || j >= board[i].length || i < 0 || j < 0
                || visited[i][j] || cur >= word.length() ||
                board[i][j] != word.charAt(cur))
            return false;
        if (cur == word.length() - 1) return true;
        visited[i][j] = true;
        boolean res = dfs(board, word, i, j + 1, cur + 1, visited) ||
                dfs(board, word, i + 1, j, cur + 1, visited) ||
                dfs(board, word, i - 1, j, cur + 1, visited) ||
                dfs(board, word, i, j - 1, cur + 1, visited);
        visited[i][j] = false;
        return res;
    }

    public static void main(String[] args) {

    }
}
