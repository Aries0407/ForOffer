package NiuKe;

import java.util.Arrays;

public class JZ35 {

    /*
    在数组中的两个数字，如果前面一个数字大于后面的数字，
    则这两个数字组成一个逆序对。
    输入一个数组，求出这个数组中的逆序对的总数。
     */
    int count2 = 0;

    public int InversePairs2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count2++;
                }
            }
        }
        return count2;
    }


    public int InversePairs(int[] array) {
        int len = array.length;
        if (len < 2) return 0;
        int copy[] = Arrays.copyOf(array, len);
        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);
    }

    private int reversePairs(int[] copy, int left, int right, int[] temp) {
        if (left == right) return 0;
        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(copy, left, mid, temp);
        int rightPairs = reversePairs(copy, mid + 1, right, temp);
        if (copy[mid] <= copy[mid + 1]) {
            return leftPairs + rightPairs;
        }
        int crossPairs = mergeAndCount(copy, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    private int mergeAndCount(int[] copy, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = copy[i];
        }
        int i = left;
        int j = mid + 1;
        int count = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                copy[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                copy[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                copy[k] = temp[i];
                i++;
            } else {
                copy[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JZ35 jz35 = new JZ35();
        int[] test = {1, 3, 2, 4, 6, 5};
        jz35.InversePairs(test);
    }
}
