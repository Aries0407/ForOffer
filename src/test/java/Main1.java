import java.util.Vector;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Aries
 * @date 2021/3/12 19:00
 */
public class Main1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Vector<Integer>> conn = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Vector<Integer> list1 = new Vector<>();
            list1.add(b);
            conn.put(a, list1);

            Vector<Integer> list2 = new Vector<>();
            list2.add(a);
            conn.put(b,list2);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Vector<Integer> tim = new Vector<>(1001,9999);
            tim.set(a, 0);
            Vector<Integer> t = new Vector<>();
            t.add(a);
            while (t.size() != 0) {
                Vector<Integer> t2 = new Vector<>();
                for (Integer tt : t) {
                    for (Integer other : conn.get(tt)) {
                        if (tim.get(other) == 9999) {
                            tim.set(other,tim.get(tt) + 1);
                            t2.add(other);
                        }
                    }
                }
                if (tim.get(b) != 9999) break;
                t = t2;
            }
            if (tim.get(b) != 9999) System.out.println(tim.get(b));
            else System.out.println(-1);
        }

    }
}
