package basic.day3;

public class Employee {
    public String number;
    public String name;

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
