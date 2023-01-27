package NiuKe;

public class JZ37 {
    /*
    题目描述：统计一个数字在排序数组中出现的次数。
     */

    /*
    题目考察：二分法
     */
    public int GetNumberOfK(int[] array , int k){

         return 0;
    }

    /*
    题目没有说是升序还是降序，但是有序就代表着k是连续存在的
     */
    public int GetNumberOfK1(int[] array , int k) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == k){
                count++;
            }
            if (count>0 && array[i]!=k )  break;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
