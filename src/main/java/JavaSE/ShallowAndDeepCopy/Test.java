package JavaSE.ShallowAndDeepCopy;

public class Test {
    public static void main(String[] args) throws Exception {
        //引用拷贝
        System.out.println("引用拷贝");
        Teacher t1 = new Teacher("t3", 3);
        Studnet s1 = new Studnet("s1", 1, t1);
        Studnet s2 = s1;
        s2.setAge(2);
        s2.setName("s2");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //浅拷贝
        System.out.println("浅拷贝");
        Teacher t2 = new Teacher("t2", 2);
        Studnet s3 = new Studnet("s3", 3, t2);
        Studnet s4 = (Studnet) s3.clone();
        System.out.println(s3.toString() + "-" + s3.getTeacher().toString());
        System.out.println(s4.toString() + "-" + s4.getTeacher().toString());
        s4.setName("s4变了");
        s4.setAge(4);
        System.out.println(s3.toString() + "-" + s3.getTeacher().toString());
        System.out.println(s4.toString() + "-" + s4.getTeacher().toString());

        //深拷贝
        System.out.println("深拷贝");
        Teacher t3 = new Teacher("t3", 3);
        Studnet s5 = new Studnet("s5", 5, t3);
        Studnet s6 = (Studnet) s5.deepClone();
        s6.getTeacher().setName("s6老师变了");
        System.out.println(s5.toString() + "-" + s5.getTeacher().toString());
        System.out.println(s6.toString() + "-" + s6.getTeacher().toString());
    }
}
