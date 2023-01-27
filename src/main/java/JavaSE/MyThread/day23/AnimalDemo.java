package JavaSE.MyThread.day23;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal d = AnimalFactory.createAnimal("dog");
        d.eat();
        d = AnimalFactory.createAnimal("cat");
        d.eat();

    }
}
