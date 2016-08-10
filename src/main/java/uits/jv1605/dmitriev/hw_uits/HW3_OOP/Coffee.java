/*
    Фургон кофе. Загрузить фургон определенного объема  грузом на определенную  сумму 
из различных сортов кофе, находящихся к тому же в разных состояниях (зерно, молотый, 
растворимый в банках, в пакетиках). Учитывать объем кофе вместе с упаковкой. Провести сортировку
товаров на основе соотношения цены к весу. Найти в фургоне товар, соответствующий 
заданному диапазону параметров качества. 
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Coffee implements Comparable <Coffee> {
    String type; //Сорт кофе
    Sost state; // в каком состянии кофе
    double price;
    double packageQuantity; // количество в упаковке
    int howPackage; // количество загруженных  упаковок в фургон
    int quality; // степень качества  от 0 до 10
    
    
    enum Sost{Bean, Ground, InstantJars, InstantBags}
    
    //@Override 911
        public int compareTo(Coffee obj) {
             Coffee entry = (Coffee) obj;
             if ((price/packageQuantity)>(entry.price/entry.packageQuantity)) return 1;
             if ((price/packageQuantity)==(entry.price/entry.packageQuantity)) return 0;
             if ((price/packageQuantity)<(entry.price/entry.packageQuantity)) return -1;
           return 0;  
       }
        
        boolean sortByNumber(double start, double end){
           return (this.quality>=start)&(this.quality<=end);
            }
        
        public class Arabica extends Coffee{
            Arabica(Sost state, double price, double packageQuantity, int howPackage, int quality){
                this.type="Кофе арабика";
                this.state=state;
                this.price=price; 
                this.packageQuantity=packageQuantity;
                this.howPackage=howPackage;
                this.quality=quality;}
        }
        
        public class Robusta extends Coffee{
            Robusta(Sost state, double price, double packageQuantity, int howPackage, int quality){
                this.type="Кофе конголезский";
                this.state=state;
                this.price=price; 
                this.packageQuantity=packageQuantity;
                this.howPackage=howPackage;
                this.quality=quality;}
        }
        
        public class CapeAlamid extends Coffee{
            CapeAlamid (Sost state, double price, double packageQuantity, int howPackage, int quality){
                this.type="Капе Аламид";
                this.state=state;
                this.price=price; 
                this.packageQuantity=packageQuantity;
                this.howPackage=howPackage;
                this.quality=quality;}
        }
        
        public static void main(String args[]){
            double maxWeigth=100;
            double maxPay=1000; //Максимальная стоимость кофе в фургоне
            double weigth=0;
            double pay=0;
            //(Sost state, double price, double packageQuantity, int howPackage, int quality)
         Coffee c=new Coffee();
         Coffee.Arabica cof1=c.new Arabica(Sost.Bean,5,5,5,5);
         Coffee.Robusta cof2=c.new Robusta(Sost.InstantJars,3,4,5,4);
         Coffee.CapeAlamid cof3=c.new CapeAlamid(Sost.Ground,130,5,1,10);
         Coffee.Arabica cof4=c.new Arabica(Sost.InstantJars,4,3,5,5);
         Coffee.Arabica cof5=c.new Arabica(Sost.InstantBags,2,1,20,2);
         ArrayList <Coffee> wagon=new ArrayList <Coffee>();
         wagon.add(cof1);
         wagon.add(cof2);
         wagon.add(cof3);
         wagon.add(cof4);
         wagon.add(cof5);
            for (Coffee iterator : wagon){
                     weigth+=iterator.packageQuantity*iterator.howPackage;
                     pay+=iterator.price;
            }
            if ((weigth>maxWeigth)|(pay>maxPay)){
                System.out.println("Вагончик перегружен или оказался слишком дорогим");}
           
          Collections.sort(wagon);
          for (Coffee i:wagon){
                System.out.println(i.type + " в виде  " + i.state + " и  соотношении " + i.price/i.quality);}
        
        System.out.print("Введите минимальный  порог  качества ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальный  порог  качества ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Coffee i:wagon){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " в виде  " + i.state + " и  качестве " + i.quality);}}
          
        
        }   
        
}
