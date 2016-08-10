/*
ЖД Транспорт
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Train2 implements Comparable <Train2>{
    int passenger;
    double payload; //количество груза
    int comfortabiluty; //степень комфортности
    String type;
    int number; //Номер вагона
    
    //@Override 911
        public int compareTo(Train2 obj) {
             Train2 entry = (Train2) obj;
           return comfortabiluty-entry.comfortabiluty;  
       }
        
        boolean sortByNumber(int start, int end){
           return (this.passenger>=start)&(this.passenger<=end);
            }
        
        public class ChipWagon extends Train2{
        ChipWagon(int passenger, double payload,int number){
            this.type="Общий вагон"; 
            this.passenger=passenger;
            this.payload=payload;
            this.comfortabiluty=1;
            this.number=number;}
        }
        public class ReservedWagon extends Train2{
        ReservedWagon(int passenger, double payload,int number){
            this.type="Плацкартный вагон"; 
            this.passenger=passenger;
            this.payload=payload;
            this.comfortabiluty=2;
            this.number=number;}
        }
        public class LuxWagon extends Train2{
        LuxWagon(int passenger, double payload,int number){
            this.type="Купейный вагон"; 
            this.passenger=passenger;
            this.payload=payload;
            this.comfortabiluty=3;
            this.number=number;}
        }
        
        public static void main(String args[]){
           Train2 w=new Train2();
           Train2.ChipWagon wag1=w.new ChipWagon(100,350,1);
           Train2.ReservedWagon wag2=w.new ReservedWagon(60,400,2);
           Train2.ReservedWagon wag3=w.new ReservedWagon(55,450,3);
           Train2.ReservedWagon wag4=w.new ReservedWagon(69,400,4);
           Train2.LuxWagon wag5=w.new LuxWagon(40,500,5);
           ArrayList <Train2> railwayTrain=new ArrayList <Train2>();
           railwayTrain.add(wag1);
           railwayTrain.add(wag2);
           railwayTrain.add(wag3);
           railwayTrain.add(wag4);
           railwayTrain.add(wag5);
           
           double sumPayLoad=0;
           int sumPas=0;
           for (Train2 iterator : railwayTrain){
              sumPayLoad+=iterator.payload;
              sumPas+=iterator.passenger;
        }
          System.out.println("Пассажиров в составе " + sumPas);
          System.out.println("Перевозят груза на " + sumPayLoad + " кг");
          
          Collections.sort(railwayTrain);
          for (Train2 i:railwayTrain){
                System.out.println(i.type + " в  составе № " + i.number + "  " + i.passenger + " пассажиров: " + i.payload + "кг груза");}
        
          System.out.print("Введите минимальное количество пассажиров ");
            Scanner in=new Scanner(System.in);
            int taskStart=in.nextInt();
            System.out.print("Введите максимальное  количество  пассажиров ");
            Scanner in2=new Scanner(System.in);
            int taskEnd=in.nextInt();
            System.out.println("В вашем диапазоне подходят: ");
           for (Train2 i:railwayTrain){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " в  составе №1 " + i.passenger + " пассажиров: " + i.payload + "кг груза");}}
          
        
        }
}
