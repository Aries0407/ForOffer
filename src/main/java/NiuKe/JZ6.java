package NiuKe;

public class JZ6 {

    /*
    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    done
     */



    /*
    找到旋转位置->确定平移个数->逐个平移
    其实无需旋转，找到开始旋转的位置，直接返回最小值即可
     */
    public int minNumberInRotateArray(int[] array) {

        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int flag = 0;
            int pan = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    flag = i;
                    pan = array.length - flag - 1;
                    break;
                }
            }
            for(int i = 0 ; i < pan ; i++){
                int temp = array[array.length-1];
                for(int j = array.length-1 ; j > 0 ; j--){
                    array[j] = array[j-1];
                }
                array[0] = temp;
            }
            return array[0];
        }
    }

    public static void main(String[] args) {
        JZ6 jz = new JZ6();
        int a[] = {3, 4, 5, 1, 2};
        System.out.println(jz.minNumberInRotateArray(a));
        for(int i = 0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
