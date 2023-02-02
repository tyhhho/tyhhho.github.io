package cn.tedu.meshoot;

import java.awt.image.BufferedImage;

//英雄机
public class Hero extends FlyingObject {
   private int Life;//命
    private int Fire;//火力
    /**英雄机的构造方法*/
    public Hero(){
        super(97,139,140,400);//英雄机的xy初始坐标是固定的
        Life=3;
        Fire=0;
    }
    int index =0;//下标
    public BufferedImage getImage(){
        return Images.heros[index++%2];
        /*
        执行过程：
                             index=0;
        10m 返回heros[0]      index=1;
        20m 返回heros[1]      index=2;
        30m 返回heros[0]      index=3;
        40m 返回heros[1]      index=4；
        50m 返回heros[0]      index=5;
        60m 返回heros[1]      index=6;
         */

    }
}
