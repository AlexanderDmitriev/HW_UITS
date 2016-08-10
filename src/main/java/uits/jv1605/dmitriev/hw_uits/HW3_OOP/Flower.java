/*
Цветочник. Иерархия цветов, сортировка, сбор букета
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Flower implements Comparable <Flower> {
    int lengthFlower;
        int priceFlower;
        int recencyFlower;
        boolean trappings; // Украшения
        String type;
        
     Flower(){}
        
     Flower(int length, int price, int recency, boolean trappings){
            lengthFlower=length;    // Длина ножки
            priceFlower=price;
            recencyFlower=recency; // Свежесть в днях
            this.trappings=trappings;   }
     
       //@Override 911
       public int compareTo(Flower obj) {
             Flower entry = (Flower) obj;
             return recencyFlower-entry.recencyFlower;
       }
       
       boolean sortByNumber(int start, int end){
           return (this.lengthFlower>start)&(this.lengthFlower<end);
            }     
       
       public class RedRose extends Flower{
        RedRose(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="RedRose";}
        }
    public class PinkRose extends Flower{
        PinkRose(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="PinkRose";}
        }
    public class WhiteRose extends Flower{
        WhiteRose(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="WhiteRose";}
        }
    public class Tulip extends Flower{
        Tulip(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="Tulip";}
        }
    public class Chrysantemum extends Flower{
        Chrysantemum(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="Chrysantemum";}
        }
    public class PotatoMine extends Flower{
        PotatoMine(int length, int price, int recency, boolean trappings){
            super(length, price, recency, trappings);
            this.type="PotatoMine";}
        }
    
    public static void main(String args[]){
        Flower ff=new Flower();
        Flower.RedRose f1=ff.new RedRose(5,10,1,true);
        Flower.RedRose f2=ff.new RedRose(5,10,2,true);
        Flower.RedRose f3=ff.new RedRose(5,10,0,true);
        Flower.PinkRose f4=ff.new PinkRose(5,12,1,true);
        Flower.WhiteRose f5=ff.new WhiteRose(5,15,1,true);
        Flower.WhiteRose f6=ff.new WhiteRose(5,15,0,true);
        Flower.Tulip f7=ff.new Tulip(4,5,0, false);
        Flower.Chrysantemum f8=ff.new Chrysantemum(4,15,2, false);
        Flower.PotatoMine f9=ff.new PotatoMine(25,0,364, false);
        // Создали цветы-объекты, которые будем упаковывать в букет
          ArrayList <Flower> bunch=new ArrayList <Flower>();
          bunch.add(f1);
          bunch.add(f2);
          bunch.add(f3);
          bunch.add(f4);
          bunch.add(f5);
          bunch.add(f6);
          bunch.add(f7);
          bunch.add(f8);
          bunch.add(f9);
          double cost=0;
          for (Flower iterator : bunch){
              cost+=iterator.priceFlower;
        }
          System.out.println("Букет затянул на " + cost + " миллионов тугриков");
          Collections.sort(bunch);
          for (Flower i:bunch){
                System.out.println(i.type + " свежесть " + i.recencyFlower);}
          
          System.out.print("Введите интересующую  длину стебля (начало) ");
            Scanner in=new Scanner(System.in);
            String a=in.nextLine();
            int taskStart=Integer.parseInt(a);
            System.out.print("Введите интересующую  длину стебля (конец) ");
            Scanner in2=new Scanner(System.in);
            String b=in.nextLine();
            int taskEnd=Integer.parseInt(b);
            System.out.println("В вашем диапазоне подходят: ");
            for (Flower i:bunch){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " с длиной стебля " + i.lengthFlower);}}

    }
}
