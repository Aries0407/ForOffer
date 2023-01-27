package LeetCode.WeeklyCompetition;

public class WC5627 {
    //未完成
    public static int stoneGameVII(int[] stones) {
        int sum = 0;
        for (int i : stones) {
            sum += i;
        }
        int diff = 0;
        int alice = 0;
        int bob = 0;
        int i = 0;
        int j = stones.length - 1;
        int flag = 1;
        while (i <= j) {
            if (flag % 2 == 1) {
                if (stones[i] > stones[j]) {
                    sum -= stones[j];
                    alice += sum;
                    j--;
                } else {
                    sum -= stones[i];
                    alice += sum;
                    i++;
                }
                System.out.println("alice " + alice);
            } else {
                if (stones[i] > stones[j]) {
                    sum -= stones[i];
                    bob += sum;
                    i++;
                } else {
                    sum -= stones[j];
                    bob += sum;
                    j--;
                }
                System.out.println("bob " + bob);
            }
            flag++;
        }
        diff = alice - bob;
        return diff;
    }

    public static void main(String[] args) {
        int[] stones = {5, 3, 1, 4, 2};
        System.out.println(WC5627.stoneGameVII(stones));
    }
}
