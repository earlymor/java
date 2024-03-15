package API.Generic;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的动物，正在吃东西");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name,int age){
        super(name,age);
    }


    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的猫，正在吃东西");
    }

    public String toString() {
        return "Cat{}";
    }
}

class Bosi extends Cat{
    public Bosi(String name,int age){
        super(name,age);
    }

    public Bosi() {
    }

    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的波斯猫，正在吃小饼干");
    }

    public String toString() {
        return "Bosi{}";
    }
}

class Lihua extends Cat{
    public Lihua(String name,int age){
        super(name,age);
    }

    public Lihua() {
    }
    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的狸花猫，正在吃鱼");
    }
}

class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }

    public Dog() {
    }
    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的狗，正在吃东西");
    }
}

class Taidi extends Dog{
    public Taidi(String name,int age){
        super(name,age);
    }

    public Taidi() {
    }
    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}

class Hashiqi extends Dog{
    public Hashiqi(String name,int age){
        super(name,age);
    }

    public Hashiqi() {
    }
    @Override
    void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}