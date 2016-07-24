/*
Цветочник. Иерархия цветов, сортировка, сбор букета
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

/**
 * @author 911
 */
    enum Flowers{RedRose(5,10,1,true), PinkRose(5,12,1, true), WhiteRose(5,15,1, true), Tulip(4,5,0, false), Chrysantemum(4,15,2, false), PotatoMine(25,0,364, false); 
        int lengthFlower;
        int priceFlower;
        int recencyFlower;
        boolean trappings; // Украшения
        Flowers(int length, int price, int recency, boolean trappings){
            lengthFlower=length;    // Длина ножки
            priceFlower=price;
            recencyFlower=recency; // Свежесть в днях
            this.trappings=trappings;
    }
  }

public class Task1_FlowersShop {
    
    public static void main(String args[]){
         Flowers   fl1=Flowers.RedRose;
         Flowers   fl2=Flowers.RedRose;
         Flowers   fl3=Flowers.RedRose;
         Flowers   fl4=Flowers.PinkRose;
         Flowers   fl5=Flowers.WhiteRose;
         Flowers   fl6=Flowers.WhiteRose;
         Flowers   fl7=Flowers.Tulip;
         Flowers   fl8=Flowers.Chrysantemum;
         Flowers   fl9=Flowers.PotatoMine;   // Создали цветы-объекты, которые будем упаковывать в букет
    }
}
