package interview;

/**
 * @author Aries
 * @date 2021/9/16 19:12
 */
public class QQMUsic2 {

    public String maxLexicographical(String num) {
        // write code here
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                chars[i] = '1';
                if (i < chars.length - 1 && chars[i + 1] == '1') {
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
