package API.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyCollection {
    public static void main(String[] args) {
        // 创建集合，并添加对象
        Collection<String> coll = new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        // 1.迭代器遍历
        /*Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        // 2.增强for循环遍历
        /*for (String s : coll) {
            System.out.println(s);
        }*/

        // 3.Lambda遍历
        coll.forEach((String s) -> {
                System.out.println(s);
            }
        );
        /*coll.forEach( s -> System.out.println(s));*/
    }
}
