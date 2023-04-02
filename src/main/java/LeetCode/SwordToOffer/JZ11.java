package LeetCode.SwordToOffer;

public class JZ11 {
    public int minArray(int[] numbers) {
        if (numbers.length==1)  return numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]<numbers[i-1]){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
