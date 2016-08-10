/*
Таксопарк
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Taxi implements Comparable <Taxi>{
    String type;
    double price;
    int number; // Номер такси в базе таксопарка
    double fuelConsumption; // потребление топлива
    double speed;
    
    //@Override 911
        public int compareTo(Taxi obj) {
             Taxi entry = (Taxi) obj;
             if (fuelConsumption>entry.fuelConsumption) return 1;
             if (fuelConsumption==entry.fuelConsumption) return 0;
             if (fuelConsumption<entry.fuelConsumption) return -1;
           return 0;  
       }
        
        boolean sortByNumber(double start, double end){
           return (this.speed>=start)&(this.speed<=end);
            }
        
        public class LadaCalina extends Taxi{
            LadaCalina(double price, int number){
                this.type="Лада Калина";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=2; // потребление топлива
                this.speed=160; }
        }
        public class LadaDaNuNa extends Taxi{
            LadaDaNuNa(double price, int number){
                this.type="Лада да ну на...";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=3; // потребление топлива
                this.speed=140; }
        }
        public class FerrariFXX extends Taxi{
            FerrariFXX(double price, int number){
                this.type="Ferrari FXX";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=5; // потребление топлива
                this.speed=320; }
        }
        
        public class WindowsAutoMobile extends Taxi{
            WindowsAutoMobile(double price, int number){
                this.type="Microsoft автобобиль";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=18; // потребление топлива
                this.speed=32; }
        }
        public static void main(String args[]){
            Taxi t=new Taxi();
            Taxi.LadaCalina tax1=t.new LadaCalina(14,4148);
            Taxi.LadaDaNuNa tax2=t.new LadaDaNuNa(8,4007);
            Taxi.LadaDaNuNa tax3=t.new LadaDaNuNa(8.5,1381);
            Taxi.FerrariFXX tax4=t.new FerrariFXX(100,0001);
            Taxi.WindowsAutoMobile tax5=t.new WindowsAutoMobile(50,6060);
            ArrayList <Taxi> kamikadzeTaxi=new ArrayList <Taxi>();
            kamikadzeTaxi.add(tax1);
            kamikadzeTaxi.add(tax2);
            kamikadzeTaxi.add(tax3);
            kamikadzeTaxi.add(tax4);
            kamikadzeTaxi.add(tax5);
            double cost=0;;
                for (Taxi iterator : kamikadzeTaxi){
                     cost+=iterator.price;
            }
                System.out.println("Ваш таксопарк стоит " + cost + "00 000 USD");
                
             Collections.sort(kamikadzeTaxi);
          for (Taxi i:kamikadzeTaxi){
                System.out.println(i.type + " под  номером  " + i.number + " и  потреблением  " + i.fuelConsumption);}
          
          System.out.print("Введите минимальную скорость ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальную  скорость ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Taxi i:kamikadzeTaxi){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " под  номером " + i.number + " , скорость " + i.speed);}}
          
        
        
        }
    
}
