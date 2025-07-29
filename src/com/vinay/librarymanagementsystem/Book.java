package com.vinay.librarymanagementsystem;

public class Book extends LibraryItem {
    private String author;
//
    //
    public Book(String Itemid, String title, String author) {
        super(Itemid, title);
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.println("Book Title:" + title + "\nAuthorName:" + author);

    }
    public String toString(){
        return Itemid+","+title+","+author;
    }
}
