package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/11 20:13
 */
public class JD1 {
    public static void main(String[] args) {

        String sss = "s ";
        String[]ss = sss.split(" ");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i] + "-- ");
        }
        System.out.println(ss.length);

        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextInt();
        }
        sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < input[0]; i++) {
            String s = sc.nextLine();
            char[] cs = s.toCharArray();
            for (int j = 0; j < input[1]; j++) {
                list.add(cs[j]);
            }
        }
        String strs = sc.nextLine();
        int ret = action(strs, list, input);
        System.out.println(ret);
    }

    private static int action(String strs, ArrayList<Character> list, int[] input) {
        int ret = 0;
        int px = 0;
        int py = 0;
        for (int i = 0; i < strs.length(); i++) {
            int ind = list.indexOf(strs.charAt(i));
            int cx = ind / input[0];
            int cy = ind / input[0];
            ret += Math.abs(cy - py) * input[2] + Math.abs(cx - px) * input[2];
            ret += input[4];
            if (cx != px && cy != py) {
                ret += input[3];
            }
            px = cx;
            py = cy;
        }
        return ret;
    }
}
