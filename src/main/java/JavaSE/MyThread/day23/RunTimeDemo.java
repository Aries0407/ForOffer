package JavaSE.MyThread.day23;
import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
       Runtime t = Runtime.getRuntime();
       t.exec("calc");
    }
}
