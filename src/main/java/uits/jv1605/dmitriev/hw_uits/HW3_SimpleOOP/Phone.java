/*
Телефон. Вывести: 1)сведения об абонентах, у  которых время внутригородских разговоров превышает заданное
                  2) сведения об абонентах, которые  пользуются междугородней связью
                  3) сведения  об  абонентах  в  алфавитном  порядке
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Phone extends Person implements Comparable <Phone> {
    //String identificationNumber - В данном случае  номер кредитной  карты 
    double debet;
    double credit;
    double innerTime;
    double outerTime;
    
    Phone(){super();}
    Phone(String lastName, String name, String surName, String adress, String identificationNumber, 
            double debet, double credit, double innerTime, double outerTime ){
        super(lastName, name, surName, adress, identificationNumber);
        this.debet=debet;
        this.credit=credit;
        this.innerTime=innerTime;
        this.outerTime=outerTime;
    }
    
    void setDebet(double parameter){this.debet=parameter;}
    void setCredit(double parameter){this.credit=parameter;}
    void setInnerTime(double parameter){this.innerTime=parameter;}
    void setOuterTime(double parameter){this.outerTime=parameter;}
    
    double getDebet(){return this.debet;}
    double getPhoneCredit(){return this.credit;}
    double getInnerTime(){return this.innerTime;}
    double getOuterTime(){return this.outerTime;}
    
    @Override
    public String toString(){return id + " Писатель: " + this.lastName + " " + this.surName + "  " + this.name + 
                 " . Номер  кредитной  карты  " + this.identificationNumber  + " Дебет: " + this.debet +
                " Кредит: " + this.credit + ". Наговорил  внутри сети: " + this.innerTime + " , по межгороду: "
                + this.outerTime;}
    
        //@Override 911
       public int compareTo(Phone obj) {
             Phone entry = (Phone) obj;
            
             int result = lastName.compareTo(entry.lastName);
             if(result != 0) {
                    return result;
             }
            
             if(result == 0) {
                    return  name.compareTo(entry.name);
             }
             return 0;
       }
    
    public static void main(String args[]){
        ArrayList <Phone> phoneList=new ArrayList <Phone>();
        Phone ph1=new Phone("Сапковский", "Анжей", "","г.Лодзь, Польша", "41484432", 5,4,18,0);
            phoneList.add(ph1);
        Phone ph2=new Phone("Карпишин", "Дрю", "","г.Эдмонтон, Канада", "54548796", 8,4,25,4);
            phoneList.add(ph2);
        Phone ph3=new Phone("Мартин", "Джордж", "Реймонд","г.Нью-Джерси, США", "54658125", 18,3,20,10);
            phoneList.add(ph3);
        Phone ph4=new Phone("Буровский", "Андрей", "Михайлович","г.Красноярск, Россия", "65743214", 4,2,5,0);
            phoneList.add(ph4);
        Phone ph5=new Phone("Бушков", "Александр", "Александрович","г.Минусинск, Россия", "99986542", 4,4,8,0);
            phoneList.add(ph5);
        Phone ph6=new Phone("Кинг", "Стивен", "Эдвин","г.Портленд, США", "77775475", 9,4,11,1);
            phoneList.add(ph6);
    
        System.out.print("Введите порог  времени  разговора: ");
        Scanner in=new Scanner(System.in);
        int taskTime=in.nextInt();
        for (Phone iterator : phoneList){
            if (iterator.innerTime>=taskTime){
                System.out.println("Болтун: " + iterator.toString());
            }
        }
        System.out.println("Пользовались  междугородней  связью: ");
        for (Phone iterator : phoneList){
            if (iterator.outerTime>0){
                System.out.println("Болтун  масштабный  обыкновенный: " + iterator.toString());
            }
        }
        System.out.println("Выводим список в алфавитном порядке ");
        Collections.sort(phoneList);
        Object [] temp=phoneList.toArray();
        Arrays.sort(temp);
         for (Object temp1 : temp) {
             System.out.println(temp1.toString());
         }
    }
    
}
