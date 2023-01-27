package NiuKe;

import java.util.ArrayList;

public class JZ34 {

    /*
    在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
    并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     */
    public int FirstNotRepeatingChar(String str) {

        if (str == "" || str == null) return -1;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String e = String.valueOf(str.charAt(i));
            if (list.contains(e)) {
                int index = list.indexOf(e);
                num.set(index, num.get(index) + 1);

            } else {
                list.add(e);
                num.add(1);
            }
        }
        int tag = -1;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 1) {
                tag = i;
                break;
            }
        }
        String c = list.get(tag);
        int index = str.lastIndexOf(c);
        return index;
    }

    public static void main(String[] args) {
        JZ34 jz34 = new JZ34();
        System.out.println(jz34.FirstNotRepeatingChar("google"));
    }
}
