package advanced.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

    }
    public static void demo1() throws FileNotFoundException {
        String fileName = "output.txt";
        String content = "Hello, FileOutputStream!";

        // 创建FileOutputStream对象，如果文件不存在，则会创建新文件；如果文件已存在，则会覆盖原文件内容
        FileOutputStream fos = new FileOutputStream(fileName);
        try(fos) {

            // 将字符串内容转换为字节数组
            byte[] bytes = content.getBytes();

            // 将字节数组写入到文件中
            fos.write(bytes);

            System.out.println("数据已成功写入文件 " + fileName);
        } catch (IOException e) {
            System.out.println("写入文件时出现错误：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
