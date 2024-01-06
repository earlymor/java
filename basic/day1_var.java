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
        /* 错误: 不兼容的类型: int无法转换为boolean
            if(2){
            System.out.println(true);
        } */
        if(true){
            System.out.println(true);
        }
        
    }
}