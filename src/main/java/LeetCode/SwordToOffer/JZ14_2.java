package LeetCode.SwordToOffer;

public class JZ14_2 {


    public static void main(String[] args) {
        JZ14_2 jz14_2 = new JZ14_2();
        System.out.println(jz14_2.cuttingRope(10));

    }

    //快速幂
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;

        int remainder = n % 3;
        long rem = 1, x = 3;
        int p = 1000000007;
        for (int i = n / 3 - 1; i > 0; i /= 2) {
            if (i % 2 == 1) rem = (rem * x) % p;
            x = (x * x) % p;
        }
        if (remainder == 0) {
            return (int) (rem * 3 % p);
        }
        if (remainder == 1) {
            return (int) (rem * 4 % p);
        }
        return (int) (rem * 6 % p);
    }

    public int cuttingRope1(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int remainder = n % 3;
        int quotient = n / 3;
        if (remainder == 2) {
            return (int) (Math.pow(3, quotient) * 2);
        }
        if (remainder == 1) {
            return (int) (Math.pow(3, quotient - 1) * 4);
        }
        return (int) Math.pow(3, quotient);
    }
}
