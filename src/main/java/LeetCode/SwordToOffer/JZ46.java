package LeetCode.SwordToOffer;

public class JZ46 {
    public static void main(String[] args) {
        JZ46 jz46 = new JZ46();
        System.out.println(jz46.translateNum2(506));

    }


    public int translateNum(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if (len < 2) {
            return len;
        }
        char[] c = s.toCharArray();
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1];
            int currentNum = 10 * (c[i - 1] - '0') + (c[i] - '0');
            if (currentNum > 9 && currentNum < 26) {
                if (i - 2 < 0) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[len - 1];
    }

    public int translateNum2(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if (len < 2) {
            return len;
        }
        char[] c = s.toCharArray();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < len; i++) {
            dp[i + 1] = dp[i];
            int currentNum = 10 * (c[i - 1] - '0') + (c[i] - '0');
            if (currentNum > 9 && currentNum < 26) {
                dp[i + 1] = dp[i] + dp[i - 1];
            }
        }
        return dp[len];
    }

}
