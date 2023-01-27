package JavaSE.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        streamTest.mytest();
    }

    public static void mytest(){
        List<Integer> list = Arrays.asList(1,4,2,6,3,8,6,3,9,0,3);
        Stream<Integer> stream = list.stream();
        stream.sorted().forEach(System.out::println);
    }
}
