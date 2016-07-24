package uits.jv1605.dmitriev.hw_uits.HW2_Arrays;
public class Task1_IfElse {
       public static void searching(int number){  // Находим значения, кратные number
   for (int i=0; i<=100; i++){
     if  (i%number==0){
       System.out.print(i + "  ");}}} 
       
   public static int searchingSum(int number){
       int sum=0;
   for (int i=0; i<=100; i++){
     if  (i%number==0){
       sum+=i;}}
   return sum;}  
   
   public static void main(String args[]){
        searching(2); System.out.println();
        searching(3); System.out.println();
        searching(5); System.out.println();
        searching(7); System.out.println();
        System.out.println("Сумма  значений, кратных  2 равна  " + searchingSum(2) );
        System.out.println("Сумма  значений, кратных  3 равна  " + searchingSum(3) );
        System.out.println("Сумма  значений, кратных  5 равна  " + searchingSum(5) );
        System.out.println("Сумма  значений, кратных  7 равна  " + searchingSum(7) );
        int razSum72=searchingSum(7)-searchingSum(2);
        System.out.println("Разность сумм  7  и  2  равна  " + razSum72);
        double delSum53=((double)searchingSum(5))/((double)searchingSum(3));
        System.out.println("Отношение  сумм 5  к  3  равно  " + delSum53);
    }
}
