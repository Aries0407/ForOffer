package LeetCode.DynamicProgramming;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/2/8 12:10
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strs = s.split(" ");
            int sum = 0;
            for (String str : strs) {
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
        }
    }
}
