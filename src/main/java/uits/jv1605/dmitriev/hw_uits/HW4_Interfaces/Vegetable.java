/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

/**
 *
 * @author ПК
 */
public class Vegetable extends Plant {
    
    public Vegetable(double weigth, String color, boolean ripeness, boolean condition, boolean peelling) {
        super(weigth, color, ripeness, condition, peelling);
    }
    
    @Override
    public void peel() {
        this.weigth=weigth*0.95;
        this.peelling=true;
    }
    
    //public class Potato extends Vegetable{String type="Картофель";}
    //public class Carrot extends Vegetable{String type="Морковь";}
    //public class Celery extends Vegetable{String type="Сельдерей";}
    //public class Onion extends Vegetable{String type="Лук репчатый";}
}
