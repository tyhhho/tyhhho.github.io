package cn.tedu.meshoot;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

/**整个游戏窗口*/
public class World extends JPanel{
    public static final int WIDTH=400;//窗口的宽
    public static final int HEIGHT=700;//窗口高

    private Sky sky=new Sky();//天空对象
    private Hero hero=new Hero();//英雄机对象
    private FlyingObject[] enemies={
            new Airplane(),
            new BigAirplane(),
            new Bee()
    };//敌人(小敌机大敌机小蜜蜂)
    private Bullet[] bullets={
            new Bullet(100,200)
    };//子弹数组
    /**重写paint*/
public void paint(Graphics g){
    sky.paintIMage(g);//天空
    hero.paintIMage(g);//英雄机
    for (int i=0;i<enemies.length;i++){//遍历数组
        enemies[i].paintIMage(g);
    }
    for(int i=0;i<bullets.length;i++){
        bullets[i].paintIMage(g);
    }
}
    public static void main(String[] args) {
        JFrame frame = new JFrame();    //3
        World world = new World();
        frame.add(world);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//1)设置窗口可见  2）尽快调用

    }
}
