package NiuKe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JZ53 {
    /*
    请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
    例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
    但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
     */

    //使用正则表达式
    public boolean isNumeric1(char[] str) {
        String pattern = "^[-+]?\\d*\\$(?:\\.\\d+)(?:[eE][+-]?\\d+)?$";
        String s = new String(str);
        return Pattern.matches(pattern,s);
    }

    public boolean isNumeric(char[] str) {
        Pattern p = Pattern.compile("[-+]?\\d*(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        String s = new String(str);
        Matcher m = p.matcher(s);
        return m.matches();
    }


    public static void main(String[] args) {

    }
}
