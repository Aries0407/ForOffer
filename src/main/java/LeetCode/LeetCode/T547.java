package LeetCode.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class T547 {

    void init(int[] rank, int[] parent) {
        Arrays.fill(rank, 0);
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    int find(int x, int[] parent) {
        int root = x;
        while (parent[root] != root) {
            root = parent[root];
        }
        return root;
    }

    void union(int x, int y, int[] parent, int[] rank) {
        int x_root = find(x, parent);
        int y_root = find(y, parent);
        int source = -1;
        int target = -1;
        if (x_root != y_root) {
            if (rank[x_root] > rank[y_root]) {
                source = parent[y_root];
                parent[y_root] = x_root;
                target = x_root;
            } else if (rank[x_root] < rank[y_root]) {
                source = parent[x_root];
                parent[x_root] = y_root;
                target = y_root;
            } else {
                source = parent[x_root];
                parent[x_root] = y_root;
                target = y_root;
                rank[y_root]++;
            }
        }
        if (source >= 0 && target >= 0) {
            for (int i = 0; i < parent.length; i++) {
                if (parent[i] == source) {
                    parent[i] = target;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        //初始化
        int[] parent = new int[isConnected.length];
        int[] rank = new int[isConnected.length];
        init(rank, parent);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1 && i < j) {
                    union(i, j, parent, rank);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : parent) {
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        T547 t = new T547();
        int[][] is = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(t.findCircleNum(is));
    }
}
