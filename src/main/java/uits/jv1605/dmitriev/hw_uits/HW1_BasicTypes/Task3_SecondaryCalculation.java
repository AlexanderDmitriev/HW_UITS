/*  1. Используя данные задания 2 создать программу, которая
рассчитывает:
● объем цилиндра  ​  объем полого цилиндра  ​ площадь боковой
поверхности цилиндра (не полого) 
● объем шара, площадь поверхности шара
● объем, площадь поверхности прямоугольного параллелепипеда
● объем, площадь поверхности тетраэдра
*/
package uits.jv1605.dmitriev.hw_uits.HW1_BasicTypes;
import static uits.jv1605.dmitriev.hw_uits.HW1_BasicTypes.Task2_SimpleCalculation.PI;
public class Task3_SecondaryCalculation {
   

     public static double obCil(double radius, double heigth){  //Расчет объема цилиндра
         if ((radius<0)|(heigth<0)){throw new IllegalArgumentException(" Радиус и высота не может быть меньше нуля");}
        return PI*radius*radius*heigth;}
     
      public static double obPolCil(double radiusOut, double radiusInner, double heigth){   //Расчет объема полого  цилиндра
          if ((radiusOut<0)|(radiusInner<0)|(heigth<0)){throw new IllegalArgumentException(" Радиус и высота не может быть меньше нуля");}
          if ((radiusOut<radiusInner)){throw new IllegalArgumentException(" Внешний радиус не может быть меньше внутреннего");}
        return PI*heigth*(radiusOut*radiusOut-radiusInner*radiusInner);}
      
       public static double bokCil(double radius, double heigth){
           if ((radius<0)|(heigth<0)){throw new IllegalArgumentException(" Радиус и высота не может быть меньше нуля");}
         return PI*2*radius*heigth;}    
       
    public static double obCircle(double radius){
        if (radius<0){throw new IllegalArgumentException(" Радиус не может быть меньше нуля");}
         return (PI*4*(Math.pow(radius,3)))/3;}  
    
    public static double sqCircle(double radius){
        if (radius<0){throw new IllegalArgumentException(" Радиус не может быть меньше нуля");}
         return PI*4*radius*radius;}  
    
    public static double obPar(double a, double b, double c){
        if ((a<0)|(b<0)|(c<0)){throw new IllegalArgumentException(" Сторона не может быть меньше нуля");}
        return a*b*c;}  
    
    public static double sqPar(double a, double b, double c){
        if ((a<0)|(b<0)|(c<0)){throw new IllegalArgumentException(" Сторона не может быть меньше нуля");}
        return 2*(a*b+b*c+a*c);} 
    
    public static double obTet(double a){
        if (a<0){throw new IllegalArgumentException(" Сторона не может быть меньше нуля");}
        return ((Math.sqrt(2))*(Math.pow(a,3)))/12;} 
    
    public static double sqTet(double a){
        if (a<0){throw new IllegalArgumentException(" Сторона не может быть меньше нуля");}
        return Math.sqrt(3)*a*a;} 

public static void main(String args[]){
    System.out.println("Объем цилиндра = " + obCil(10,10));
        System.out.println("Объем полого цилиндра = " + obPolCil(10,5,10));
        System.out.println("Площадь боковой поверхности цилиндра = " + bokCil(10,10));
        System.out.println("Объем шара = " + obCircle(10));
        System.out.println("Площадь шара = " + sqCircle(10));
        System.out.println("Объем параллелепипеда = " + obPar(10,10,8));
        System.out.println("Площадь параллелепипеда = " + sqPar(10,10,8));
        System.out.println("Объем  тетраэдра = " + obTet(10));
        System.out.println("Площадь  тетраэдра = " + sqTet(10));
}




}

