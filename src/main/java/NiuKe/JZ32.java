package NiuKe;

import java.util.Arrays;
import java.util.Stack;

public class JZ32 {
    /*
    输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
    例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     */

    public String PrintMinNumber(int[] numbers) {
        StringBuilder res = new StringBuilder();
        String strs[] = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        for (String str:strs){
            res.append(str);
        }
        return res.toString();
    }

    //超时
    public String PrintMinNumber1(int[] numbers)

    {
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int ii = numbers[i];
                int jj = numbers[j];
                Stack<Integer> s1 = new Stack<>();
                Stack<Integer> s2 = new Stack<>();
                while (ii > 0) {
                    int s = ii % 10;
                    s1.push(s);
                    ii /= 10;
                }
                while (jj > 0) {
                    int s = jj % 10;
                    s2.push(s);
                    jj /= 10;
                }
                int start1 = s1.peek();
                boolean flag = false;
                while (!s1.empty() && !s2.empty()) {
                    if (s1.pop() > s2.pop()) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                        flag = true;
                        break;
                    }
                }

                while (!flag && s1.empty() && !s2.empty()) {
                    if (start1 > s2.peek()) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                        break;
                    }
                    if (start1 == s2.peek()) {
                        s2.pop();
                    }
                }

            }
            res += numbers[i];
        }
        return res;
    }

    public static void main(String[] args) {
        JZ32 jz32 = new JZ32();
        int a[] = {3, 323, 32123};
        System.out.println(jz32.PrintMinNumber(a));
    }
}
