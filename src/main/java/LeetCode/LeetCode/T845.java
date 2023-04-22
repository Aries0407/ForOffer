package LeetCode.LeetCode;

public class T845 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        T845 t845 = new T845();
        System.out.println(t845.longestMountain(A));
    }

    /**
     *
     * @param A
     * @return
     * 方法3：动态规划，枚举山脚
     */
    public int longestMountain(int[] A) {
        if (A.length < 3) return 0;
        int left = 0;
        int right = left + 1;
        int longest = 0;
        while (left + 2 < A.length) {
            right = left + 1;
            if (A[left] < A[left + 1]) {
                while (right + 1 < A.length && A[right] < A[right + 1]) {
                    right++;
                }
                if (right < A.length-1 && A[right] > A[right + 1]) {
                    while (right + 1 < A.length && A[right] > A[right + 1]) {
                        right++;
                    }
                    longest = Math.max(longest, right - left + 1);
                } else {
                    right++;
                }
            }
            left = right;
        }

        return longest;
    }

    /**
     * @param A
     * @return 方法2；动态规划，枚举山顶
     */
    public int longestMountain1(int[] A) {
        if (A.length < 3) return 0;
        int[] left = new int[A.length];
        int[] right = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) left[i] = left[i - 1] + 1;
        }
        for (int i = A.length - 2; i > 0; i--) {
            if (A[i] > A[i + 1]) right[i] = right[i + 1] + 1;
        }

        int longest = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (left[i] > 0 && right[i] > 0)
                longest = longest > left[i] + right[i] ? longest : left[i] + right[i];
        }

        return longest == 0 ? 0 : longest + 1;
    }

    /**
     * @param A
     * @return 方法1：枚举山顶，把数组元素从左到右依次视为山顶，并分别向左右扩展，统计最大山顶
     */
    public int longestMountain0(int[] A) {
        if (A.length < 3) return 0;
        boolean isMountains = false;
        int longest = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            int max = 0;
            while (left < i && left >= 0 && right > i && right <= A.length - 1) {
                if (A[left] < A[left + 1] && A[right - 1] > A[right]) {
                    isMountains = true;
                    left--;
                    right++;
                    max += 2;
                } else {
                    break;
                }
            }
            if (isMountains) {
                while (left < i && left >= 0) {
                    if (A[left] < A[left + 1]) {
                        left--;
                        max++;
                    } else {
                        break;
                    }
                }
                while (right > i && right <= A.length - 1) {
                    if (A[right - 1] > A[right]) {
                        right++;
                        max++;
                    } else {
                        break;
                    }
                }
            }
            longest = longest > max ? longest : max;
            isMountains = false;
        }
        return longest == 0 ? 0 : longest + 1;
    }
}
