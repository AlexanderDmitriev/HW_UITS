/*
    Карточка студента
 */

package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;
import java.util.ArrayList;
import java.util.Scanner;
/**
 @author 911
 */
public class Student  extends Person {
    String birthDay;
    String telephone;
    int faculty;  // Номер факультета
    int course;
    int group;
    
    Student(String lastName, String name, String surName, String birthDay, String adress, String telephone, 
            int faculty, int course, int group){
        id=(int)(Math.random()*10000);
        this.lastName=lastName;
        this.name=name;
        this.surName=surName;
        this.adress=adress;
        this.birthDay=birthDay;
        this.telephone=telephone;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
    }
    
        Student(String lastName, String name, String surName, String birthDay, String adress, String telephone, 
            int faculty){
        id=(int)(Math.random()*10000);
        this.lastName=lastName;
        this.name=name;
        this.surName=surName;
        this.adress=adress;
        this.birthDay=birthDay;
        this.telephone=telephone;
        this.faculty=faculty;
        this.course=1;
        this.group=1;}
        
        Student(){super();}
        
        void setSurName(String parameter){this.surName=parameter;}
        void setBirthDay(String parameter){this.birthDay=parameter;}
        void setTelephone(String parameter){this.telephone=parameter;}
        void setFaculty(int parameter){this.faculty=parameter;}
        void setCourse(int parameter){this.course=parameter;}
        void setGroup(int parameter){this.group=parameter;}
        
        String getBirthDay(){return this.birthDay;}
        String getTelephone(){return this.telephone;}
        int  getFaculty(){return this.faculty;}
        int  getCourse(){return this.course;}
        int getGroup(){return this.group;}
        
        public String toString(){return id + " Студент: " + this.name + " " + this.surName + "  " + this.lastName + 
                "  родился  " + birthDay + ". Проживает  по  адресу: " + adress + " . Связаться  с  ним можно  по телефону "
                + telephone + " . Учится  на " + faculty + "-м  факультете, на  " + course + "-м  курсе " + 
                group + "-й группе";}
    
        public static void main(String args []){
            ArrayList <Student> studentsList=new ArrayList <Student>();
            Student std1=new Student("Иванов","Иван", "Иванович", "19-07-1989","3-я улица строителей 18, под лестницей","+380506684455", 1,1,1);
            studentsList.add(std1);
            Student std2=new Student("Пупкин","Василий", "Иванович", "11-06-1988","3-я улица строителей 24","+380506684555", 4);
            studentsList.add(std2);
            Student std3=new Student("Сноу","Джон", "Рейгарович", "03-11-1283","хз","нет", 1,2,3);
            studentsList.add(std3);
            Student std4=new Student();
                std4.setlastName("Терминатор");
                std4.setName("Арнольд");
                std4.setSurName("Никанорович");
                System.out.println("Имя 4-го  " + std4.getlastName()+ " " + std4.getName()+" "+std4.getSurName());
                std4.setBirthDay("21-01-2083");
                std4.setAdress("Конвеер смерти №18, ячейка 321");
                std4.setFaculty(2);
                std4.setCourse(3);
                std4.setGroup(1);
            studentsList.add(std4);
            // Выводим  список для заданного  массива
            Scanner in=new Scanner(System.in);
            System.out.print("Введите интересующий  факультет  ");
            int taskFac=in.nextInt();
            for (Student i:studentsList){
               if (i.faculty==taskFac){System.out.println(i.toString());}
            }
            // Список студентов каждого факультета
            ArrayList <Student> faculty1=new ArrayList <Student>();
            ArrayList <Student> faculty2=new ArrayList <Student>();
            ArrayList <Student> faculty3=new ArrayList <Student>();
            ArrayList <Student> faculty4=new ArrayList <Student>();
            
            for (Student i:studentsList){
               switch(i.faculty){
                   case 1: {faculty1.add(i); break;}
                   case 2: {faculty2.add(i); break;}
                   case 3: {faculty3.add(i); break;}
                   case 4: {faculty4.add(i); break;}
            }
           }
            for (Student i:faculty1)
                {System.out.println("Первый факультет " + i.lastName + " "+ i.name + " " +i.surName);}
            for (Student i:faculty2)
                {System.out.println("Второй факультет " + i.lastName + " "+ i.name + " " +i.surName);}
            for (Student i:faculty3)
                {System.out.println("Третий факультет " + i.lastName + " "+ i.name + " " +i.surName);}
            for (Student i:faculty4)
                {System.out.println("Четвертый факультет " + i.lastName + " "+ i.name + " " +i.surName);}
        
        // Список студентов каждого курса
        ArrayList <Student> course1=new ArrayList <Student>();
        ArrayList <Student> course2=new ArrayList <Student>();
        ArrayList <Student> course3=new ArrayList <Student>();
        ArrayList <Student> course4=new ArrayList <Student>();
        
        for (Student i:studentsList){
               switch(i.course){
                   case 1: {course1.add(i); break;}
                   case 2: {course2.add(i); break;}
                   case 3: {course3.add(i); break;}
                   case 4: {course4.add(i); break;}
            }
           }
        for (Student i:course1)
                {System.out.println("Первый курс " + i.lastName + " "+ i.name + " " +i.surName);}
        for (Student i:course2)
                {System.out.println("Второй курс " + i.lastName + " "+ i.name + " " +i.surName);}
        for (Student i:course3)
                {System.out.println("Третий курс " + i.lastName + " "+ i.name + " " +i.surName);}
        for (Student i:course4)
                {System.out.println("Четвертый курс " + i.lastName + " "+ i.name + " " +i.surName);}
        
        // Список студентов, родившихся после заданного  года
        System.out.print("Введите интересующий  год  рождения  ");
            int taskYear=in.nextInt();
            for (Student i:studentsList){
                if(Integer.parseInt(i.birthDay.substring(6))>taskYear){System.out.println("После "+ taskYear + " родился  "+i.lastName + " "+ i.name + " " +i.surName);}
            // Выше  Integer.parseInt - преобразовали строку в число int
            }
         // Список группы
            System.out.print("Введите интересующую  группу  ");
            Scanner in2=new Scanner(System.in);
            String taskGroup=in2.nextLine();
            System.out.println("В  " + taskGroup + "-й  группе  учатся: ");
            for (Student i:studentsList){
                String tmp=Integer.toString(i.faculty)+Integer.toString(i.course)+Integer.toString(i.group);
                if (tmp.equals(taskGroup)){System.out.println(i.toString());}
            }
        }}
