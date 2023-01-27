package LeetCode;

import java.util.Arrays;

public class T322 {

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            int temp = amount / coins[i];
            amount %= coins[i];
            count += temp;
        }
        return amount == 0? count : -1;
    }

    public static void main(String[] args) {

    }

}
