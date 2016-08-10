/*
Авиакомпания
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Airlines implements Comparable <Airlines>{
    String type; // Модель лайнера
    int passenger;
    double payload; //количество груза
    double distance; //дальность перелета
    double fuelConsumption; // потребление топлива
    int number;
    //@Override 911
        public int compareTo(Airlines obj) {
             Airlines entry = (Airlines) obj;
             if (distance>entry.distance) return 1;
             if (distance==entry.distance) return 0;
             if (distance<entry.distance) return -1;
           return 0;  
       }
        
        boolean sortByNumber(double start, double end){
           return (this.fuelConsumption>=start)&(this.fuelConsumption<=end);
            }
        
        public class AirBus330 extends Airlines{
        AirBus330(int passenger, double payload,int number){
            this.type="AirBus A330"; 
            this.passenger=passenger;
            this.payload=payload;
            this.distance=1200;
            this.number=number;
            this.fuelConsumption=800;}
        }
         public class Boeing737 extends Airlines{
        Boeing737(int passenger, double payload,int number){
            this.type="Boeing 737"; 
            this.passenger=passenger;
            this.payload=payload;
            this.distance=1000;
            this.number=number;
            this.fuelConsumption=700;}
        }
          public class Tu144 extends Airlines{
        Tu144(int passenger, double payload,int number){
            this.type="Ту-144"; 
            this.passenger=passenger;
            this.payload=payload;
            this.distance=3000;
            this.number=number;
            this.fuelConsumption=1200;}
        }
           public class ANT2 extends Airlines{
        ANT2(int passenger, double payload,int number){
            this.type="АНТ-2"; 
            this.passenger=passenger;
            this.payload=payload;
            this.distance=200;
            this.number=number;
            this.fuelConsumption=100;}
        }
           
           
           public static void main(String args[]){
               Airlines a=new Airlines();
               Airlines.AirBus330 plane1=a.new AirBus330(100,350,123);
               Airlines.AirBus330 plane2=a.new AirBus330(120,340,244);
               Airlines.Boeing737 plane3=a.new Boeing737(125,300,314);
               Airlines.Tu144 plane4=a.new Tu144(150,290,2121);
               Airlines.ANT2 plane5=a.new ANT2(15,100,404);
               ArrayList <Airlines> sysaninTransports=new ArrayList <Airlines>();
               sysaninTransports.add(plane1);
               sysaninTransports.add(plane2);
               sysaninTransports.add(plane3);
               sysaninTransports.add(plane4);
               sysaninTransports.add(plane5);
               
                double sumWeigth=0;
                int sumPass=0;
                for (Airlines iterator : sysaninTransports){
                     sumWeigth+=iterator.payload;
                     sumPass+=iterator.passenger;
        }
          System.out.println("Наша авиакомпания  может  перевезти " + sumWeigth + "00 кг груза");
          System.out.println("Наша авиакомпания  может  перевезти " + sumPass + " пассажиров");
           
          Collections.sort(sysaninTransports);
          for (Airlines i:sysaninTransports){
                System.out.println(i.type + " под бортовым номером " + i.number + " , максимальная дальность " + i.distance);}
        
          System.out.print("Введите минимальный расход топлива ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальный  расход ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Airlines i:sysaninTransports){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " под бортовым номером " + i.number + " , потребление " + i.fuelConsumption);}}
          
           
           
           }
}
