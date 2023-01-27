package JavaSE.day27;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //获取字节码文件对象
        Class c = Class.forName("JavaSE.day27.Person");
        //获取私有构造方法
        Constructor con = c.getDeclaredConstructor(String.class);
        //暴力访问
        //设置为true，，则指示反射的对象在使用时应取消Java的语言访问检查
        con.setAccessible(true);
        //使用此Constructor对象表示构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例
        Object obj = con.newInstance("风清扬");
        System.out.println(obj);
    }
}
