/*
Шеф-повар
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Vegetables implements Comparable <Vegetables>{
    double caloricContent;
    int recency; // Свежесть
    String type;
    
    Vegetables(){}
    Vegetables(double caloricContent, int recency){
        this.caloricContent=caloricContent;
        this.recency=recency;}
    
    //@Override 911
       public int compareTo(Vegetables obj) {
             Vegetables entry = (Vegetables) obj;
             return recency-entry.recency;
       }
       
       boolean sortByNumber(double start, double end){
           return (this.caloricContent>=start)&(this.caloricContent<=end);
            } 
       
       public class Cucumber extends Vegetables{
        Cucumber(double caloricContent, int recency){
            this.caloricContent=caloricContent;
            this.recency=recency;     
            this.type="Огурец";}
        }
       public class Tomato extends Vegetables{
        Tomato(double caloricContent, int recency){
            this.caloricContent=caloricContent;
            this.recency=recency;     
            this.type="Помидор";}
        }
       public class Pepper extends Vegetables{
        Pepper(double caloricContent, int recency){
            this.caloricContent=caloricContent;
            this.recency=recency;     
            this.type="Перец";}
        }
       public class Onion extends Vegetables{
        Onion(double caloricContent, int recency){
            this.caloricContent=caloricContent;
            this.recency=recency;     
            this.type="Лук";}
        }
       public class Dill extends Vegetables{
        Dill(double caloricContent, int recency){
            this.caloricContent=caloricContent;
            this.recency=recency;     
            this.type="Укроп";}
        }
       
       public static void main(String args[]){
           Vegetables v1=new Vegetables();
           Vegetables.Cucumber veg1=v1.new Cucumber(1,0);
           Vegetables v2=new Vegetables();
           Vegetables.Cucumber veg2=v2.new Cucumber(1,1);
           Vegetables v3=new Vegetables();
           Vegetables.Tomato veg3=v3.new Tomato(2,0);
           Vegetables v4=new Vegetables();
           Vegetables.Tomato veg4=v4.new Tomato(3,1);
           Vegetables v5=new Vegetables();
           Vegetables.Pepper veg5=v5.new Pepper(2,3);
           Vegetables v6=new Vegetables();
           Vegetables.Onion veg6=v6.new Onion(4,3);
           Vegetables v7=new Vegetables();
           Vegetables.Dill veg7=v7.new Dill(2,0);
           ArrayList <Vegetables> salad=new ArrayList <Vegetables>();
           salad.add(veg1);
           salad.add(veg2);
           salad.add(veg3);
           salad.add(veg4);
           salad.add(veg5);
           salad.add(veg6);
           salad.add(veg7);
           double sumCaloric=0;
           for (Vegetables iterator : salad){
              sumCaloric+=iterator.caloricContent;
        }
          System.out.println("Вы потребляете " + sumCaloric + " ккал");
          Collections.sort(salad);
          for (Vegetables i:salad){
                System.out.println(i.type + " свежесть " + i.recency + " дней");}
          
            System.out.print("Введите минимальную калорийность (начало) ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальную калорийность (конец) ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
            for (Vegetables i:salad){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " калорийность " + i.caloricContent + " ккал");}}
          
          
       }
          
       
}
