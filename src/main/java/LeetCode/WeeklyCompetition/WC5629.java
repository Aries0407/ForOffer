package LeetCode.WeeklyCompetition;

public class WC5629 {
    public static String reformatNumber(String number) {
        number = number.replaceAll("-", "");
        number = number.replaceAll(" ", "");
        int len = number.length();
        if (len <= 4) {
            if (len <= 3) {
                return number;
            }
            if (len == 4) {
                StringBuffer sb = new StringBuffer();
                int index = 1;
                while (index <= 4) {
                    sb.append(number.charAt(index - 1));
                    if (index == 2) {
                        sb.append("-");
                    }
                    index++;
                }
                return sb.toString();
            }
        }

        StringBuffer sb = new StringBuffer();
        if (len % 3 == 0 || len % 3 == 2) {
            int i = 1;
            while (i < len) {
                sb.append(number.charAt(i - 1));
                if (i % 3 == 0) {
                    sb.append("-");
                }
                i++;
            }
            sb.append(number.charAt(i - 1));
        }

        if (len % 3 == 1) {
            int i = 1;
            while (i < len - 4) {
                sb.append(number.charAt(i - 1));
                if (i % 3 == 0) {
                    sb.append("-");
                }
                i++;
            }
            sb.append(number.charAt(i - 1) + "-");

            int j = 1;
            while (j < 4) {
                sb.append(number.charAt(i + j - 1));
                if (j % 2 == 0) {
                    sb.append("-");
                }
                j++;
            }
            sb.append(number.charAt(i + j - 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(WC5629.reformatNumber("123 4-567"));
    }
}
