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
    
    Plant(double weigth, String color, boolean ripeness, boolean condition, boolean peelling){
        this.weigth=weigth;
        this.color=color;
        this.ripeness=ripeness;
        this.condition=condition;
        this.peelling=peelling;
    }
}
