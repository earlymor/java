package basic;

// 布偶猫 ：吃饭、喝水、抓老鼠
// 中国梨花猫 ：吃饭、喝水、抓老鼠
// 哈士奇 ：吃饭、喝水、看家、拆家
// 泰迪 ：吃饭、喝水、看家、蹭一蹭
class Animals{
    public void eat(){
        System.out.println("eat");
    }
    public void drink(){
        System.out.println("drink");
    }
}

class Cat extends Animals{

    void catchMouse(){
        System.out.println("catch mouse");

    }
}
class Dog extends Animals{
    void guard(){
        System.out.println("guard");
    }
}
