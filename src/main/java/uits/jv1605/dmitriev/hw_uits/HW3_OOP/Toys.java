/*
    Игровая комната. Подготовить игровую комнату для детей разных возрастных групп. 
Игрушек должно быть фиксированное количество в пределах выделенной суммы денег. 
Должны встречаться игрушки родственных групп: маленькие, средние и большие машинки, 
мячи, куклы, кубики. Провести сортировку игрушек в комнате по одному из параметров.
Найти игрушки в комнате, соответствующие заданному диапазону параметров.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Toys implements Comparable <Toys>{
    String type;
    double price;
    int quantity;
    
    //@Override 911
        public int compareTo(Toys obj) {
             Toys entry = (Toys) obj;
             if ((price)>(entry.price)) return 1;
             if ((price)==(entry.price)) return 0;
             if ((price)<(entry.price)) return -1;
           return 0;  
       }
        
        boolean sortByNumber(int start, int end){
           return (this.quantity>=start)&(this.quantity<=end);
            }
        
        public class SmallCars extends Toys{
            SmallCars(double price, int quantity){
                this.type="Маленькие машинки";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        public class MiddleCars extends Toys{
            MiddleCars(double price, int quantity){
                this.type="Средние машинки";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        public class LargeCars extends Toys{
            LargeCars(double price, int quantity){
                this.type="Большие машинки";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        public class Dolls extends Toys{
            Dolls(double price, int quantity){
                this.type="Куклы";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        public class Balls extends Toys{
            Balls(double price, int quantity){
                this.type="Мяч";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        public class Cube extends Toys{
            Cube(double price, int quantity){
                this.type="Кубики";
                this.quantity=quantity;
                this.price=price; 
                }
        }
        
        public static void main(String args[]){
            double maxQuantity=200;
            double maxPay=1000; //Выделенная сумма для покупки игрушек
            double count=0;
            double pay=0;
            //(double price, int quantity)
            Toys t1=new Toys();
            Toys.SmallCars toy1=t1.new SmallCars(1,30);
            Toys t2=new Toys();
            Toys.MiddleCars toy2=t2.new MiddleCars(2,20);
            Toys t3=new Toys();
            Toys.LargeCars toy3=t3.new LargeCars(3,10);
            Toys.Dolls toy4=t1.new Dolls(1.5,15);
            Toys.Balls toy5=t1.new Balls(2,15);
            Toys.Cube toy6=t1.new Cube(0.25,110);
            ArrayList <Toys> juniorGroup=new ArrayList <Toys>();
            ArrayList <Toys> middleGroup=new ArrayList <Toys>();
            ArrayList <Toys> payment=new ArrayList <Toys>();
            payment.add(toy2);
            payment.add(toy3);
            payment.add(toy4);
            payment.add(toy5);
            payment.add(toy6);
            payment.add(toy1);
            juniorGroup.add(toy2);
            juniorGroup.add(toy3);
            juniorGroup.add(toy4);
            juniorGroup.add(toy5);
            juniorGroup.add(toy6);
            middleGroup.add(toy1);
            middleGroup.add(toy2);
            middleGroup.add(toy3);
            middleGroup.add(toy4);
            middleGroup.add(toy5);
            for (Toys iterator : payment){
                     count+=iterator.quantity;
                     pay+=iterator.price;
            }
            if ((count>maxQuantity)|(pay>maxPay)){
                System.out.println("На игровую не хватит денег");}
            if (count<maxQuantity){
                System.out.println("Игрушек может на всех не хватить");}
            
            Collections.sort(juniorGroup);
                for (Toys i:juniorGroup){
                    System.out.println("У  малышей " + i.type + " есть  " + i.quantity + " шт, и  стоит " + i.price);}
            Collections.sort(middleGroup);
                for (Toys i:middleGroup){
                    System.out.println("У  старшей группы " + i.type + " есть  " + i.quantity + " шт, и  стоит " + i.price);}
           
            System.out.print("Введите минимальное количество ");
            Scanner in=new Scanner(System.in);
            int taskStart=in.nextInt();
            System.out.print("Введите максимальное количество ");
            Scanner in2=new Scanner(System.in);
            int taskEnd=in.nextInt();
            System.out.println("В вашем диапазоне купленных  игрушек  для  комнаты подходят: ");
           for (Toys i:payment){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " есть  " + i.quantity + " шт");}}
          
        }
}
