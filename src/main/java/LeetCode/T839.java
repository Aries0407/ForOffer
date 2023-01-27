package LeetCode;

public class T839 {
        int[] parent;

        public int numSimilarGroups(String[] strs) {
            int n = strs.length;
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int pi = find(i);
                    int pj = find(j);
                    if (pi == pj) continue;

                    if (check(strs[i], strs[j])) {
                        parent[pi] = pj;
                    }
                }
            }
            int ret = 0;
            for (int i = 0; i < n; i++) {
                if (parent[i] == i) {
                    ret++;
                }
            }
            return ret;
        }


        private int find(int x) {
            return parent[x] == x ? x : (parent[x] = find(parent[x]));
        }

        public boolean check(String a, String b) {
            int num = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    num++;
                }
                if (num > 2) {
                    return false;
                }
            }
            return true;
        }
}
