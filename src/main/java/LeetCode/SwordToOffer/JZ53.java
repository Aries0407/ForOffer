package LeetCode.SwordToOffer;

public class JZ53 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] != m) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    public int missingNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;
    }
}
