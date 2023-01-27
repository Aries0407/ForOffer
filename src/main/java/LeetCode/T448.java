package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class T448 {

    //原地修改
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int index = nums[i] - 1;
                nums[i] = nums[index];
                nums[index] = index + 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    //哈希表
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(T448.findDisappearedNumbers(num));
    }
}
