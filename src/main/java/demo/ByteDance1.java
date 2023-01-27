package demo;

import java.util.*;

/**
 * @author Aries
 * @date 2021/5/23 14:55
 */
public class ByteDance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String tmp = sc.nextLine();
            list.add(tmp);
        }
        String[][] strs = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            strs[i] = list.get(i).split(" ");
        }
        int[] ret = new int[list.size()];
        Arrays.fill(ret, 1);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < strs[i].length; j += 2) {
                for (int k = 0; k < strs[i][j].length(); k++) {
                    char c = strs[i][j].charAt(k);
                    if (c < 'A' || c > 'Z') {
                        ret[i] = 0;
                    }
                    if (strs[i][j].contains("(") || strs[i][j].contains(")")) {
                        ret[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < strs[i].length - 1; j++) {
                if (strs[i][j].equals("NOT") && strs[i][j + 1].equals("NOT")) {
                    ret[i] = 0;
                }
            }
        }
        for (int i : ret) {
            System.out.println(i);
        }
    }
}
