package LeetCode.LeetCode;

public class T169 {
    public int majorityElement(int[] nums) {
        if (nums.length <= 0) return 0;
        int count = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    temp = nums[i];
                    count = 1;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
