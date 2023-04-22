package LeetCode.LeetCode;

public class LC1375 {

    public int numTimesAllBlue(int[] light) {
        int count = 0;
        int shine = 0;
        int farest = -1;
        for (int i = 0; i < light.length; i++) {
            shine++;
            farest = Math.max(farest, light[i]);
            if (farest == shine) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = {4, 1, 2, 3};
        LC1375 t1375 = new LC1375();
        System.out.println(t1375.numTimesAllBlue(test));
    }
}
