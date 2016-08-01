/*
    Кредиты. Сформировать набор предложений клиенту по целевым кредитам различных
банков для оптимального выбора. Учитывать возможность досрочного погашения кредита 
и/или увеличения кредитной линии. Реализовать выбор и поиск кредита.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;
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
    
    public static void main(String args[]){
        Credits cred1=new Credits(700, true, false,12,"Lier's Bank");
        Credits cred2=new Credits(1500, true, true,14,"Fool's Land");
        Credits cred3=new Credits(1000, false, true,24,"Welcome to Hell Bank");
        Credits cred4=new Credits(750, false, false,12,"Welcome to Slave List Bank");
    
    
    }
}
