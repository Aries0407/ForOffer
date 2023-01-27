package NiuKe;

public class JZ50 {
    /*
    在一个长度为n的数组里的所有数字都在0到n-1的范围内。
    数组中某些数字是重复的，但不知道有几个数字是重复的。
    也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
    例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     */

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        int count[] = new int[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            count[numbers[i]]++;
        }
        for (int i = 0; i < count.length ; i++) {
            if (count[i]>=2) {
                flag = true;
                duplication[0]=i;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}
