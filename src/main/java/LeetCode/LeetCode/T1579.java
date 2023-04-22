package LeetCode.LeetCode;

import java.util.Arrays;

public class T1579 {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind una = new UnionFind(n);
        UnionFind unb = new UnionFind(n);
        int ans = 0;
        for (int[] edge : edges) {
            edge[1]--;
            edge[2]--;
        }

        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!una.unite(edge[1], edge[2])) {
                    ans++;
                } else {
                    unb.unite(edge[1], edge[2]);
                }
            }
        }

        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!una.unite(edge[1], edge[2])) {
                    ans++;
                }
            }
            if (edge[0] == 2) {
                if (!unb.unite(edge[1], edge[2])) {
                    ans++;
                }
            }
        }

        if (una.setCount != 1 || unb.setCount != 1) {
            return -1;
        }
        return ans;

    }
}

class UnionFind {
    int[] parent;
    int[] size;
    int n;
    int setCount;

    public UnionFind(int n) {
        this.n = n;
        this.setCount = n;
        parent = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int findSet(int x) {
        return parent[x] == x ? x : (parent[x] = findSet(parent[x]));
    }

    public boolean unite(int x, int y) {
        x = findSet(x);
        y = findSet(y);
        if (x == y) {
            return false;
        }
        if (size[x] < size[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        parent[y] = x;
        size[x] += size[y];
        --setCount;
        return true;
    }

    public boolean connected(int x, int y) {
        x = findSet(x);
        y = findSet(y);
        return x == y;
    }
}