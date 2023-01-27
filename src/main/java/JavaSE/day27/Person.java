package JavaSE.day27;

/**
 * @author Aries
 * @date 2021/3/25 15:19
 */
public class Person {
    int age;
    String name;
    private String sex;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void show() {

    }

    public void method() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
