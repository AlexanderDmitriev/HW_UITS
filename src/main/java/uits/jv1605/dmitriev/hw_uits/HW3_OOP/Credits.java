/*
    Кредиты. Сформировать набор предложений клиенту по целевым кредитам различных
банков для оптимального выбора. Учитывать возможность досрочного погашения кредита 
и/или увеличения кредитной линии. Реализовать выбор и поиск кредита.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Credits {
    double cash;  //Доступная сумма кредита
    boolean erlyRepayment;  //Возможность досрочного погашения
    boolean increaseCredit; // возможность повышения кредитной линии
    int term; // срок возращения кредита
    String bankName; // название банка
    
    Credits(double cash, boolean erlyRepayment, boolean increaseCredit, int term, String bankName){
        this.cash=cash;
        this.erlyRepayment=erlyRepayment;
        this.increaseCredit=increaseCredit;
        this.term=term;
        this.bankName=bankName;
    }
    public void find(double targetCash, boolean targetRepayment, boolean targetIncrease, int targetTerm){
        if ((targetCash>=this.cash)&(targetRepayment==this.erlyRepayment)&(targetIncrease==increaseCredit)&(targetTerm>=this.term)){
            System.out.println("Подходит  кредит от " + this.bankName + " , возможность расширения кредитной линии "
                                        + this.increaseCredit + " , готово к выдаче " + this.cash);}
    }
    
    public static void main(String args[]){
        Credits cred1=new Credits(700, true, false,12,"Lier's Bank");
        Credits cred2=new Credits(1500, true, true,14,"Fool's Land");
        Credits cred3=new Credits(1000, false, true,24,"Welcome to Hell Bank");
        Credits cred4=new Credits(750, false, false,12,"Welcome to Slave List Bank");
         ArrayList <Credits> wayToSlaves=new ArrayList <Credits>();
            wayToSlaves.add(cred1);
            wayToSlaves.add(cred2);
            wayToSlaves.add(cred3);
            wayToSlaves.add(cred4);
            // Задаем критерии поиска кредита
            System.out.print("На какую сумму кредита вы расчитываете? ");
            Scanner in=new Scanner(System.in);
            double targetCash=in.nextDouble();
            System.out.print("Хотите ли погасить кредит досрочно? ");
            Scanner in2=new Scanner(System.in);
            boolean targetRepayment=in2.nextBoolean();
            System.out.print("Вы не против изменения кредитной линии? ");
            Scanner in3=new Scanner(System.in);
            boolean targetIncrease=in3.nextBoolean();
            System.out.print("На какой срок вы хотите взять кредит? ");
            Scanner in4=new Scanner(System.in);
            int targetTerm=in4.nextInt();
            for (Credits i:wayToSlaves){
            i.find(targetCash, targetRepayment, targetIncrease, targetTerm);
            }
    
    }
}
