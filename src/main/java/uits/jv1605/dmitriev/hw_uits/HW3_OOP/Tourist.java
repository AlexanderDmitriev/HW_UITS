/*
    Туристическая путевка. Сформировать набор предложений клиенту по выбору туристической
путевки различного типа (отдых, экскурсия, лечение, шопинг, круиз и т.д.)  для оптимального
выбора. Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;
/**
 * @author 911
 */
public class Tourist implements Comparable <Tourist>{
    String type; 
    int food; // количество приемов пищи в день
    int days;
    double price; // стоимость услуги без логистики
    double cost; // итоговая стоимость отдыха
    Transport logistic;
    double transportPay;
    String kind;
    
    enum Transport{Car(2, "на автомобиле"), Bus(1, " автобусом"), Boat(3, "на лодке"), Horse(2, "на лошадях"),
                    Plane(5, " на самолете"), Walk(0, "пешком"), Train(1, "на поезде");
        Transport(double pay, String kind){
            double transportPay=pay;  
            String transportKind=kind;}
    }
    
    
    
    //@Override 911
       public int compareTo(Tourist obj) {
             Tourist entry = (Tourist) obj;
             if (cost>entry.cost) return 1;
             if (cost==entry.cost) return 0;
             if (cost<entry.cost) return -1;
           return 0;  
       }
        boolean sortByNumber(double start, double end){
           return (this.cost>=start)&(this.cost<=end);
            } 
        
        public class WoodRest extends Tourist{
        WoodRest(int food, int days, Transport logistic){
            this.type=" Отдых в лесу ";     
            this.food=food;
            this.days=days;
            this.price=100;}
        }
}
