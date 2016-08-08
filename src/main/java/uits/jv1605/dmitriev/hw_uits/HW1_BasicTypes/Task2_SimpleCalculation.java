/*  Используя числовые типы данных создать программу, которая
рассчитывает:
●  длину окружности,  ​ площадь окружности,  ​ площадь кольца
● периметр треугольника, площадь треугольника
● периметр, площадь прямоугольника
*/
package uits.jv1605.dmitriev.hw_uits.HW1_BasicTypes;
public class Task2_SimpleCalculation {
   static final double PI=3.14159265;
   
   public static double dlOkr(double radius){   //Расчет длины окружности
       if (radius<0){throw new IllegalArgumentException(" Радиус не может быть меньше нуля");}
    return PI*2*radius;}
  
    public static double sqOkr(double radius){  // Рсчет полщади окружности
        if (radius<0){throw new IllegalArgumentException(" Радиус не может быть меньше нуля");}
    return PI*radius*radius;}
   
   public static double sqRing(double radiusBig, double radiusSmall){  //Расчет площади  кольца
       if ((radiusBig<0)|(radiusSmall<0)){throw new IllegalArgumentException(" Радиус не может быть меньше нуля");}
    return PI*(radiusBig*radiusBig-radiusSmall*radiusSmall);}
   
  public static double perTrian(double a, double b, double c){  //Расчет периметра треугольника
      if ((a<0)|(b<0)|(c<0)){throw new IllegalArgumentException(" Сторона треугольника не может быть меньше нуля");}
    return a+b+c;}
  
    public static double sqTrian(double as, double bs, double cs){  //Расчет  площади  треугольника
        double p=(as+bs+cs)/2;
    return Math.sqrt(p*(p-as)*(p-bs)*(p-cs));}
    
    public static double perSq(double a, double b){ //Расчет  периметра  прямоугольника
        if ((a<0)|(b<0)){throw new IllegalArgumentException(" Сторона прямоугольника не может быть меньше нуля");}
    return 2*(a+b);}
    
    public static double sqSq(double a, double b){  //Расчет  площади  прямоугольника
        if ((a<0)|(b<0)){throw new IllegalArgumentException(" Сторона прямоугольника не может быть меньше нуля");}
    return a*b;}  

    public static void main(String args[]){
        System.out.println("Длина окружности = " + dlOkr(10));
        System.out.println("Площадь  круга = " + sqOkr(10));
        System.out.println("Площадь  кольца = " + sqRing(10,5));
        System.out.println("Периметр треугольника = " + perTrian(10,10,10));
        System.out.println("Площадь треугольника = " + sqTrian(10,10,10));
        System.out.println("Периметр  прямоугольника  = " + perSq(10,10));
        System.out.println("Площадь прямоугольника = " + sqSq(10,10));}


}
