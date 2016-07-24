/*
Ввод с консоли даты рождения и преобразование ее  в целое  число
 */
package uits.jv1605.dmitriev.hw_uits.MindBreaker;
import java.util.Scanner;
public class Task2_InputDataByConsole {
    public static boolean validate(int number, int mark, int howBit){
        int x=(number>>howBit);
        boolean result=false;
        if (mark==12){result= (number&240)==0;}
        if (mark==31){result= (number&224)==0;}
        return result;
        }
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Введите день  ");
        byte birthDay=in.nextByte();
        System.out.print("Введите месяц  ");
        byte birthMonth=in.nextByte();
        System.out.print("Введите год  ");
        short birthYear=in.nextShort();
        // Переводим полученные  данные  в  число
        int data;
        data=Task1_DateByInt.dateCoding(birthDay,birthMonth,birthYear);
        System.out.println(data);
        System.out.println("Валидность введенного месяца  " + validate(data,12,16));
        System.out.println("Валидность введенного дня   " + validate(data,31,24));
        Task1_DateByInt.dateDeCoding(data);
    }
}


