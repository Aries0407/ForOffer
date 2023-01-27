package LeetCode;

public class T461 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        while (z != 0) {
            if ((z & 1) == 1) {
                count++;
            }
            z >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(3 & 1);
    }
}
