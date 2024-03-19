package advanced.collecion.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 添加
        list.add("apple");
        list.add("pear");
        list.add("apple"); // 可重复

        // 遍历优先使用迭代器
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
        // 删除
        list.remove("apple");
        System.out.println(list);
        // set

        // get
    }



}
