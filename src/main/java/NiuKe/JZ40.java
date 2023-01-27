package NiuKe;

import java.util.HashSet;
import java.util.Set;

public class JZ40 {

    public void FindNumsAppearOnce(int [] nums,int num1[] , int num2[]) {
        //牛客通过，leetCode超出内存限制
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int min = 0;
        max = min = nums[0] ;
        for (int i = 0; i < nums.length; i++) {
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;
        }
        int[] bucket = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i] - min]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (bucket[nums[i] - min] == 1) {
                set.add(nums[i]);
            }
        }
        int ints[] = set.stream().mapToInt(Integer::intValue).toArray();
        num1[0] = ints[0];
        num2[0] = ints[1];
    }

    public static void main(String[] args) {

    }
}
