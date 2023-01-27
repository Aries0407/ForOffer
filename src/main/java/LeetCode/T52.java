package LeetCode;


import java.util.HashSet;

public class T52 {

    public int totalNQueens(int n) {
        HashSet<Integer> column = new HashSet<>();
        HashSet<Integer> diagonalLine1 = new HashSet<>();
        HashSet<Integer> diagonalLine2 = new HashSet<>();
        return dfs(0, n, column, diagonalLine1, diagonalLine2);
    }

    private int dfs(int row, int n, HashSet<Integer> column, HashSet<Integer> diagonalLine1, HashSet<Integer> diagonalLine2) {
        if (row == n) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (column.contains(i)) {
                continue;
            }
            int dia1 = row - i;
            if (diagonalLine1.contains(dia1)) {
                continue;
            }
            int dia2 = row + i;
            if (diagonalLine2.contains(dia2)) {
                continue;
            }
            column.add(i);
            diagonalLine1.add(dia1);
            diagonalLine2.add(dia2);
            count += dfs(row + 1, n, column, diagonalLine1, diagonalLine2);
            column.remove(i);
            diagonalLine1.remove(dia1);
            diagonalLine2.remove(dia2);
        }
        return count;
    }


    public static void main(String[] args) {
        T52 t = new T52();
        System.out.println(t.totalNQueens(8));
    }

}
