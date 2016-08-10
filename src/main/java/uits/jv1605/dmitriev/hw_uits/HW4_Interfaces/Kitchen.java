/*
    Реализовать приложение, которое будет добавлять овощи/фрукты в корзину, иметь 
кухонный комбайн для чистки, нарезки/шинковки. Также вывести потери веса для 
овощей/фрктов исходя из данных до и после нарезки/чистки/шинковки
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

import java.util.ArrayList;
import java.util.Collection;


/**@author 911  */
public class Kitchen extends KitchenMachine {

    public  Collection <Plant> machine(Collection <Plant> e){  // Метод, обрабатывающий продукты
            for(Plant iterator : e){
                if (!iterator.peelling){peellItem(iterator);}  
        }
            System.out.println(getWeigth(e));
            System.out.println("Корзина нарезки фруктов весит "  + sliceAll(e));
            System.out.println("Корзина нарезки овощей весит "  + cutAll(e));
            return e;
     }
        
     public Plant machine(Plant e){  // Метод, обрабатывающий продукты
                if (!e.peelling){System.out.print("Корзина после очистки весит "  + peellItem(e));}  
        
            System.out.print("Корзина нарезки фруктов весит "  + slice(e));
            System.out.print("Корзина нарезки овощей весит "  + cut(e));
            return e;
     }   
        
    
    //(double weigth, String color, boolean ripeness, boolean condition, boolean peelling)
    public static void main(String args[]){
        Apple redApple=new Apple(1,"Red",false,true,true);
        Pear someFruit=new Pear(0.5, "Yellow",false,true,false);
        Banana bananas=new Banana(0.5,"Yellow",false,true,false);
        Orange someOrange=new Orange(0.6,"Orange",false,true,false);
        Potato veg1=new Potato(0.7, "Grey",true,true,true);
        Carrot veg2=new Carrot(0.4,"Red",false,true,false);
        Celery veg3=new Celery(0.7,"White",false,true,false);
        Onion veg4=new Onion(0.6, "White",false,true,false);
        Collection <Plant> coll=new ArrayList <Plant>();
        coll.add(redApple);
        coll.add(someFruit);
        coll.add(bananas);
        coll.add(someOrange);
        coll=fillTheBasket(coll,redApple);
        Collection <Plant> coll2=new ArrayList <Plant>();
        coll2.add(someFruit);
        coll2.add(bananas);
        coll2.add(someOrange);
        coll=fillTheBasket(coll,coll2);
        double startWeigth=getWeigth(coll);
        Kitchen x=new Kitchen();
        coll=x.machine(coll);
        System.out.println("Потеря веса = " + (startWeigth-getWeigth(coll)));

    }

}
