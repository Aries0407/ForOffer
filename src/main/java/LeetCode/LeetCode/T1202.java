package LeetCode.LeetCode;

import java.util.*;

public class T1202 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if (pairs.size() == 0) return s;
        int len = s.length();
        int[] parent = new int[len];
        int[] rank = new int[len];
        Arrays.fill(parent, -1);
        for (List<Integer> list : pairs) {
            int x = list.get(0);
            int y = list.get(1);
            union(x, y, parent, rank);
        }
        char[] chars = s.toCharArray();
        HashMap<Integer, PriorityQueue<Character>> map = new HashMap<>(len);
        for (int i = 0; i < s.length(); i++) {
            int root = find(i, parent);
            if (map.containsKey(root)) {
                map.get(root).add(chars[i]);
            } else {
                PriorityQueue<Character> queue = new PriorityQueue<>();
                queue.add(chars[i]);
                map.put(root, queue);
            }
            //map.computeIfAbsent(root, key -> new PriorityQueue<>()).offer(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int root = find(i, parent);
            sb.append(map.get(root).poll());
        }
        return sb.toString();
    }

    int find(int x, int[] parent) {
        int xRoot = x;
        while (parent[xRoot] != -1) {
            xRoot = parent[xRoot];
        }
        return xRoot;
    }

    void union(int x, int y, int[] parent, int[] rank) {
        int xRoot = find(x, parent);
        int yRoot = find(y, parent);
        if (xRoot != yRoot) {
            if (rank[x] > rank[y]) {
                parent[yRoot] = xRoot;
            } else if (rank[x] < rank[y]) {
                parent[xRoot] = yRoot;
            } else {
                parent[yRoot] = xRoot;
                rank[yRoot]++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
