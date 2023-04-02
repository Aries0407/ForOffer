package LeetCode.SwordToOffer;


import java.util.regex.Pattern;

public class JZ20 {

    //测试数据太变态！！！
    public boolean isNumber(String s) {
        String pattern = "^[+-]?\\d+$(?:\\.\\d+)?(?:[Ee][+-]?\\d+)?$";
        boolean b = s.matches(pattern);
        return Pattern.matches(pattern,s);
    }

    public static void main(String[] args) {

    }
}
