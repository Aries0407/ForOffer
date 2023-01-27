package JavaSE.Sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyRadixSort {
    public static void main(String[] args) {
        int num[] = {10, 8, 33, 54, 1, 6, 12, 43, 32, 27};
        radixSort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void radixSort(int[] num) {
        int m = getMax(num);   //用来寻找最大元素长度
        int n = 1;   //用来取位，1用来表示取个位数字，10用来表示十位数字
        //表示0-9的每一个桶
        Queue buckets[] = new Queue[10];
        for (int i = 0; i < buckets.length ; i++) {
            buckets[i] = new LinkedList();
        }
        /*
        不可以用Arrays.fill(buckets, new LinkedList<Integer>());
        因为该语句会将所有数组元素添加同一个队列对象，需要用不同的对象进行初始化
         */
        //当基数排序次数小于len时，继续进行基数排序
        while (n < m) {
            //使用基数排序时需要从低位开始，因为在比较过程中有些数字可能没有高位
            for (int x : num) {
                int val = (x / n) % 10;
                buckets[val].offer(x);
            }

            int k = 0;
            for (Queue queue : buckets) {
                while (!queue.isEmpty()) {
                    num[k] = (int) queue.poll();
                    k++;
                }
            }
            n *= 10;
        }
    }

    private static int getMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
