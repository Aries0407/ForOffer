package JavaSE.Sort;

/**
 * @author Aries
 * @date 2021/8/29 16:04
 */

class BaseClass{
    BaseClass (){
        System.out.println("BaseClass");
    }
    static {
        System.out.println("static BaseClass");
    }
}

public class Base extends BaseClass{
    public Base(){
        System.out.println("Base");
    }
    static {
        System.out.println("static Base");
    }

    public static void main(String[] args) {
        Base base = new Base();
    }
}
