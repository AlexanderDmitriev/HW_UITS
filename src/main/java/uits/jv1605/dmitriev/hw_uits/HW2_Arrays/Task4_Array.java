/*  Создать одномерный массив на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● вывести все элементы массива в прямом и обратном порядке
● вывести все четные элементы массива
● вывести все нечетные элементы массива
● сумму элементов, кратных 7
● произведение элементов, кратных 3
*/
package uits.jv1605.dmitriev.hw_uits.HW2_Arrays;
public class Task4_Array {
    
    public static int summary(int array[], int num){
        int sum7=0;
        for (int j=1;j<array.length;j++){
            if (array[j]%num==0){sum7+=array[j];}
        }
        return sum7;
    }
    
    public static int multiplier(int array[], int num){
        int pr3=1;
        for (int j=0;j<array.length;j++){
                if ((array[j]%num==0)&(array[j]!=0)){pr3*=array[j];}
            }
        return pr3;
    }
    
    public static void arrays(int n){
        int array[]=new int[n];
        for (int i=0; i<array.length;i++){
            array[i]=(int)(Math.random()*100);} //Заполняем массив размерностью n случайными числами
        System.out.println(java.util.Arrays.toString(array));
        
        for (int k=0; k<array.length/2;k++){
            int tmp=array[k];
            array[k]=array[array.length-k-1];
            array[array.length-k-1]=tmp;}
        System.out.println(java.util.Arrays.toString(array));
        
        System.out.print(" Четные числа массива ");
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){ System.out.print(array[i] + "  ");}
   }   
        System.out.println();
        System.out.print(" Нечетные числа массива ");
        
            for (int j=0;j<array.length;j++){
                if (array[j]%2!=0) {System.out.print(array[j] + "  ");}
            }
            System.out.println();
            System.out.println("Сумма  элементов, кратных 7 = " + summary(array,7));
            System.out.println("Произведение  элементов, кратных 3 = " + multiplier(array,3));
   }
    
    public static void main(String args[]){
        arrays(10);}
}
