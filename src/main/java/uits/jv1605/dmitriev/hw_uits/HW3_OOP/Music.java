/*
Звукозапись
 */

package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Music implements Comparable <Music> {
    String name; //Название песни
    int time; //продолжительность песни
    String style;
    double capacity;// занимаемое место
    String group;
    
    //@Override 911
       public int compareTo(Music obj) {
             Music entry = (Music) obj;
            
             int result = style.compareTo(entry.style);
             if(result != 0) {
                    return result;
             }
            
             if(result == 0) {
                    return  name.compareTo(entry.name);
             }
             return 0;
       }
       boolean sortByNumber(double start, double end){
           return (this.time>=start)&(this.time<=end);
            } 
       
       public class CoB extends Music{
        CoB(String name, int time, String style, double capacity){
            this.name=name;
            this.time=time;
            this.style=style;
            this.capacity=capacity;
            this.group="Children of Bodom";}
        }
       
       public class Metallica extends Music{
        Metallica(String name, int time, String style, double capacity){
            this.name=name;
            this.time=time;
            this.style=style;
            this.capacity=capacity;
            this.group="Metallica";}
        }
       
       public class Dethklok extends Music{
        Dethklok(String name, int time, String style, double capacity){
            this.name=name;
            this.time=time;
            this.style=style;
            this.capacity=capacity;
            this.group="Dethklok";}
        }
       
       public static void main(String args[]){
           Music m1=new Music();
           Music.CoB track1=m1.new CoB("Are you dead yet?",200,"death metall",3.7);
           Music m2=new Music();
           Music.CoB track2=m2.new CoB("Sixpounder",240,"death metall",4.2);
           Music m3=new Music();
           Music.Metallica track3=m3.new Metallica("Enter sandman",400,"trash metall",4.4);
           Music m4=new Music();
           Music.Dethklok track4=m4.new Dethklok("Hatercopter",200,"trash metall",4.5);
           Music m5=new Music();
           Music.CoB track5=m5.new CoB("In your face",300,"death metall",3.7);
           Music m6=new Music();
           Music.Metallica track6=m6.new Metallica("Unforgiven",200,"ballad",3.7);
           ArrayList <Music> disk=new ArrayList <Music>();
           disk.add(track1);
           disk.add(track2);
           disk.add(track3);
           disk.add(track4);
           disk.add(track5);
           disk.add(track6);
           double sumTime=0;
           for (Music iterator : disk){
              sumTime+=iterator.time;
        }
          System.out.println("На диске " + sumTime + " секунд музыки");
          Collections.sort(disk);
          for (Music i:disk){
                System.out.println(i.group + " - " + i.name + " .жанр: " + i.style);}
          System.out.print("Введите минимальную продолжительность ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальную продолжительность ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
            for (Music i:disk){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.group + " - " + i.name + " .жанр: " + i.style);}}
          
       }
       
       
}
