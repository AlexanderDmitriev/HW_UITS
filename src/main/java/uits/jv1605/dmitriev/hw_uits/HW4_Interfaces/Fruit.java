/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;

import java.util.Collection;
import static uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Basket.getWeigth;

/**
 * @author 911
 */
public class Fruit extends Plant{

    public Fruit(double weigth, String color, boolean ripeness, boolean condition, boolean peelling) {
        super(weigth, color, ripeness, condition, peelling);
    }

    
    
    @Override
    public void peel() {
        this.weigth=weigth*0.98;
        this.peelling=true;
          
 
    }
  
    //public class Apple extends Fruit{String type="Яблоко";}
    //public class Pear extends Fruit{String type="Груша";}
    //public class Banana extends Fruit{String type="Банан";}
    //public class Orange extends Fruit{String type="Апельсин";}
}
    

