package cn.tedu.meshoot;

import java.awt.image.BufferedImage;

//小敌机
public class Airplane extends FlyingObject {
    private int speed;
    /**构造方法*/
    Airplane(){
        super(48,50);
        speed=2;//可以随机数
    }
    int index=1;//爆破起始下标
    /**重写getImage()获取图片*/
    public BufferedImage getImage(){
        if (isLive()){//若活着的
            return Images.airs[0];//返回airs的第一张图
        }else if(isDead()){//若死了的
            BufferedImage img=Images.airs[index++];
            if (index==Images.airs.length){
                state=REMOVE;
            }
            return img;
        }
        /*  假设已经死了
        执行过程：
                              index=1;
            10m img=airs[1]   index=2;  返回airs[1]
            20m img=airs[2]   index=3;  返回airs[2]
            30m img=airs[3]   index=4;  返回airs[3]
            40m img=airs[4]   index=5(REMOVE)   返回airs【4】
            50m 返回null(不返回图片)
         */
        return null;
    }
}
