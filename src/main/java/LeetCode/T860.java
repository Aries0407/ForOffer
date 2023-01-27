package LeetCode;

public class T860 {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        int money = 0;
        for (int i = 0; i < bills.length; i++) {
            if (money < bills[i] - 5) {
                return false;
            } else {
                int temp = bills[i] - 5;
                if (ten >= temp / 10) {
                    ten -= temp / 10;
                    temp %= 10;
                } else {
                    temp -= 10 * ten;
                    ten = 0;
                }
                if (five >= temp / 5) {
                    five -= temp / 5;
                } else {
                    return false;
                }
            }
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                ten++;
            }
            if (bills[i] == 20) {
                twenty++;
            }
            money = five * 5 + ten * 10 + twenty * 20;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 10, 20};
        System.out.println(T860.lemonadeChange(bills));
    }
}
