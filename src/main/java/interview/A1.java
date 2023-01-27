package interview;

import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/9/8 9:18
 */
public class A1 {

    public static String tenToK(int n, int num) {
        // n 表示目标进制, num 要转换的值
        String str = "";
        int yushu;      // 保存余数
        int shang = num;      // 保存商
        while (shang > 0) {
            yushu = shang % n;
            shang = shang / n;

            if (yushu > 9) {
                str = (char) ('a' + (yushu - 10)) + str;
            } else {
                str = yushu + str;
            }
        }

        return str;
    }

    public static int KtoTen(String s, int k) {
        char[] chars = s.toCharArray();
        int ret = 0;
        int pow = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            ret += Integer.parseInt(chars[i] + "") * Math.pow(k, pow);
            pow++;
        }
        return ret;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] nums = new int[t][2];
        for (int i = 0; i < t; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
            String s = tenToK(nums[i][1], nums[i][0]);
            StringBuilder sb = new StringBuilder(s);
            s = sb.reverse().toString();
            int ret = KtoTen(s, nums[i][1]);
            System.out.println(ret);
        }

    }
}
