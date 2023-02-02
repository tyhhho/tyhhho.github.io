package cn.tedu.meshoot;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Images {
    public static BufferedImage sky;//天空图
    public static BufferedImage bullet;//子弹图
    public static BufferedImage[] heros;//英雄机图片数组
    public static BufferedImage[] airs;//小敌机图片数组
    public static BufferedImage[] bairs;//大敌机图片数组
    public static BufferedImage[] bees;//小蜜蜂图片数组
    public static BufferedImage start;//启动图
    public static BufferedImage pause;//暂停图
    public static BufferedImage gameover;//结束图
    //初始化静态图片
    static{
        start=readImage("start.png");
        pause=readImage("pause.png");
        gameover=readImage("gameover.png");
        sky=readImage("background.png");
        bullet=readImage("bullet.png");

        heros=new BufferedImage[2];//两张图片
        heros[0]=readImage("hero0.png");
        heros[1]=readImage("hero1.png");

        airs=new BufferedImage[5];
        bairs=new BufferedImage[5];
        bees=new BufferedImage[5];
        airs[0]=readImage("airplane.png");
        bairs[0]=readImage("bigairplane.png");
        bees[0]=readImage("bee.png");
        for (int i =1;i< airs.length;i++){
            airs[i]=readImage("bom"+i+".png");
            bairs[i]=readImage("bom"+i+".png");
            bees[i]=readImage("bom"+i+".png");

        }

    }
    /**读取图片*/
    public  static BufferedImage readImage(String fileName){
        try{
            BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
            return img;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        System.out.println(Images.airs.length);
    }
}
//java图片类：Image，Icon，ImageIcon，BufferedImage....