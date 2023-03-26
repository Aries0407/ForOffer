package JavaSE.conflict;

/**
 * @author Aries
 * @date 2023/3/20 10:06
 */
public class Main implements Interface1, Interface2{
    @Override
    public void test() {
        System.out.printf("test1");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
