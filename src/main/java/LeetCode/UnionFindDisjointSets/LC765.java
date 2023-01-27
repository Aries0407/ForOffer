package LeetCode.UnionFindDisjointSets;

/**
 * @author Aries
 * @date 2021/2/14 10:24
 */
public class LC765 {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int n = len / 2;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < len; i++) {
            unionFind.union(row[i] / 2, row[i + 1] / 2);
        }
        return n - unionFind.getCount();
    }
}


class UnionFind {
    int count;
    int[] parent;

    public UnionFind(int n) {
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        while (x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }
        parent[rootX] = rootY;
        count--;
    }

    public int getCount() {
        return this.count;
    }
}