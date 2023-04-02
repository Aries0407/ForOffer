package LeetCode.SwordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class JZ40 {

    public static void main(String[] args) {
        int[] test = {0,0,2,3,2,1,1,2,0,4};
        JZ40 jz40 = new JZ40();
        int[] num = jz40.getLeastNumbers(test, 10);
        System.out.println(Arrays.toString(num));

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.addAll(list1);
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) return new int[0];
        if (arr.length < k) return arr;
        return search(arr, 0, arr.length - 1, k - 1);
    }

    public int[] search(int[] arr, int left, int right, int k) {
        int index = quickSortGetIndex(arr, left, right);
        if (index == k) {
            return Arrays.copyOf(arr, k + 1);
        }
        return index > k ? search(arr, left, index - 1, k) : search(arr, index + 1, right, k);
    }

    public int quickSortGetIndex(int[] arr, int low, int high) {
        int base = arr[low];
        int i = low ;
        int j = high;
        while (i < j) {
            while (i < j && arr[j] >= base) {
                j--;
            }
            while (i < j && arr[i] <= base){
                i++;
            }
            if (i >= j) break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[low] = arr[j];
        arr[j] = base;
        return j;
    }
}
