package LeetCode;

public class T463 {

    public static void main(String[] args) {
        T463 t463 = new T463();
        int [][]grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(t463.islandPerimeter1(grid));

    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int islandPerimeter(int[][] grid){
        int count = 0;
        return count;
    }



    public int islandPerimeter1(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1){
                    int ant = 0;
                    for (int k = 0; k < 4; k++) {
                        int tx = i + dx[k];
                        int ty = j + dy[k];
                        if (tx < 0 || ty < 0 || tx >= m || ty >= n || grid[tx][ty] == 0) {
                            ant++;
                        }
                    }
                    count += ant;
                }
            }
        }
        return count;
    }



}
