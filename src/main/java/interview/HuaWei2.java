package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/5/9 15:01
 */
public class HuaWei2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            nums.add(tmp);
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            for (int num : nums) {
                map.put(num + tmp, map.getOrDefault(num + tmp, 0) + 1);
            }
        }

        int aim = sc.nextInt();
        int result = 0;
        for (int m : map.keySet()) {
            if (aim > map.get(m)) {
                result += m * map.get(m);
                aim -= map.get(m);
            } else {
                result += m * aim;
                break;
            }
        }
        System.out.println(result);
    }
}
