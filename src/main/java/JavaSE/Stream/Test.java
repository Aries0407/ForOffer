package JavaSE.Stream;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Aries
 * @date 2023/3/4 13:55
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("张无忌", "周芷若", "赵敏", "张强"
                , "张三丰"));

        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(
                System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        map.put("4", "44");

        map.forEach((key, value) -> System.out.println(key));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Arrays.stream(arr).forEach(System.out::println);
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌-男-15","周芷若-女-14", "赵敏-女-13",
                "张强-男-20", "张三丰-男100", "张翠山-男-100", "张良-男-35", " 王二麻子-男-37",
                "谢广坤-男-41");

        List<String> collect = list1.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
