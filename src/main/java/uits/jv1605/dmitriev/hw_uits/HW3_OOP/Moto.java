/*Мотоциклист */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Moto implements Comparable <Moto>{
    double price;
    double weigth;
    String type;
    //@Override 911
        public int compareTo(Moto obj) {
             Moto entry = (Moto) obj;
             if (weigth>entry.weigth) return 1;
             if (weigth==entry.weigth) return 0;
             if (weigth<entry.weigth) return -1;
           return 0;  
       }
       boolean sortByNumber(double start, double end){
           return (this.price>=start)&(this.price<=end);
            } 
       public class Jacket extends Moto{
        Jacket(double price, double weigth){
            this.type="Мотокуртка"; 
            this.price=price;
            this.weigth=weigth;}
        }
       public class Gloves extends Moto{
        Gloves(double price, double weigth){
            this.type="Мотоперчатки"; 
            this.price=price;
            this.weigth=weigth;}
        }
       public class Jeans extends Moto{
        Jeans(double price, double weigth){
            this.type="Мотоджинсы"; 
            this.price=price;
            this.weigth=weigth;}
        }
       public class Helmet extends Moto{
        Helmet(double price, double weigth){
            this.type="Шлем"; 
            this.price=price;
            this.weigth=weigth;}
        }
       public static void main(String args[]){
           Moto m1=new Moto();
           Moto.Jacket mot1=m1.new Jacket(1500,1.5);
           Moto m2=new Moto();
           Moto.Gloves mot2=m2.new Gloves(300,0.3);
           Moto m3=new Moto();
           Moto.Jeans mot3=m3.new Jeans(1500,0.5);
           Moto m4=new Moto();
           Moto.Helmet mot4=m4.new Helmet(4000,1);
           ArrayList <Moto> biker=new ArrayList <Moto>();
           biker.add(mot1);
           biker.add(mot2);
           biker.add(mot3);
           biker.add(mot4);
           double sumPrice=0;
           for (Moto iterator : biker){
              sumPrice+=iterator.price;
        }
          System.out.println("Экипировка  весит " + sumPrice + " кг");
          Collections.sort(biker);
          for (Moto i:biker){
                System.out.println(i.type + " - " + i.weigth + " кг, стоит: " + i.price + "грн");}
          
          System.out.print("Введите минимальную стоимость ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальную стоимость ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Moto i:biker){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " - " + i.weigth + " кг, стоит: " + i.price + "грн");}}
          

       
       }
       
}
