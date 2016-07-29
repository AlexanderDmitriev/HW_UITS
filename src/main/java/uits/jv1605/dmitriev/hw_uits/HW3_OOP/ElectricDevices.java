/*
Домашние электроприборы
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class ElectricDevices implements Comparable <ElectricDevices>{
    double power;
    String type;
    
    ElectricDevices(){}
    ElectricDevices(double power){  this.power=power;}
    
    //@Override 911
       public int compareTo(ElectricDevices obj) {
             ElectricDevices entry = (ElectricDevices) obj;
             if (power>entry.power) return 1;
             if (power==entry.power) return 0;
             if (power<entry.power) return -1;
           return 0;  
       }
       boolean sortByNumber(double start, double end){
           return (this.power>=start)&(this.power<=end);
            } 
    public class Kettle extends ElectricDevices{
        Kettle(double power){
            this.power=power;     
            this.type="Чайник";}
        }
    public class SlowCooker extends ElectricDevices{
        SlowCooker(double power){
            this.power=power;     
            this.type="Мультиварка";}
        }
    public class MicroWave extends ElectricDevices{
        MicroWave(double power){
            this.power=power;     
            this.type="Микроволновка";}
        }
    public class RectalInhaler extends ElectricDevices{
        RectalInhaler(double power){
            this.power=power;     
            this.type="Ректальный ингалятор";}
        }
    public class Heater extends ElectricDevices{
        Heater(double power){
            this.power=power;     
            this.type="Обогреватель";}
        }
    public static void main(String args[]){
        ElectricDevices e1=new ElectricDevices();
        ElectricDevices.Kettle el1=e1.new Kettle(1);
        ElectricDevices e2=new ElectricDevices();
        ElectricDevices.SlowCooker el2=e2.new SlowCooker(1.5);
        ElectricDevices e3=new ElectricDevices();
        ElectricDevices.MicroWave el3=e3.new MicroWave(3);
        ElectricDevices e4=new ElectricDevices();
        ElectricDevices.RectalInhaler el4=e4.new RectalInhaler(5);
        ElectricDevices e5=new ElectricDevices();
        ElectricDevices.RectalInhaler el5=e5.new RectalInhaler(2);
        ElectricDevices e6=new ElectricDevices();
        ElectricDevices.Heater el6=e6.new Heater(3);
        ArrayList <ElectricDevices> devices=new ArrayList <ElectricDevices>();
        devices.add(el1);
        devices.add(el2);
        devices.add(el3);
        devices.add(el4);
        devices.add(el5);
        devices.add(el6);
        double sumPower=0;
        for (ElectricDevices iterator : devices){
              sumPower+=iterator.power;
        }
          System.out.println("Вы потребляете " + sumPower + " кВт");
        
        Collections.sort(devices);
          for (ElectricDevices i:devices){
                System.out.println(i.type + " потребляет " + i.power + " кВт");}
          
            System.out.print("Введите потребляемую мощность (начало) ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите потребляемую мощность (конец) ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
            for (ElectricDevices i:devices){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.type + " потребляет " + i.power + " кВт");}}
    }
}
