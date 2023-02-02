package cn.tedu.meshoot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

//小蜜蜂
public class Bee extends FlyingObject{
    private int xSpeed;//x坐标移动速度
    private int ySpeed;//y坐标移动速度
    private int awardType;//奖励类型
    public Bee(){//构造方法
        super(60,51);
        xSpeed=1;
        ySpeed=2;
        Random rand=new Random();
        awardType=rand.nextInt(2);//0到1的随机数
    }
    int index = 1; //下标
    /** 重写getImage()获取图片 */
    public BufferedImage getImage(){ //每10毫秒走一次
        if(isLive()){
            return Images.bees[0];
        }else if(isDead()){
            BufferedImage img = Images.bees[index++];
            if(index==Images.bees.length){
                state = REMOVE;
            }
            return img;
        }
        return null;
    }
}
