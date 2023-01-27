package interview;

import java.util.Arrays;
import java.util.Comparator;

public class DiDi1 {
    /*
    最长回文子串
     */
    public static void main(String[] args) {
        int[][] nums=new int[][]{{1,3},{4,5},{1,2},{3,7}};
        //方法一
        Arrays.sort(nums,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }else{
                    return a[0]-b[0];
                }
            }
        });


        // 方法二，使用匿名表达式
        // (a,b)->a[1]-b[1]会自动转变成上面的形式
        /*Arrays.sort(nums,(a,b)->a[1]-b[1]);*/
        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }
    }
}
