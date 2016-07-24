/*
    Абитуриент. Вывести: а) список абитуриентов, имеющих неуд.
                         б) список  абитуриентов, у которые сумма баллов  выше  заданной
                         в) выбрать заданное число  абитуриентов, имеющих самую высокую сумму баллов
                         г) вывести список  абитуриентов, имеющих  полупроходную сумму
 */

package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 911
 */
public class Abiturient extends Person {
    int markArray[]=new int[5];
    String phone;
    
    Abiturient(){super();}
    Abiturient(String lastName, String name, String surName, String adress, String phone, int[] markArray){
        id=(int)(Math.random()*10000);
        this.lastName=lastName;
        this.name=name;
        this.surName=surName;
        this.adress=adress;
        this.phone=phone;
        System.arraycopy(markArray,0,this.markArray, 0,markArray.length);
    }
    void setPhone(String parameter){this.phone=parameter;}
    void setMarkArray(int [] parameter){System.arraycopy(parameter,0,this.markArray, 0,parameter.length-1);}
    
    String getPhone(){return this.phone;}
    int [] getMarkArray(){return this.markArray;}
    
    @Override
    public String toString(){return id + " Абитуриент: " + this.lastName + " " + this.surName + "  " + this.name + 
                ". Проживает  по  адресу: " + adress + " . Связаться с ним можно по телефону  "
                + this.phone  + ", Его  оценки:" + "\t" + "Физкультура " + this.markArray[0] + "\t"  + "  Разделка  тюленей  напильником "
                + this.markArray[1] + "\t" + " Высшая  математика " + this.markArray[2] + "\t" + "Физика " + this.markArray[3]
                + " Информатика " + this.markArray[4];}
    
        public static double middle(int markArray[]){
            double mid=0;
            for (int i=0;i<markArray.length; i++ ){ mid+=markArray[i];}
            return (mid/markArray.length);}
        
        public boolean finder(double task, char how){
            if (how=='+'){return (middle(this.markArray)>task);}
            if (how=='-'){return (middle(this.markArray)<task);}
            else return true;
    }

    
    public static void main(String [] args){
        ArrayList <Abiturient> abiturientsList=new ArrayList <Abiturient>();
        // Формируем перечень студентов
        int mark1[]={3,5,4,3,4};
        int mark2[]={5,5,4,5,5};
        int mark3[]={4,5,4,5,5};
        int mark4[]={5,4,4,4,5};
        int mark5[]={3,3,4,4,5};
        int mark6[]={5,5,5,4,4};
        Abiturient ab1=new Abiturient("Беггинс", "Фродо", "Дрогович","Шир","0577558484", mark1);
            abiturientsList.add(ab1);
        Abiturient ab2=new Abiturient("король", "Арагорн II", "Араторнович","Ривенделл","0448575888", mark2);
            abiturientsList.add(ab2);
        Abiturient ab3=new Abiturient("", "Гендальф", "Серый","Валинор","0575285854", mark3);
            abiturientsList.add(ab3);
        Abiturient ab4=new Abiturient("ст.оперуполномоченный", "Боромир", "Денеторович ","Гондор","+380664515531", mark4);
            abiturientsList.add(ab4);
        Abiturient ab5=new Abiturient("Длиннобородый", "Гимли", "Глоинович","Эребор","0543312121", mark5);
            abiturientsList.add(ab5);
        Abiturient ab6=new Abiturient("", "Леголас", "Трандуилович","Лихолесье","0335242332", mark6);
            abiturientsList.add(ab6);
        
        System.out.println("Абитуриенты с неудовлетворительными  оценками: ");
        int count=0;
        for (Abiturient i:abiturientsList){
            if (i.finder(4.2,'-')){System.out.println(i.toString()); count++;}
        }   if (count==0){System.out.print("Все  умные!");}
        
        System.out.print("Введите порог  балла: ");
        Scanner in=new Scanner(System.in);
        String taskMark=in.nextLine();
        Double taskMark1=Double.parseDouble(taskMark);
        System.out.println("Абитуриенты с баллом, выше  : " + taskMark);
        int count2=0;
        for (Abiturient i:abiturientsList){
            if (i.finder(taskMark1, '+')){System.out.println(i.toString()); count2++;}
        }   if (count2==0){System.out.print("Все  тупее!");}
       
        //Выводим заданное  число абитуриентов
        System.out.println("Введите  количество абитуриентов  для  определения");
        Scanner in2=new Scanner(System.in);
        int howAbiturient=in.nextInt();
        int countAb=0;
        Abiturient tempArray[]=new Abiturient[abiturientsList.size()];
        
        tempArray=(abiturientsList.toArray(new Abiturient [abiturientsList.size()]));
        for (int j=0;j<tempArray.length;j++){
        for (int i=0; i<tempArray.length-j-1;i++){
            if(middle(tempArray[i].markArray)<=middle(tempArray[i+1].markArray)){
                Abiturient temp=tempArray[i+1];
                tempArray[i+1]=tempArray[i];
                tempArray[i]=temp;}}
        }

        if (howAbiturient<tempArray.length){
        for (int i=0; i<howAbiturient; i++){
            System.out.println("Подходит " + tempArray[i].name + " со  средним баллом " + middle(tempArray[i].markArray) );}}
        System.out.println("Список непрошедших: ");
        if (howAbiturient<tempArray.length){
        for (int i=howAbiturient; i<tempArray.length; i++){
            System.out.println("Не проходит " + tempArray[i].name + " со  средним баллом " + middle(tempArray[i].markArray) );}}
    }
    
}
