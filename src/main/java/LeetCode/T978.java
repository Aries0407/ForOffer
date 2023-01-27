package LeetCode;

public class T978 {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length <= 1) return 1;
        if (arr.length == 2 && arr[0] != arr[1]) return 2;
        int max = 0;
        for (int k = 1; k < arr.length - 1; k++) {
            max = Math.max(max, helper1(k + 1, arr));
            max = Math.max(max, helper2(k - 1, k, arr));
        }
        return max;
    }

    private int helper2(int i, int j, int[] arr) {
        int ret = 0;
        if (arr[i] != arr[j]) {
            ret = 2;
            while (i > 0 && j < arr.length - 1) {
                if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ||
                        (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                    i--;
                    ret++;
                } else if ((arr[j] < arr[j - 1] && arr[j] < arr[j + 1]) ||
                        (arr[j] > arr[j - 1] && arr[j] > arr[j + 1])) {
                    j++;
                    ret++;
                } else {
                    break;
                }
            }
            if (j == arr.length - 1) ret++;
        }
        return ret;
    }

    private int helper1(int i, int[] arr) {
        int ret = 1;
        int j = i;
        while (i > 0 && j < arr.length - 1) {
            if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ||
                    (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                i--;
                ret++;
            } else if ((arr[j] < arr[j - 1] && arr[j] < arr[j + 1]) ||
                    (arr[j] > arr[j - 1] && arr[j] > arr[j + 1])) {
                j++;
                ret++;
            } else {
                break;
            }
        }
        return ret;
    }
}
