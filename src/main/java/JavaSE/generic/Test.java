package JavaSE.generic;

/**
 * @author Aries
 * @date 2023/3/18 21:12
 */
public class Test {
    public static void main(String[] args) {
        Student<String> stringStudent = new Student<>();
        stringStudent.set("zz");
        System.out.println(stringStudent.getT());

        stringStudent.setNumber("1");
        stringStudent.setNumber(1);

        GenericInterface<String> genericInterface = new GenericImpl<>();
        genericInterface.getT();


    }
}
