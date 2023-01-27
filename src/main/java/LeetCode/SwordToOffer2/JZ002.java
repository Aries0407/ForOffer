package LeetCode.SwordToOffer2;

/**
 * @author Aries
 * @date 2021/8/7 16:52
 */
public class JZ002 {
    public String addBinary(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = ac.length - 1;
        int j = bc.length - 1;
        int tmp = 0;
        int cur = 0;
        while (i >= 0 && j >= 0) {
            int ai = ac[i] - '0';
            int bj = bc[j] - '0';
            cur = (tmp + ai + bj) % 2;
            tmp = (tmp + ai + bj) / 2;
            i--;
            j--;
            sb.append(cur);
        }

        while (i >= 0) {
            int ai = ac[i] - '0';
            cur = (tmp + ai) % 2;
            tmp = (tmp + ai) / 2;
            i--;
            sb.append(cur);
        }
        while (j >= 0) {
            int bj = bc[j] - '0';
            cur = (tmp + bj) % 2;
            tmp = (tmp + bj) / 2;
            j--;
            sb.append(cur);
        }

        if (tmp == 1) sb.append(tmp);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        JZ002 jz002 = new JZ002();
        System.out.println(jz002.addBinary("100", "110010"));

    }
}
