package JavaSE.Constant;

import java.io.ObjectStreamConstants;

import static JavaSE.Constant.InterfaceConstant.INTERFACE_FIRST;

/**
 * @author Aries
 * @date 2023/1/27 9:38
 */
public class ConstantTest {
    public static void main(String[] args) {
        System.out.println(ClassConstant.SUCCESS);
        System.out.println("----------------------------");
        System.out.println(INTERFACE_FIRST);
        InterfaceConstant classConstant = new ClassConstant();
        System.out.println(INTERFACE_FIRST);
        System.out.println(INTERFACE_FIRST);
        System.out.println("----------------------------");


        System.out.println(ObjectStreamConstants.baseWireHandle);

        System.out.println("----------------------------");

        System.out.println(INTERFACE_FIRST == ObjectStreamConstants.baseWireHandle);

        System.out.println("----------------------------");

        System.out.println(ClassConstant.SUCCESS);
    }
}
