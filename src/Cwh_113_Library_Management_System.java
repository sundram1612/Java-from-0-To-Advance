//  Library Management System

import java.util.ArrayList;

class Book{
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("This book has been added to the Library.");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("This has been issued from the Library to "+issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("This book had been returned.");
        this.books.add(b);
    }
    public void addBook(String string, String string2) {
    }
}
public class Cwh_113_Library_Management_System {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm", "CLRS");
        bk.add(b1);
        Book b2 = new Book("Algorithm2", "CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorithm3", "CLRS3");
        bk.add(b3);
        Book b4 = new Book("Algorithm4", "CLRS4");
        bk.add(b4);
        Book b5 = new Book("English Grammar", "Wren & Martin");
        bk.add(b5);


        MyLibrary ml = new MyLibrary(bk);
        ml.addBook("algo4", "CLRS4");
        System.out.println(ml.books);

        ml.issueBook(b3, "Sundram Kumar");
        System.out.println(ml.books);
    }
}
//-----------------------------------End of the course-------------------------------------
// 12:10 on 19th of june 2023.