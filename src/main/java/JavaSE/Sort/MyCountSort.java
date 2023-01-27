package JavaSE.Sort;

public class MyCountSort {
    public static void main(String[] args) {
        int num[] = {10, 10, 33, 54, 33, 6, 6, 7, 3, 3};
        countingSort(num);
    }

    private static void countingSort(int[] num) {
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        int offset = 0 - min;
        int count[] = new int[max - min + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i] + offset]++;
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                System.out.print(i - offset + " ");
                count[i]--;
            }
        }
    }
}
