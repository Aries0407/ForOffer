package LeetCode.SwordToOffer;

public class JZ5 {

    public String replaceSpace(String s) {

       s = s.replaceAll(" ","%20");
       return s;
    }

    public static void main(String[] args) {
       JZ5 jz5 = new JZ5();
       System.out.println(jz5.replaceSpace("We are happy."));
    }
}
