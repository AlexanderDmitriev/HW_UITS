/*
Общий класс для карт, отображающих  данные  человека
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;



/**
 * @author 911
 */
public class Person   {
    String lastName;
    String name;
    String surName;
    int id;
    String adress;
    String identificationNumber; // Номер идентификационной карты
    
    Person(){
        id=(int)(Math.random()*10000);}
    
    Person(String lastName, String name, String surName,String adress, String identificationNumber){
        id=(int)(Math.random()*10000);
        this.lastName=lastName;
        this.name=name;
        this.surName=surName;
        this.adress=adress;
        this.identificationNumber=identificationNumber;}
    
    void setId(int parameter){this.id=parameter;}
    void setlastName(String parameter){this.lastName=parameter;}
    void setName(String parameter){this.name=parameter;}
    void setAdress(String parameter){this.adress=parameter;}
    void setIdentificationNumber(String  parameter){this.identificationNumber=parameter;}
    
     int getId(){return this.id;}
     String getlastName(){return this.lastName;}
     String getName(){return this.name;}
     String getSurName(){return this.surName;}
     String getAdress(){return this.adress;}
     String getIdentificationNumber(){return this.identificationNumber;}
     
      boolean sortByNumber(int start, int end){
           int target=Integer.parseInt(this.identificationNumber); 
           {return (target>start)&(target<end);}
            }
   
}
