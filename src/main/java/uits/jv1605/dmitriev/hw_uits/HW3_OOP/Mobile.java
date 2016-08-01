/*
Мобильная связь
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Mobile implements Comparable <Mobile> {
    String type;
    int clients;
    double payment;
    int freeMinutes;
    
     //@Override 911
        public int compareTo(Mobile obj) {
             Mobile entry = (Mobile) obj;
             if (payment>entry.payment) return 1;
             if (payment==entry.payment) return 0;
             if (payment<entry.payment) return -1;
           return 0;  
       }
     boolean sortByNumber(double start, double end){
           return (this.clients>=start)&(this.clients<=end);
            }
     
     public class studentsTariff extends Mobile{
            studentsTariff(int clients){
                this.type="Тариф студентческий";
                this.clients=clients;
                this.payment=1; 
                this.freeMinutes=0;}
        }
     
     public class standartTariff extends Mobile{
            standartTariff(int clients){
                this.type="Тариф стандартный";
                this.clients=clients;
                this.payment=2; 
                this.freeMinutes=30;}
        }
     
     public class unlimitedTariff extends Mobile{
            unlimitedTariff(int clients){
                this.type="Тариф безлимитный";
                this.clients=clients;
                this.payment=3; 
                this.freeMinutes=100;}
        }
     
     public static void main(String args[]){
         Mobile m1=new Mobile();
         Mobile.studentsTariff tar1=m1.new studentsTariff(12000);
         Mobile m2=new Mobile();
         Mobile.standartTariff tar2=m2.new standartTariff(50000);
         Mobile m3=new Mobile();
         Mobile.unlimitedTariff tar3=m3.new unlimitedTariff(45000);
         ArrayList <Mobile> MTC=new ArrayList <Mobile>();
            MTC.add(tar1);
            MTC.add(tar2);
            MTC.add(tar3);
         int clientsSum=0;
                for (Mobile iterator : MTC){
                     clientsSum+=iterator.clients;
            }
                System.out.println("У  компании "  + clientsSum + " клиентов ");
                
                Collections.sort(MTC);
          for (Mobile i:MTC){
                System.out.println(i.type + " пользуются  " + i.clients + " и  платят " + i.payment);}
          
          System.out.print("Введите минимальное количество ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальное количество ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Mobile i:MTC){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " пользуются  " + i.clients);}}
          
     }
    
}
