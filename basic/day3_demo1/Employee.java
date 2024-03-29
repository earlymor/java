package basic.day3_demo1;

public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("111","haha");
        Employee e2 = new Employee("222","www");
        e2 = e1;

        System.out.println(e1);
        System.out.println(e2);
    }
    // 成员变量私有
    private String number;
    private String name;
    // 构造方法 （空参 带全部参数的）
    public Employee() {
    }

    public Employee(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("员工工作");
    }
    public void eat(){
        System.out.println("吃米饭");
    }
}
