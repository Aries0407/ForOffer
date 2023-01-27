package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aries
 * @date 2021/2/12 18:40
 */
public class LC119 {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> list = new LinkedList<>();
        if (rowIndex <= 0) return new LinkedList<>();
        if (rowIndex == 1) {
            list.add(1);
            return list;
        }
        if (rowIndex == 2) {
            list.addLast(1);
            list.addLast(1);
            return list;
        }
        int[][] nums = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i < rowIndex + 1; i++) {
            nums[i][0] = 1;
        }
        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = 1; j <= i; j++) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }
        for (int i : nums[rowIndex]) {
            list.addLast(i);
        }
        return list;
    }
}
