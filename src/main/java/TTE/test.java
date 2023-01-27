package TTE;

public class test {

    public static void set(int i) {
        i = i + 10;
    }


    public static void set(int i, int j) {
        i = i + 10;
    }

    public static void main(String[] args) {
        int i = 0;
        set(i);
        System.out.println(i);
        String s1 = "ab";
        String s2 = " a" + " b";
        String s3 = " a";
        String s4 = " b";
        String s5 = s3+ s4;

    }
}
