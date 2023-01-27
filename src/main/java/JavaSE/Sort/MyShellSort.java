package JavaSE.Sort;

import java.util.Arrays;

public class MyShellSort {
    public static void main(String[] args) {
        int num[] = {10, 8, 33, 54, 1, 6, 12, 43, 32, 27};
        shellSort(num);
        System.out.println(Arrays.toString(num));
    }

    /*
    希尔排序其实是对插入排序的优化,希尔排序又叫减小增量排序
     */
    private static void shellSort(int[] num) {
        //初始增量一般为数组长度的一半
        int increment = num.length / 2;
        while (increment >= 1) {
            for (int i = increment; i < num.length; i++) {
                int temp = num[i];
                int j = i - increment;
                while (j >= 0 && num[j] > temp) {
                    num[j + increment] = num[j];
                    j = j - increment;
                }
                num[j + increment] = temp;
            }
            //增量减半
            increment /= 2;
        }
    }
}
