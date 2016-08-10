/*
    Реализовать минимальный пользовательский интерфейс для выполнения всех операций
(создание объектов с заданнием характеристик, добавление/изъятие из корзины,
чистка, шинковка/нарезка, потери и отходы)
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;
import javax.swing.*;
/** @author 911 */
public class InputInterface {
    public static void input(){
        String x=JOptionPane.showInputDialog("Выберите операцию: " + "\n" + "1.Create - создать объект" +
                "\n" + "2.Add - Добавить объект в корзину" + "\n" + "3.Extract - изъять из корзины" + 
                "\n" + "4.Peell - чистка овощей" + "\n" + "5.Slice - шинковка фруктов" + "\n" + 
                "6.Cut - нарезка овощей" + "\n" + "7.Trash - сколько ушло в мусор" + "\n" + 
                "8.Weigth - узнать текущий вес корзины");
        if(x.equalsIgnoreCase("Create")){}
        if(x.equalsIgnoreCase("Add")){}
        if(x.equalsIgnoreCase("Extract")){}
        if(x.equalsIgnoreCase("Peell")){}
        if(x.equalsIgnoreCase("Slice")){}
        if(x.equalsIgnoreCase("Cut")){}
        if(x.equalsIgnoreCase("Trash")){}
        if(x.equalsIgnoreCase("Weigth")){}
        
    }
    
    public static void main(String args[]){
        input();
    }
}
