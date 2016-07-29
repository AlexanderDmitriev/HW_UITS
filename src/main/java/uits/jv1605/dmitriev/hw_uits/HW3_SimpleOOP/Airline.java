/*
Аэрофлот. Вывести: 1) список рейсов для заданного  пункта назначения
                   2) список рейсов для дня недели
                   3) список рейсов для дня недели, которые вылетают позже указанного
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Airline {
    String destination; //Пункт назначения
    int flightNumber;   // Номер рейса
    String airplane;    // Тип самолета
    String departureTime; // Время отправления
    int [] day; //День  недели
    
    Airline(String destination, int flightNumber, String airplane, String departureTime, int [] day){
        this.destination=destination;
        this.flightNumber=flightNumber;
        this.departureTime=departureTime;
        this.airplane=airplane;
        this.day=day;}
    
    void setDestination(String parameter){this.destination=parameter;}
    void setFlightNumber(int parameter){this.flightNumber=parameter;}
    void setDepartureTime(String parameter){this.departureTime=parameter;}
    void setAirplane(String parameter){this.airplane=parameter;}
    void setDay(int []  parameter){this.day=parameter;}
    
    String getDestination(){return this.destination;}
     int getFlightNumber(){return this.flightNumber;}
     String getDepartureTime(){return this.departureTime;}
     String getAirplane(){return this.airplane;}
     int [] getDay(){return this.day;}
     
     public String toString(){return " Лайнер, летящий в " + this.destination + "  . Рейс №  " + this.flightNumber + 
                            " . Отправление  в  " + this.departureTime + " . Вы  летите  на: " + this.airplane;}
     
     //Airline(String destination, int flightNumber, String airplane, String departureTime, byte day)
     public static void main(String args[]){
         ArrayList <Airline> planeList=new ArrayList <Airline>();
         int [] week1={1,2,3,4,5};
         int [] week2={2,3,4,5};
         int [] week3={1,2,3,4,5,6};
         int [] week4={2,3,4};
         int [] week5={1,2,3,4,5,6,7};
         int [] week6={1,2,3};
        Airline plane1=new Airline("London", 3458, "YAK-42","06-45", week1);
            planeList.add(plane1);
        Airline plane2=new Airline("Minsk", 1844, "Airbus A320","08-45", week2);
            planeList.add(plane2);
        Airline plane3=new Airline("Moskow", 1734, "Boeing 737","12-45", week3);
            planeList.add(plane3);
        Airline plane4=new Airline("Moskow", 1233, "Airbus A350","11-25", week4);
            planeList.add(plane4);
        Airline plane5=new Airline("Gadukino village", 4458, "Airbus A380","11-30", week5);
            planeList.add(plane5);
        Airline plane6=new Airline("Kiev", 1231, "ANT-2","14-45", week6);
            planeList.add(plane6);
        System.out.print("Введите интересующий пункт назначения: ");
        Scanner in=new Scanner(System.in);
        String taskDestanition=in.next();
        for (Airline iterator : planeList){
            if (iterator.destination.equalsIgnoreCase(taskDestanition)){
                System.out.println("Подходит: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий день недели: ");
        Scanner in2=new Scanner(System.in);
        String taskDay=in2.next();
        int task=0;
        switch (taskDay){
            case "monday": task=1;break;
            case "tuesday": task=2;break;
            case "wednesday": task=3;break;
            case "thursday": task=4;break;
            case "friday": task=5;break;
            case "saturday": task=6;break;
            case "sunday": task=7;break;}
        for (Airline iterator : planeList){
            for (int i=0; i<iterator.day.length; i++){
                 if (iterator.day[i]==task){
                    System.out.println("В этот день вылетают: " + iterator.toString());
            }}
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий день недели: ");
        Scanner in3=new Scanner(System.in);
        String taskTime=in3.next();
        for (Airline iterator : planeList){
            int hour=Integer.parseInt(iterator.departureTime.substring(0,1));
            int minutes=Integer.parseInt(iterator.departureTime.substring(3,4));
            int hourTask=Integer.parseInt(taskTime.substring(0,1));
            int minutesTask=Integer.parseInt(taskTime.substring(3,4));
            for (int i=0; i<iterator.day.length; i++){
                 if (iterator.day[i]==task){
                     if(((hour>hourTask)|(hour==hourTask)&(minutes>=minutesTask))){
                          System.out.println("В этот день и в удобное время вылетают: " + iterator.toString());}
            }}
        }
        
     }
}
