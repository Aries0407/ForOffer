package LeetCode;

public class T736 {

    //动态规划
    public static int minCostClimbingStairs(int[] cost) {
        int []ret = new int[cost.length+1];
        for (int i = 0; i < cost.length; i++) {
            ret[i] = cost[i];
        }
        for (int i = 2; i < ret.length; i++) {
            if (ret[i - 1] > ret[i - 2]) {
                ret[i] += ret[i - 2];
            } else {
                ret[i] += ret[i - 1];
            }
        }
        return ret[cost.length];
    }

    public static void main(String[] args) {
        int []cost = {10, 15, 20};
        System.out.println(T736.minCostClimbingStairs(cost));
    }
}
