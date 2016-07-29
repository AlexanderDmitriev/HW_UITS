/*
Автобус. Вывести: 1)список автобусов для заданного  номер  маршрута
                  2) список автобусов, которые  эксплуатируются  больше  заданного  срока
                  3) список автобусов, пробег  которых больше заданного
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Bus {
    String driverName; //ФИО Водителя
    int busNumber;   
    int routeNumber; // номер маршрута
    String bus;  // Марка автобуса
    int year;
    double kilometerage;
    
    Bus(String driverName, int busNumber, int routeNumber, String bus, int year, double  kilometerage){
        this.driverName=driverName;
        this.busNumber=busNumber;
        this.routeNumber=routeNumber;
        this.bus=bus;
        this.year=year;
        this.kilometerage=kilometerage;}
    
    void setDriverName(String parameter){this.driverName=parameter;}
    void setBusNumber(int parameter){this.busNumber=parameter;}
    void setRouteNumber(int parameter){this.routeNumber=parameter;}
    void setBus(String parameter){this.bus=parameter;}
    void setYear(int  parameter){this.year=parameter;}
    void setKilometerage(double  parameter){this.kilometerage=parameter;}

     String getDriverName(){return this.driverName;}
     int getBusNumber(){return this.busNumber;}
     int getRouteNumber(){return this.routeNumber;}
     String getBus(){return this.bus;}
     int getYear(){return this.year;}
     double getKilometerage(){return this.kilometerage;}
    
     public String toString(){return " Автобус: № " + this.busNumber + "  отправляется  по  " + this.routeNumber + 
                            "-му  маршруту. Водитель:  " + this.driverName + " . Используется: " + this.bus
                            + " c " +  this.year + "-го  года. Пробег: "+this.kilometerage;}
     
     public static void main(String args[]){
        // Bus(String driverName, int busNumber, int routeNumber, String bus, int year, double  kilometerage)
         ArrayList <Bus> busList=new ArrayList <Bus>();
        Bus bus1=new Bus("Михалыч", 1420, 240,"Богдан-1", 2014, 1024);
            busList.add(bus1);
        Bus bus2=new Bus("М. Шумахер", 1844, 240,"Ferrari GT", 2015, 807);
            busList.add(bus2);
        Bus bus3=new Bus("И. Сусанин", 1734, 266,"Богдан-1", 2006, 3478);
            busList.add(bus3);
        Bus bus4=new Bus("В. Пупкин", 1233, 206,"Богдан-6544", 2005, 2704);
            busList.add(bus4);
        Bus bus5=new Bus("Н. Гастелло", 4458, 9,"ДБ-3Ф", 1924, 10328);
            busList.add(bus5);
        Bus bus6=new Bus("Марко Поло", 1231, 42,"Кобыла", 1438, 1);
            busList.add(bus6);
        
        System.out.print("Введите интересующий номер маршрута: ");
        Scanner in=new Scanner(System.in);
        int taskRouteNumber=in.nextInt();
        for (Bus iterator : busList){
            if (iterator.routeNumber==taskRouteNumber){
                System.out.println("Подходит: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий срок эксплуатации: ");
        Scanner in2=new Scanner(System.in);
        int taskTime=in2.nextInt();
         for (Bus iterator : busList){
            if (2016-iterator.year>=taskTime){
                System.out.println("Подходит по сроку: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий пробег: ");
        Scanner in3=new Scanner(System.in);
        int taskKilometerage=in3.nextInt();
         for (Bus iterator : busList){
            if (iterator.kilometerage>=taskKilometerage){
                System.out.println("Подходит по пробегу: " + iterator.toString());
            }
        } 
}}
