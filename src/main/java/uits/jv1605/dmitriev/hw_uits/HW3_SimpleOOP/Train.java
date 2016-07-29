/*
Поезд. Вывести: 1) список поездов до заданного  пункта  назначения
                2) список поездов до заданного  пункта  назначения, отправляющихся после определенного  времени
                3) список поездов до заданного  пункта  назначения  и  имеющий общие  места
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Train {
    String destination; //Пункт назначения
    int trainNumber;   
    String departureTime; // Время отправления
    int seats;  // Число мест
    int cheapSeats;
    int reservedSeats;
    int luxSeats;
    
    Train(String destination, int trainNumber, String departureTime, int cheapSeats, int reservedSeats, int luxSeats){
        this.destination=destination;
        this.trainNumber=trainNumber;
        this.departureTime=departureTime;
        this.cheapSeats=cheapSeats;
        this.reservedSeats=reservedSeats;
        this.luxSeats=luxSeats;}
    
    void setDestination(String parameter){this.destination=parameter;}
    void setTrainNumber(int parameter){this.trainNumber=parameter;}
    void setDepartureTime(String parameter){this.departureTime=parameter;}
    void setCheapSeats(int parameter){this.cheapSeats=parameter;}
    void setReservedSeats(int  parameter){this.reservedSeats=parameter;}
    void setLuxSeats(int  parameter){this.luxSeats=parameter;}

     String getDestination(){return this.destination;}
     int getTrainNumber(){return this.trainNumber;}
     String getDepartureTime(){return this.departureTime;}
     int getCheapSeats(){return this.cheapSeats;}
     int getReservedSeats(){return this.reservedSeats;}
     int getLuxSeats(){return this.luxSeats;}
    
     public String toString(){return " Поезд: № " + this.trainNumber + "  отправляется  в  " + this.destination + 
                            " в  " + this.departureTime + " . Мест: " + (this.cheapSeats+this.reservedSeats+this.luxSeats );}
     
     public static void main(String args[]){
//Train(String destination, int trainNumber, String departureTime, int cheapSeats, int reservedSeats, int luxSeats)
         ArrayList <Train> trainList=new ArrayList <Train>();
        Train train1=new Train("Dnepropetrovsk", 15, "14-30",0, 120, 24);
            trainList.add(train1);
        Train train2=new Train("Odessa", 59, "17-30",200, 120, 48);
            trainList.add(train2);
        Train train3=new Train("Kiev", 63, "18-45",0, 150, 48);
            trainList.add(train3);
        Train train4=new Train("Kiev", 108, "04-20",185, 240, 0);
            trainList.add(train4);
        Train train5=new Train("Lvov", 111, "23-59",0, 240, 0);
            trainList.add(train5);
        Train train6=new Train("Odessa", 471, "06-30",0, 300,48);
            trainList.add(train6);
            
        System.out.print("Введите интересующий пункт назначения: ");
        Scanner in=new Scanner(System.in);
        String taskDestanition=in.nextLine();
        for (Train iterator : trainList){
            if (iterator.destination.equalsIgnoreCase(taskDestanition)){
                System.out.println("Подходит: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующее  время: ");
        Scanner in2=new Scanner(System.in);
        String taskTime=in2.nextLine();
        for (Train iterator : trainList){
            int hour=Integer.parseInt(iterator.departureTime.substring(0,1));
            int minutes=Integer.parseInt(iterator.departureTime.substring(3,4));
            int hourTask=Integer.parseInt(taskTime.substring(0,1));
            int minutesTask=Integer.parseInt(taskTime.substring(3,4));
            if ((hour>hourTask)|(hour==hourTask)&(minutes>=minutesTask)){
                if (iterator.destination.equalsIgnoreCase(taskDestanition)){
                    System.out.println("Подходит еще и по времени: " + iterator.toString());}
            }
        }
         System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий пункт назначения: ");
        Scanner in3=new Scanner(System.in);
        String taskDestanition2=in3.nextLine();
        for (Train iterator : trainList){
            if ((iterator.destination.equalsIgnoreCase(taskDestanition2))&(iterator.cheapSeats!=0)){
                System.out.println("Подходит  и есть общие места: " + iterator.toString());
            }
        }
        
     }
     
}
