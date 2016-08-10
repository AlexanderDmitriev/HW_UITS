/*
    Создать класс Корзина, который будет хранить набор овощей и фруктов. Корзина
должна быть расширяемым контейнером и содержать набор методов:
    1) put. Добавление овощей/фруктов в корзину, перегрузить данный метод таким 
образом, чтоб он мог принимать массив овощей/фруктов, другую корзину и перекладывать
овощи в указанную корзину.
    2) extract. Получение элемента из корзины по индексу, элемент должен быть
удален из корзины и возращен методом, все идущие после указанного элемента должны быть 
смещены влево
    3) extractAll. получение всего содержимого корзины в виде массива, корзина 
опустошается
    4) extractAllFruit. извлечение всех фруктов
    5) extractAllVegetables. извлечение всех овощей
    6) getWeigth. возращает вес корзины
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Plant;

/** @author 911 */
public class Basket {
    
    public static void put(Collection <Plant> c, Plant e){
        c.add(e);
    }
    public void put(Collection <Plant> c, Collection <Plant> e){
        for(Plant iterator : e){
            c.add(iterator);}
    }
    
    public Plant extract(ArrayList <Plant> c, int number){
        Plant tempArray[]=new Plant[c.size()];
        tempArray = c.toArray(new Plant [c.size()]);
        Plant result=tempArray[number];
        c.remove(number);
        c.trimToSize();
        return result;
    }
    
    public Plant [] extractAll(ArrayList <Plant> c){
        Plant tempArray[]=new Plant[c.size()];
        tempArray = c.toArray(new Plant [c.size()]);
        c.clear();
        return tempArray;
    }
    
    public Plant [] extractAllFruit(ArrayList <Plant> c){
        Plant tempArray[]=new Plant[c.size()];
        int i=0;
        for(Plant iterator : c){
            if(iterator instanceof Fruit){ // iterator instanceof Fruit  вернет true, если iterator принадлежит классу Fruit
                  tempArray[i]=iterator;
                  i++;}
            } if (i==0) return null;
        return tempArray;
        }
    
    public Plant [] extractAllVegetables(ArrayList <Plant> c){
        Plant tempArray[]=new Plant[c.size()];
        int i=0;
        for(Plant iterator : c){
                if(iterator instanceof Vegetable){
                  tempArray[i]=iterator;
                  i++;}
            } if (i==0) return null;
        return tempArray;
        }
        
    
    
    public static double getWeigth(Collection <Plant> c){
        double sum=0;
        for(Plant iterator : c){
             sum+=iterator.weigth;
        }
        return sum;
    }
    
    public static Collection <Plant> fillTheBasket(Collection <Plant> list,Collection <Plant> e){ //Метод, наполняющий корзину
        for(Plant iterator : e){
            if (!iterator.condition){throw new IllegalArgumentException(" Вы загрузили некачественный продукт");}
            put(list,iterator);
            System.out.println("Корзина на данный момент весит "  + getWeigth(list) );
            }
        return list;
    }
    public static Collection <Plant> fillTheBasket(Collection <Plant> list, Plant e){ //Метод, наполняющий корзину
            if (!e.condition){throw new IllegalArgumentException(" Вы загрузили некачественный продукт");}
            put(list,e);
            System.out.println("Корзина на данный момент весит "  + getWeigth(list) );
            return list;
        }
    
    


    public static void main(String args[]){

    }
}
