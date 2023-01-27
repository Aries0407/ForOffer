package NiuKe;

import java.util.ArrayList;
import java.util.Arrays;

public class JZ51 {

    /*
    题目描述
    给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
    其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
    （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，
              B[n-1] = A[0] * A[1] * ... * A[n-2];）
    用例:
    [1,2,3,4,5]
    对应输出应该为:
    [120,60,40,30,24]
     */
    public int[] multiply(int[] A) {
        int []B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            int temp = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    temp *= A[j];
                }
            }
            B[i] = temp;
        }
        return B;
    }
    public static void main(String[] args) {

    }
}
