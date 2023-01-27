package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/13 19:10
 */
public class XieCheng1 {

    public void test() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int num = sc.nextInt();
            list.add(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3, 4, 2, 1, 2};
        int[] dp = new int[nums.length - 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        
        System.out.println(dp[nums.length - 1]);
    }
}
