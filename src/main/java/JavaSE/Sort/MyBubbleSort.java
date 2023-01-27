package JavaSE.Sort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int num[] = {10,8,33,54,1,6,12,43,32,27};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void bubbleSort(int[]num){
        for (int i = 0; i < num.length ; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if (num[i]>num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
