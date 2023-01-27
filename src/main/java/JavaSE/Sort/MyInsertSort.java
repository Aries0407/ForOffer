package JavaSE.Sort;

import java.util.Arrays;

public class MyInsertSort {
    public static void main(String[] args) {
        int num[] = {10, 8, 33, 54, 1, 6, 12, 43, 32, 27};
        insertSort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void insertSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;
            while (j>=0&&num[j]>key){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;
        }
    }
}
