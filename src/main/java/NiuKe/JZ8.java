package NiuKe;

public class JZ8 {

    /*
    一只青蛙一次可以跳上1级台阶，
    也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
    （先后次序不同算不同的结果）。

    求解思路：斐波那契数列
     */

    public int JumpFloor(int target) {
        if (target == 0 || target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }

    public static void main(String[] args) {
        JZ8 jz8 = new JZ8();
        System.out.println(jz8.JumpFloor(3));
    }
}
