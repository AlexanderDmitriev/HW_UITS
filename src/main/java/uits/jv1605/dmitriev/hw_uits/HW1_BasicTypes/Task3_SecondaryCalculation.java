package uits.jv1605.dmitriev.hw_uits.HW1_BasicTypes;
import static uits.jv1605.dmitriev.hw_uits.HW1_BasicTypes.Task2_SimpleCalculation.PI;
public class Task3_SecondaryCalculation {
   

     public static double obCil(double radius, double heigth){  //Расчет объема цилиндра
        return PI*radius*radius*heigth;}
     
      public static double obPolCil(double radiusOut, double radiusInner, double heigth){   //Расчет объема полого  цилиндра
        return PI*heigth*(radiusOut*radiusOut-radiusInner*radiusInner);}
      
       public static double bokCil(double radius, double heigth){   
         return PI*2*radius*heigth;}    
       
    public static double obCircle(double radius){
         return (PI*4*(Math.pow(radius,3)))/3;}  
    
    public static double sqCircle(double radius){
         return PI*4*radius*radius;}  
    
    public static double obPar(double a, double b, double c){
        return a*b*c;}  
    
    public static double sqPar(double a, double b, double c){
        return 2*(a*b+b*c+a*c);} 
    
    public static double obTet(double a){
        return ((Math.sqrt(2))*(Math.pow(a,3)))/12;} 
    
    public static double sqTet(double a){
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

