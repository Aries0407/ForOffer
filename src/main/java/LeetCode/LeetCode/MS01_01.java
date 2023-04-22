package LeetCode.LeetCode;

public class MS01_01 {
    public static void main(String[] args) {
        MS01_01 ms01_01 = new MS01_01();
        System.out.println(ms01_01.isUnique("leetcode"));

    }

    //位运算
    public boolean isUnique(String astr) {
        int div = 0;
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            int temp = (int) c;
            div ^= temp;
            System.out.println(div);
            if (div == 0){
                System.out.println("yes");
                return false;
            }
        }
        return true;
    }
}
