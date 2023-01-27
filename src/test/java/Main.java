import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Aries
 * @date 2021/3/12 19:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int num = 0;
            Vector<Integer> nn = new Vector<>();
            Vector<Integer> mm = new Vector<>();
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x!=y){
                    nn.add(x);
                    mm.add(y);
                    num++;
                }
            }
            Collections.sort(nn);
            Collections.sort(mm);
            if (nn == mm){
                System.out.println(num+1);
            }else {
                System.out.println(num);
            }
        }
    }
}
