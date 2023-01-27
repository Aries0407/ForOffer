package LeetCode;

import java.util.Arrays;

public class T283 {
    public static void main(String[] args) {
        T283 t283 = new T283();
        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        t283.moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //暴力搜索
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    //双指针
    public void moveZeroes2(int[] nums) {
        if (nums.length == 0) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
