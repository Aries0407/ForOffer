package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class T684 {

    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length + 1];
        int[] rank = new int[edges.length + 1];
        ArrayList<int[]> list = new ArrayList<>();
        init(parent, rank);
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            if (quickUnion(x, y, parent, rank) == 1) {
                int[] temp = new int[2];
                temp[0] = x;
                temp[1] = y;
                list.add(temp);
            }
        }
        return list.get(list.size() - 1);
    }

    void init(int[] parent, int[] rank) {
        Arrays.fill(parent, -1);
        Arrays.fill(rank, 1);
    }

    int find(int x, int[] parent) {
        int root = x;
        while (parent[root] != -1) {
            root = parent[root];
        }
        return root;
    }

    int quickUnion(int x, int y, int[] parent, int[] rank) {
        int xRoot = find(x, parent);
        int yRoot = find(y, parent);
        if (xRoot != yRoot) {
            if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
            } else if (rank[yRoot] > rank[xRoot]) {
                parent[xRoot] = yRoot;
            } else {
                parent[xRoot] = yRoot;
                rank[yRoot]++;
            }
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        T684 t = new T684();
        System.out.println(Arrays.toString(t.findRedundantConnection(edges)));
    }
}
