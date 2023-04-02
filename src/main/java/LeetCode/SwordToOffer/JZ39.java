package LeetCode.SwordToOffer;

public class JZ39 {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int votes = 0;
        int x = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += x == num ? 1 : -1;
        }
        return x;
    }
}
