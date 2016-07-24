/*
Карта покупателя
 */

package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author 911
 */
public class Customer extends Person implements Comparable <Customer>  {
     String bankAccount;
     // identificationNumber - в данном  случае  номер банковской  карты
    
    Customer(){super();}
    
    Customer(String lastName, String name, String surName, String adress, String identificationNumber, String bankAccount){
        super(lastName, name, surName, adress, identificationNumber);
        this.bankAccount=bankAccount;}
    
    void setBankAccount(String parameter){this.bankAccount=parameter;}
    
    String getBankAccount(){return this.bankAccount;}
    
    // @Override911
    public String toString(){return id + " Покупатель: " + this.lastName + " " + this.surName + "  " + this.name + 
                ". Проживает  по  адресу: " + adress + " . Номер  кредитной  карты  "
                + this.identificationNumber  + ", номер банковского  счета: " + this.bankAccount;}
    
    //@Override 911
       public int compareTo(Customer obj) {
             Customer entry = (Customer) obj;
            
             int result = lastName.compareTo(entry.lastName);
             if(result != 0) {
                    return result;
             }
            
             if(result == 0) {
                    return  name.compareTo(entry.name);
             }
             return 0;
       }
       
    
    public static void main(String args[]){
        ArrayList <Customer> customersList=new ArrayList <Customer>();
        Customer cst1=new Customer("Хетфилд", "Джеймс", "Верджилович", "414854013328", "г.Сан-Франциско, ул.Ленина 8",  "4148-3328-2828");
            customersList.add(cst1);
        Customer cst2=new Customer("Ульрих", "Ларс", "Торбенович", "434854513628", "г.Сан-Франциско, ул.Гагарина 28",  "5565-3338-2528");
            customersList.add(cst2);
        Customer cst3=new Customer("Хэммет", "Кирк", "безотцовщина","484854013528", "г.Сан-Франциско, ул.Стивена Кинга 18",  "4178-3378-2878");
            customersList.add(cst3);
        Customer cst4=new Customer("Трухильо", "Роберт", "Августин", "444854413428", "г.Сан-Франциско, ул.Ленина 4",  "4144-3324-4428");
            customersList.add(cst4);
       
        Collections.sort(customersList);
        Object [] temp=customersList.toArray();
        Arrays.sort(temp);
         for (Object temp1 : temp) {
             System.out.println(temp1);
         }
            System.out.print("Введите интересующий диапазон из 12 цифр (начало) ");
            Scanner in=new Scanner(System.in);
            String a=in.nextLine();
            int taskStart=Integer.parseInt(a);
            System.out.print("Введите интересующий диапазон из 12 цифр (конец) ");
            Scanner in2=new Scanner(System.in);
            String b=in.nextLine();
            int taskEnd=Integer.parseInt(b);
            System.out.println("В вашем диапазоне подходят: ");
            for (Customer i:customersList){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.toString());}}
    }
}
