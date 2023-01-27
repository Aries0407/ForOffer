package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author Aries
 * @date 2021/8/21 15:06
 */
public class WY1 {

    public static int recursionBinarySearch(int[] arr,int key,int low,int high){

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        int middle = (low + high) / 2;
        if(arr[middle] > key){
            return recursionBinarySearch(arr, key, low, middle - 1);
        }else if(arr[middle] < key){
            return recursionBinarySearch(arr, key, middle + 1, high);
        }else {
            return middle;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int target = sc.nextInt();
        String[] strs = s.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(nums);

        System.out.println();
    }
}
