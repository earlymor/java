package Project1_puzzleGame;

import javax.swing.*;

// 游戏主界面
// 宽603 高680
public class GameJFrame extends JFrame {
    public GameJFrame(){
        // 设置长宽
        this.setSize(603,680);
        // 设置标题
        this.setTitle("拼图单机版 V1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭方式
        this.setDefaultCloseOperation(3);

        // 设置可见，写在最后
        this.setVisible(true);
    }
}
