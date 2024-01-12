package basic.day3;

public class Manager extends Employee{
    private int bonus;

    public Manager() {
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String number, String name, int bonus) {
        super(number, name);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理其他人");
    }

}
