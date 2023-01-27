package JavaSE.Sort;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        MyMergeSort myMergeSort = new MyMergeSort();
        int[] num = {3, 4, 2, 7, 4, 5, 1, 8, 0, 9};
        myMergeSort.sort(num, 0, num.length - 1);
        System.out.println(Arrays.toString(num));
    }


    public void sort(int[] num, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(num, left, mid);
        sort(num, mid + 1, right);
        merge(num, left, mid, right);
    }

    public void merge(int[] num, int left, int mid, int right) {
        int[] tempArr = new int[num.length];
        int i = left;
        int ii = left;
        int center = mid + 1;
        while (left <= mid && center <= right) {
            if (num[left] <= num[center]) {
                tempArr[i++] = num[left++];
            } else {
                tempArr[i++] = num[center++];
            }
        }
        while (left <= mid) {
            tempArr[i++] = num[left++];
        }
        while (center <= right) {
            tempArr[i++] = num[center++];
        }
        while (ii <= right) {
            num[ii] = tempArr[ii++];
        }
    }
}
