package API.LambdaDemo1;

import java.util.Arrays;
import java.util.Comparator;

public class GirlFriend {
    int age;
    double height;
    String name;

    public GirlFriend() {
    }

    public GirlFriend(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend(18,1.65,"ab");
        GirlFriend gf2 = new GirlFriend(18,1.66,"bc");
        GirlFriend gf3 = new GirlFriend(19,1.65,"cd");
        GirlFriend gf4 = new GirlFriend(19,1.65,"cde");

        GirlFriend[] arr = {gf1,gf2,gf3,gf4};
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getHeight() - o2.getHeight():result;
                result = result == 0 ? o1.getName().compareTo(o2.getName()):result;
                if(result > 0){
                    return  1;
                }else if(result < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(arr));
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

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
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

    public String toString() {
        return "GirlFriend{age = " + age + ", height = " + height + ", name = " + name + "}";
    }
}
