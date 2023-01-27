package LeetCode;

public class T941 {
    public static void main(String[] args) {
         T941 t941 = new T941();
         int []A = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(t941.validMountainArray(A));

    }

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int i = 0;
        int j = A.length - 1;
        while (i + 1 <A.length && A[i] < A[i + 1]) i++;
        while (j - 1 >= 0 && A[j] < A[j - 1]) j--;
        if (i == j && i > 0 && j < A.length - 1) return true;
        else return false;
    }
}
