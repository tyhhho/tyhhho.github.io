package cn.tedu.meshoot;

import java.awt.image.BufferedImage;
import java.util.Random;

//子弹
public class Bullet extends FlyingObject{
    private int speed;
    public Bullet(int x,int y){
        super(8,20,x,y);
        speed=3;
    }
    public BufferedImage getImage(){
        if (isLive()){//若活着的
            return Images.bullet;//返回子弹图片
        }else if (isDead()){//弱死了的
            state=REMOVE;//将当前状态修改为REMOVE删除的；
        }
        return null;//死了的和删除的不返回图片
    }
    /*
    1/若活着的，返回bullet图片
    2/若死了的，将当前状态修改为REMOVE删除的；
    3/若删除的，不返回图片；
     */

}
