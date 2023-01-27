package JavaSE.Sort;


public class FastPower {
    /**
     * 快速幂的实现
     *
     * @param a
     * @param b
     * @return
     */

    public int power(int a,int b){
        int res = 1;
        for (int i = 1; i <= b ; i++) {
            res *= a;
        }
        return res;
    }
    //快速幂递归写法
    public int FastPower2(int a,int b){
        if (b==0) return 1;
        if (b==1) return a;
        int result = FastPower2(a,b>>1);
        result *= result;
        if (b%2==1) result *= a;
        return result;
    }

    //快速幂非递归写法
    public int FastPower1(int a, int b) {
        //假设a和b是大于等于0的数，那么在幂运算中，结果的最小值为1
        int result = 1;
        //为了便于理解，这里多申请一个变量，位权
        int base_pow_positionPower = a;
        while (b != 0) {
            if ((b & 1) != 0) {
                result *= base_pow_positionPower;
            }
            b >>= 1;
            base_pow_positionPower *= base_pow_positionPower;
        }
        return result;
    }

    public static void main(String[] args) {
        FastPower test = new FastPower();
        System.out.println(test.FastPower2(2, 3));
        double res = test.power(2, 3);
    }
}
