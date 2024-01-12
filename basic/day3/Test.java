package basic.day3;

public class Test {
    public static void main(String[] args){
        Employee e = new Employee("1234","张三");
        e.work();
        e.eat();
        Manager m = new Manager("3333","李四");
        m.work();
        m.eat();
        m.say();
        Cook c = new Cook("5555","库克",500);
        c.work();
        c.eat();
        c.say();
    }
}
