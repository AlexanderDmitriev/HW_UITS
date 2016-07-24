/*
Автомобиль. Вывести: 1)список автомобилей заданной  марки
                     2) список авто заданной марки, которые эксплуатируются больше  лет
                     3) список авто заданного года выпуска, дороже указанной цены
 */

package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Car {
    int id;
    String brand; //Марка автомобиля
    String model; 
    String year; //Год выпуска
    String color;
    double price;
    int registrationNumber;
    
    Car(){
        id=(int)(Math.random()*10000);}
    
    Car(String brand, String model, String year,String color, double price, int registrationNumber){
        id=(int)(Math.random()*10000);
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.registrationNumber=registrationNumber;}
    
    void setId(int parameter){this.id=parameter;}
    void setBrand(String parameter){this.brand=parameter;}
    void setModel(String parameter){this.model=parameter;}
    void setYear(String parameter){this.year=parameter;}
    void setColor(String  parameter){this.color=parameter;}
    void setPrice(double  parameter){this.price=parameter;}
    void setRegistrationNumber(int  parameter){this.registrationNumber=parameter;}
    
    int getId(){return this.id;}
     String getBrand(){return this.brand;}
     String getModel(){return this.model;}
     String getYear(){return this.year;}
     String getColor(){return this.color;}
     double getPrice(){return this.price;}
     int getRegistrationNumber(){return this.registrationNumber;}
     
     public String toString(){return id + " Автомобиль: " + this.brand + " " + this.model + " , выпущен в  " 
                + this.year + " году. Цвет -  " + this.color  + " . Стоимость: " + this.price +
                " Регистрационный  номер: " + this.registrationNumber;}
     
     public static void main(String args[]){
         ArrayList <Car> carList=new ArrayList <Car>();
        Car auto1=new Car("Porsche", "Carrera GT", "2004","silver", 80000, 3102);
            carList.add(auto1);
        Car auto2=new Car("Volkswagen", "Golf IV", "2001","red", 40000, 7401);
            carList.add(auto2);
        Car auto3=new Car("Lada", "Priora", "2012","silver", 35000, 5285);
            carList.add(auto3);
        Car auto4=new Car("Toyota", "Corolla E90", "1989","white", 30000, 2444);
            carList.add(auto4);
        Car auto5=new Car("Volkswagen", "New Beetle", "2004","silver", 40000, 7434);
            carList.add(auto5);
        Car auto6=new Car("Volkswagen", "Passat B4", "1995","black", 35000, 5203);
            carList.add(auto6);
            
        System.out.print("Введите интересующий бренд  автомобиля: ");
        Scanner in=new Scanner(System.in);
        String taskBrand=in.nextLine();
        for (Car iterator : carList){
            if (iterator.brand.equalsIgnoreCase(taskBrand)){
                System.out.println("Подходит: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий срок службы  автомобиля: ");
        Scanner in2=new Scanner(System.in);
        int taskTime=in2.nextInt();
        for (Car iterator : carList){
            if ((iterator.brand.equalsIgnoreCase(taskBrand))&((2016-Integer.parseInt(iterator.year))>taskTime)){
                System.out.println("Подходит по бренду и сроку службы: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий год выпуска  автомобиля: ");
        Scanner in3=new Scanner(System.in);
        int taskYear=in3.nextInt();
        System.out.print("Введите интересующую  стоимость  автомобиля: ");
        Scanner in4=new Scanner(System.in);
        double taskPrice=in4.nextDouble();
        for (Car iterator : carList){
            if ((taskYear==Integer.parseInt(iterator.year))&(iterator.price>taskPrice)){
                System.out.println("Подходит по году и цене: " + iterator.toString());
            }
        }
     }
}
