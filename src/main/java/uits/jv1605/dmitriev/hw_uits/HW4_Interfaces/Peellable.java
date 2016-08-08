/*
    Создать интерфейс Peelable, содержащий метод peel(). На  основе интерфейса 
реализовать иерархию классов овощей и фруктов. Иерархия должна содержать промежуточный 
абстрактный класс растение (Plant), набор классов, характеризующий каждую конечную 
реализацию как овощ или фрукт (Vegetable, Fruit). Создать конечные реализации
для набора фруктов (Яблоко, Груша, Банан, Апельсин) и овощей (Картофель, Морковь,
Сельдерей, Лук). каждая конечная реализация должна иметь следующие характеристики:
вес, цвет, зрелость, состояние(кондиция), признак очищен ли фрукт/овощ. Для каждого 
объекта реализовать метод peel() базового интерфейса, который уменьшает вес объекта после 
чистки на 5% для овощей и на 2% для фруктов, устанавливает флаг очищенности фрукта.
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

/** * @author 911  */
public interface Peellable {
    void peel();
}
abstract class Plant implements Peellable{
    double weigth;
    String color;
    boolean ripeness; //Зрелость - зрелый/незрелый
    boolean condition; //Кондиция - хороший/негодный
    boolean peelling; // Очищен ли продукт?
    String type;
    //abstract void peel(Plant obj);
}

 class Fruit extends Plant{
    @Override
    public void peel() {
        this.weigth=weigth*0.98;
        this.peelling=true;
    }
    
    
    public class Apple extends Fruit{String type="Яблоко";}
    public class Pear extends Fruit{String type="Груша";}
    public class Banana extends Fruit{String type="Банан";}
    public class Orange extends Fruit{String type="Апельсин";}
    
    
}

 class Vegetable extends Plant {
    @Override
    public void peel() {
        this.weigth=weigth*0.95;
        this.peelling=true;
    }
    
    public class Potato extends Vegetable{String type="Картофель";}
    public class Carrot extends Vegetable{String type="Морковь";}
    public class Celery extends Vegetable{String type="Сельдерей";}
    public class Onion extends Vegetable{String type="Лук репчатый";}
}