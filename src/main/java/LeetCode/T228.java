package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class T228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        int i = 0;
        int j = 1;
        String start = nums[0] + "";
        String end = nums[1] + "";
        int tap = 0;
        while (j < nums.length) {
            if (nums[j] - 1 == nums[i]) {
                end = nums[j] + "";
                i++;
                j++;
                tap = 1;
            } else {
                if (tap == 0) {
                    list.add(start);
                } else {
                    list.add(start + "->" + end);
                }
                tap = 0;
                i = j ;
                start = nums[i] + "";
                if (j + 1 < nums.length) {
                    j++;
                    end = nums[j] + "";
                } else {
                    list.add(start);
                    break;
                }
            }
        }
        if (tap==1){
            list.add(start + "->" + end);
        }
        return list;
    }

}
