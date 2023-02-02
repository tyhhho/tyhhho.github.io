package cn.tedu.meshoot;

import java.awt.image.BufferedImage;

//大敌机
public class BigAirplane extends FlyingObject {
     private int speed;
     public BigAirplane(){
          super(66,89);
          speed=2;
     }
     int index=1;//爆破起始下标
     public BufferedImage getImage() {
          if (isLive()) {//若活着的
               return Images.bairs[0];//返回airs的第一张图
          } else if (isDead()) {//若死了的
               BufferedImage img = Images.bairs[index++];
               if (index == Images.bairs.length) {
                    state = REMOVE;
               }
               return img;
          }
          return null;
     }
}
