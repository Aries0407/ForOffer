package LeetCode.Thread;

/**
 * @author Aries
 * @date 2023/3/24 22:51
 */
public class test {
    public static void main(String[] args) {

    }
}

class T1 extends Thread {
    private int count;

    public T1(int i) {
        this.count = i;
    }

    @Override
    public void run() {
        System.out.println();
    }
}

class T2 extends Thread {
    private int count;

    public T2(int i) {
        this.count = i;
    }

    @Override
    public void run() {
        System.out.println();
    }
}

class T3 extends Thread {
    private int count;

    public T3(int i) {
        this.count = i;
    }

    @Override
    public void run() {
        System.out.println();
    }
}
