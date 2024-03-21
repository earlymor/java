package advanced.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {

    }

    public static void demo1() throws FileNotFoundException {
        String fileName = "input.txt";

        // 创建FileInputStream对象以读取指定文件
        FileInputStream fis = new FileInputStream(fileName);
        try(fis) { // 自动释放资源

            // 读取文件中的内容
            int data;
            while ((data = fis.read()) != -1) {
                // 将读取到的数据转换为字符并输出到控制台
                System.out.print((char) data);
            }

            // 关闭流
            fis.close();
        } catch (IOException e) {
            System.out.println("读取文件时出现错误：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
