package LeetCode.SwordToOffer2;

/**
 * @author Aries
 * @date 2021/8/22 16:52
 */
public class JZ010 {

    public int subarraySum(int[] nums, int k) {

        return 0;
    }

    public int subarraySum1(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (left < right && sum > k) {
                sum -= nums[left++];
            }
            if (left <= right && sum == k) {
                count++;
                right++;
            } else {
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JZ010 jz010 = new JZ010();
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        System.out.println(jz010.subarraySum(nums, k));
    }
}
