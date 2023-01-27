package JavaSE.ProducerAndConsumer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/10/30 18:36
 */
public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cntx = sc.nextInt(), cnty = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int cx = 0;
        int cy = 0;
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (cntx + cnty - cx - cy - list.size() > 0) {
            if (i % x != 0 && i % y != 0) {
                list.add(i);
            } else if (i % x != 0 && i % y == 0 && cx < cntx) cx++;
            else if (i % y != 0 && i % x == 0 && cy < cnty) cy++;
            if (cntx + cnty - cx - cy - list.size() <= 0) break;
            i++;
        }
        System.out.println(i);
    }
}
