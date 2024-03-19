package advanced.collecion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        // 添加
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);
        // 遍历
        // 1.迭代器遍历
        //   循环结束后，迭代器指向末尾没有元素的位置，不复位，再次使用需创建新的迭代器
        //   it.next()相当于i++
        //   遍历时不能使用集合方法进行增删，要使用迭代器进行增删
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // 2.增强for
        // 底层为迭代器
        // 所有单列集合和数组才能用
        // 快速生成方式 coll.for
        // 修改循环中变量不会改变集合中的原始数据，使用第三方变量
        for (String s : coll) {
            System.out.println(s);
        }
        // 3.Lambda遍历
        coll.forEach(s -> System.out.println(s));
        // 集合元素个数
        System.out.println(coll.size());
        // 删除
        coll.remove("张三");
        System.out.println(coll);

        // 清空
        coll.removeAll(coll);
        System.out.println(coll);

        // 是否包含
        System.out.println(coll.contains("王五"));
        // 是否为空
        System.out.println(coll.isEmpty());


    }
}
