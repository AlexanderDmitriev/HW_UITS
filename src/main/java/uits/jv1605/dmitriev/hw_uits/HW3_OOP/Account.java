/*
    Счета. Клиент может иметь несколько счетов  в  банке. Учитывать возможность  блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим 
положительный и отрицательный баланс  отдельно.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 911
 */
public class Account implements Comparable <Account> {
    String name;
    boolean blocking;
    double cash;
    String res;
    
    //@Override 911
        public int compareTo(Account obj) {
             Account entry = (Account) obj;
             if ((cash)>(entry.cash)) return 1;
             if ((cash)==(entry.cash)) return 0;
             if ((cash)<(entry.cash)) return -1;
           return 0;  
       }
        
        boolean sortByNumber(double start, double end){
           return (this.cash>=start)&(this.cash<=end);
            }
        Account(String name, boolean blocking,double cash){
            this.name=name;
            this.blocking=blocking;
            this.cash=cash;
        }
        
        public static void main(String args[]){
            //Формируем 4 разных расчетных счета  одного клиента
            Account acc1=new Account("Счет №1 ", false, 1000);
            Account acc2=new Account("Счет №2 ", false, 500);
            Account acc3=new Account("Счет №3 ", false, -300);
            Account acc4=new Account("Счет №4 ", false, 10);
            ArrayList <Account> client=new ArrayList <Account>();
            client.add(acc1);
            client.add(acc2);
            client.add(acc3);
            client.add(acc4);
            Collections.sort(client);
            String res;
                for (Account i:client){
                    if (i.blocking){i.res="заблокирован";} else i.res=" открыт "; 
                    System.out.println(i.name + "   " + i.res + i.cash  +  " грн");}
            System.out.print("Введите минимальный баланс ");
            Scanner in=new Scanner(System.in);
            double taskStart=in.nextDouble();
            System.out.print("Введите максимальный баланс ");
            Scanner in2=new Scanner(System.in);
            double taskEnd=in.nextDouble();
            System.out.println("В вашем диапазоне подходят: ");
           for (Account i:client){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.name + "   " + i.res + " " + i.cash  +  " грн за год");}}
                
            double allSum=0;
            double positiveSum=0;
            double negativeSum=0;
            for (Account iterator : client){
                     allSum+=iterator.cash;
                     if ((!iterator.blocking)&(iterator.cash>0)){positiveSum+=iterator.cash;}
                     if ((!iterator.blocking)&(iterator.cash<0)){negativeSum+=iterator.cash;}
            }
       System.out.println("Общая сумма " + allSum);
       System.out.println("Положительная сумма " + positiveSum);
       System.out.println("Отрицательная сумма " + negativeSum);
                
                
        }
        
}
