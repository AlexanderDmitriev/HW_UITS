/*
    Налоги. Определить множество и сумму налоговых выиплат физ. лица ха год с учетом
доходом с основного  и дополнительного мест работы, авторских вознаграждений, 
продажи имущества, получения в подарок денежных сумм и имущества, переводов из-за границы,
льгот на детей  и  материальной помощи. 
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ПК
 */
public class Payment  implements Comparable <Payment> {
    static double paymentProcent; //Процент, от доходов, являющийся налогом
    double cash; //основная зарплата
    double additionalCash; //дополнительный доход
    double authorCash; // авторские выплаты
    double solded; // проданное имущество
    double presentCash; // подаренные денежные средства
    double presentThings; // подаренное  имущество
    double money; //перевод из=за границы
    double childrenHelp; // льготы на детей
    double help; // материальная помощь
    String type;
    double sum; // сумма налога за год
    
    //@Override 911
        public int compareTo(Payment obj) {
             Payment entry = (Payment) obj;
             if ((sum)>(entry.sum)) return 1;
             if ((sum)==(entry.sum)) return 0;
             if ((sum)<(entry.sum)) return -1;
           return 0;  
       }
    
    void setCash(double parameter){this.cash=parameter;}
    void setAdCash(double parameter){this.additionalCash=parameter;}
    void setAuthor(double parameter){this.authorCash=parameter;}
    
    Payment(){}
    
    Payment(double solded, double presentCash, double presentThings, double money, double childrenHelp, double help){
        this.solded=solded;
        this.presentCash=presentCash;
        this.presentThings=presentThings;
        this.money=money;
        this.childrenHelp=childrenHelp;
        this.help=help;
    }
    public class EstateTax extends Payment{
            EstateTax(double solded, double presentThings){
                this.type="Налог на недвижимость";
                sum=(solded+presentThings)*0.2;
                }
        }
    public class MainTax extends Payment{
            MainTax(double cash, double additionalCash, double authorCash, double childrenHelp){
                this.type="Основной налог";
                sum=((authorCash+additionalCash+cash)*0.2-childrenHelp)*12;
                }
        }
    public class PresentTax extends Payment{
            PresentTax(double presentCash, double presentThings, double money, double help){
                this.type="Налог на подарки";
                sum=(presentCash+presentThings+money+help)*0.2;
                }
        }
    
    public class TaxOnAir extends Payment{
            TaxOnAir(double cash){
                this.type="Налог на воздух";
                sum=cash*0.2*12;
                }
        }
    
    
   public static void main(String args[]){
       Payment man=new Payment(0,0,0,100000,0,0);
       System.out.print("Введите ваш основной доход в месяц ");
       Scanner inCash=new Scanner(System.in);
       man.setCash(inCash.nextInt());
       System.out.print("Введите ваш дополнительный доход в месяц ");
       Scanner inAdCash=new Scanner(System.in);
       man.setAdCash(inAdCash.nextInt());
       System.out.print("Введите ваш авторский доход за год ");
       Scanner inAut=new Scanner(System.in);
       man.setAuthor(inAut.nextInt());
       
       double allPayments=0; // общая сумма  налогов за год
       ArrayList <Payment> payments=new ArrayList <Payment>();
       Payment.EstateTax tax1=man.new EstateTax(man.solded,man.presentThings);
       Payment.MainTax tax2=man.new MainTax(man.cash,man.additionalCash, man.authorCash, man.childrenHelp);
       Payment.PresentTax tax3=man.new PresentTax(man.presentCash, man.presentThings, man.money, man.help);
       Payment.TaxOnAir tax4=man.new TaxOnAir(man.cash);
            payments.add(tax1);
            payments.add(tax2);
            payments.add(tax3);
            payments.add(tax4);
       for (Payment iterator : payments){
                     allPayments+=iterator.sum;
            }
       System.out.println("За  год  нужно  выплатить " + allPayments);
       Collections.sort(payments);
                for (Payment i:payments){
                    System.out.println(i.type + " к оплате  " + i.sum + " грн за год");}

   
   } 
}
