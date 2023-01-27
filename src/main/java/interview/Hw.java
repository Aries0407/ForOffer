package interview;

import java.util.LinkedList;

/**
 * @author Aries
 * @date 2021/9/14 11:23
 */
public class Hw {
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 3, 6, 4, 8, 9, 10};
        int[] nums2 = {5, 6, 6, 8, 8, 9, 10, -1};
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] > nums1[i]) {
                    System.out.print(nums1[j] + " ");
                    break;
                }
            }
        }
        System.out.println(-1 + " ");

        LinkedList<Integer> list = new LinkedList<>();
        for (int i : nums1) {
            list.add(i);
        }
        list.pollFirst();
        for (int i = 0; i < nums1.length; i++) {
            if (list.size() == 0) {
                System.out.println(-1);
                continue;
            }
            if (nums1[i] < list.peekFirst()) {
                System.out.print(list.poll()+ " ");
            } else {
                list.pollFirst();
                i--;
            }
        }
    }
}
