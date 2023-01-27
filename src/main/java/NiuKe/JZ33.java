package NiuKe;

public class JZ33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0 ) return 0;
        int nums[] = new int[index];
        nums[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        for (int i = 1; i < index; i++) {
            int min = Math.min(nums[multiply2] * 2, Math.min(nums[multiply3] * 3,
                    nums[multiply5] * 5));
            nums[i] = min;
            if (nums[multiply2] * 2== min){
                multiply2++;
            }
            if (nums[multiply3] * 3 == min){
                multiply3++;
            }
            if (nums[multiply5] * 5 == min){
                multiply5++;
            }
        }

        return nums[index-1];
    }

    public static void main(String[] args) {
        JZ33 jz33 = new JZ33();
        System.out.println(jz33.GetUglyNumber_Solution(10));
    }
}
