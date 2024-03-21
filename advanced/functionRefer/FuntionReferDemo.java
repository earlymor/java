package advanced.functionRefer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuntionReferDemo {
    public static void main(String[] args) {

    }

    public static void demo1() {

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张三,11", "李四,12", "王五,13", "赵六,14", "周七,15", "钱八,16", "孙九,17");
        // Lambda表达式
        Function<String, Integer> parser = s -> Integer.parseInt(s.split(",")[1]);


        // 方法引用
        Function<String, Integer> parser2 = Integer::parseInt;

    }

}
