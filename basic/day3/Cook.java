package basic.day3;

public class Cook extends Employee{
    public String number;
    public String name;
    public int bonus;
    @Override
    public String getNumber() {
        return number;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }

    public Cook(String number, String name, String number1, String name1, int bonus) {
        super(number, name);
        this.number = number1;
        this.name = name1;
        this.bonus = bonus;
    }

    public Cook(String number, String name, int bonus) {
        this.number = number;
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("炒菜");
    }
    public void say(){
        System.out.println(this.name + ", "+this.number+", "+this.bonus);
    }

}
