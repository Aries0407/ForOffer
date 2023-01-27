package JavaSE;

import java.util.Arrays;

public class DisjointSet {
    /**
     * 并查集实现
     */

    /**
     * 初始化
     * @param parent
     * @param rank
     */
    void init(int[] parent, int[] rank) {
        Arrays.fill(parent, -1);
        Arrays.fill(rank, 0);
    }

    /**
     * 查找根
     * @param x
     * @param parent
     * @return
     */
    int find(int x, int[] parent) {
        int root = x;
        while (parent[root] != -1) {
            root = parent[root];
        }
        return root;
    }

    /**
     * 合并
     * @param x
     * @param y
     * @param parent
     * @param rank
     * @return
     */
    int quickUnion(int x, int y, int[] parent, int[] rank) {
        int x_root = find(x, parent);
        int y_root = find(y, parent);
        if (x_root == y_root) {
            return 0;
        } else {
            //parent[x_root] = y_root;
            if (rank[x_root] > rank[y_root]) {
                parent[y_root] = x_root;
            } else if (rank[x_root] < rank[y_root]) {
                parent[x_root] = y_root;
            } else {
                parent[x_root] = y_root;
                rank[y_root]++;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        int vertices = 4;
        int[][] nums = {{1, 2}, {1, 3}, {2, 3}};
        int[] parent = new int[vertices];
        int[] rank = new int[vertices];
        DisjointSet disjointSet = new DisjointSet();
        disjointSet.init(parent, rank);
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i][0];
            int y = nums[i][1];
            if (disjointSet.quickUnion(x, y, parent, rank) == 0) {
                System.out.println("yes");
                System.exit(0);
            }
        }
        System.out.println("no");
    }
}
