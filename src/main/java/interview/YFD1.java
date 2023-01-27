package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/7/31 19:49
 */
public class YFD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String input = sc.nextLine();
        String []strings = input.split(" ");
        int []num = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            num[i] = Integer.parseInt(strings[i]);
        }
        int []newN = Arrays.copyOf(num,num.length);
        Arrays.sort(newN);
        for (int i = 0; i < num.length ; i++) {
            if (num[i]!= newN[i]){
                System.out.print(i+1+" ");
            }
        }
    }
}
