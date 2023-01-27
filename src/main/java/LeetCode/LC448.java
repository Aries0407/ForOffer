package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2021/2/13 8:41
 */
public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - 1;
            nums[x] += n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                list.addLast(i + 1);
            }
        }

        return list;
    }
}
