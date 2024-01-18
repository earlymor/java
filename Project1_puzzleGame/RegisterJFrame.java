package Project1_puzzleGame;

import javax.swing.*;

// 注册界面
// 宽488 高500
public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        this.setSize(488,500);
        // 设置标题
        this.setTitle("拼图 注册");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置可见，写在最后
        this.setVisible(true);
    }
}
