package Project1_puzzleGame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;

// 游戏主界面
// 宽603 高680
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int[4][4];
    int x,y;
    int count = 0;
    String image = "animal/animal3/";
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeGameItem = new JMenuItem("关闭游戏");

    JMenuItem beautyItem = new JMenuItem("美女");
    JMenuItem sportItem = new JMenuItem("运动");
    JMenuItem animalItem = new JMenuItem("动物");

    // 关于我们选项下的条目：公众号
    JMenuItem officialAccount= new JMenuItem("公众号");
    public GameJFrame(){
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenu();

        // 初始化数据
        initData();

        // 初始化图片
        initImage();

        this.addKeyListener(this);
        // 设置可见，写在最后
        this.setVisible(true);
    }

    private void initData() {
        count = 0;
        // 创建一维数组
        int[] temp = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 打乱顺序
        Random r =new Random();
        for(int i = 0;i< temp.length;i++){
            int index = r.nextInt(temp.length);
            int t = temp[i];
            temp[i] = temp[index];
            temp[index] = t;
        }
        // 给二维数组赋值
        for(int i =0 ;i<temp.length;i++){
            if(temp[i] == 0){
                x = i%4;
                y = i/4;
            }
            data[i%4][i/4] = temp[i];
        }

    }

    private void initImage() {
        // 循环加载16张图片
        this.getContentPane().removeAll();
        JLabel steps = new JLabel("步数："+count);
        steps.setBounds(50,30,100,20);
        this.getContentPane().add(steps);

        if(victory()){
            JLabel winJlabel = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/win.png"));
            winJlabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJlabel);
        }
        for(int i = 0;i<4;i++){
            for(int j = 0 ;j<4;j++){
                // 创建一个ImageIcon的对象
                // 创建管理容器JLabel对象
                int num = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/"+image+num+".jpg"));
                // 指定图片位置
                jLabel.setBounds(105*j+83,105*i+134,105,105);
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 把容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
        JLabel background = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        this.getContentPane().repaint();

    }

    private boolean victory() {
        for (int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                int num = i*4+j+1;
                if(data[i][j]!=num){
                    return false;
                }
            }
        }
        return true;
    }

    private void initJMenu() {
        // 初始化菜单
        // 创建菜单主体
        JMenuBar gameMenuBar = new JMenuBar();

        // 菜单选项：功能、关于我们
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeJMenu = new JMenu("更换图片");


        changeJMenu.add(beautyItem);
        changeJMenu.add(sportItem);
        changeJMenu.add(animalItem);

        // 功能选项下的条目：更换图片、重新游戏、重新登录、关闭游戏
//        JMenuItem changeImage = new JMenuItem("更换图片");


        // 将条目添加到菜单选项中：功能（更换图片、重新游戏、重新登录、关闭游戏）、关于我们（公众号）
//        function.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeGameItem);
        functionJMenu.add(changeJMenu);

        aboutJMenu.add(officialAccount);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeGameItem.addActionListener(this);
        officialAccount.addActionListener(this);

        beautyItem.addActionListener(this);
        sportItem.addActionListener(this);
        animalItem.addActionListener(this);

        // 将菜单选项加入到菜单主体中:功能、关于我们
        gameMenuBar.add(functionJMenu);
        gameMenuBar.add(aboutJMenu);
//        gameMenuBar.setSize(new Dimension(100,100));
        // 设置菜单
        this.setJMenuBar(gameMenuBar);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) { // a
            this.getContentPane().removeAll();
            JLabel jLabel = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/"+image+"all.jpg"));
            // 指定图片位置
            jLabel.setBounds(83,134,420,420);
            jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
            // 把容器添加到界面中
            this.getContentPane().add(jLabel);
            JLabel background = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
        int code = e.getKeyCode();
//        System.out.println(code);
        if(code  == 37){ // 左键
            if(y != 3){
                data[x][y] = data[x][y+1];
                data[x][y+1] = 0;
                y++;
                count++;
                initImage();
            }
        } else if (code == 38) { // 上键
            if(x != 3){
                data[x][y] = data[x+1][y];
                data[x+1][y] = 0;
                x++;
                count++;
                initImage();
            }
        }else if (code == 39) { // 右键
            if(y != 0){
                data[x][y] = data[x][y-1];
                data[x][y-1] = 0;
                y--;
                count++;
                initImage();
            }
        }else if (code == 40) { // 下键
            if(x != 0){
                data[x][y] = data[x-1][y];
                data[x-1][y] = 0;
                x--;
                count++;
                initImage();
            }
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };
            x = 3;
            y = 3;
            initImage();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            initData();
            initImage();
        } else if (obj == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeGameItem) {
            System.exit(0);
        } else if (obj == officialAccount) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("Project1_puzzleGame/素材/image/about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);

        } else if (obj == beautyItem) {
            // 随机选择一张
            Random r = new Random();
            int num = r.nextInt(13);
            image = "girl/girl"+num+"/";
            System.out.println(image);
            initData();
            initImage();
        }else if (obj == sportItem) {
            Random r = new Random();
            int num = r.nextInt(10);
            image = "sport/sport"+num+"/";
            initData();
            initImage();
        }else if (obj == animalItem) {
            Random r = new Random();
            int num = r.nextInt(8);
            image = "animal/animal"+num+"/";
            initData();
            initImage();
        }
    }
}
