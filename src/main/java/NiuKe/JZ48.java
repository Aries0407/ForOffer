package NiuKe;

public class JZ48 {

    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2)<<1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        JZ48 jz48 = new JZ48();
        System.out.println(jz48.Add(3, 3));
    }
}
