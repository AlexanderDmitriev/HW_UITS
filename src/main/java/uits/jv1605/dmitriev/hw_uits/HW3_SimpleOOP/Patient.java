/*
�����  �������� ��������
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.charset.Charset;
import java.util.ResourceBundle;
import java.util.Locale;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 911
 */
public class Patient extends Person{
    static ResourceBundle bundle;
    String phoneNumber;
    String diagnosis;   // диагноз
    //String identificationNumber - в данном  случае  номер мед. карты
    Patient(){super();}
    Patient(String lastName, String name, String surName, String adress, String identificationNumber, String phoneNumber, String diagnosis ){
        super(lastName, name, surName, adress, identificationNumber);
        this.phoneNumber=phoneNumber;
        this.diagnosis=diagnosis;
    }
    void setPhoneNumber(String parameter){this.phoneNumber=parameter;}
    void setDiagnosis (String parameter){this.diagnosis=parameter;}
    
    String getPhoneNumber(){return this.phoneNumber;}
    String getDiagnosis(){return this.diagnosis;}
    
    
    @Override
    public String toString(){return id + " Пациент " + this.lastName + " " + this.surName + "  " + this.name + 
                ". связаться с ним можно по номеру: " + phoneNumber + " . Номер мед. карты  "
                + this.identificationNumber  + ", Диагноз " + this.diagnosis;}
    
    public static void main(String args[]){
         ArrayList <Patient> patientsList=new ArrayList <Patient>();
        // Locale current=new Locale("ru", "RU");
         //bundle=ResourceBundle.getBundle("labels", current);
        //Charset.defaultCharset();
        // charset = "UTF-8";
         
         /*java.io.InputStream applStream = getClass().getClassLoader().getResourceAsStream(applPath);
         Reader applReader = new InputStreamReader(applStream, "UTF-8");
         applBundle = new PropertyResourceBundle(applReader);  */

        Patient pat1=new Patient("Грин", "Рейчел", "Карен","г. Нью-Йорк, ��.������� 90/19","41484432", "0789991178",  "воспаление хитрости");
            patientsList.add(pat1);
        Patient pat2=new Patient("Геллер", "Моника", "������","г. Нью-Йорк, ��.������� 90/19","41443325", "0795551113",  "ВОСПАЛЕНИЕ ХИТРОСТИ");
            patientsList.add(pat2);
        Patient pat3=new Patient("Буффе", "Фиби", "","г. Нью-Йорк, ��.������� 11/34","56457898", "0856547823",  "Воспаление Хитрости");
            patientsList.add(pat3);
        Patient pat4=new Patient("Трибиани", "Джо", "�������","г. Нью-Йорк, ��.������� 90/20", "44445522", "0312564545",  "ok");
            patientsList.add(pat4);
        Patient pat5=new Patient("Бинг", "Чендлер", "������","г. Нью-Йорк, ��.������� 90/20", "44475867", "0312564545",  "здоров");
            patientsList.add(pat5);
        Patient pat6=new Patient("Геллер", "Росс", "Юстас","г. Нью-Йорк, ��.������� 89/18", "33215642", "0958574587",  "здоров");
            patientsList.add(pat6);
        System.out.print("Введите интересующий диагноз: ");
        Scanner in=new Scanner(System.in);
        String taskDiagnosis=in.nextLine();
        for (Patient iterator : patientsList){
            if (iterator.diagnosis.equalsIgnoreCase(taskDiagnosis)){
                System.out.println(iterator.toString());
            }
        }
        
      /*  System.out.print("Введите номер мед. карты из 8 цифр (начало) ");
            Scanner in2=new Scanner(System.in);
            String a=in.nextLine();
            int taskStart=Integer.parseInt(a);
            System.out.print("Введите номер мед. карты из 8 цифр (конец) ");
            Scanner in3=new Scanner(System.in);
            String b=in.nextLine();
            int taskEnd=Integer.parseInt(b);
            System.out.println("В  заданном интервале подходят пациенты: ");
            for (Patient i:patientsList){
                if (i.sortByNumber(taskStart, taskEnd)){System.out.println(i.toString());}}*/
            System.out.println(taskDiagnosis);
    }

}
