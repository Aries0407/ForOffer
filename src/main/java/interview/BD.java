package interview;

/**
 * @author Aries
 * @date 2021/9/25 11:42
 */
public class BD {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 10;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > x) {
                j--;
            } else if (nums[i] + nums[j] < x) {
                i++;
            } else {
                break;
            }
        }
        System.out.println(nums[i] + " " + nums[j]);
    }
}
