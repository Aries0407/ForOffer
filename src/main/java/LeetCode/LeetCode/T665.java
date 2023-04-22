package LeetCode.LeetCode;

public class T665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 3) return true;
        int count = 0;
        if (nums[0] > nums[1]) {
            count++;
            nums[0] = nums[1];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){
                if (nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
                count++;
            }
        }
        return count <= 1;
    }
}
