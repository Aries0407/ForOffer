package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/4 10:02
 */
public class MeiTuan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int n = input.length();
        for (int mask = 0; mask < (1 << n); mask++) {
            list.clear();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    list.add(chars[i] + "");
                }
            }

            HashSet<String> set = new HashSet<>();
            boolean flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (!set.contains(list.get(i))){
                    set.add(list.get(i));
                }else {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            count++;
        }



        System.out.println(count);
    }
}
