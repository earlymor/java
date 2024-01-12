package basic.day3;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String number, String name) {
        super(number, name);
    }

    public void work(){
        System.out.println("炒菜");
    }


}
