/*
    Создать интерфейс Peeller, содержащий методы peellItem и peellItems, которые
чистят  один  или несколько фруктов/овощей. Создать интерфейс Cutter, который 
содержит методы cut и cutAll для шинковки одного или нескольких овощей. Создать
интерфейс Slicer для нарезки ломтиками как овощей, так и фруктов. При шинковке
и нарезке вес уменьшается на 2%. На основе данных интерфейсов реализовать 
класс кухонный комбайн, который способен чистить/нарезать  и шинковать фрукты и 
овощи. Каждый из методов возращает вес обработанных продуктов и оперирует только 
очищенными объектами. При попадании неочищенного объекта метод генерирует 
исключение  IllegalArgumentException
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

import java.util.Collection;
import java.lang.Exception;


/**@author 911 */
public interface Peeller {
    double  peellItem(Plant obj);
    double peellItems(Collection <Plant> c);
}

 interface Cutter{
     double cut(Plant obj);
     double cutAll(Collection <Plant> c);
}

interface Slicer{
    double slice(Plant obj);
    double sliceAll(Collection <Plant> c);
}

class KitchenMachine extends Basket implements Peeller, Cutter, Slicer {

    @Override
    public  double peellItem(Plant obj) {
         obj.peel();
            return obj.weigth;
    }

    @Override
    public double peellItems(Collection<Plant> c) {
        double sumWeigth=0;
        try{for(Plant iterator : c){
            if (!iterator.peelling){
             iterator.peel();
             sumWeigth+=iterator.weigth;}}
        } catch(IllegalArgumentException e){System.out.println("IllegalArgumentException");}
        return sumWeigth;
    }

    @Override
    public double cut(Plant obj) {
            if(obj instanceof Vegetable){
            if (!obj.peelling){throw new IllegalArgumentException(" Вы загрузили неочищенный продукт");}}
            return obj.weigth*0.98;
    }

    @Override
    public double cutAll(Collection<Plant> c) {
        double sumWeigth=getWeigth(c);
        for(Plant iterator : c){
            if(c instanceof Vegetable){
                if (!iterator.peelling){throw new IllegalArgumentException(" Вы загрузили неочищенный продукт");}
                sumWeigth=(sumWeigth-iterator.weigth)+iterator.weigth*0.98;
                iterator.weigth=iterator.weigth*0.98;
        }}
        return sumWeigth;
    }

    @Override
    public double slice(Plant obj) {
        if (!obj.peelling){throw new IllegalArgumentException(" Вы загрузили неочищенный продукт");}
        return obj.weigth*0.98;
    }

    @Override
    public double sliceAll(Collection<Plant> c) {
        double sumWeigth=0;
        for(Plant iterator : c){
             if (!iterator.peelling){throw new IllegalArgumentException(" Вы загрузили неочищенный продукт");}
             sumWeigth+=iterator.weigth*0.98;
             iterator.weigth=iterator.weigth*0.98;
        }
       return sumWeigth; 
    }
    
    
}