package JavaSE.day27;

import java.lang.reflect.Field;

public class Tool {
    public void setProperty(Object obj,String propertyName,Object value) throws NoSuchFieldException, IllegalAccessException {
        //根据对象获取字节码文件
        Class c = obj.getClass();
        //获取该对象的propertyName成员变量
        Field field = c.getDeclaredField(propertyName);
        //去想访问检查
        field.setAccessible(true);
        //给对象的成员变量赋值
        field.set(obj,value);
    }
}
