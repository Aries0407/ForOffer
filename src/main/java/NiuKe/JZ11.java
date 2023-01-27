package NiuKe;

public class JZ11 {
    /*
    从高位到低位与1进行与运算，num的和即为1的个数，
    对于负数的情况，计算机中是用补吗表示的，因此不用自行转换
     */
    public int NumberOf1(int n) {
        int num = 0;
        for (int i = 31; i >= 0; i--) {
            num += n>>>i&1;
        }
        return num;
    }

    public static void main(String[] args) {
        JZ11 jz11 = new JZ11();
        System.out.println(jz11.NumberOf1(6));
        for (int i = 31; i >= 0; i--) {
            System.out.print(-6 >>> i & 1);
        }
    }
}
