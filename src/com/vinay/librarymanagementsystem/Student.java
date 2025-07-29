package com.vinay.librarymanagementsystem;
//
public class Student extends User{
    public Student(String userId, String name) {
        super(userId, name);
    }

    public void borrow(LibraryItem item) {
        if (item instanceof Book) {
            super.borrow(item);
        } else {
            System.out.println("Students only borrow books");
        }

    }
}
