package JavaSE.Sort;

import java.util.Arrays;

public class MySelectSort {
    /*
    选择排序
     */
    public static void main(String[] args) {
        int num[] = {10,8,33,54,1,6,12,43,32,27};
        selectSort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void selectSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int index = i;
            for (int j = i+1; j < num.length ; j++) {
                if(num[j] < num[index] ){
                    index = j;
                }
            }
            int temp = num[index];
            num[index] = num[i];
            num[i] = temp;
        }
    }
}
