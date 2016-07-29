/*
 Новогодний подарок. 
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class NewYearsPresent implements Comparable <NewYearsPresent>{
    double weight; //Вес конфеты
    double sugar;
    double price;
    String type;
    
    NewYearsPresent(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;   }
    NewYearsPresent(){}
    //@Override 911
       public int compareTo(NewYearsPresent obj) {
             NewYearsPresent entry = (NewYearsPresent) obj;
             if (price>entry.price) return 1;
             if (price==entry.price) return 0;
             if (price<entry.price) return -1;
           return 0;  
       }
       
       boolean sortByNumber(double start, double end){
           return (this.sugar>=start)&(this.sugar<=end);
            }  
       
       public class Caramel extends NewYearsPresent{
        Caramel(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="Caramel";}
        }
       public class Iris extends NewYearsPresent{
        Iris(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="Iris";}
        }
       public class ChocolateCandy extends NewYearsPresent{
        ChocolateCandy(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="ChocolateCandy";}
        }
       public class Tryffle extends NewYearsPresent{
        Tryffle(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="Tryffle";}
        }
       public class CandyBar extends NewYearsPresent{
        CandyBar(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="CandyBar";}
        }
       public class SugarCandy extends NewYearsPresent{
        SugarCandy(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="SugarCandy";}
        }
       public class JellySweets extends NewYearsPresent{
        JellySweets(double weight, double sugar, double price){
            this.weight=weight;     
            this.sugar=sugar;
            this.price=price;
            this.type="JellySweets";}
        }
public static void main(String args[]){
        NewYearsPresent c1=new NewYearsPresent(5,10,1);
        NewYearsPresent.Caramel can1=c1.new Caramel(5,10,1);
        NewYearsPresent c2=new NewYearsPresent(5,10,2);
        NewYearsPresent.Iris can2=c2.new Iris(5,10,2);
        NewYearsPresent c3=new NewYearsPresent(5,10,3);
        NewYearsPresent.Iris can3=c3.new Iris(5,10,3);
        NewYearsPresent c4=new NewYearsPresent(5,12,5);
        NewYearsPresent.ChocolateCandy can4=c4.new ChocolateCandy(5,12,5);
        NewYearsPresent c5=new NewYearsPresent(5,15,1);
        NewYearsPresent.ChocolateCandy can5=c5.new ChocolateCandy(5,15,5);
        NewYearsPresent c6=new NewYearsPresent(5,15,4);
        NewYearsPresent.Tryffle can6=c6.new Tryffle(5,15,4);
        NewYearsPresent c7=new NewYearsPresent(4,5,4);
        NewYearsPresent.CandyBar can7=c7.new CandyBar(4,5,4);
        NewYearsPresent c8=new NewYearsPresent(4,15,2);
        NewYearsPresent.SugarCandy can8=c8.new SugarCandy(4,15,2);
        NewYearsPresent c9=new NewYearsPresent(25,0,364);
        NewYearsPresent.JellySweets can9=c9.new JellySweets(25,5,1);
        ArrayList <NewYearsPresent> present=new ArrayList <NewYearsPresent>();
          present.add(can1);
          present.add(can2);
          present.add(can3);
          present.add(can4);
          present.add(can5);
          present.add(can6);
          present.add(can7);
          present.add(can8);
          present.add(can9);
          
          double presentWeigth=0;
          for (NewYearsPresent iterator : present){
              presentWeigth+=iterator.weight;
        }
          System.out.println("Подарок  затянул на " + presentWeigth + " кг");
          Collections.sort(present);
          for (NewYearsPresent i:present){
                System.out.println(i.type + " цена " + i.price);}
          System.out.print("Введите количество сахара (начало) ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите количество сахара (конец) ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
            for (NewYearsPresent i:present){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " с содержанием сахара " + i.sugar);}}
}
}
