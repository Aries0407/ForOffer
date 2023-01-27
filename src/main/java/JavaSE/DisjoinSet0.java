package JavaSE;

import java.util.Arrays;

/**
 * @author Aries
 * @date 2021/4/15 13:14
 */
public class DisjoinSet0 {

    public static void init(int[] parent) {
        Arrays.fill(parent, -1);
    }

    public static int find(int x, int[] parent) {
        int x_root = x;
        while (parent[x_root] != -1) {
            x_root = parent[x_root];
        }
        return x_root;
    }

    public static boolean connect(int x, int y, int[] parent) {
        int x_root = find(x, parent);
        int y_root = find(y, parent);
        if (x_root == y_root) {
            return true;
        } else {
            parent[x_root] = y_root;
            return false;
        }
    }

    public static void main(String[] args) {
        int[] parent = new int[6];
        int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {2, 5}};
        init(parent);
        for (int i = 0; i < 6; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            if (connect(x, y, parent)) {
                System.out.println("yes");
                System.exit(1);
            }
        }
        System.out.println("no");

    }
}
