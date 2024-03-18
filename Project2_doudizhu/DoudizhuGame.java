package Project2_doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DoudizhuGame {
    // 牌组初始化
    static ArrayList<String> list = new ArrayList<>();

    // 花色："♣","♠","♥","🔶🔶♦"
    // 数字:"3","4","5","6","7","8","9","J","Q","K","A","2"
    static {
        String[] color = {"♣", "♠", "♥", "🔶🔶♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String s : color) {
            for (String num : number) {
                list.add(s + num);
            }
        }
        list.add("小王");
        list.add("大王");

    }

    DoudizhuGame() {
        // 洗牌
        Collections.shuffle(list);
//        System.out.println(list);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            }else  {
                player3.add(poker);
            }
        }
        lookPoker("小帅",player1);
        lookPoker("蛋筒",player2);
        lookPoker("钢脑壳",player3);

    }
    // 看牌
    public void lookPoker(String name,ArrayList<String> list){
        System.out.println(name+":"+list);
    }

}
