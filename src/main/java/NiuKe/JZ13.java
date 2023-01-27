package NiuKe;


public class JZ13 {


    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > 0 ; j--) {
                if (array[j-1] % 2 == 0 && array[j] % 2 == 1) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
      JZ13 jz13 = new JZ13();
      int []a = {1,2,3,4,5,6,7};
      jz13.reOrderArray(a);
    }
}
