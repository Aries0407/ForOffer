package JavaSE.day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("JavaSE.day27.Person");
        /*
        Constructor con = c.getConstructor();
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor co: cons){
            System.out.println(co);
        }
        Field []fields = c.getDeclaredFields();
        for (Field field: fields){
            System.out.println(field);
        }
         */
        /*
        System.out.println("------");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        Field address = c.getDeclaredField("address");
        address.set(obj,"北京");
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"marry");
        System.out.println(obj);
        System.out.println("------");
         */
        /*
        //获取所有方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method);
        }
         */
        //获取单个方法
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        Method m1 = c.getMethod("show");
        m1.invoke(obj);

        Method m2 = c.getMethod("method", String.class);
        m2.invoke(obj," hello");
        Method m3 = c.getMethod("getString", String.class, int.class);
        Object objectstring = m3.invoke(obj,"hello" ,100);
        System.out.println(objectstring);
        String s = (String)m3.invoke(obj,"hello",100);
        System.out.println(s);

        Method m4 = c.getDeclaredMethod("funtion");
        m4.setAccessible(true);
        m4.invoke(obj);
    }
}
