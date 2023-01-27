package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/22 20:32
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            long sum = 0;
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            sum = Long.parseLong(strings[0]) + Long.parseLong(strings[1]);
            System.out.println(sum);
        }
        sc.close();
    }
}
