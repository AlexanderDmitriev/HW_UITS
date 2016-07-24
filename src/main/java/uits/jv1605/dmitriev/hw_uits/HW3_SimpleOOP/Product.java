/*
Продукт. Вывести: 1) список товаров заданного наименования
                  2) список товаров заданного  наименования, дороже указанной цены
                  3)список товаров, срок хранения, которых  больше заданного
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Product {
    int id;
    String name; // наименование
    long upc; //Универсальный  код  товара, состоящий из 8 цифр
    String manufacturer; //производитель
    double price;
    int storageLife;
    int howMany;
    
    Product(){
        id=(int)(Math.random()*10000);}
    
    Product(String name, long upc, String manufacturer, double price, int storageLife, int howMany){
        id=(int)(Math.random()*10000);
        this.name=name;
        this.upc=upc;
        this.manufacturer=manufacturer;
        this.price=price;
        this.storageLife=storageLife;
        this.howMany=howMany;}
    
    void setId(int parameter){this.id=parameter;}
    void setName(String parameter){this.name=parameter;}
    void setUPC(long parameter){this.upc=parameter;}
    void setManufacturer(String parameter){this.manufacturer=parameter;}
    void setStorageLife(int  parameter){this.storageLife=parameter;}
    void setPrice(double  parameter){this.price=parameter;}
    void setHowMany(int  parameter){this.howMany=parameter;}
    
     int getId(){return this.id;}
     String getName(){return this.name;}
     long getUPC(){return this.upc;}
     String getManufacturer(){return this.manufacturer;}
     int getStorageLife(){return this.storageLife;}
     double getPrice(){return this.price;}
     int getHowMany(){return this.howMany;}
     
     public String toString(){return id + " Товар: " + this.name + "  под  кодом  UPC:  " + this.upc + " , произведен  " 
                + this.manufacturer + " . Стоимость: " + this.price + " . Срок  годности (мес)  " + this.storageLife   +
                " На  складе: " + this.howMany;}
     //Product(String name, int upc, String manufacturer, double price, int storageLife, int howMany)
     public static void main(String args[]){
          ArrayList <Product> productList=new ArrayList <Product>();
        Product prod1=new Product("AG Gold 3g", 12345678, "AG Termopasty",100.0, 24, 3);
            productList.add(prod1);
        Product prod2=new Product("Compressed Air 300ml", 87654321, "AG Chemia",110, 36, 3);
            productList.add(prod2);
        Product prod3=new Product("CRC-LC Cleaner", 44556677, "CRC",300, 12, 1);
            productList.add(prod3);
        Product prod4=new Product("FREEZE 300ml", 12457836, "AG Chemia",185, 24, 3);
            productList.add(prod4);
        Product prod5=new Product("Kontakt 60 200ml", 78453512, "Kontakt Chemie",190, 24, 3);
            productList.add(prod5);
        Product prod6=new Product("CRC-LC Cleaner", 44556677, "Poland",331.85, 12, 0);
            productList.add(prod6);
            
        System.out.print("Введите интересующий товар: ");
        Scanner in=new Scanner(System.in);
        String taskProduct=in.nextLine();
        for (Product iterator : productList){
            if (iterator.name.equalsIgnoreCase(taskProduct)){
                System.out.println("Подходит: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующую цену товара: ");
        Scanner in2=new Scanner(System.in);
        int taskPrice=in2.nextInt();
        for (Product iterator : productList){
            if ((iterator.name.equalsIgnoreCase(taskProduct))&(iterator.price>=taskPrice)){
                System.out.println("Подходит по наименованию  и  минимальной  цене: " + iterator.toString());
            }
        }
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.print("Введите интересующий срок  хранения  товара ");
        Scanner in3=new Scanner(System.in);
        int taskTime=in3.nextInt();
        for (Product iterator : productList){
            if (iterator.storageLife>=(taskTime)){
                System.out.println("Долго  хранятся: " + iterator.toString());
            }
        }
     }
}
