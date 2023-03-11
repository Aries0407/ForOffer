package JavaSE.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Aries
 * @date 2023/3/5 10:07
 */
public class NumberFilter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);
        list.stream()
                .filter(s -> s % 2 == 0)
                .forEach(System.out::print);
        System.out.println("-------------------");
        List<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三,23", "李四,24", "王五,25");
        list1.stream().filter(s -> Integer.parseInt(s.split(",")[1]) > 24)
                .forEach(System.out::println);

        Map<String, String> stringMap = list1.stream().
                filter(s -> Integer.parseInt(s.split(",")[1]) > 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(stringMap);
        System.out.println("---------");
        List<String> manList = new ArrayList<>();
        List<String> womanList = new ArrayList<>();
        Collections.addAll(manList, "菜坤坤,24", "叶浔晗,23", "刘不甜,22", "吴签,23",
                "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womanList, "赵小颖,35", "杨颖,36", "高圆圆,43", "张天天,31",
                "刘诗,35", "杨小幂,33");
        Stream<String> manStream = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        Stream<String> womanStream = womanList.stream().filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        System.out.println("---------");
        List<Actor> collect1 = Stream.concat(manStream, womanStream).map(s -> new Actor(s.split(",")[0],
                Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(collect1);


    }


}
