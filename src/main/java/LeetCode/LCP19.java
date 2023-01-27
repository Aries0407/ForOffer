package LeetCode;

public class LCP19 {


    public static void main(String[] args) {
        LCP19 lcp19 = new LCP19();
        System.out.println(lcp19.minimumOperations("yry"));

    }

    /**
     * 未AC 思路 动态规划
     * @param leaves
     * @return
     */
    public int minimumOperations(String leaves) {
        if (leaves.length() == 0 || leaves.length() == 1 || leaves.length() == 2) return 0;
        if (!leaves.contains("y")) return 1;
        int count = 0;
        if (leaves.charAt(0) == 'y') {
            count += 1;
            leaves = "r" + leaves.substring(1);
        }
        if (leaves.charAt(leaves.length() - 1) == 'y') {
            count += 1;
            leaves = leaves.substring(0, leaves.length() - 2) + "r";
        }
        if (!leaves.contains("y")) {
            count += 1;
            return count;
        }
        int i = 0;
        int j = leaves.length() - 1;
        while (leaves.charAt(i) == 'r' && i < j) i++;
        while (leaves.charAt(j) == 'r' && i < j) j--;
        for (int k = i; k <= j; k++) {
            if (leaves.charAt(k) == 'r') {
                count += 1;
            }
        }
        return count;
    }
}
