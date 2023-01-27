package NiuKe;

public class JZ1 {
    /*
    牛客网，剑指offer第一题   d

    题目描述：
    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
    判断数组中是否含有该整数。
     */

    public boolean Find1(int target, int [][] array){
        /*
        方法一：暴力搜索，时间复杂度为O（n*n),空间复杂度为O(1)
         */
        for(int i = 0 ; i<array.length;i++){
            for(int j = 0 ; j<array[i].length; j++){
                if(array[i][j] == target){
                    System.out.println("yes1");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Find2(int target, int [][] array){
        /*
        方法二：从左下或者右上找原理相同,此处为右上;时间复杂度为O(长+宽),空间复杂度为O(1)
         */
        for(int i = 0,j = array[i].length-1 ; j >= 0&&i<array.length ; ){
             if(array[i][j]==target){
                 System.out.println("yes2");
                 return true;
             }else if(array[i][j]>target){
                 j--;
             }else{
                 i++;
             }
        }
        return false;
    }

    public static void main(String []args){
        int [][]array = {{0,1,2,3,4},{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8}};
        int target = 4 ;
        JZ1 jz1 = new JZ1();
        jz1.Find2(target,array);
    }
}
