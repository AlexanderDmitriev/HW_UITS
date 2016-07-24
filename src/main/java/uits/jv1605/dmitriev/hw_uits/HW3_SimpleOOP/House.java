/*
Дом. Вывести: 1) список n-комнатных  квартир
              2) список n-комнатных квартир, находящихся  между  fl1 и fl2 - этажами
              3) список квартир, площадь  которых  больше  заданной
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class House {
    int id;
    int number; // Номер квартиры
    double square;
    int floor;
    int rooms; //Количество комнат
    String street;
    Building type; // Тип здания
    int periodOfUse;
    
    enum Building{FullSize, ChipAndSmall, Typical, Elite}
    
    House(){id=(int)(Math.random()*10000);}
    
    House(int number,double square,int floor, int rooms, String street, Building type, int periodOfUse){
        id=(int)(Math.random()*10000);
        this.number=number;
        this.square=square;
        this.floor=floor;
        this.rooms=rooms;
        this.street=street;
        this.type=type;
        this.periodOfUse=periodOfUse;
    }
    
    void setNumber(int parameter){this.number=parameter;}
    void setSquare(double parameter){this.square=parameter;}
    void setFloor(int parameter){this.floor=parameter;}
    void setRooms(int parameter){this.rooms=parameter;}
    void setStreet(String parameter){this.street=parameter;}
    void setType(Building parameter){this.type=parameter;}
    void setPeriodOfUse(int parameter){this.periodOfUse=parameter;}
    
    int getNumber(){return this.number;}
    double getSquare(){return this.square;}
    int getFloor(){return this.floor;}
    int getRooms(){return this.rooms;}
    String getStreet(){return this.street;}
    Building getType(){return this.type;}
    int getPeriodOfUse(){return this.periodOfUse;}
    
    @Override
    public String toString(){return id + " Квартира №: " + this.number  + ". Площадью: " + this.square + " . Находится  на  "
                + this.floor  + "-м этаже. Состоит  из  " + this.rooms + " комнат.Расположена  по  улице  " + this.street + 
            " в  доме  типа: "  + this.type + " . Расчитано  на "  + this.periodOfUse + " лет  использования";}
    
    public boolean finderRooms(int task){
        return this.rooms==task;}
    
    public static void main(String args[]){
        ArrayList <House> houseList=new ArrayList <House>();
        House ap1=new House(514, 10, 5, 1, "пер.Электроинструментальный 6Б", Building.ChipAndSmall, 50);
            houseList.add(ap1);
        House ap2=new House(206, 33, 7, 3, "пер.Электроинструментальный 9", Building.Typical, 70);
            houseList.add(ap2);
        House ap3=new House(123, 45, 3, 4, "ул.Героев Труда 65", Building.FullSize, 75);
            houseList.add(ap3);
        House ap4=new House(14, 85, 2, 6, "ул. Школьная 14", Building.Elite, 100);
            houseList.add(ap4);
        House ap5=new House(23, 64, 1, 5, "ул. Бессмертия Heavy Metall'а 8", Building.FullSize, 80);
            houseList.add(ap5);
        House ap6=new House(284, 33, 2, 8, "пер.Электроинструментальный 6", Building.Typical, 65);
            houseList.add(ap6);
        System.out.print("Введите количество комнат: ");
        Scanner in=new Scanner(System.in);
        int taskRooms=in.nextInt();
        for (House iterator : houseList){
            if (iterator.finderRooms(taskRooms)){
                System.out.println(iterator.toString());
            }
        }
        System.out.print("Вывод квартир между этажами: ");
        System.out.print("Введите количество комнат: ");
        Scanner in2=new Scanner(System.in);
        int taskRooms2=in2.nextInt();
        System.out.print("Введите нижний этаж: ");
        Scanner in3=new Scanner(System.in);
        int taskLowerFl=in3.nextInt();
        System.out.print("Введите верхний этаж: ");
        Scanner in4=new Scanner(System.in);
        int taskUpperFl=in4.nextInt();
        for (House iterator : houseList){
            if ((iterator.finderRooms(taskRooms2))&(iterator.floor>taskLowerFl)&(iterator.floor<taskUpperFl)){
                System.out.println(iterator.toString());
            }
        }
        
        // Квартиры, имеющие, большую  площадь
        System.out.println("Вывод квартир с  площадью, больше  заявленной: ");
        System.out.print("Введите площадь: ");
        Scanner in5=new Scanner(System.in);
        double taskSquare=in5.nextDouble();
        for (House iterator : houseList){
            if (iterator.square>=taskSquare){
                System.out.println(iterator.toString());
            }
        }
    }
    
    
}
