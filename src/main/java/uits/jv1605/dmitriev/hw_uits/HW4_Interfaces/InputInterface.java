/*
    Реализовать минимальный пользовательский интерфейс для выполнения всех операций
(создание объектов с заданнием характеристик, добавление/изъятие из корзины,
чистка, шинковка/нарезка, потери и отходы)
 */
package uits.jv1605.dmitriev.hw_uits.HW4_Interfaces;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;
import uits.jv1605.dmitriev.hw_uits.HW4_Interfaces.Kitchen.*;
/** @author 911 */
public class InputInterface {
    public static Plant creation(String classType){
        boolean ripeness;
        boolean condition;
        boolean peelling;
        boolean cont=false;
        Plant obj;
            do{
                    String temp=JOptionPane.showInputDialog("Сколько весит объект?");
                    double weigth=Integer.parseInt(temp);
                    String color=JOptionPane.showInputDialog("Какого он цвета?");
                    temp=JOptionPane.showInputDialog("Он зрелый?");
                    if(temp.equalsIgnoreCase("yes")){ ripeness=true;} else ripeness=false;
                    temp=JOptionPane.showInputDialog("Он годный?");
                    if(temp.equalsIgnoreCase("yes")){ condition=true;} else condition=false;
                    temp=JOptionPane.showInputDialog("Он очищен?");
                    if(temp.equalsIgnoreCase("yes")){ peelling=true;} else peelling=false;
                        if(classType.equalsIgnoreCase("Apple")) 
                            {obj=new Apple(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Banana")) 
                            { obj=new Banana(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Carrot")) 
                            { obj=new Carrot(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Celery")) 
                            { obj=new Celery(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Onion")) 
                            { obj=new Onion(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Orange")) 
                            { obj=new Orange(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Pear")) 
                            { obj=new Pear(weigth,color,ripeness,condition,peelling);
                                return obj;}
                        if(classType.equalsIgnoreCase("Potato")) 
                            { obj=new Potato(weigth,color,ripeness,condition,peelling);
                                }
                        else {
                            JOptionPane.showMessageDialog(null, "Неверный тип данных");
                            obj=null;
                            cont=true;}
                         temp=JOptionPane.showInputDialog("Продолжить?");
                        if(temp.equalsIgnoreCase("no")){ cont=true;}
            } while(!cont);
            
                        return obj;
    }
    
    public static void input(Collection <Plant> pl){
        Kitchen xx=new Kitchen();
        double startWeigth=xx.getWeigth(pl);
        String x=JOptionPane.showInputDialog("Выберите операцию: " + "\n" + "1.Create - создать объект" +
                "\n" + "2.Add - Добавить объект в корзину" + "\n" + "3.Extract - изъять из корзины" + 
                "\n" + "4.Peell - чистка овощей" + "\n" + "5.Slice - шинковка фруктов" + "\n" + 
                "6.Cut - нарезка овощей" + "\n" + "7.Trash - сколько ушло в мусор" + "\n" + 
                "8.Weigth - узнать текущий вес корзины");
        if(x.equalsIgnoreCase("Create")){
            String classType=JOptionPane.showInputDialog("Объект какого класса вы хотите создать?"); 
                pl.add(creation(classType));
                
        }
        
        if(x.equalsIgnoreCase("Add")){
            String addition=JOptionPane.showInputDialog("Какой элемент хотите добавить?");

        }
        
        if(x.equalsIgnoreCase("Extract")){
            String how=JOptionPane.showInputDialog("Какой элемент хотите удалить?");
            int count=Integer.parseInt(how);
            pl.remove(count);
        }
        
        if(x.equalsIgnoreCase("Peell")){
            JOptionPane.showMessageDialog(null, "Продукты очищены " + xx.peellItems(pl));
        }
        
        if(x.equalsIgnoreCase("Slice")){
            JOptionPane.showMessageDialog(null, "Фрукты нарезаны " + xx.sliceAll(pl));
        }
        
        if(x.equalsIgnoreCase("Cut")){ 
            JOptionPane.showMessageDialog(null, "Овощи нарезаны " + xx.cutAll(pl));
            }
        
        if(x.equalsIgnoreCase("Trash")){
            JOptionPane.showMessageDialog(null, "В корзину ушло " + (startWeigth-xx.getWeigth(pl)));
        }
        
        if(x.equalsIgnoreCase("Weigth")){
            JOptionPane.showMessageDialog(null, "Вес корзины " + xx.getWeigth(pl));
        }
        
    }
    
    public static void main(String args[]){
        Apple redApple=new Apple(1,"Red",false,true,true);
        Pear someFruit=new Pear(0.5, "Yellow",false,true,false);
        Banana bananas=new Banana(0.5,"Yellow",false,true,false);
        Orange someOrange=new Orange(0.6,"Orange",false,true,false);
        Collection <Plant> coll=new ArrayList <Plant>();
        coll.add(redApple);
        coll.add(someFruit);
        coll.add(bananas);
        coll.add(someOrange);
        input(coll);
    }
}
