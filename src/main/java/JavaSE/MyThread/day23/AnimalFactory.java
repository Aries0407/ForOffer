package JavaSE.MyThread.day23;

public class AnimalFactory {
    private AnimalFactory(){

    }

    public static Animal createAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }else{
            return null;
        }
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
