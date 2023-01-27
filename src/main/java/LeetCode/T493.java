package LeetCode;

public class T493 {
    public static void main(String[] args) {
        T493 t493 = new T493();
        int[] a = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(t493.reversePairs(a));

    }

    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
