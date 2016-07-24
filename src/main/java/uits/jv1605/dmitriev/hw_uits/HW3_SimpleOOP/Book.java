/*
Книги. Вывести: 1) список книг заданного автора
                2) список книг, выпущенных данным  издательством
                3)список книг, выпущенных  после  заданного  года
 */
package uits.jv1605.dmitriev.hw_uits.HW3_SimpleOOP;

import java.util.ArrayList;
import java.util.Scanner;

/** @author 911 */

public class Book {
    String name; //Название  книги
    int id;
    String author;
    String publisher;
    String year;
    int howPages;
    double price;
    Binding bookBinding; //Книжный  переплет
    
    Book(){id=(int)(Math.random()*10000);}
    
    Book(String name, String author, String publisher, String year, int howPages, double price, Binding bookBinding){
        id=(int)(Math.random()*10000);
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.year=year;
        this.howPages=howPages;
        this.price=price;
        this.bookBinding=bookBinding;
    }
   void setName(String parameter){this.name=parameter;}
   void setAuthor(String parameter){this.author=parameter;}
   void setPublisher(String parameter){this.publisher=parameter;}
   void setYear(String parameter){this.year=parameter;}
   void setPages(int parameter){this.howPages=parameter;}
   void setPrice(double parameter){this.price=parameter;}
   void setBookBinding(Binding parameter){this.bookBinding=parameter;}
   
   String getName(){return this.name;}
   String getAuthor(){return this.author;}
   String getPublisher(){return this.publisher;}
   String getYear(){return this.year;}
   int getPages(){return this.howPages;}
   double getPrice(){return this.price;}
   Binding getBookBinding(){return this.bookBinding;}
   
   @Override
    public String toString(){return id + " Книга: " + this.name  + ". Написана: " + this.author + " . Издана  "
                + this.publisher  + ", в " + this.year + " году.Содержит  " + this.howPages + " страниц. Розничная  цена "  + 
                + this.price + " . Переплетено "  + this.bookBinding;}
    
    enum Binding{HardCover, SoftCover, GlueConnection, BondBracket, CombBinding}
    
    boolean findByYear(int yearTask){
           int target=Integer.parseInt(this.year); 
           {return (target>yearTask);}
            }
    
    public static void main(String args[]){
        ArrayList <Book> booksList=new ArrayList <Book>();
         Book bk1=new Book("Легкий способ написать книгу про легкий способ", "Ален Карр", "ЁКЛМН","2010", 120, 15.0, Binding.SoftCover);
            booksList.add(bk1);
        Book bk2=new Book("Ампутация  как альтернативный метод похудения", "Ален Карр", "ЛИТ","2013", 213, 18.5, Binding.HardCover);
            booksList.add(bk2);
        Book bk3=new Book("Java для начинающих", "Герберт Шилдт", "ЁКЛМН","2013", 620, 150.0, Binding.GlueConnection);
            booksList.add(bk3);
        Book bk4=new Book("Новый некромикон", "Faust", "some","1838", 513, 400.0, Binding.HardCover);
            booksList.add(bk4);
        Book bk5=new Book("Легкий способ получить силу земли  при  помощи огурца", "Ален Карр", "ЁКЛМН","2009", 168, 17.0, Binding.SoftCover);
            booksList.add(bk5);
        Book bk6=new Book("Капитанская дочка", "Александр Пушкин", "Рус. лит","1989", 150, 16.0, Binding.BondBracket);
            booksList.add(bk6);
        
        System.out.print("Введите интересующего вас автора: ");
        Scanner in=new Scanner(System.in);
        String taskAuthor=in.nextLine();
        for (Book iterator : booksList){
            if (iterator.author.equalsIgnoreCase(taskAuthor)){
                System.out.println(iterator.toString());
            }
        }
        
        System.out.print("Введите интересующее вас издательство: ");
        Scanner in2=new Scanner(System.in);
        String taskPublisher=in2.nextLine();
        for (Book iterator : booksList){
            if (iterator.publisher.equalsIgnoreCase(taskPublisher)){
                System.out.println(iterator.toString());
            }
        }
        
         System.out.print("Введите после какого  года  вас  заинтересовали  книги: ");
        Scanner in3=new Scanner(System.in);
        int taskYear=in3.nextInt();
        for (Book iterator : booksList){
            if (iterator.findByYear(taskYear)){
                System.out.println(iterator.toString());
            }
        }
    
    
    }
    
}
