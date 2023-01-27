package NiuKe;

public class JZ7 {
        // done
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        JZ7 jz7 = new JZ7();
        System.out.println(jz7.Fibonacci(39));
    }
}
