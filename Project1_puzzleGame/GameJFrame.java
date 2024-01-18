package Project1_puzzleGame;

import javax.swing.*;

// 游戏主界面
// 宽603 高680
public class GameJFrame extends JFrame {
    public GameJFrame(){
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenu();

        // 初始化数据
        initData();

        // 初始化图片
        initImage();

        // 设置可见，写在最后
        this.setVisible(true);
    }

    private void initData() {
        // 创建一维数组

        // 打乱顺序

        // 给二维数组赋值

    }

    private void initImage() {
        // 循环加载16张图片

        // 创建一个ImageIcon的对象

        // 创建管理容器JLabel对象

        // 指定图片位置

        // 把容器添加到界面中
//        this.getContentPane().add();
    }

    private static void initJMenu() {
        // 初始化菜单
        // 创建菜单主体
        ;
        // 菜单选项：功能、关于我们

        // 功能选项下的条目：更换图片、重新游戏、重新登录、关闭游戏

        // 关于我们选项下的条目：公众号

        // 将条目添加到菜单选项中：功能（更换图片、重新游戏、重新登录、关闭游戏）、关于我们（公众号）

        // 将菜单选项加入到菜单主体中:功能、关于我们

        // 设置菜单
    }

    private void initJFrame() {
        // 设置长宽
        this.setSize(603,680);
        // 设置标题
        this.setTitle("拼图单机版 V1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认居中放置
        this.setLayout(null);
    }
}
