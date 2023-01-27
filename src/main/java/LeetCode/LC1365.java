package LeetCode;

import java.util.Arrays;

public class LC1365 {
    public static void main(String[] args) {
        int[] a = {8, 1, 2, 3};
        LC1365 t1365 = new LC1365();
        System.out.println(Arrays.toString(t1365.smallerNumbersThanCurrent(a)));

    }

    //当数组中无重复元素时适用
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        int[] frequent = new int[101];
        for (int num:nums){
            frequent[num]++;
        }
        for (int i = 1; i < frequent.length ; i++) {
            frequent[i] += frequent[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                count[i] = frequent[nums[i] - 1];
        }
        return count;
    }

}
