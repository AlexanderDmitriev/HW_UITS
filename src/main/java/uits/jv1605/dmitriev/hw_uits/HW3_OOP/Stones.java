/*
Драгоценные камни
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Stones implements Comparable <Stones> {
    String type; //Тип камня
    int weigth;
    double price;
    String color;
    int transparency; // степень прозрачности
    //@Override 911
       public int compareTo(Stones obj) {
             Stones entry = (Stones) obj;
            
             int result = color.compareTo(entry.color);
             if(result != 0) {
                    return result;
             }
            
             if(result == 0) {
                    return  type.compareTo(entry.type);
             }
             return 0;
       }
       boolean sortByNumber(int start, int end){
           return (this.transparency>=start)&(this.transparency<=end);
            } 
       
       public class Diamond extends Stones{
        Diamond(int weigth, double price){
            this.type="Алмаз"; 
            this.weigth=weigth;
            this.price=price;
            this.color="clear";
            this.transparency=10;}
        }
       
       public class Ruby extends Stones{
        Ruby(int weigth, double price){
            this.type="Рубин"; 
            this.weigth=weigth;
            this.price=price;
            this.color="red";
            this.transparency=5;}
        }
       
       public class Sapphire extends Stones{
        Sapphire(int weigth, double price){
            this.type="Сапфир"; 
            this.weigth=weigth;
            this.price=price;
            this.color="blue";
            this.transparency=4;}
        }
       
       public class Emerald extends Stones{
        Emerald(int weigth, double price){
            this.type="Изумруд"; 
            this.weigth=weigth;
            this.price=price;
            this.color="green";
            this.transparency=6;}
        }
       
       public static void main(String args[]){
           Stones s=new Stones();
           Stones.Diamond st1=s.new Diamond(3,32);
           Stones.Diamond st2=s.new Diamond(5,120);
           Stones.Ruby st3=s.new Ruby(5,100);
           Stones.Sapphire st4=s.new Sapphire(6,140);
           Stones.Emerald st5=s.new Emerald(7,155);
           Stones.Emerald st6=s.new Emerald(120,3000);
           ArrayList <Stones> necklace=new ArrayList <Stones>();
           necklace.add(st1);
           necklace.add(st2);
           necklace.add(st3);
           necklace.add(st4);
           necklace.add(st5);
           necklace.add(st6);
           double sumWeigth=0;
           double sumPrice=0;
           for (Stones iterator : necklace){
              sumWeigth+=iterator.weigth;
              sumPrice+=iterator.price;
        }
          System.out.println("Ожерелье  весит " + sumWeigth + " карат");
          System.out.println("Ожерелье  стоит " + sumPrice + "000 долларов");
          
          Collections.sort(necklace);
          for (Stones i:necklace){
                System.out.println(i.type + " - " + i.weigth + " карат .стоит: " + i.price + "000 долларов");}
          
          System.out.print("Введите минимальную прозрачность ");
            Scanner in=new Scanner(System.in);
            int taskStart=in.nextInt();
            System.out.print("Введите максимальную прозрачность ");
            Scanner in2=new Scanner(System.in);
            int taskEnd=in.nextInt();
            System.out.println("В вашем диапазоне подходят: ");
            for (Stones i:necklace){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " - " + i.weigth + " карат .стоит: " + i.price + "000 долларов");}}
          
       
       
       }
 
}
