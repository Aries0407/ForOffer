package interview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/7/25 20:23
 */
public class PDD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            if ((q-a)%2==b || (q/a)%c == 0 || ((q/c)-a)%b ==0){
                list.add(1);
            }else {
                list.add(0);
            }
        }
        for (int i : list){
            System.out.println(i + " ");
        }
    }
}
