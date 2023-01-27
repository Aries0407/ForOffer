package LeetCode;

/**
 * @author Aries
 * @date 2021/2/14 11:36
 */
public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int left = 1;    //存储左边乘积
        int right = 1;   //存储右边乘积
        for (int i = 0; i < ret.length; i++) {
            ret[i] = left;
            left *= nums[i];
        }
        for (int i = ret.length - 1; i >= 0; i--) {
            ret[i] *= right;
            right *= nums[i];
        }
        return ret;
    }
}
