/*  Создать двумерный массив m на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
● распечатать массив в прямом и обратном порядке
● для каждой четной строки вывести все четные элементы массива
● для каждого нечетного столбца вывести все нечетные элементы массива
● сумму всех элементов, кратных 7 в четных строках
● произведение элементов, кратных 3 в нечетных строках
*/

package uits.jv1605.dmitriev.hw_uits.HW2_Arrays;

import static uits.jv1605.dmitriev.hw_uits.HW2_Arrays.Task4_Array.multiplier;
import static uits.jv1605.dmitriev.hw_uits.HW2_Arrays.Task4_Array.summary;

public class Task5_Array2D {
    public static void arrays2D(int m, int n){
        int array2D[][]=new int[m][n];
        for (int[] arrayIterator : array2D) {
            for (int j = 0; j<array2D.length; j++) {
                arrayIterator[j] = (int)(Math.random()*100);
            }
        }
        System.out.println("Массив задания 5 в прямом порядке");
        for (int[] arrayIterator : array2D) {
            System.out.println(java.util.Arrays.toString(arrayIterator));   
        }
        System.out.println("Массив задания 5 в обратном порядке");
        for (int i=0; i<array2D.length;i++){  // Инверсия массива
            for (int k=0; k<array2D.length/2;k++){
                int tmp=array2D[i][k];
                array2D[i][k]=array2D[i][array2D.length-k-1];
                array2D[i][array2D.length-k-1]=tmp;}}
        for (int[] arrayIterator : array2D) {
            System.out.println(java.util.Arrays.toString(arrayIterator));
        }
  // Выводим четные элементы для каждой четной строки
        for (int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D.length; j++){
                if (i%2==0){ if(array2D[i][j]%2==0){System.out.print(array2D[i][j]+ "  ");}} }
        }   
            System.out.println();
  // Выводим нечетные элементы для каждой нечетной строки
        for (int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D.length; j++){
                if (i%2!=0){ if(array2D[i][j]%2!=0){System.out.print(array2D[i][j]+ "  ");}} }}
        System.out.println();
    // Выводим сумму всех  элементов, кратных  7
    int sum72D=0;
    for (int i=0; i<array2D.length; i++){
        for (int j=0; j<array2D.length; j++){
            sum72D=summary(array2D[i],7);
        }
    }   
    System.out.println("Сумма  всех элементов, кратных 7, в четных строках = " + sum72D);
// Выводим произведение  элементов, кратных 3 в нечетных строках
    int pr32D=1;
    for (int i=0; i<array2D.length; i++){
        for (int j=0; j<array2D.length; j++){
             if (i%2!=0){
                 pr32D=multiplier(array2D[i],3);
             } 
        }
    }   
        System.out.println("Произведение  всех элементов, кратных 3, в нечетных строках = " + pr32D);
}
    
    public static void main(String args[]){
        arrays2D(4,4);}
}
