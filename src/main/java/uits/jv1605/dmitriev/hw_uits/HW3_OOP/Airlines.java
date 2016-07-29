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
               Airlines a1=new Airlines();
               Airlines.AirBus330 plane1=a1.new AirBus330(100,350,123);
               Airlines a2=new Airlines();
               Airlines.AirBus330 plane2=a2.new AirBus330(120,340,244);
               Airlines a3=new Airlines();
               Airlines.Boeing737 plane3=a3.new Boeing737(125,300,314);
               Airlines a4=new Airlines();
               Airlines.Tu144 plane4=a4.new Tu144(150,290,2121);
               Airlines a5=new Airlines();
               Airlines.ANT2 plane5=a5.new ANT2(15,100,404);
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
