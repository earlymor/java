package basic.day3_demo2;

public class Cat extends Animals {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的"+"猫眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
