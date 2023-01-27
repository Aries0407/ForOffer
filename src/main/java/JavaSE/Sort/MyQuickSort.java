package JavaSE.Sort;

import java.util.Arrays;
import java.util.Random;

public class MyQuickSort {

    //快速排序--啊哈算法
    public static void main(String[] args) {
        Random random = new Random();
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = random.nextInt(100);
        }
        quickSort(num, 0, num.length - 1);
        System.out.println(Arrays.toString(num));
    }

    private static void quickSort(int arr[], int low, int high) {
        //判断终止的条件在递归函数中很重要
        //这里的大于等于的大于有什么区别？？
        if (low >= high) return;
        int base = arr[low];    //基准数
        int i = low;
        int j = high;
        while (i < j) {
            //当i<j时继续，当i=j时停止
            /*
            先从右边开始找起，很重要
            从右边找小于基准数的元素，从左边找大于基准数的元素，然后交换二者；
             */

            /*
            这里的大于等于和大于有什么区别？？
            在这里加>=很重要，如果少了等于号，那么它很有可能会和自己交换
            而和自己交换或者和与自己相等的值的交换没有意义，这是原因之一，但好像不是全部。
             */
            while (i < j && arr[j] >= base) {
                j--;
            }
            //这里的小于等于和小于有什么区别？？
            while (i < j && arr[i] <= base) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        /*
        /将基准数与 i==j的位置的元素交换，此处a[i]==a[j]
        */
        arr[low] = arr[i];
        arr[i] = base;
        //递归调用 i==j 左边和右边的部分
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }
}
