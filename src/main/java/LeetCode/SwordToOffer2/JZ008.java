package LeetCode.SwordToOffer2;

import java.util.List;

/**
 * @author Aries
 * @date 2021/8/21 9:12
 */
public class JZ008 {



    public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 1;
        int ret = nums[right];
        while (left < right && right < nums.length) {
            if (ret < target) {
                ret += nums[right++];
            } else if (ret > target) {
                ret -= nums[left++];
            } else {
                minLen = Math.min(minLen, right - left + 1);
                System.out.println(left + " " + right);
            }
        }
        return minLen;
    }

    public static void main(String[] args) {

    }
}
