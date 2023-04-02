package LeetCode.SwordToOffer;

public class JZ10_1 {
    public static void main(String[] args) {
        JZ10_1 jz10_1 = new JZ10_1();
        System.out.println(jz10_1.fib1(7));

    }

    public int fib1(int n) {
        if (n <= 1) return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int[] num = new int[n+1];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = (num[i - 1] + num[i - 2])% 1000000007;
        }
        return num[n];
    }

}
