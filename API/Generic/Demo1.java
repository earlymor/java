package API.Generic;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {
        Bosi bosi = new Bosi("皮皮",10);
        Lihua lihua = new Lihua("哈哈",5);
        ArrayList list = new ArrayList<>();
        list.add(bosi);
        list.add(lihua);
        keepPet(list);
    }
    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }
    /*public static void keepPet(ArrayList<? extends Dog> list){
        for (Dog dog : list) {
            dog.eat();
        }
    }*/
}
