package NiuKe;

import java.util.ArrayList;

public class JZ42 {
    /*
    输入一个递增排序的数组和一个数字S，在数组中查找两个数，
    使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     */
    public static void main(String[] args) {

    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        //双指针法
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            //先从右端移动是为了保证两个数的乘积最小
            if (array[i] + array[j] > sum) j--;
            if (array[i] + array[j] < sum) i++;
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            }
        }
        return list;
    }
}
