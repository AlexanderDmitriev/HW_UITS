/*
Таксопарк
 */
package uits.jv1605.dmitriev.hw_uits.HW3_OOP;

/**
 * @author 911
 */
public class Taxi implements Comparable <Taxi>{
    String type;
    double price;
    int number; // Номер такси в базе таксопарка
    double fuelConsumption; // потребление топлива
    double speed;
    
    //@Override 911
        public int compareTo(Taxi obj) {
             Taxi entry = (Taxi) obj;
             if (fuelConsumption>entry.fuelConsumption) return 1;
             if (fuelConsumption==entry.fuelConsumption) return 0;
             if (fuelConsumption<entry.fuelConsumption) return -1;
           return 0;  
       }
        
        boolean sortByNumber(double start, double end){
           return (this.speed>=start)&(this.speed<=end);
            }
        
        public class LadaCalina extends Taxi{
            LadaCalina(double price, int number){
                this.type="Лада Калина";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=2; // потребление топлива
                this.speed=160; }
        }
        public class LadaDaNuNa extends Taxi{
            LadaDaNuNa(double price, int number){
                this.type="Лада да ну на...";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=3; // потребление топлива
                this.speed=140; }
        }
        public class FerrariFXX extends Taxi{
            FerrariFXX(double price, int number){
                this.type="Ferrari FXX";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=5; // потребление топлива
                this.speed=320; }
        }
        
        public class WindowsAutoMobile extends Taxi{
            WindowsAutoMobile(double price, int number){
                this.type="Microsoft автобобиль";
                this.price=price;
                this.number=number; // Номер такси в базе таксопарка
                this.fuelConsumption=18; // потребление топлива
                this.speed=32; }
        }
        public static void main(String args[]){}
    
}
