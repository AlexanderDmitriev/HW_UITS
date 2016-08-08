/*
    Туристическая путевка. Сформировать набор предложений клиенту по выбору туристической
путевки различного типа (отдых, экскурсия, лечение, шопинг, круиз и т.д.)  для оптимального
выбора. Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Tourist implements Comparable <Tourist>{
    String type; 
    int food; // количество приемов пищи в день
    int days;
    double price; // стоимость услуги без логистики
    double cost; // итоговая стоимость отдыха
    Transport logistic;
    double transportPay;
    String kind;
    
    enum Transport{Car(2, "на автомобиле"), Bus(1, " автобусом"), Boat(3, "на лодке"), Horse(2, "на лошадях"),
                    Plane(5, " на самолете"), Walk(0, "пешком"), Train(1, "на поезде");
        Transport(double pay, String kind){
            double transportPay=pay;  
            String transportKind=kind;}
    }
    
    
    
    //@Override 911
       public int compareTo(Tourist obj) {
             Tourist entry = (Tourist) obj;
             if (cost>entry.cost) return 1;
             if (cost==entry.cost) return 0;
             if (cost<entry.cost) return -1;
           return 0;  
       }
        boolean sortByNumber(double start, double end){
           return (this.cost>=start)&(this.cost<=end);
            } 
        
        public class WoodRest extends Tourist{
        WoodRest(int food, int days, Transport logistic, double transportPay){
            this.type=" Отдых в лесу ";     
            this.food=food;
            this.days=days;
            this.price=100;
            this.logistic=logistic;
            this.transportPay=transportPay;
            this.cost=(5*food+price)*days+transportPay;
            }
        }
        public class Trip extends Tourist{
        Trip(int food, int days, Transport logistic, double transportPay){
            this.type=" Экскурсия ";     
            this.food=food;
            this.days=days;
            this.price=120;
            this.logistic=logistic;
            this.transportPay=transportPay;
            this.cost=(5*food+price)*days+transportPay;
            }
        }
        public class Healing extends Tourist{
        Healing(int food, int days, Transport logistic, double transportPay){
            this.type=" Лечение ";     
            this.food=food;
            this.days=days;
            this.price=90;
            this.logistic=logistic;
            this.transportPay=transportPay;
            this.cost=(5*food+price)*days+transportPay;
            }
        }
        public class Shopping extends Tourist{
        Shopping(int food, int days, Transport logistic, double transportPay){
            this.type=" Прогулка по магазинам ";     
            this.food=food;
            this.days=days;
            this.price=250;
            this.logistic=logistic;
            this.transportPay=transportPay;
            this.cost=(5*food+price)*days+transportPay;
            }
        }
        public class Cruise extends Tourist{
        Cruise(int food, int days, Transport logistic, double transportPay){
            this.type=" Путешествие ";     
            this.food=food;
            this.days=days;
            this.price=500;
            this.logistic=logistic;
            this.transportPay=transportPay;
            this.cost=(5*food+price)*days+transportPay;
            }
        }
        
        public static void main(String args[]){
            Tourist t=new Tourist();
            Tourist.WoodRest rest1=t.new WoodRest(3,3,Transport.Walk,0);
            Tourist.Trip rest2=t.new Trip(1,1,Transport.Train,3);
            Tourist.Healing rest3=t.new Healing(4,2,Transport.Car,5);
            Tourist.Shopping rest4=t.new Shopping(0,1,Transport.Horse,4);
            Tourist.Cruise rest5=t.new Cruise(4,7,Transport.Boat,6);
            Tourist.Healing rest6=t.new Healing(4,2,Transport.Plane,10);
            ArrayList <Tourist> tours=new ArrayList <Tourist>();
            tours.add(rest1);
            tours.add(rest2);
            tours.add(rest3);
            tours.add(rest4);
            tours.add(rest5);
            tours.add(rest6);
            Collections.sort(tours);
            for (Tourist i:tours){
                System.out.println("Вид отдыха: " + i.type + " с затратами "+ i.cost + " добраться можно " +  i.logistic);}
            System.out.print("Введите сумму, которую вы готовы потратить ");
            Scanner in=new Scanner(System.in);
            double task=in.nextDouble();
            for (Tourist iterator : tours){
                 if (task>iterator.cost){
                System.out.println("Вам подходит: " + iterator.type + " , затраты составят " +  iterator.cost);}    
            }
            
        
        
        
        }  
        
}
