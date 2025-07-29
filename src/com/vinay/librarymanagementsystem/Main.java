package com.vinay.librarymanagementsystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create Library Items
        Book book1=new Book("Java001","Head First Java","Kathy Sierra");
        Magazine m1=new Magazine("Mag001","AI Evolu on",10);
        Book book2=new Book("Python","Programs of Python","Kathy Sierra");

        Library library=new Library();
        library.addBooks(book1);
        library.addBooks(book2);
        library.displayBooks();
        library.removeBook("Python");
        library.displayBooks();


        //Create Users
        Student s1=new Student("24Stu001","Payal");
        Professor p1=new Professor("EMP001","Jenny");

        //Borrow items
//        s1.borrow(book1);
//         s1.borrow(m1);
//        p1.borrow(m1);
//
//        Return items
//        p1.returnItem();
//        s1.returnItem();

//        p1.borrow(book1);
//
//        //show Borrowed items
//        s1.showBorrowItems();
//        p1.showBorrowItems();
    }
}