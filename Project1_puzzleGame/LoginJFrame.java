package Project1_puzzleGame;

import javax.swing.*;
import java.awt.*;

// 登录界面
// 宽488 高430
public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        this.setSize(488,430);
        // 设置标题
        this.setTitle("拼图 登录");
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
