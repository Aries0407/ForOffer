package interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/8 20:23
 */
public class BeiKe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for (int i : map.keySet()){
            max = max<map.get(i)? map.get(i):max;
        }
        System.out.println(max);
    }
}
