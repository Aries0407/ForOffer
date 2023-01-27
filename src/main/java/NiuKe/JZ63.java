package NiuKe;

import java.util.PriorityQueue;

public class JZ63 {
    /*
    如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
    那么中位数就是所有数值排序之后位于中间的数值。
    如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
    我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

    方法一：使用大顶堆和小顶堆的思想

    方法二：构建二叉平衡搜索树
     */

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    int count = 0;

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int max = maxHeap.poll();
            minHeap.offer(max);
        } else {
            minHeap.offer(num);
            int min = minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        double d = 0;
        if (count % 2 == 0) {
            d = (minHeap.peek() + maxHeap.peek()) / 2;
        } else {
            d = minHeap.peek();
        }
        return d;
    }

    public static void main(String[] args) {

    }
}
