package LeetCode;

import java.util.HashSet;

public class T217 {
    public static void main(String[] args) {
        int[] nums = {-24500,-24499,-24498,-24497,29999};
        System.out.println(T217.containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
