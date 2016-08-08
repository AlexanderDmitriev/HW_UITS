/*
    Реализовать приложение, которое будет добавлять овощи/фрукты в корзину, иметь 
кухонный комбайн для чистки, нарезки/шинковки. Также вывести потери веса для 
овощей/фрктов исходя из данных до и после нарезки/чистки/шинковки
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

import java.util.ArrayList;
import java.util.Collection;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Fruit.Apple;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Fruit.Banana;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Fruit.Orange;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Fruit.Pear;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Vegetable.Carrot;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Vegetable.Celery;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Vegetable.Onion;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Vegetable.Potato;


/**@author 911  */
public class Kitchen {



    class Distribution extends Basket{
    public Collection <Plant> fillTheBasket(Collection <Plant> e){ //Метод, наполняющий корзину
        Collection <Plant> list=new ArrayList <Plant>();
        for(Plant iterator : e){
            if (!iterator.condition){throw new IllegalArgumentException(" Вы загрузили некачественный продукт");}
            put(list,iterator);
            System.out.print("Корзина на данный момент весит "  + getWeigth(list) );
            }
        return list;
    }
    public Collection <Plant> fillTheBasket(Collection <Plant> list, Plant e){ //Метод, наполняющий корзину
       // Collection <Plant> list=new ArrayList <Plant>();
            if (!e.condition){throw new IllegalArgumentException(" Вы загрузили некачественный продукт");}
            put(list,e);
            System.out.print("Корзина на данный момент весит "  + getWeigth(list) );
            return list;
        }
    }
    class Processing extends KitchenMachine{
        public Collection <Plant> machine(Collection <Plant> e){  // Метод, обрабатывающий продукты
            for(Plant iterator : e){
                if (!iterator.peelling){System.out.print("Корзина после очистки весит "  + peellItem(iterator));}  
        }
            System.out.print("Корзина нарезки фруктов весит "  + sliceAll(e));
            System.out.print("Корзина нарезки овощей весит "  + cutAll(e));
            return e;
     }
        
        public Plant machine(Plant e){  // Метод, обрабатывающий продукты
                if (!e.peelling){System.out.print("Корзина после очистки весит "  + peellItem(e));}  
        
            System.out.print("Корзина нарезки фруктов весит "  + slice(e));
            System.out.print("Корзина нарезки овощей весит "  + cut(e));
            return e;
     }
    }
    
    
    public static void main(String args[]){
        Apple redApple=new Fruit().new Apple();
        Pear someFruit=new Fruit().new Pear();
        Banana bananas=new Fruit().new Banana();
        Orange someOrange=new Fruit().new Orange();
        Potato veg1=new Vegetable().new Potato();
        Carrot veg2=new Vegetable().new Carrot();
        Celery veg3=new Vegetable().new Celery();
        Onion veg4=new Vegetable().new Onion();
        ArrayList <Plant> coll=new ArrayList <Plant>();
        coll.add(redApple);
        coll.add(someFruit);
        coll.add(bananas);
        coll.add(someOrange);
        //coll=fillTheBasket(coll,redApple);  !!! Error
    }

}
