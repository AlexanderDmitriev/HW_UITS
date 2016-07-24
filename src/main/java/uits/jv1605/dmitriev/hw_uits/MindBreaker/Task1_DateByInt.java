/*
Записываем дату в число типа int
 */

package uits.jv1605.dmitriev.hw_uits.MindBreaker;
public class Task1_DateByInt {
    public static int dateCoding(byte day, byte month, short year){
        int x=0;
        x=(x|day)<<8;
        x=(x|month)<<16;
        x=(x|year);
        return x;}
    
        public static void dateDeCoding(int code){
            int year=(code&65535);
             System.out.println("Год " + year);
                int month=((code>>16)&255);
                System.out.println("Месяц " + month);
                int day=((code>>24));
                System.out.println("День " + day);
        }
    
    public static void main(String args[]){
      System.out.println(dateCoding((byte)22,(byte)5,(short)1988));
      dateDeCoding((dateCoding((byte)18,(byte)8,(short)1989)));
    }
}
