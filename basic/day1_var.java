class Test1{
    public static void main(String[] args){
        // +运算符两种运用
        // 1.字符串拼接，当+两侧有字符类型时进行拼接 
        // 2.其他进行相加
        System.out.println(1+2+"3"); // 33
        System.out.println("1"+2+3); // 123
        System.out.println("1"+(2+3)); // 15
    }
}

class Test2{
    public static void main(String[]args){
        /* 
            错误: 不兼容的类型: int无法转换为boolean
            if(2){
            System.out.println(true);
        } */
        if(true){
            System.out.println(true);
        }

    }
}

class Test3{

    public static void main(String[]args){
        // 字面量
        int a = 10;
        long b = 100L;
        // int c = 10L;错误: 不兼容的类型: 从long转换到int可能会有损失
        int c = (int)10L;
        int d = (int)2147483648L;
        // int e = 2147483648; 错误: 整数太大
        System.out.println("a="+a); // a=10
        System.out.println("b="+b); // b=100
        System.out.println("c="+c); // c=10
        System.out.println("d="+d); // d=-2147483648
        // System.out.println("e="+e);

    }
}