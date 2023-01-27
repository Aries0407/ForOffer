package LeetCode;

public class LC4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int mid = 0;
        if (len % 2 == 1){
            mid = (len + 1) / 2;
        }
        int mid1 = nums1.length / 2 + 1;
        int mid2 = nums2.length / 2 + 1;
        while (true) {
            if (nums1[mid1] > nums2[mid2]) {
                mid2 = (nums2.length + mid2) / 2;
            } else {
                mid1 = (nums1.length + mid1) / 2;
            }
            return 0;
        }

    }

    //时间复杂度O(m+n)
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        double res = 0;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (i == nums1.length) {
            for (; k < nums.length; j++, k++) {
                nums[k] = nums2[j];
            }
        }
        if (j == nums2.length) {
            for (; k < nums.length; i++, k++) {
                nums[k] = nums1[i];
            }
        }
        if (nums.length % 2 == 0) {
            res = nums[nums.length / 2] + nums[nums.length / 2 - 1];
            res = res / 2.0;
        } else {
            res = nums[nums.length / 2];
        }

        return res;
    }

    public static void main(String[] args) {
        LC4 t4 = new LC4();
        int a[] = {1, 2};
        int b[] = {3, 4};
        System.out.println(t4.findMedianSortedArrays2(a, b));

    }
}
