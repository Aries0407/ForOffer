package LeetCode.SimulationOfInterview;

import java.util.Arrays;
import java.util.HashMap;

public class TouTiao1 {
    /**
     * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
     */
    public static int[] singleNumber(int[] nums) {
        int []ret = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }
        int index = 0;
        for (int i:map.keySet()){
            if (map.get(i) == 1){
                ret[index] = i;
                index++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(TouTiao1.singleNumber(nums)));
    }
}
