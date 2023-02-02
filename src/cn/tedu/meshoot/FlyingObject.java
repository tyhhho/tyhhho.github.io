package cn.tedu.meshoot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

//飞机超类
public abstract class FlyingObject {
    public static final int LIVE=0;//或者
    public static final int DEAD=1;//死了
    public static final int REMOVE=2;//待死
    protected  int  state=LIVE;//默认活着
    //判断是不是活的
    public boolean isLive(){
        return state==LIVE;
    }
    //判断死没死
    public boolean isDead(){
        return state==DEAD;
    }
    //判断是不是删除的
    public boolean isRemove(){
        return state==REMOVE;
    }
    //获取图片
    public abstract BufferedImage getImage();
    public void paintIMage(Graphics g){
        g.drawImage(this.getImage(),this.x,this.y,null);

        }



    protected  int width;
    protected  int height;
    protected  int x;
    protected  int y;
    /**专门给小敌机、大敌机、小蜜蜂提供的*/
    //三种敌人的宽高是不一样的，所以需要传参，数据不能写死，要传参写活。
    //三种敌人的x和y是一样的，所以数据可以写死，不需要传参。
    public FlyingObject(int width,int height){
        this.width=width;
        this.height=height;
        Random rand =new Random();//随机数对象
        x=rand.nextInt(World.WIDTH-width);//0到窗口宽减去敌人宽的随机数
        y=height;//负的敌人的高
    }
    /**专门给英雄机 天空 子弹提供的*/
    //三种对象的宽高xy都不一样的，所以数据不能写死，需要传参写活
    public FlyingObject(int width,int height,int x,int y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }
}
