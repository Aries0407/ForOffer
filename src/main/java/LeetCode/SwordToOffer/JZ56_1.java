package LeetCode.SwordToOffer;

public class JZ56_1 {

    public static void main(String[] args) {

    }

    public int[] singleNumbers(int[] nums) {
        int a = 0, b = 0;
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }

        for (int num : nums) {
            if ((div & num) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
