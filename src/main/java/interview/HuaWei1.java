package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/4/7 19:07
 */
public class HuaWei1 {
    private HashMap<String, String> map = new HashMap<>();
    private int count = 0;

    public HuaWei1(HashMap<String, String> map, HashSet<String> set) {
        for (String s : set) {
            map.put(s, "#");
        }
        this.map = map;
        this.count = set.size();
    }

    public String find(String p) {
        String root = p;
        while (!map.get(root).equals("#")) {
            root = map.get(root);
        }
        return root;
    }

    public boolean connect(String p, String q) {
        String pRoot = find(p);
        String qRoot = find(q);
        if (pRoot.equals(qRoot)) {
            return true;
        } else {
            count--;
            map.put(pRoot, qRoot);
            return false;
        }
    }

    private int getCount() {
        return this.count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] strings = new String[n][2];
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            strings[i][0] = sc.next();
            strings[i][1] = sc.next();
            set.add(strings[i][0]);
            set.add(strings[i][1]);
        }
        HashMap<String, String> map = new HashMap<>();
        HuaWei1 huaWei1 = new HuaWei1(map, set);
        for (int i = 0; i < n; i++) {
            if (!huaWei1.connect(strings[i][0], strings[i][1])) {
                map.put(strings[i][0], strings[i][1]);
            }
        }
        System.out.println(huaWei1.getCount());
    }
}
