package LeetCode.SlidingWindow;

public class LC978 {

    //双指针
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        if (len < 2) return len;
        int left = 0;
        int right = 1;
        boolean pre = false;
        int ret = 1;
        while (right < len) {
            boolean cur = arr[right - 1] < arr[right];
            if (right == 1 || cur == pre) {
                left = right - 1;
            }
            if (arr[right - 1] == arr[right]) {
                left = right;
            }
            right++;
            ret = Math.max(ret,right-left);
            pre = cur;
        }
        return ret;
    }
}
