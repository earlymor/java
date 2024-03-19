package advanced.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

//        demo1();
//        demo2();
//        demo3();
        demo4();
    }

    public static void demo1() {
        // 双列集合 无法直接使用 先转换为Set
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.keySet().stream().forEach(s -> System.out.println(s));
    }

    public static void demo2() {
        // filter
        // limit
        // skip

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张三", "张三丰", "张无忌", "梅超风", "郭靖");
        arrayList.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }

    public static void demo3() {
        // 筛选与映射
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "strawberry");

        // 筛选出长度大于5的水果，并转换成大写形式
        List<String> result = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void demo4() {
        // 归约操作
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 对所有元素求和
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
    public static void demo5(){
        // 分组与分区
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "strawberry");

        // 按照首字母进行分组
        Map<Character, List<String>> groupedByFirstLetter = fruits.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupedByFirstLetter);

        // 根据长度是否大于5进行分区
        Map<Boolean, List<String>> partitioned = fruits.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));

        System.out.println(partitioned);
    }
    public static void demo6(){
        // 并行流
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 使用并行流对所有元素求和
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
