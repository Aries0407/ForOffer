package NiuKe;

public class JZ10 {

    /*
    边界条件也要考虑
     */
    public int RectCover(int target) {
        if(target < 1 ){
            return 0;
        }else if(target == 2 || target == 1){
            return target;
        }else{
            return RectCover(target -1) + RectCover(target -2);
        }
    }

    public static void main(String[] args) {
         JZ10 jz10 = new JZ10();
         System.out.println(jz10.RectCover(4));
    }
}
