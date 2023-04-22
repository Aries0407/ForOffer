package LeetCode.LeetCode;

public class T79 {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() <= 0) {
            return false;
        }
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean flag = dfs(board, word, i, j, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String target,
                        int i, int j, int m) {
        if (board[i][j] != target.charAt(m)) {
            return false;
        } else if (m == target.length() - 1) {
            return true;
        }
        boolean result = false;
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        for (int[] dir : directions) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 && newI <= board.length && newJ >= 0 && newJ < board[0].length) {
                if (!visited[newI][newJ]) {
                    boolean flag = dfs(board, target, newI, newJ, m + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
