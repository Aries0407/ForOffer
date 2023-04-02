package LeetCode.SwordToOffer;

public class JZ58 {
    /*
    输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
    为简单起见，标点符号和普通字母一样处理。
    例如输入字符串"I am a student. "，则输出"student. a am I"。
     */
    public String reverseWords(String s) {
        if (s.trim() == "") return s;
        s = s.trim();
        String[] str = s.split(" ");
        s = "";
        for (int i = str.length - 1; i > 0; i--) {
            if (str[i].equals("")) continue;
            s += str[i] + " ";
        }
        return s + str[0];
    }
}
