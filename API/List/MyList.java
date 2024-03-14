package API.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class MyList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,4);
//        list.remove(0);
//        list.remove((Integer)4);
       /* Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }*/
        /*for (Integer i : list) {
            System.out.println(i);
        }*/
//        list.forEach((i) -> System.out.println(i));
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
