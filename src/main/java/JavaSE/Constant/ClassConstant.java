package JavaSE.Constant;

import java.io.ObjectStreamConstants;

/**
 * @author Aries
 * @date 2023/1/25 10:23
 */
public class ClassConstant implements InterfaceConstant{
    private final static int SUCCESS= 11;
    private final static int INTERFACE_FIRST= 12;

    public static void main(String[] args) {
        System.out.println(ClassConstant.SUCCESS);
        System.out.println("----------------------------");
        System.out.println(InterfaceConstant.INTERFACE_FIRST);
        InterfaceConstant classConstant = new ClassConstant();
        System.out.println(INTERFACE_FIRST);
        System.out.println(classConstant.INTERFACE_FIRST);
        System.out.println("----------------------------");


        System.out.println(ObjectStreamConstants.baseWireHandle);

        System.out.println("----------------------------");

        System.out.println(INTERFACE_FIRST == ObjectStreamConstants.baseWireHandle);
    }
}
