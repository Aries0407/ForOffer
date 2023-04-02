package LeetCode.SwordToOffer;

public class JZ44 {
    public static void main(String[] args) {

    }

    /*
    数字以0123456789101112131415…的格式序列化到一个字符序列中。
    在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
     */
    public int findNthDigit(int n) {
        int digit = 1;
        int start = 1;
        int count = 9;
        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = start * digit * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }

}
