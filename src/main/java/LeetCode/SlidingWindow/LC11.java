package LeetCode.SlidingWindow;

/**
 * @author Aries
 * @date 2021/2/18 11:52
 */
public class LC11 {

    //双指针
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, height[left] * height[right]);
            if (height[left] > height[right]) {
                right--;
                maxArea = Math.max(maxArea, height[left] * height[right]);
            } else {
                left++;
                maxArea = Math.max(maxArea, height[left] * height[right]);
            }
        }
        return maxArea;
    }

}
