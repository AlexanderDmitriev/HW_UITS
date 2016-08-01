/*
Страхование
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Risk implements Comparable <Risk>{
    double cost;
    double payment;
    double chance;
    String type;
    //@Override 911
        public int compareTo(Risk obj) {
             Risk entry = (Risk) obj;
             if (chance>entry.chance) return 1;
             if (chance==entry.chance) return 0;
             if (chance<entry.chance) return -1;
           return 0;  
       }
     boolean sortByNumber(double start, double end){
           return (this.payment>=start)&(this.payment<=end);
            }
     
      public class LifeInsurance extends Risk{
            LifeInsurance(double cost, double payment, double chance){
                this.type="Страхование жизни";
                this.cost=cost;
                this.payment=payment; 
                this.chance=chance; }
        }
      
      public class HealthInsurance extends Risk{
            HealthInsurance(double cost, double payment, double chance){
                this.type="Страхование здоровья";
                this.cost=cost;
                this.payment=payment; 
                this.chance=chance; }}
     
     public class EstateInsurance extends Risk{
            EstateInsurance(double cost, double payment, double chance){
                this.type="Страхование недвижимости";
                this.cost=cost;
                this.payment=payment; 
                this.chance=chance; }}
     
     public class AssInsurance extends Risk{
            AssInsurance(double cost, double payment, double chance){
                this.type="Страхование правильности кармического пути";
                this.cost=cost;
                this.payment=payment; 
                this.chance=chance; }}
     
     public static void main(String args[]){
         Risk r1=new Risk();
         Risk.LifeInsurance er1=r1.new LifeInsurance(12000,400,0.001);
         Risk r2=new Risk();
         Risk.HealthInsurance er2=r2.new HealthInsurance(5000,100,0.01);
         Risk r3=new Risk();
         Risk.EstateInsurance er3=r3.new EstateInsurance(7500,120,0.015);
         Risk r4=new Risk();
         Risk.AssInsurance er4=r4.new AssInsurance(5,25,0.1);
         ArrayList <Risk> insurance=new ArrayList <Risk>();
            insurance.add(er1);
            insurance.add(er2);
            insurance.add(er3);
            insurance.add(er4);
            insurance.add(er4);
         double costSum=0;
         double pay=0;
                for (Risk iterator : insurance){
                     costSum+=iterator.cost;
                     pay+=iterator.payment;
            }
                System.out.println("Если вы застрахуете все  и  вам  очень не повезет, вы  получите " 
                        + costSum + " USD , но ежемесячно будете платить  " + pay);
                
                Collections.sort(insurance);
          for (Risk i:insurance){
                System.out.println(i.type + " с шансом  " + i.chance + " и  взносом  " + i.payment);}
          
          System.out.print("Введите минимальный  взнос ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальный  взнос ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Risk i:insurance){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " с взносом  " + i.payment);}}
          
     }
}
