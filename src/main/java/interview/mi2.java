package interview;

import java.util.*;

/**
 * @author Aries
 * @date 2021/9/8 19:43
 */
public class mi2 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int[] nums = new int[strings.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        int[] count = new int[4];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            while (count[i] != 0) {
                count[i]--;
                System.out.print(i + " ");
            }
        }


    }
}
