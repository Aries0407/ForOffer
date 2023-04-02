package LeetCode.SwordToOffer;

public class JZ16 {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1.0;
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
