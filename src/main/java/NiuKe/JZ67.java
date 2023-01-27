package NiuKe;

public class JZ67 {

    public int cutRope(int target) {
        if (target==2){
            return 1;
        }if(target==3){
            return 2;
        }
        if (target%3==0){
            return (int)Math.pow(3,target/3);
        }
        else if (target%3==1){
            return 4*(int)Math.pow(3,target/3 - 1);
        }
        else{
            return 2*(int)Math.pow(3,target/3);
        }
    }

    public static void main(String[] args) {
         JZ67 jz67 = new JZ67();
        System.out.println(jz67.cutRope(16));

    }
}
