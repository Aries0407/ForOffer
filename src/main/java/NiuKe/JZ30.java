package NiuKe;

import java.util.Arrays;

public class JZ30 {
    /*
    HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
    今天测试组开完会后,他又发话了:在古老的一维模式识别中,
    常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
    但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
    例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
    给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)

    本题主要考察动态规划
     */

    public int FindGreatestSumOfSubArray2(int[] array){
        if (array.length == 0 ){
            return 0;
        }
        int res = array[0];
        int sum = 0;
        for (int x : array){
            sum = sum > 0 ? sum + x : x;
            res = Math.max(sum,res);
        }
        return res;
    }


    /*
    方法一：暴力法，复杂度太高
     */
    public int FindGreatestSumOfSubArray1(int[] array) {
        int res [] = new int [1];
        res[0] = array[0];
        int[] max = new int[array.length];
        Arrays.fill(max, 0);
        for (int i = 0; i < array.length; i++) {
            helper(i, array, max,res);
        }
        System.out.println(res[0]);
        return res[0];
    }

    private void helper(int i, int[] array, int[] max,int []res) {
        for (int j = i; j < array.length; j++) {
            max[i] += array[j];
            if (res[0] < max[i]) {
                res[0] = max[i];
            }
        }
    }



    public static void main(String[] args) {
        JZ30 jz30 = new JZ30();
        int a[] = {1, -2, 3, 10, -4, 7, 2, -5};
        jz30.FindGreatestSumOfSubArray1(a);
    }
}
