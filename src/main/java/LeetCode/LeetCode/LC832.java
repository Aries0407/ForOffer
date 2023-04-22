package LeetCode.LeetCode;

/**
 * @author Aries
 * @date 2021/2/24 9:26
 */
public class LC832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int k = 0 ; k < A.length; k++){
            int i = 0;
            int j = A[k].length-1;
            while(i<j){
                int temp = A[k][i];
                A[k][i] = A[k][j];
                A[k][j] = temp;
                A[k][i] = A[k][i] == 1 ? 0 : 1;
                A[k][j] = A[k][j] == 1 ? 0 : 1;
                i++;
                j--;
            }
        }
        return A;
    }
}
