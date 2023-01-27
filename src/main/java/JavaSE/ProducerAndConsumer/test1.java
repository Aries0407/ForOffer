package JavaSE.ProducerAndConsumer;

import javax.management.remote.rmi._RMIConnection_Stub;

/**
 * @author Aries
 * @date 2021/11/29 10:39
 */
public class test1 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int i = 0;
        int j = nums.length - 1;
        int target = 9;
        int mid = j / 2;
        while (i < j) {
            if (nums[mid] > target) {
                j = mid;
                mid = (j - i) / 2 + i;
            } else if (nums[mid] < target) {
                i = mid;
                mid = (j - i) / 2 + i;
            } else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
