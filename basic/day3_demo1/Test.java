package basic.day3_demo1;

public class Test {
    public static void main(String[] args){
        Employee e = new Employee("1234","张三");
        e.work();
        e.eat();
        Manager m = new Manager("3333","李四",550);
        m.work();
        m.eat();
        System.out.println(m.getName()+", "+m.getNumber()+", "+m.getBonus());
        Cook c = new Cook("5555","库克");
        c.work();
        c.eat();
        System.out.println(c.getName()+", "+c.getNumber());

    }
}
