package LeetCode.SwordToOffer;

public class JZ15 {

    public static void main(String[] args) {
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
