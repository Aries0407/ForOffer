package JavaSE.Sort;

import java.util.Arrays;

public class MyHeapSort {
    /*
    此处为大顶堆
     */
    public static void main(String[] args) {
        int num[] = {10, 8, 33, 54, 1, 6, 12, 43, 32, 27};
        heapSort(num, num.length);
        System.out.println(Arrays.toString(num));
    }

    private static void heapSort(int[] num, int n) {
        /*
        建堆,起始位置为第一个非叶结点
         */
        for (int i = num.length / 2 - 1; i >= 0; i--) {
            heapAdjust(num, i, n);
        }
        /*
        排序
        拿出堆顶元素与堆中最后一个叶子结点交换，然后再进行堆调整
         */
        for (int i = n - 1; i >= 0; i--) {
            swap(num, i, 0);
            //每次拿出堆顶元素，堆的大小都要减一
            heapAdjust(num, 0, i);
        }
    }

    //堆调整
    private static void heapAdjust(int[] num, int index, int n) {
        //父结点和左右子结点在数组中索引的关系
        int parent = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        //因为是构建大顶堆，所以如果父结点元素小于孩子结点元素，则交换
        if (left < n && num[parent] < num[left] && right < n && num[left] > num[right]) {
            parent = left;
        }
        if (right < n && num[parent] < num[right] && num[left] < num[right]) {
            parent = right;
        }
        if (parent != index) {
            swap(num, parent, index);
            heapAdjust(num, parent, n);
        }
    }

    //交换数组中两个元素位置
    private static void swap(int num[], int m, int n) {
        int temp = num[n];
        num[n] = num[m];
        num[m] = temp;
    }
}
