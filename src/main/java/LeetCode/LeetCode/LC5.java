package LeetCode.LeetCode;

public class LC5 {
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        if (s.length() <= 2) return s;
        int begin = 0;
        char[] c = s.toCharArray();
        int maxLen = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i + 1 > maxLen && isPalindrome(c, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public boolean isPalindrome(char[] c, int i, int j) {
        while (i < j) {
            if (c[i] != c[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
