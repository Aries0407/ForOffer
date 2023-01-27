package NiuKe;

public class JZ2 {

   /*
    牛客网，剑指offer第二题
    题目描述：
    请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */

    /*
    方法一：使用java String中自带的replace函数
     */
    public String replaceSpace1(StringBuffer str) {
        String s = new String(str);
        return s.replace(" ", "%20");

    }

    /*
    方法二：开辟新的字符串，逐个遍历字符串中的元素，遇到空格就添加”%20“，
    否则就将新元素拼接到新字符串后边
     */
    public String replaceSpace2(StringBuffer str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                res += "%20";
            } else {
                res += c;
            }
        }
        return res;
    }

    /*
    方法三：不是用自带函数，在原字符串的基础上进行替换
     */

    public String replaceSpace3(StringBuffer str) {
        int old_length = str.length()-1 ;  //用来记录原先的长度
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }
        }
        str.setLength(str.length() + 2 * cnt);
        int new_length = str.length() - 1;   // 用来记录新的长度
        for (;old_length>=0 && old_length<new_length; old_length--){
            if (str.charAt(old_length) == ' '){
                str.setCharAt(new_length--,'0');
                str.setCharAt(new_length--,'2');
                str.setCharAt(new_length--,'%');
            }
            else {
                str.setCharAt(new_length--,str.charAt(old_length));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        JZ2 jz2 = new JZ2();
        StringBuffer str = new StringBuffer("sdfd dfs dfs fd");
        System.out.println(jz2.replaceSpace3(str));

    }
}
