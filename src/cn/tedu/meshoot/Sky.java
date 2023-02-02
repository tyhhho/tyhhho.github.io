package cn.tedu.meshoot;

import java.awt.*;
import java.awt.image.BufferedImage;

//天空
public class Sky extends FlyingObject{
    private int speed;
    private int y1;//第二章图天空图y坐标；
    public Sky(){
        super(World.WIDTH,World.HEIGHT,0,0);
        speed=1;
        y1=-World.HEIGHT;//负的窗口的高
    }
    public BufferedImage getImage(){
        return Images.sky;
    }
    public void paintIMage(Graphics g){
        super.paintIMage(g);
        g.drawImage(this.getImage(),this.x,this.y1,null);

    }

}
