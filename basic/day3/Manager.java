package basic.day3;

public class Manager extends Employee{
    public String number;
    public String name;

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    public Manager(String number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("管理其他人");
    }
    public void say(){
        System.out.println(this.name + ", "+this.number);
    }
}
