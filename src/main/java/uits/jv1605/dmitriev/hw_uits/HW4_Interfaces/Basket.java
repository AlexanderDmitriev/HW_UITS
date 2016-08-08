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
    transient Object[] elementData; // non-private to simplify nested class access
    private int size;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    
   /* public void put(Collection<? extends Plant> c, Plant e) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            // c.toArray might (incorrectly) not return Object[] (see 6260652)
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        } else {
            // replace with empty array.
            this.elementData = EMPTY_ELEMENTDATA;
        }
        //ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
    }*/
    
    public void put(Collection <Plant> c, Plant e){
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
        //tempArray = c.toArray(new Plant [c.size()]);
        //Fruit x=new Fruit();
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
        //tempArray = c.toArray(new Plant [c.size()]);
        //Vegetable x=new Vegetable();
        int i=0;
        for(Plant iterator : c){
            //if(iterator.getClass().getName().equals(x.getClass().getName())){
                if(iterator instanceof Vegetable){
                  tempArray[i]=iterator;
                  i++;}
            } if (i==0) return null;
        return tempArray;
        }
        
    
    
    public double getWeigth(Collection <Plant> c){
        double sum=0;
        for(Plant iterator : c){
             sum+=iterator.weigth;
        }
        return sum;
    }
    


    public static void main(String args[]){
        Fruit x=new Fruit();
        x.getClass();
    }
}
