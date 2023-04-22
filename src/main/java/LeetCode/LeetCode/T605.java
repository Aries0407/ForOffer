package LeetCode.LeetCode;

public class T605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && n >= 1) return false;
        for (int i = 1; i < flowerbed.length ; i++) {
            if (i == 1 && flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        return n == 0;
    }

    public static void main(String[] args) {

    }
}
